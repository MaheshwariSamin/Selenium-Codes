
public class CoreBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is an object or String Literal
		String s1 = "Welcome Maggie";
		String s2 = "Welcome Maggie"; // in this case values are same so in the backend java side only 1 object will be created to store this value
		
		//with new keyword
		String s3 = new String("Welcome");
		String s4 = new String("Welcome");
		
		//How to split a string
		String	s = "Welcome to Maggie's Selenium Into";
		String[] splittedString = s.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		System.out.println(splittedString[3]);
		System.out.println(splittedString[1].trim());
		for(int i=0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i));
		}
	}

}
