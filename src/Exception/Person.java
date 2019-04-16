package Exception;
/**
 * 使用当前类测试异常的抛出2
 * @author Administrator
 *
 */
public class Person {
	private int age;

	public int getAge() {
		return age;
	}
	/**
	 * 当一个方法中使用throw抛出一个异常时，就要在当前方法声明的同时使用throws声明
	 * 该异常的抛出，只有抛出RuntimeException及其子类异常时不强制要求，否则编译不通过。
	 * @param age
	 * @throws Exception
	 */
	public void setAge(int age) throws IllegalAgeException {
		if(age<0||age>100) {
			//主动实例化一个异常对外抛出
			throw new IllegalAgeException("年龄不合法");
		}
		this.age = age;
	}
	public static void main(String[] args) {
		System.out.println("程序开始了");
		Person p = new Person();
		//语法满足，但是不满足业务需求
		/*
		 * 当我们调用一个含有throws声明异常抛出的方法时，编译器要求我们必须处理这个异常，
		 * 否则编译不通过。处理异常的方式有两种：
		 * 1：使用try-catch主动处理这个异常
		 * 2：在当前方法上继续使用throws声明抛出具体使用哪种处理方式取决于实际情况，
		 * 看该异常应当由谁解决。
		 */
			try {
				p.setAge(10000);
			} catch (IllegalAgeException e) {
				e.printStackTrace();
			}
			System.out.println(p.getAge());
			System.out.println("程序结束了");
		}
	}
