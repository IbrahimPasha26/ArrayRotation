import java.util.Scanner;
public class Array 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array length.");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter elements in an Array");
		for(int i = 0; i<=arr.length-1; i++)
		{
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter rotation Count");
		int count = scan.nextInt();
		ReverseArray ra = new ReverseArray();
		ra.rotateArray(arr, count);
	}
}
