
public class ReverseArray 
{
	public void rotateArray(int arr[], int count)
	{
		int rotatedArray[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rotatedArray[(i + count) % arr.length] = arr[i];
        }
        for (int i = 0; i < rotatedArray.length; i++) {
            System.out.print(rotatedArray[i] + " ");
	}
}
}