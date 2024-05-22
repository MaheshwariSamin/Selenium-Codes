
public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo d = new MethodDemo();
		d.getData();
		String name = d.getString();
		System.out.println(name);
		String name1 = getData1();
		getData2();
		MethodDemo2 d1 = new MethodDemo2();
		d1.getUserData();
		

	}
	
	//Why method??? -- if there is a need to resuse any set of codes then we create a method and then call them
	public void getData() {
		System.out.println("Hello World!");
	}
	
	public String getString() {
		System.out.println("Hello World!");
		return "Maggie";
	}
	
	public static String getData1() {
		return "Maggie";
	}		
	public static String getData2() {
			return "POPPY";
	}
}
