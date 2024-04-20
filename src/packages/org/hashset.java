package packages.org;

import java.util.HashSet;
import java.util.Set;

public class hashset {

	public static void main(String[] args) {
		Set<Object> b = new HashSet<Object>();
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
