package nuiPractice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Winnie the pooh";
		String newStr = "";
		char ch;
		
		for(int i =0; i < str.length(); i++) {
			ch = str.charAt(i);
			newStr = ch + newStr;
		}
		System.out.println("Reversed word: "+ newStr);
	}

}
