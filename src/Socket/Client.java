package Socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 聊天室客户端
 * @author Administrator
 *
 */
public class Client {
	/*
	 * java.nat.Socket 套接字
	 * Scoket封装了TCP连接盒通讯的细节，
	 * 使用它可以通过两条流的读写完成与远端计算机的数据交互。
	 */
	private Socket socket;
	/**
	 * 构造方法，用来初始化客户端
	 */
	public Client() {
		try {
			/*
			 * 实例化Socket时需要传入两个参数：
			 * 1：服务端计算机的IP地址
			 * 2：服务端应用程序打开的服务端口
			 * 我们通过IP可以找到网络上的服务端计算机
			 * 通过端口连接到该机器上的服务端应用程序
			 * 
			 * 实例化Socket的过程就是连接的过程，
			 * 若服务器没有响应这里会抛出异常。
			 */
			System.out.println("正在连接服务端……");
			socket = new Socket("127.0.0.1",8088);
			System.out.println("已连接！");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 客户端开始工作的方法
	 */
	public void start() {
		try {
			//启动用于读取服务端发送过来的消息的线程
			Thread t = new Thread(new ServerHandler());
			t.start();
			/*
			 * Socket提供的方法：
			 * OutputStream getOutputStream()
			 * 获取的字节输出流写出的字节会通过网络发送给远端计算机。 
			 */
			PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"utf-8")),true);
			
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("输入文字：");
				String line = sc.nextLine();
				pw.println(line);
				}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Client client = new Client();
		client.start();
	}
	/**
	 * 该线程负责读取服务端发送过来的信息
	 * @author Administrator
	 *
	 */
	private class ServerHandler implements Runnable{
		public void run() {
			try {
				//创建输入流读取服务端发送过来的消息
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
				//从服务器端发送过来的消息
				String message = null;
				while((message = br.readLine())!=null){
					System.out.println(message);
				}				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

