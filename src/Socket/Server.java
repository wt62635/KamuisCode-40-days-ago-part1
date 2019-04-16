package Socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 聊天室服务端
 * @author Administrator
 *
 */

public class Server {
	private ServerSocket server;
	/*
	 * 该数组用于保存所有的ClientHandler对应客户端
	 * 的输出流，便于这些ClientHandler转发消息
	 */
//	private PrintWriter[] allOut = {};
	private Collection<PrintWriter> allOut = new ArrayList<>();	
	
	public Server(){
		/*
		 * 运行在服务端的ServerSocket主要有两个作用：
		 * 1：向系统申请服务端口（客户端就是通过这个端口与服务端程序建立连接的）
		 * 2：监听端口，一旦一个客户端建立连接，
		 * 	那么就会自动创建一个Socket与该客户端通讯。
		 */
		try {
			System.out.println("正在启动服务端……");
			server = new ServerSocket(8088);
			System.out.println("服务端启动完毕！");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void start() {
		try {
			/*
			 * ServerSocket提供了接收客户端连接的方法：
			 * Socket accept()
			 * 这是一个阻塞方法，调用后服务端开始等待，
			 * 直到一个客户端通过这个端口与服务端建立连接为止，
			 * 这时该方法会返回一个Socket实例，通过这个实例就可以与该客户端通讯了。
			 * 
			 * 多次调用accpet方法可以等待多个客户端的连接。
			 */
			while(true) {
				System.out.println("等待客户端连接……");
				Socket socket = server.accept();
				System.out.println("一个客户端连接了！");
				/*
				 * 启动一个线程来处理该客户端的交互
				 */
				ClientHandler handler = new ClientHandler(socket);
				Thread t = new Thread(handler);
				t.start();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}
	/**
	 * 该线程任务是负责指定客户关系进行交互。
	 * @author Administrator
	 */
	private class ClientHandler implements Runnable{
		private Socket socket;
		private String host;
		
		public ClientHandler(Socket socket) {
			this.socket = socket;
			//通过socket获取远端计算机地址信息
			InetAddress address = socket.getInetAddress();
			//获取远端计算机地址信息IP的字符串格式
			this.host = address.getHostAddress();
		}
		
		public void run() {
			PrintWriter pw = null;
			try {
				/*
				 * 通过Soccket获取输入流，可以读取远端计算机发送过来的字节数据。
				 */
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
				
				/*
				 * 通过Socket获取输出流，以便将消息发送给客户端
				 */
				pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"utf-8")),true);
				/*
				 * 将当前ClientHandler对应客户端的输出流
				 * 放入共享数组allOut中，以便其它的ClientHandler
				 * 也可以访问到，从而给这个客户端转发消息。
				 */
				/*
				 * 多个线程（ClientHandler）不能同时对allOut数组
				 * 扩容添元素，会出现并发安全问题。
				 */
				//1.将当前客户端输出流从共享数组中删除
				synchronized(allOut) {
//					//1.对allOut扩容
//					allOut = Arrays.copyOf(allOut, allOut.length+1);
//					//2.将输出流存入到数组中
//					allOut[allOut.length-1] = pw ;
					
					allOut.add(pw);
				}
//				System.out.println(host + "上线了，当前在线人数：" + allOut.length);
				System.out.println(host + "上线了，当前在线人数：" + allOut.size());
				
				String message = null;
				while((message = br.readLine())!=null) {
					System.out.println(host + "来信："  + message);
					synchronized(allOut) {
						//将消息发送给所有客户端
//						for (int i = 0; i < allOut.length; i++) {
//							allOut[i].println(host + "说："  + message);
//						}
						for (PrintWriter o : allOut) {
							o.println(host + "说："  + message);
						}
					}
				}

			} catch (Exception e) {
				System.out.println("失去连接！");
			} finally {
				// 处理客户端断开连接后的操作
				// 1.将当前客户端输出流从共享数组中删除
//				for (int i = 0; i < allOut.length; i++) {
//					if (allOut[i] == pw) {
//						allOut[i] = allOut[allOut.length - 1];
//						//对allOut减容
//						allOut = Arrays.copyOf(allOut, allOut.length - 1);
//						break;
//					}
//				}
				allOut.remove(pw);
				System.out.println(host + "下线了，当前在线人数：" + allOut.size());
				try {
					socket.close();
				} catch (Exception e2) {
				}
			}
		}
	}
}
