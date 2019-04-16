package Socket;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int allOut[] = {10,55,13,64,89,657,846,259};
		int pw = 64;
		System.out.println(Arrays.toString(allOut));
		//将pw从allOut中删除
		for (int i = 0; i < allOut.length; i++) {
			if(allOut[i]==pw) {
				allOut[i] = allOut[allOut.length-1];
				allOut = Arrays.copyOf(allOut, allOut.length-1);
				break;
			}
		}
		System.out.println(Arrays.toString(allOut));
	}
}
