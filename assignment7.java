package assignment7;

public class assignment7 {

	public static void main(String[] args) {
		int i,j,k;
		String s="xyz";
		int n=s.length();
		for(i=1;i<=s.length();i++)
		{
			k=i;
			for(j=0;j<n;j++)
			{
				String q=s.substring(j,k);
				System.out.println(q);
				k++;
			}
			n--;
			
		}
		

	}

}
