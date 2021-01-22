package empty;

import java.util.StringTokenizer;

public class StringSplit {

	public static void main(String[] args) {
 		StringTokenizer string = new StringTokenizer("This is Java Training");
		while (string.hasMoreTokens()) {
			System.out.println(string.nextToken());

		}
	}
}
