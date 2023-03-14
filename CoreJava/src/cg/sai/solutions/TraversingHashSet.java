package cg.sai.solutions;

//Write a program to traverse(or iterate) HashSet-34
import java.util.*;

public class TraversingHashSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<Integer>();
		int num;
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the number " + (i + 1));
			num = sc.nextInt();
			set.add(num);
		}

		// Creating Iterator to iterate over a HashSet
		Iterator<Integer> it = set.iterator();
		System.out.println("Contents of HashSet: ");
		while (it.hasNext()) {
			int number = (Integer) it.next();
			System.out.print(number + " ");
		}
		sc.close();
	}

}
