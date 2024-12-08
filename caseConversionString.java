import java.util.*;
import java.lang.*;
import java.io.*;

class caseConversionString
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str = "Hello GoodMorning...";
	    	String	mystr ="";
		for(char ch:str.toCharArray()){
		    if(Character.isUpperCase(ch))
		        mystr+=Character.toLowerCase(ch);
		    else if(Character.isLowerCase(ch))
		        mystr+=Character.toUpperCase(ch);
		    else
		        mystr+=ch;
		}
		System.out.println("Converted String :" + mystr);

	}
}