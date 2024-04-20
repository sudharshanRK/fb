package packages.org;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {

	public static void main(String[] args) {
		Set<Object> b = new LinkedHashSet<Object>();
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
