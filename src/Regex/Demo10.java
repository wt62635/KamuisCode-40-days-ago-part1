package Regex;
/*
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//和网络相关的操作
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Demo10 {

/**
* @param args
*/

    public static void main(String[] args) throws IOException {
        //1.1  创建一个URL对象
       URL url=new URL("https://www.douban.com/group/topic/8845032/");
        //1.2  打开连接
        URLConnection con=url.openConnection();
       //1.3设置连接网络超时时间  单位为毫秒
       con.setConnectTimeout(1000 * 10);
       //1.4 通过流 操作读取指定网络地址中的文件 
       BufferedReader bufr = new BufferedReader(new InputStreamReader(con.getInputStream())); 
       String line = null; 
       //1.5 匹配email的正则
       String regex = "[a-zA-Z0-9_-]+@\\w+\\.[a-z]+(\\.[a-z]+)?";
       //1.6 使用模式的compile()方法生成模式对象
       Pattern p = Pattern.compile(regex); 
       //1.7
       while((line = bufr.readLine()) != null) { 
       Matcher m = p.matcher(line); 
          while(m.find()) { 
          System.out.println(m.group());// 获得匹配的email 
          } 
       } 

    }
}