
public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 3, 4,6,8, 12};
		for(int i =0; i<arr.length; i++)
		{
			if(arr[i]%2 ==0)
			{
				System.out.println(arr[i]);	
				break;
			}
			else
			{
				System.out.println(arr[i] + "\t Is not");	
			}
		}

	}

}
