package pac.javaprograms.assignment;

public class LengthOfString {

	public static void main(String[] args) {
		 String helloWorld="This is hello world";
		  System.out.println("length of helloWorld string :"+getLengthOfString(helloWorld));
		  }
		 
		public static int getLengthOfString(String str)
		 {
		  int length=0;
		  char[] strCharArray=str.toCharArray();
		  for(char c:strCharArray)
		  {
		   length++;
		  }
		  return length;

	}

}
