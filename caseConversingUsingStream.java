import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String str = "Hello GoodMorning...";
	    String	mystr = str.chars().mapToObj(ch -> {
		                      if(Character.isUpperCase(ch))
		                       mystr+=Character.toLowerCase(ch);
		                      else if(Character.isLowerCase(ch))
		                       mystr+=Character.toUpperCase(ch);
		                      else
		                       mystr+=ch;})
		         .map(String::valueOf)
		        .collect(Collectors.joining());
		//	System.out.println("Converted String :" + mystr);

	}
}