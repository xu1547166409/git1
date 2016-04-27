package xu;

public class Count
{
	public static void main(String[] args)
	{
		Count count=new Count();
		count.count1();

	}

	public void count1()
	{
		int sum=0;
		int j=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				j = i;
				System.out.print(j+",");
				sum += j;
			}
		}
		System.out.println("\n"+sum);
	}
}