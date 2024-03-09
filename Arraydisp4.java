import java.util.Arrays;
import java.util.Scanner;
public class Arraydisp4
{
	public static void main(String[] args) {
		int[] a=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Original array:");
		for(int i=0;i<a.length;i++){
		    System.out.println("Enter integer:");
		    a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
		    System.out.println(a[i]);
		}

	}
}
