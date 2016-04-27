package xu;

public class Narnum
{
	public static void main(String[] args)
	{
		Narnum narnum=new Narnum();
		narnum.num();
	}

	public void num()
	{
		int[] arr1=new int[9];
		int[] arr2=new int[9];
		int[] arr3=new int[9];
		int x=100;
		if(x<1000)
		{
			for(int i=1;i<=arr1.length;i++)
			{
				for(int j=0;j<=arr2.length;j++)
				{
					for(int k=0;k<=arr3.length;k++)
					{
						x=100*i+10*j+k;
						if(i*i*i+j*j*j+k*k*k==x)
						{
							System.out.print(x+",");
						}
					}
				}
			} 
		}
		System.out.print("已输出所有水仙花数");
	}

}
