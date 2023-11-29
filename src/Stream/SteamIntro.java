package Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SteamIntro {
//count the number of names strtg with letter A
	@Test
	public void regular() {
		ArrayList<String> names= new ArrayList<String>();
		names.add("Abijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		
		int count= 0;
		
		for(int i=0; i<names.size();i++) {
			
			String actual=names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
			
		} 		
		System.out.println(count);

	}
	@Test
	public static void streamFilter()
	{
		ArrayList<String> names= new ArrayList<String>();
		names.add("Abijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		//there is no life for intermediate op if there is no terminal op
		//terminal operation will execute only if internal op (filter) returns true
		//we can creates Stream
		//how to use filter in stream API
		Long c=names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		Long d= Stream.of("Abijeet","Don","Alekhya","Adam", "Ram" ).filter(s->
		{
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);
		//print all the names of ArrayList
		
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}
	
	@Test
	public static void streamMap()
	{
		ArrayList<String> names= new ArrayList<String>();
		names.add("man");
		names.add("Don");
		names.add("Women");
		
		//print names which has letter as "a" with uppercase
		
		Stream.of("Abijeet","Don","Alekhya","Adam", "Rama" ).filter(s->s.endsWith("a")).map(s->s.toUpperCase()).
		forEach(s->System.out.println(s));
		
		//print letters which has first letter as a and sorted
		List<String> names1= Arrays.asList("Abijeet","Don","Alekhya","Adam", "Rama");
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).
		forEach(s->System.out.println(s));
		
		//Merging 2 different lists
		Stream<String> newStream =Stream.concat(names.stream(), names1.stream());
		
		boolean flag= newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
	@Test
	public static void streamCollect()
	{
		List<String> ls= Stream.of("Abijeet","Don","Alekhya","Adam", "Rama").filter(s->s.endsWith("a")).
				map(s->s.toUpperCase()).collect(Collectors.toList());
				System.out.println(ls.get(0));
				//
		List<Integer>values= Arrays.asList(3,32,23,3,21,5,9);
		//print unique numbers from this array
		//sort this array - 3rd index
		values.stream().distinct().forEach(s->System.out.println(s));
		List<Integer> li= values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
	}
	

}
