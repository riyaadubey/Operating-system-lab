import java.util.Scanner;
public class Arraydisp3
{
	public static void main(String[] args) {
		String[] array=new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Original array:");
		for(int i=0;i<array.length;i++){
		    System.out.println("Enter string");
		    array[i]=sc.nextLine();
		}
		for(int i=0;i<array.length;i++){
		    System.out.println(array[i]);
		}

	}
}



