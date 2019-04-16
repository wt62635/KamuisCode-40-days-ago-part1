package Obejct;

public class Demo06 {
	public static void main(String[] args) {
		/*
		 * Java中与人进行交互的核心方法,
		 * 被封装到包装类中.
		 * 
		 * parse方法:一个简单的理解是,将字符串转换为基本数据类型.
		 * 
		 * 准确理解:实现人和计算机之间沟通桥梁
		 * 1.将人类熟悉的10进制字符串转换为,计算机内部能够处理的2进制(基本类型是2进制)
		 * 2.将计算机内部的2进制转换为人能够是别的10进制字符串.
		 * 3.一般情况下,这些方法都是自动调用.如果需要手动转换的时候,就调用这些方法完成转换.
		 * 如果输入字符串无法完成转换,会抛出异常:NumberFormatException
		 *
		 * 实际过程:将人所能理解的十进制与字符串文字,通过转换成底层2进制交付计算机进行2进制补码
		 * 最终获得由计算机处理后的结果并转换回指定的基本数据类型.
		 */
		Boolean b = true ;
		System.out.println(b);//输出布尔类型值:true
		System.out.println(b.toString());//输出字符串:"true"
		
		String str = "886";
		//将10进制数字字符串转换为2进制int
		int n = Integer.parseInt(str);
		n++;
		//将2进制的int转换为10进制的字符串
		System.out.println(Integer.toString(n));//输出:887
		
		//double测试例
		String str1 = "10.25";
		double d = Double.parseDouble(str1);
		d = d+1.5;
		System.out.println(Double.toString(d));//输出:11.75
	}
}
