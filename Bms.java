package xu;
import 

public class Bms
{
	private Books[] bo = new Books[3];
	private int index = 0;
	public static void main(String[] args){
		Bms bms = new Bms();
		bms.menu();
	}

	public void menu(){
		System.out.println("-------------�鼮��Ϣ����ϵͳ-------------");
		System.out.println("|                                        |");
		System.out.println("|             1.�����鼮��Ϣ             |");
		System.out.println("|             2.ɾ���鼮��Ϣ             |");
		System.out.println("|             3.�޸��鼮��Ϣ             |");
		System.out.println("|             4.�鿴�����鼮��Ϣ         |");
		System.out.println("|             5.��Ų鿴�鼮��Ϣ         |");
		System.out.println("|               exit                     |");
		System.out.println("|               help                     |");
		System.out.println("|                                        |");
		System.out.println("---------------- ���ߣ�xu ----------------");
	}


}