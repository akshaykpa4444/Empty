package empty;

import java.util.StringTokenizer;

public class StringSplit2 {

	public static void main(String[] args) {
		StringTokenizer string = new StringTokenizer("ABCD.INX");
		System.out.println(string.nextToken("."));
	}

}
