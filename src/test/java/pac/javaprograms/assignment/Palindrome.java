package pac.javaprograms.assignment;

public class Palindrome {

	public static void main(String[] args) {
		
		String s1="madam";
		char[]ch=s1.toCharArray();
		int count=0;
		for(int i=0,j=ch.length-1;i<ch.length/2;i++,j--)
		{
			if(ch[i]!=ch[j])
			{
				count++;
				break;
			}
		}
		if(count==0)
			
		{
			System.out.println("The given string is Palindrome");
		}
		else
		{
			System.out.println("The given string is not palindrome");
		}

	}

}
