import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        int rent = sc.nextInt();
        int purchase = sc.nextInt();
        System.out.println((purchase-1)/rent);
        }
	}
}
