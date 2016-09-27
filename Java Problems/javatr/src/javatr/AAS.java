package javatr;

public class AAS {

	private static int getStringMatchNumber(String input) {
	    char[] str = input.toCharArray();

	    int last = findMatches(str, 0);
	    System.out.println("Last unmatched index: " + (last - 1));

	    for(int i = str.length-1; i > 0; i--) {
	        Character c = str[i];
	        Character p = str[i-1];
	        if (Character.isLowerCase(c) && Character.isUpperCase(p)){
	            if (p == Character.toUpperCase(c))
	                return i;
	        }
	    }
	    return 0;
	}

	private static int findMatches(char[] str, int pos) {

	    if(pos+1 >= str.length) {
	        return pos;
	    }
	    Character c = str[pos];
	    Character p = str[pos+1];
	    int nextPos = 0;

	    System.out.println(c + " " + p);

	    if (Character.isUpperCase(c) && Character.isLowerCase(p)){
	         if (c == Character.toUpperCase(p)) {
	             System.out.println("Match found");
	             pos = pos+2;
	             pos = findMatches(str, pos);
	         } else {
	             System.out.println("Next lower case letter doesn't match. Stop.");
	         }
	    } else if(Character.isUpperCase(c) && Character.isUpperCase(p)) {
	        System.out.println("Trying to find inner Matches first");

	        nextPos = findMatches(str, pos+1);
	        if(nextPos < str.length)
	        {
	            p = str[nextPos];
	            System.out.println("Outer match character: " + p);
	            System.out.println(c + " " + p);

	            if ((Character.isUpperCase(c) && Character.isLowerCase(p)) && (c == Character.toUpperCase(p)))
	            {
	                System.out.println("Outer Match found");
	                pos = nextPos + 1;
	            } 
	            else 
	            {
	                pos = nextPos;
	            }
	        }
	        if(pos < str.length) 
	        {
	            pos = findMatches(str, pos);
	        }
	    } 
	    else 	
	    {
	        System.out.println("Lower case letter found, will return and find outer match");
	    }

	    return pos;
	}
	
	public static void main(String...args){
		AAS.getStringMatchNumber("ABC");
	}
}
