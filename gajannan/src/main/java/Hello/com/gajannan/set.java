package Hello.com.gajannan;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class set {

	public static void main(String args[])
	{
		ArrayList<String> ob2 = new ArrayList<String>();
		ob2.add("I am one");
		ob2.add("I am two");
		ob2.add("I am three");
		Iterator<String> iterate_me = ob2.iterator();
		while(iterate_me.hasNext())
				{
			System.out.println(iterate_me.next());
				}
		System.out.println("Working in Arraylist");
      set s1 = new set();
      s1.Set_example();
}
	
public String Set_example()
{
	HashSet<String> s1= new HashSet();
	s1.add("I am one");
	s1.add("I am two");
	s1.add("I am three");
	
	Iterator<String> iterate_me = s1.iterator();
	while(iterate_me.hasNext())
			{
		System.out.println(iterate_me.next());
			}
	System.out.println("Working in HashSet");

	return null;
}


}

