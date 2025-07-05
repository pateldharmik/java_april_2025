package jun28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoIterator {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		Iterator<Integer> iterator = list.iterator();

		while (iterator.hasNext()) {
			Integer name = iterator.next();
			if (name.equals(30)) {
				iterator.remove();
			}
		}
		System.out.println(list);
	}
}
