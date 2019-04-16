package IO;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 使用当前类测试对象流的对象读写操作
 * @author Administrator
 *
 */
public class Person01 implements Serializable {
	private String name;
	private int age;
	private String gender;
	private String otherInfo[];
	/*
	 * 当一个属性使用transient修饰后，那么进行序列化时这个值会被忽略。
	 * 忽略不必要的属性可以达到对象序列化瘦身操作，减少不必要的资源开销。
	 */
	
	public Person01(String name, int age, String gender, String[] otherInfo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.otherInfo = otherInfo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(String[] otherInfo) {
		this.otherInfo = otherInfo;
	}
	
	@Override
	public String toString() {
		return "Person01 [name=" + name + ", age=" + age + ", gender=" + gender + ", otherInfo="
				+ Arrays.toString(otherInfo) + "]";
	}
	
}
