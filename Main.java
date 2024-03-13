import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner o=new Scanner(System.in);
	    System.out.print("enter the value :");
	    int num =o.nextInt();
	    int countodd=0;
	    int counteven=0;
	    while(num>0)
	    {
	        int n=num%10;
	        //System.out.println(n);
	        if(n%2==0)
	        {
	            counteven=counteven+1;
	        }
	        else
	        {
	            countodd=countodd+1;
	        }
	        num=num/10;
	        
	    }
		System.out.println("num of odd Numbers  :"+countodd);
		System.out.println("num of even Numbers :"+counteven);
	}
}
