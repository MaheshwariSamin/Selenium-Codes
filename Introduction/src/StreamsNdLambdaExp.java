import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamsNdLambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Count the number of names starting with Alphabet "a"
		//@Test
		public void regular(){
			ArrayList<String> names = new ArrayList<String>();
			names.add("Abhi");
			names.add("Ram");
			names.add("Ani");
			names.add("Suni");
			names.add("Aarti");
			names.add("Akshay");
			int count = 0;
			
			for (int i=0; i<names.size(); i++)
			{
				String actual=names.get(i);
				if(actual.startsWith("A"))
				{
					count++;
				}
			}
			System.out.println(count);
		}
		@Test
		public void StreamFilter()
		{
			ArrayList<String> names = new ArrayList<String>();
			names.add("Abhi");
			names.add("Ram");
			names.add("Ani");
			names.add("Suni");
			names.add("Aarti");
			names.add("Akshay");
			//Streams and lambda expression
			//there is no life for intermediate operations if there is no terminal operation
			//terminal op will execute only if inter op (filter) returns true
			//we can create Stream
			//how to use filter in Stream API
			Long c=names.stream().filter(s->s.startsWith("A")).count();
			System.out.println(c);
			
			Long d = Stream.of("Abhi","Ani","Suni","Akshay","Aarati","Ram").filter(s ->
			{
				s.startsWith("A");
				return true;
			}).count();
		}
		
}

