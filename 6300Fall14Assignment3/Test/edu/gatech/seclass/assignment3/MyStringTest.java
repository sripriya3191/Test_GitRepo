package edu.gatech.seclass.assignment3;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyStringTest {

	MyString s = new MyString();

	/**** Start of Set and Get String Test cases ****/
		@Test
		public void set_StringTest(){		
			//Setting and getting a valid string
			s.setString("Set a String");
			assertEquals("Strings are matching","Set a String",s.getString());
		}
		
		@Test
		public void set_getStringBlankTest(){	
			//Setting a blank String and retrieving
			s.setString("");
			assertEquals("Strings are matching","",s.getString());
		}
		
		@Test
		public void set_getStringNullTest(){		
			//Getting a Null String
			assertEquals("Strings are matching",null,s.getString());
		}
	/**** End of Set and Get String Test cases ****/
	
	/**** Start of getVowels Test cases ****/
		@Test
		public void getVowelsTest(){
			//Valid test to return vowels
			s.setString("Vowels Test");
			assertEquals("Vowels are returned","oee",s.getVowels());
		}
		
		@Test
		public void getVowelsCaseInsensitiveTest(){
			//Testing case insensitiveness with lower case and upper case
			s.setString("Vowels Test CAPITALS");
			assertEquals("Vowels are returned","oeeAIA",s.getVowels());
		}
		
		@Test
		public void getVowelsAbsenceTest(){
			//Get vowels from no vowels in a string
			s.setString("SDP cn");
			assertEquals("Vowels are not returned","",s.getVowels());
		}
		
		@Test
		public void getVowelsNullTest(){
			//Getting vowels from a null String
			assertEquals("Vowels are not returned","",s.getVowels());
		}
	/**** End of getVowels Test cases ****/
		
	/**** Start of getSubstring Test cases ****/
		@Test(expected=IndexOutOfBoundsException.class)
		public void getSubStringInvalidStartBoundsTest(){
			// Testing for Index out of Bounds with Inavlid start index
			s.setString("Sub String");
			String s1 = s.getSubstring(100,2);
		}
		
		@Test(expected=IndexOutOfBoundsException.class)
		public void getSubStringInvalidEndBoundsTest(){
			//Testing for Index out of bounds with Invalid end index
			s.setString("Sub String");
			String s1 = s.getSubstring(2,100);
		}
		
		@Test
		public void getSubstringValidBoundsTest(){
			//Testing with valid start and end index
			s.setString("This is my test");
			assertEquals("String subset is retreived","his ",s.getSubstring(2,5));
		}
		
		@Test
		public void getSubstringEqualBoundsTest(){
			//Testing with start and end equal index
			s.setString("This is my test");
			assertEquals("String subset is retreived","h",s.getSubstring(2,2));
		}
		
		@Test
		public void getSubstringLoopTest(){
			//Finding sub string in a loop for start > end scenario
			s.setString("This is my test");
			assertEquals("String subset is retreived","my testTh",s.getSubstring(9,2));
		}
		
		@Test
		public void getSubstringNullTest(){
			//Testing for substring of string null
			assertEquals("String subset is not returned","",s.getSubstring(2,5));
		}
	/**** End of getSubString Test cases ****/
		
	/**** Start of IndexOf Test cases ****/	
		@Test
		public void indexOfValidTest(){
			s.setString("Index of");
			assertEquals("Index is returned",7,s.indexOf('o'));
		}
		
		@Test
		public void indexOfCaseSensitiveTest(){
			s.setString("Iindex of");
			assertEquals("Index is returned",1,s.indexOf('I'));
		}
		
		@Test
		public void indexOfNullTest(){
			assertEquals("Index is not returned",-1,s.indexOf('o'));
		}
		
		@Test
		public void indexOfNotFoundTest(){
			s.setString("Iindex of");
			assertEquals("Index is not returned",-1,s.indexOf('K'));
		}
	/**** End of IndexOf Test cases ****/
	
	/**** Start of removeChar Test cases ****/
		@Test
		public void removeCharValidTest(){
			s.setString("Remove a char");
			s.removeChar('a');
			assertEquals("Removed String","Remove  chr",s.getString());
		}
		
		@Test
		public void removeCharCaseSensitiveTest(){
			s.setString("Remove a A char");
			s.removeChar('A');
			assertEquals("Removed String","Remove a  char",s.getString());
		}
		
		@Test
		public void removeCharNotFoundTest(){
			s.setString("Remove a char");
			s.removeChar('x');
			assertEquals("Removed String","Remove a char",s.getString());
		}
		
		@Test
		public void removeCharNullTest(){
			s.removeChar('a');
			assertEquals("Removed String",null,s.getString());
		}
	/**** End of removeChar Test cases ****/
	
	/**** Start of invert Test cases ****/
	
		@Test
		public void invertValidTest(){
			s.setString("My Srting reverse");
		    s.invert();
		    assertEquals("Reversed String","esrever gnitrS yM",s.getString());
		}
		
		@Test
		public void invertCaseSensitiveTest(){
			s.setString("Liril");
		    s.invert();
		    assertEquals("Reversed String","liriL",s.getString());
		}
		
		@Test
		public void invertNullTest(){
		    s.invert();
		    assertEquals("Reversed String",null,s.getString());
		}
    /**** End of invert Test cases ****/
}
