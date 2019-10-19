package pallavi;
import java.util.ArrayList;
import java.util.List;

public class Per {

	static List<String> firstStringArray,secondStringArray;
	static int pattern=3;
	static boolean found;

	static void printPermutn(String str, String ans) {
		if (str.length() == 0) {
			firstStringArray.add(ans.substring(0,pattern));
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			printPermutn(ros, ans + ch);
		}
	}

	static void printPermutn1(String str, String ans) {
		if (str.length() == 0) {
			secondStringArray.add(ans.substring(0,pattern));
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			printPermutn1(ros, ans + ch);
		}
	} 

	public static void main(String[] args) {

		String s = "hack";
		String s1 = "indiahacks";
		
		
		firstStringArray = new ArrayList<String>();
		secondStringArray = new ArrayList<String>();
		
		printPermutn(s, "");
		printPermutn1(s1, "");

		for(String one:firstStringArray) {
			for(String two:secondStringArray) {
				if(one.equals(two)) {
					found=true;
					break;
				}
				else {
					found=false;
				}
			}
		}
		
		if(found) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

	}

}
