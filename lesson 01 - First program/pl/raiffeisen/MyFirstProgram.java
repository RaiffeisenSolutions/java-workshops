package pl.raiffeisen;
import java.util.List;
import java.util.ArrayList;
import com.google.common.base.Joiner;

public class MyFirstProgram {
	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println("Names: " + getNames());
	}

	private static List<String> getNames() {
		List<String> names = new ArrayList<>();
		names.add("Jan");
		names.add("Karol");
		names.add("Robert");
		return names;
	}
}