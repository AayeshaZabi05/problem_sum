package java123;
import java.util.Scanner;
public class Table {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println("the multiplication table for +n+ is");
		for(int i=0;i<=10;i++)
		{
			System.out.println(n*i);
		}
		System.out.println("the reverse order is");
		for(int i=10;i>=1;i--)
		{
			System.out.println(n*i);
		}
        sc.close();
	}

}
