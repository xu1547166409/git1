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
		System.out.println("-------------书籍信息管理系统-------------");
		System.out.println("|                                        |");
		System.out.println("|             1.增加书籍信息             |");
		System.out.println("|             2.删除书籍信息             |");
		System.out.println("|             3.修改书籍信息             |");
		System.out.println("|             4.查看所有书籍信息         |");
		System.out.println("|             5.编号查看书籍信息         |");
		System.out.println("|               exit                     |");
		System.out.println("|               help                     |");
		System.out.println("|                                        |");
		System.out.println("---------------- 作者：xu ----------------");
	}


}