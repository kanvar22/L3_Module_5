
import java.util.ArrayList;

public class PracticeArrayList {
	static int st = 0;

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("bob");
		names.add("billy");
		names.add("hi");
		names.add("billy");
		names.add("jim");
		names.add("bobby");
		names.add("hey");
		names.add("hi");
		names.add("bob");
		names.add("name");
		names.add("bob");
		names.add("what");
		names.add("hi there");
		names.add("hello");
		names.add("it");
		names.add("really");

		for (String t : names) {
			if (t.equals("bob")) {
				st += 1;
				System.out.println("" + st);
			}
		}
	}
}
