package stack.impl.java;

public class StringToStringArray {

	public static void main(String[] args) {

		String str = " i like this program";
		String strArray[] = str.split(" ");
		for(int i=0;i<strArray.length;i++) {
			System.out.println(strArray[i]);
		}
	}

}
