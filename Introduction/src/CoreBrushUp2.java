import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 */
/**
 * 
 */
/**
 * 
 */
public class CoreBrushUp2 {
	public static void main(String[] args) {
		int[] arr1 = {1,3,94,2,4,5,6,7,9,10,122,44,42};
		
		for(int i=0 ; i<arr1.length; i++)
		{
			if(arr1[i] % 2 == 0)
			{
				System.out.println(arr1[i]);
				break;
			
			}
			else
			{
				System.out.println(arr1[i]+ " is not the multiples of 2 ");
			}
		}
		
		//ArrayList
		ArrayList<String> a = new ArrayList<String>();
		a.add("Maggie");
		a.add("Jim");
		a.add("Kotty");
		a.add("Selenium");
		a.remove(2);
		System.out.println(a.get(1));
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));	
		}
		System.out.println("**********************************");	
		//Enhanced For Loop
		for(String val:a)
		{
			System.out.println(val);	
		}
		
		//item present in arrayList
		System.out.println(a.contains("Selenium"));
		
		//To conver normal array to arrayList
		String[] name = {"Maggie", "Selenium", "Course"};
		List<String> nameArrayList=Arrays.asList(name);
		nameArrayList.contains("Selenium");
		
	}
}
