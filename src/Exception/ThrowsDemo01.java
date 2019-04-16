package Exception;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * 子类重写父类含有throws声明异常抛出的方法时对该方法的重写规则。
 * @author Administrator
 *
 */
public class ThrowsDemo01 {
	public void dosome() throws IOException,AWTException{
		
	}
}

class Son extends ThrowsDemo01{
	//子类重写父类方法时：
	
	/*	//允许仅抛出部分异常
	public void dosome() throws IOException{		
	}*/

	/*	//抛出父类方法中抛出异常的子类型异常
	public void dosome() throws FileNotFoundException{
		
	}*/
	
	/*	//也可以不再抛出任何异常
	public void dosome(){
		
	}*/
	/*	//不允许抛出额外异常
	public void dosome() throws SQLException{
		
	}*/
	
	/*	//不允许抛出父类方法抛出异常的父类型异常
	public void dosome() throws Exception{
		
	}*/
	
}