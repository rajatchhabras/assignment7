package assignment7;
import java.util.Scanner;
public class count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			int p=s1.indexOf(" ",i);
			if(p==-1)
			{
				break;
			}
			else
			{
				i=p;
				count++;
				
			}
		}
		System.out.println(count+1);
	

	}

}
