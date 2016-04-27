package xu;

public class Loop
{
	public static void main(String[] args){
		Loop loop=new Loop();
		loop.test1();
	}
	public void test1(){
	int total = 0;
	for(int i = 1;i<=10;i++){
	if(i%2 == 0){
	total += i;
	}
		}
		System.out.println("total:"+total);
		}
}