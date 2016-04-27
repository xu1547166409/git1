package xu;

public class Table
{
	public static void main(String[] args)
		{
		Table table=new Table();
		table.chap1();
		table.chap2();
		table.chap3();
		table.chap4();
		}

	public void chap1()
		{
		for(int i=1;i<=9;i++)
			{
			for(int j =1;j<=i;j++)
				{
				System.out.print( j+ "*"+i+ "="+j*i+ "\t");
				if(j==i)
					{
					System.out.println();
					}
				}
			}
			System.out.println("-------------分割线-----------");
		}



	public void chap2()
		{
		for(int i=1;i<=9;i++)
			{
			for(int j=9;j>=i;j--)
				{
				System.out.print( j+"*"+i+"="+j*i+"\t");
				if(j==i)
					{
					System.out.println();
					}
				}
			}
			System.out.println("-------------分割线-----------");
		}




	public void chap3()
		{
		for(int i=1;i<=9;i++)
			{
			for(int j=1;j<=i;j++)
				{ 
				int k=9;
				while (j==1&&k>i)
					{
						k--;
						System.out.print("        ");
					}
					System.out.print( j+ "*"+i+ "="+j*i+ "\t");
					if(j==i)
					{
					System.out.println();
					}
				}
			}
			System.out.println("-------------分割线-----------");
		}



		public void chap4()
			{
			for(int i=1;i<=9;i++)
				{
				for(int j=9;j>=i;j--)
					{
					int k=1;
					while(j==9&&k<i){
					k++;
					System.out.print("        ");
					}
					System.out.print( j+ "*"+i+ "="+j*i+ "\t");
					if(j==i)
						{
						System.out.println();
					}
				}
			}
			System.out.println("-------------(xu)-----------");
		}



}

 