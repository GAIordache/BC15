package btree;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		BinaryTree btree = new BinaryTree();
		btree.add(4);
		btree.add(1);
		btree.add(7);
		btree.add(9);
		btree.add(3);
		btree.traverseInOrder();
		btree.delete(7);
		System.out.println("$$$$$$$$$$$$$$$$$$$");
		btree.traverseInOrder();

		
		GenericBinaryTree<String> st = new GenericBinaryTree<>((v1,v2) -> v1.compareTo(v2));
		st.add("ala");
		st.add("gala");
		st.add("sala");
		st.add("bala");
		st.add("porto");
		st.traverseInOrder();
		
		Set<String> sets = new TreeSet<>((v1,v2) -> v1.compareTo(v2));
		sets.add("ala");
		sets.add("gala");
		sets.add("sala");
		sets.add("bala");
		sets.add("porto");
		System.out.println(sets);
	}

}
