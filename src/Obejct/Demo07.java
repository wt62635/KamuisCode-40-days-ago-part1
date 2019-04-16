package Obejct;

public class Demo07 {
	public static void main(String[] args) {
		/*
		 * 包装类案例:提取商品价格,计算商品总价?
		 */
		//编号, 名称, 价格 , 个数, 产地
		String data = "1, 手办, 500, 1.28, 天朝";
		String arr[] = data.split(",\\s");
		double price = Double.parseDouble(arr[3]);
		System.out.println(price);//1.28
		//计算总价
		int qty = Integer.parseInt(arr[2]);
		double total = qty*price;
		System.out.println(total);//640.0
	}
}
