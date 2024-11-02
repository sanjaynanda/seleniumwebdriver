package day7;

public class ReverseString {

	public static void main(String[] args) {
		String s="SANJAY";
		String rev="";
		/*char a[]=s.toCharArray();
		System.out.println(a);
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
			
		}
System.out.println(rev);*/
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
