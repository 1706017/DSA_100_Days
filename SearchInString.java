import java.io.*;
import java.lang.*;
import java.util.*;

/*
* Author :Amrit Manash
  Code Created: 10th August 
  Description: This code will search for character from a string 
*/
class SearchInString
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the string");
		String str=sc.nextLine();

		System.out.println("Enter the character to search");
		char ch=sc.next().charAt(0);

		SearchInString obj=new SearchInString();
		boolean val=obj.doSearch(str,ch);

		if(val==true)
		  {
		  	System.out.println("Character is found in string");
		  }
		else
		{
			System.out.println("Characater is not found in string");
		}


	}

	public boolean doSearch(String str,char ch)
	{
		boolean res=false;
        
        if(str.length()==0)
        	return false;

        else
        {
          for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
				res=true;

			else
			{
				continue;
			}
		}	
        }
      return res;
		
	}
}