package packages.org;

import java.util.TreeSet;
import java.util.Set;

public class TreeSet {

	public static void main(String[] args) {
		Set<Object> b = new TreeSet<String>();
		b.add(25);
		b.add("sekar");
		b.add(20);
		System.out.println(b);
		int size = b.size();
		System.out.println(size);
		boolean isempty = b.isEmpty();
		System.out.println(isempty);
		boolean contains = b.contains(20);
		System.out.println(contains);
	}

}
