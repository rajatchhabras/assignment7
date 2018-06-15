package assignment7;
import java.util.Scanner;
public class vowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
	String s1=s.replaceAll("[aeiouAEIOU]","");
		System.out.println(s1);
		

	}

}
