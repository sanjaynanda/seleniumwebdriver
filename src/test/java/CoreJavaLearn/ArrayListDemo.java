package CoreJavaLearn;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList myarr=new ArrayList();
		myarr.add(34);
		myarr.add("dfjsdl");
		myarr.add("dfsdfj");
		myarr.add(446);
		
		System.out.println("entries printing using for loop");
		for(Object x:myarr)
		{
			System.out.println(x);
			
		}
		
		System.out.println("entries printing using conventional for loop");
		for(int i=0;i<=myarr.size()-1;i++)
		{
			
			System.out.println(myarr.get(i));
		}
		
		
	}

}
