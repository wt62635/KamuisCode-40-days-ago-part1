package Regex;

public class Demo12 {
	public static void main(String[] args) {
		/*
		 * 演示：过滤文本中的敏感词，将敏感词
		 * 全部替换(replace)为XX
		 * 
		 * 替换字符串str的被正则匹配的文本为
		 * “替换文本”，返回值是替换以后的副本(新)字符串
		 * 
		 * str.replaceAll(参数1正则,参数2替换文本)
		 * 
		 * str.replaceAll("前字符[字符集]后字符","替换文本")
		 */
		String str = "那楼被爆破之前，我就看见一群Acer在喊：旅人救世剑！猴子PY小！";
		String ss = str.replaceAll("[旅PY]", "X");
		System.out.println(ss);
	}
}
