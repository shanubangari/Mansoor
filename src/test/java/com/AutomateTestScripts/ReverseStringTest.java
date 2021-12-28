package com.AutomateTestScripts;

public class ReverseStringTest {

	public static void main(String[] args) {
		/*System.out.println("Reverse the String");
		String name="jyoti";
		for(int i=name.length()-1; i>=0; i--){
			System.out.print(name.charAt(i));
			}
*/
		//Prime Number
		
		int n=141;
		int temp=n;
		int rev=0;
		while(n!=0) {
			rev=rev*10+(n%10);
			n=n/10;
		}
		
		if(temp==rev)
			System.out.println("Given number is Palindrome");
		else
			System.out.println("Given number is not Palindrome");
		
	}

}
