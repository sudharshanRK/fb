package packages.org;

import java.util.List;
import java.util.Vector;

public class vector {
	public static void main(String[] args) {
		List<Object> b = new Vector<Object>();
		b.add(25);
		b.add("sekar");
		b.add(20);
		System.out.println(b);
		int size = b.size();
		System.out.println(size);
		Object object = b.get(1);
		System.out.println(object);
		boolean contains = b.contains(20);
		System.out.println(contains);
		int index = b.indexOf(25);
		System.out.println(index);
		boolean addAll = b.addAll(b);
		System.out.print(addAll);
	}

}
