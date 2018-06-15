package assignment7;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String c=sc.nextLine();
		
		StringBuffer sb=new StringBuffer(c);
		sb.reverse();
		System.out.println("The Reversed String is "+sb);

	}

}
