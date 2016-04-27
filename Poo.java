package xu;
/**
这之前报了错，是溢出，错误在19行，而且java与c#的数组比较不知道
*/

public class Poo
{
	public static void main(String[] args)
	{
		Poo poo=new Poo();
		poo.po();

	}
	public void po()
	{
		int[] arr = new int[]{ 56,12,34,23,45};
		System.out.print("初始的数组是："+arr);
		int i;			//i是数组下标
		int temp = 1;
		for(i = 0;i <= arr.length;i++)
		{
			if((Convert.ToInt32(arr[i]) > (Convert.ToInt32(arr[i+1]))
			{
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;

			}
		}
		System.out.print(arr);
	}


}
