package jun21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
/*
		list.add(2,25);
		System.out.println(list);

		list.remove(2);
		System.out.println(list);

		list.addFirst(05);
		System.out.println(list);

		list.removeFirst();
		System.out.println(list);

		System.out.println(list.contains(30));
		System.out.println(list.isEmpty());
		list.removeAll(list);
		System.out.println(list.isEmpty());

		System.out.println(list.size());
		list.clear();
		System.out.println(list);

		System.out.println(list.lastIndexOf(20));
		list.add(20);
		System.out.println(list.lastIndexOf(20));

		System.out.println(list.getFirst());
*/
		System.out.println(list.contains(30));
		list.add(4, 60);
		System.out.println(list);
	}
}
