package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo05 {
	public static void main(String[] args) {
		/*
		 * 正则的使用实例：
		 * 从一个收到货地址中获得手机号码和邮箱地址。
		 */
		String address = "某某省某某市某某区某某路XX号，某某楼某某栋X层 名称，收件人0086 12345678910 "
		 +"+86 12345678910"
		 +"008612345678910"
		 +"收，邮箱地址：kamui_h@outlook.cn";
		//获取11位手机号码，其中（+86或0086）?表示可有可无
		//()表示分组
		//|表示或者
		String NumberCheck = "(\\+86|0086)?\\s?1\\d{10}"; 
		Utils.test(NumberCheck, address);
		//获取邮箱地址
		System.out.println(findEmail(address));
	}
	public static String findEmail(String str){
		Pattern p=Pattern.compile("\\w+([a-z0-9A-Z]+[-|\\.]?)+(\\.\\w)*@\\w+(\\.\\w{2,3}){1,3}"); //使用正则表达式匹配
		Matcher m=p.matcher(str);
		while(m.find()){
			return m.group();
		}
		return "";
	}
}
