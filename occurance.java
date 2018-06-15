package assignment7;
import java.util.Scanner;
public class occurance {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String s1=sc.nextLine();
	int i=s.indexOf(s1);
	if(i==-1)
		System.out.println("The String Doesnot Exists ");
	else
		System.out.println("The String  Exists at index "+i);
		

	}

}
