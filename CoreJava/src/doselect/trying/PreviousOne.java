package doselect.trying;

import java.util.ArrayList;

public class PreviousOne {
	public static void main(String[] args) {
		Implementation implementation = new Implementation();

		ArrayList<String> name = new ArrayList<>();
		name.add("A");
		name.add("B");
		name.add("C");
		name.add("D");

		// Input for changeOccurrence: (name, "B", "S")
		ArrayList<String> modifiedName = implementation.changeOccurrence(name, "B", "S");
		System.out.println(modifiedName); // Output: [A, S, C, D]

		// Input for getIndex: name
		String firstName = implementation.getIndex(name);
		System.out.println(firstName); // Output: A

		// Input for addAfter: (name, "B", "S")
		ArrayList<String> modifiedName2 = implementation.addAfter(name, "B", "S");
		System.out.println(modifiedName2); // Output: [A, B, S, C, D]

	}

}
