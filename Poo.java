package xu;
/**
��֮ǰ���˴��������������19�У�����java��c#������Ƚϲ�֪��
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
		System.out.print("��ʼ�������ǣ�"+arr);
		int i;			//i�������±�
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
