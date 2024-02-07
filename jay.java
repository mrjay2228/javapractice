public class jay
{
	public static void main (String[] args) 
	{
		int num = 24;
		int num1=18;
		int j=num>num1?num:num1;
		
		int k=1;
		for (int i=1;i<=j;i++)
		{
			if(num%i==0&&num1%i==0)
            k=i;
		}
		System.out.println(k);
	}
}
