package myfirst;

public class Josephus {
	public static void main(String ars[])
	{
	int no_of_person=5,k=3;
	int alive=solution(no_of_person,k);
	System.out.print(alive);
	}
 public static int solution(int n,int k)
 {
	if(n==1)return 0;
	int x=solution(n-1,k);
	int y=(x+k) %n;
	return y;
 }
	
}

//
//no of person=5
//0 1 2 3 4  where k=3 so every third person will kill itself and again count will start from next person 
//1st time 2 will get killed and 
//2nd time 0 will be killed 
