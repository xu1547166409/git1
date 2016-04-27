package xu;


import java.util.Scanner;

public class Sms	//����Sms��
{
	private Student[] stus = new Student[3];	//����ѧ������Student[3]�����ڱ���ѧ������ѧ���������ڱ���ѧ�����ԡ�
	private int index = 0;	
	

	//��
	public void add(Student stu)	//����һ��������add����������stu��stu��������ʱ����ѧ�������
	{
		if(index>=stus.length)
		{
			Student[] demo = new Student[stus.length+3];	//���¶���һ��demo���飬������չԭ���顣��������ѧ������
			System.arraycopy(stus,0,demo,0,stus.length);
			stus = demo;
		}
		stus[index++] = stu;
	}


	//ɾ
	public void deleteById(long id)
	{

	}


	//�飬ͨ��id
	public Student queryById(long id)	//������һ��queryById����������long id
	{
		Student stu = null;
		for(int i = 0;i<=index;i++)	//����һ��i����Ϊѧ������stus������Ԫ�ء�
		{
			if(stus[i].getId() == id)
			{
				stu = stus[i];
				break;
			}
		}
		return stu;
	} 
	//�鿴����ѧ����Ϣ
	public Student[] queryAll()		//����һ��queryAll������
	{
		Student[] demo = new Student[index];	//�½�һ��demo���飬����index��ֵ
		System.arraycopy(stus,0,demo,0,index);
		return demo;
	}


	public void menu()
	{
		System.out.println("------ѧ����Ϣ����ϵͳ------");
		System.out.println("-      1.�鿴����ѧ��      -");
		System.out.println("-      2.���ѧ����Ϣ      -");
		System.out.println("-      3.ɾ��ѧ����Ϣ      -");
		System.out.println("-      4.�޸�ѧ����Ϣ      -");
		System.out.println("-      5.�鿴ѧ����Ϣ      -");
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
				System.out.print("�����빦�ܱ�ţ�");
				String option = scanner.nextLine();
				System.out.println("�����ˣ�"+option);
				switch(option)
				{
					case"1"://��ѯ����
						System.out.println("����������ѧ��: ");
						Student[] stus = sms.queryAll();
						for(Student stu : stus) 
					{
							System.out.println(stu);
						}
						System.out.println("�ܼ�: "+stus.length);
						break;


					case"2"://���ѧ��
						while(true)
					{
						System.out.println("������ѧ����Ϣ�硾id#name#age��������break������һ��Ŀ¼");
						String stuStr = scanner.nextLine();
						if(stuStr.equals("break")){
							break;
						}
						//�ָ��û����룬������һ��stuArr���շָ�֮���Ԫ�أ�֮��ֱ����add���á�
						String[] stuArr = stuStr.split("#");
						long id = Long.parseLong(stuArr[0]);
						String name = stuArr[1];
						int age = Integer.parseInt(stuArr[2]);
						
						Student stu = new Student(id,name,age);
						sms.add(stu);
						System.out.println("����ɹ���");
					}
						break;


					case"3"://ɾ��ѧ��
						break;


					case"4"://�޸�ѧ����Ϣ
						break;


					case"5"://�鿴ѧ��ͨ��id
					while(true)
						{
							System.out.print("������Ҫ��ѯ��ѧ��id: ");
							String id = scanner.nextLine();
							if(id.equals("break"))
							{
								break;
							}
							Student stu = sms.queryById(Long.parseLong(id));
							System.out.println("��������Ҫ��ѯ��id");
							System.out.println(stu!=null?stu:" no found !");
						}
						break;


					case"exit":
						System.out.println("bye bye");
						System.exit(0);//��һ��������ֹ����ֱ������menuҳ��Ҳ����˵ϵͳ��Ĭ������menu��
					
					
					case"help":
						sms.menu();
						break;
					default:
						System.out.println("��������룬����ѡ���ܱ��!");
				}
			}
		}
}