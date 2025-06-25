package jun24;

import javax.imageio.ImageTranscoder;
import java.util.*;

public class ListRemoveDuplicates {
	public static void main(String[] args) {

		//Using HashSet, TreeSet.
		/*List<Integer> list = Arrays.asList(10, 20, 30, 54, 36, 4, 20, 34, 36, 54, 100);

		HashSet<Integer> set = new HashSet<>(list);

		TreeSet<Integer> treeSet = new TreeSet<>(list);

		System.out.println(treeSet.tailSet(30,true));
		System.out.println(treeSet.headSet(34));

		TreeSet<Integer> treeSet2 = new TreeSet<>(treeSet.tailSet(34,true));
		System.out.println(treeSet2);

		System.out.println(treeSet);*/


		//Using Iterator to perform remove operation
		List<String> names = new ArrayList<>();
		names.add("Dharmik");
		names.add("Edward");
		names.add("Utsav");

		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String name  = it.next();
			if (name.equals("Dharmik")) {
				it.remove();
			}
		}
		System.out.println(names);
	}
}
