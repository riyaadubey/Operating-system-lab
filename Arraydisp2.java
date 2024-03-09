import java.util.Scanner;
public class Arraydisp2
{
	public static void main(String[] args) {
		int[] array=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Original array:");
		for(int i=0;i<array.length;i++){
		    System.out.println("Enter integer:");
		    array[i]=sc.nextInt();
		}
		for(int i=0;i<array.length;i++){
		    System.out.println(array[i]);
		}

	}
}