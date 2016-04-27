package xu;


import java.util.Scanner;

public class Sms	//定义Sms类
{
	private Student[] stus = new Student[3];	//定义学生数组Student[3]，用于保存学生对象，学生对象用于保存学生属性。
	private int index = 0;	
	

	//增
	public void add(Student stu)	//定义一个公共的add方法，传入stu，stu是用于临时接收学生对象的
	{
		if(index>=stus.length)
		{
			Student[] demo = new Student[stus.length+3];	//则新定义一个demo数组，用于拓展原数组。保存更多的学生对象。
			System.arraycopy(stus,0,demo,0,stus.length);
			stus = demo;
		}
		stus[index++] = stu;
	}


	//删
	public void deleteById(long id)
	{

	}


	//查，通过id
	public Student queryById(long id)	//定义了一个queryById方法，传入long id
	{
		Student stu = null;
		for(int i = 0;i<=index;i++)	//定义一个i，作为学生数组stus的索引元素。
		{
			if(stus[i].getId() == id)
			{
				stu = stus[i];
				break;
			}
		}
		return stu;
	} 
	//查看所有学生信息
	public Student[] queryAll()		//定义一个queryAll方法，
	{
		Student[] demo = new Student[index];	//新建一个demo数组，传入index的值
		System.arraycopy(stus,0,demo,0,index);
		return demo;
	}


	public void menu()
	{
		System.out.println("------学生信息管理系统------");
		System.out.println("-      1.查看所有学生      -");
		System.out.println("-      2.添加学生信息      -");
		System.out.println("-      3.删除学生信息      -");
		System.out.println("-      4.修改学生信息      -");
		System.out.println("-      5.查看学生信息      -");
		System.out.println("-        exit              -");
		System.out.println("-        help              -");
		System.out.println("----------------------------");
	}


		public static void main(String[] args)
		{ 
			Sms sms = new Sms();
			sms.menu();
			Scanner scanner = new Scanner(System.in);

			while(true)
			{
				System.out.print("请输入功能编号：");
				String option = scanner.nextLine();
				System.out.println("输入了："+option);
				switch(option)
				{
					case"1"://查询所有
						System.out.println("以下是所有学生: ");
						Student[] stus = sms.queryAll();
						for(Student stu : stus) 
					{
							System.out.println(stu);
						}
						System.out.println("总计: "+stus.length);
						break;


					case"2"://添加学生
						while(true)
					{
						System.out.println("请输入学生信息如【id#name#age】或输入break返回上一层目录");
						String stuStr = scanner.nextLine();
						if(stuStr.equals("break")){
							break;
						}
						//分割用户输入，定义了一个stuArr接收分割之后的元素，之后直接用add调用。
						String[] stuArr = stuStr.split("#");
						long id = Long.parseLong(stuArr[0]);
						String name = stuArr[1];
						int age = Integer.parseInt(stuArr[2]);
						
						Student stu = new Student(id,name,age);
						sms.add(stu);
						System.out.println("保存成功！");
					}
						break;


					case"3"://删除学生
						break;


					case"4"://修改学生信息
						break;


					case"5"://查看学生通过id
					while(true)
						{
							System.out.print("请输入要查询的学生id: ");
							String id = scanner.nextLine();
							if(id.equals("break"))
							{
								break;
							}
							Student stu = sms.queryById(Long.parseLong(id));
							System.out.println("以下是你要查询的id");
							System.out.println(stu!=null?stu:" no found !");
						}
						break;


					case"exit":
						System.out.println("bye bye");
						System.exit(0);//这一行用于阻止程序直接跳到menu页，也就是说系统是默认跳到menu的
					
					
					case"help":
						sms.menu();
						break;
					default:
						System.out.println("错误的输入，重新选择功能编号!");
				}
			}
		}
}