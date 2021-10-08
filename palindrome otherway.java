import java.util.Scanner;

class palindrome{

	public static void main(String[] args){

		String str,rev="";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string or number");
		str = in.nextLine();
		int l = str.length();
		for(int i=l-1;i>=0;i--){
			rev = rev + str.charAt(i);
		}
		if(str.equals(rev))
			System.out.println("String/Number is a Palindrome.");

		else
			System.out.println("String/Number is not a Palindrome.");
		
	}

}