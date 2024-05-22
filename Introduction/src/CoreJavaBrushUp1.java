
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =5;
		String str1 = "Maggie";
		char letter = 'r';
		double dec = 5.99;
		boolean myresult  = true;
		
		System.out.println(num+ " is the value stored");
		System.out.println(str1);
		
		//Arrays
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 9;
		
		int[] arr1 = {1,2,3,4,9,2,4,55,553};
		System.out.println(arr1[3]);
		
		//For Loop
		for(int i = 0; i< arr.length; i++) //4
		{
		System.out.println(arr[i]);
		}
		
		String[] name = {"Maggie", "Seleium", "Course"};
		
		for(int i= 0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		//Enhanced For Loop
		for(String s:name)
		{
			System.out.println(s);
		}
		
	}

}
