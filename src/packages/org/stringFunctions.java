package packages.org;

public class stringFunctions {


	public static void main(String[] args) {
		String s = "sales";
		String s1= "Admin";
		int a  = s.length();
		System.out.println(a);
		boolean b = s.equals(s1);
		System.out.println(b);
		String lowercase = s.toLowerCase();
		System.out.println(lowercase);
		String Uppercase = s.toUpperCase();
		System.out.println(Uppercase);
		int indexOf = s.indexOf("e");
		System.out.println(indexOf);
		boolean contains = s.contains("s");
		System.out.println(contains);
		int lastIndexOf = s.lastIndexOf("s");
		System.out.println(lastIndexOf);
		String concat = s.concat(s1);
		System.out.println(concat);
		String trim = s.trim();
		System.out.println(trim);
	}

}
