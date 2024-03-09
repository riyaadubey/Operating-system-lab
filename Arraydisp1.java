public class Arraydisp1
{
	public static void main(String[] args) {
		String[] array=new String[5];
		array[0]="my";
		array[1]="name";
		array[2]="is";
		array[3]="riya";
		array[4]="dubey";
		System.out.println("Original array:");
		for(int i=0;i<array.length;i++){
		    System.out.println("Element at index"+i+":"+array[i]);
		}
	}
}