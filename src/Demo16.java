
public class Demo16 {
	public static void main(String[] args) {
		String str = "上海自来水来自海上";
		boolean ok = checkWay1(str);
		System.out.println(ok?"是回文":"不是回文");
	}
	public static boolean checkWay1(String str) {
		for (int i = 0; i < str.length()/2; i++) {
			char c1 = str.charAt(i);
			char c2 = str.charAt(str.length()-1-i);
			if(c1!=c2) {
				return false;
			}
		}
		return true ;
	}
}
