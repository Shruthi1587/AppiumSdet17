package pac.javaprograms.assignment;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String s1="This is My country";    
        
        //Removes the white spaces using regex    
        s1 = s1.replaceAll("\\s+", "");    
            
        System.out.println("String after removing all the white spaces : " + s1);    
    }    

	}


