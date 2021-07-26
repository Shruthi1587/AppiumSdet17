package pac.javaprograms.assignment;

public class ReverseString {

	public static void main(String[] args)
	{
		String s1="shruthi";
		char[]ch=s1.toCharArray();
		
		
		for(int i=0,j=ch.length-1;i<ch.length/2;i++,j--)
		{
			
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}	
				
		String res=new String(ch);
		System.out.println("input string="+s1);
		System.out.println("Output String="+res);

	}

}
