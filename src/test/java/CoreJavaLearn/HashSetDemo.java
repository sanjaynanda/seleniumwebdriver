package CoreJavaLearn;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet myset=new HashSet();
		myset.add(453);
		myset.add(34);
		myset.add("dfjd");
		ArrayList myarr2=new ArrayList(myset);
		for(int i=0;i<=myarr2.size()-1;i++)
		{
			System.out.println(myarr2.get(i));
		}
	

	}

}
