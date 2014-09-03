package edu.gatech.seclass.assignment3;

public class MyString implements MyStringInterface {
	
	private String myString;
	
	@Override
	public void setString(String str) {
		// Sets the value of the class Variable as per the argument
        this.myString = str;
	}

	@Override
	public String getString() {
		// Returns the String that belongs to the object
		return this.myString;
	}

	@Override
	public String getVowels() {
		// Build a vowel string analyzing each individual character in the String
		String vowel_string="";
		if(this.myString!=null){
			for(int i=0;i<this.myString.length();i++){
				switch(this.myString.charAt(i)){
				case 'a':
				case 'A':
				case 'e':
				case 'E':
				case 'i':
				case 'I':
				case 'o':
				case 'O':
				case 'u':
				case 'U':
					vowel_string+=this.myString.charAt(i);
					break;
				default:
				}
			}
		}
		return vowel_string;
	}

	@Override
	public String getSubstring(int start, int end) {
		// Determines the Sub String of a given String.
		String sub_myString = "";
		if(this.myString !=null){
			try{	
			  //Determine sub string in a loop 
			  if(start>end){
				  sub_myString+= this.myString.substring(start-1,this.myString.length());
				  sub_myString+= this.myString.substring(0,end);
			    }
			  else
				  sub_myString = this.myString.substring(start-1,end);
				
			}catch(IndexOutOfBoundsException e){
				throw new IndexOutOfBoundsException("Start or end index or both is outside of the lenght of the String");
			}
		}
		return sub_myString;
	}

	@Override
	public int indexOf(char c) {
	 // Determines the index of a particular character
	 int result = -1;
	 if(this.myString!=null){
		result = this.myString.indexOf(c);
	 }
	 //To show case the not found case and null
	 if(result == -1)
		return result;
 	 else
		return result+1;
	}

	@Override
	public void removeChar(char c) {
	 // Removing a character is achieved by replacing the character with ""
	 if(this.myString!=null)
       this.myString = this.myString.replaceAll(Character.toString(c),"");
	}

	@Override
	public void invert() {
	 // Reverse function to make a reversal of the string
	 if(this.myString!=null){
		StringBuilder myString_Builder = new StringBuilder(this.myString);
		this.myString = myString_Builder.reverse().toString();
	 }
	}

}
