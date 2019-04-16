package RAF;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Test01 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
		System.out.println(raf.length());
		raf.seek(0);
		System.out.println(raf.read());
	}
}
