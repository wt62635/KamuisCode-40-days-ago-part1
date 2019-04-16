package Exception;
/**
 * 自定义异常
 * 通常我们使用自定义异常来定义业务逻辑问题
 * 
 * 年龄不合法异常
 * 当年龄范围在0-100之外时会抛出该异常
 * @author Administrator
 *
 */
public class IllegalAgeException extends Exception{
	private static final long serialVersionUID = 1L;//通过Eclipse自动生成版号

	//继承父类Exception的构造器
	public IllegalAgeException() {
		super();
	}

	public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public IllegalAgeException(String message, Throwable cause) {
		super(message, cause);
	}

	public IllegalAgeException(String message) {
		super(message);
	}

	public IllegalAgeException(Throwable cause) {
		super(cause);
	}
	
}
