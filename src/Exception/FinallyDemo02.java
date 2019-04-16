package Exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 在IO中使用异常处理机制
 * @author Administrator
 *
 */
public class FinallyDemo02 {
	public static void main(String[] args){
		FileOutputStream fis = null;
		try {
			fis = new FileOutputStream("fos.txt");
			fis.write(null);
		}catch(IOException e){
			System.out.println("出错！");
		}catch(NullPointerException e){
			System.out.println("空指针异常！");
		}finally {
				try {
					if(fis!=null) {
					fis.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
