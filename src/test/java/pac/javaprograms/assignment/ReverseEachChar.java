package pac.javaprograms.assignment;

public class ReverseEachChar {

	public static void main(String[] args) 
	{
		
		
		String s="welcome to Tumkur";
		String [] str=s.split(" ");
		for(int i=0;i<str.length;i++) {
			String s1=str[i];
			char [] ch=s1.toCharArray();
			for(int j=ch.length-1;j>=0;j--)
			{
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
			

	}

}
