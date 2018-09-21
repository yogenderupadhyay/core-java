package core.java.practice.collections;
import java.util.ArrayList;
import java.util.List;
class ArrayListDemo1
{
	public static void main(String[] args)
	{
		List<String> obj = new ArrayList<>();
		String s;
		System.out.println("size of list "+obj.size());
		s=new String("element1");
		obj.add(s);
		s=new String("element2");
		obj.add(s);
		s=new String("element3");
		obj.add(s);
		s=new String("element4");
		obj.add(s);
		s=new String("element5");
		obj.add(s);
		s=new String("element6");
		obj.add(s);
		System.out.println("size of list after adding elements "+obj.size());
		System.out.println("array list after adding list "+obj);
		obj.remove(2);
		obj.remove("element5");
		System.out.println("list after removing elements "+obj);
		System.out.println("size of list after removing element"+obj.size());
		System.out.println("final list is");
		for(String i:obj)
		{
			System.out.println(i);
		}
	}
}