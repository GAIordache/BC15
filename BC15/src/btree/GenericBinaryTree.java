package btree;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class GenericBinaryTree<T> {
	private final Comparator<T> comparator;
	private Node<T> root;
	
	public GenericBinaryTree(Comparator<T> pComp) {
		comparator = pComp;
	}

	public Node<T> getRoot() {
		return root;
	}

	public void add(T value) {
		root = addRecursive(root, value);
	}

	private Node<T> addRecursive(Node<T> current, T value) {

		if (current == null) {
			return new Node(value);
		}
		int cmp = comparator.compare(value, current.value);
		if (cmp < 0) {
			current.left = addRecursive(current.left, value);
		} else if (cmp > 0) {
			current.right = addRecursive(current.right, value);
		}

		return current;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public int getSize() {
		return getSizeRecursive(root);
	}

	private int getSizeRecursive(Node<T> current) {
		return current == null ? 0 : getSizeRecursive(current.left) + 1 + getSizeRecursive(current.right);
	}

	public boolean containsNode(T value) {
		return containsNodeRecursive(root, value);
	}

	private boolean containsNodeRecursive(Node<T> current, T value) {
		if (current == null) {
			return false;
		}

		if (value.equals(current.value)) {
			return true;
		}
		int cmp = comparator.compare(value, current.value);

		return cmp < 0 ? containsNodeRecursive(current.left, value)
				: containsNodeRecursive(current.right, value);
	}

	public void delete(T value) {
		deleteRecursive(root, value);
	}

	private Node<T> deleteRecursive(Node<T> current, T value) {
		if (current == null) {
			return null;
		}

		if (value.equals(current.value)) {
			// Case 1: no children
			if (current.left == null && current.right == null) {
				return null;
			}

			// Case 2: only 1 child
			if (current.right == null) {
				return current.left;
			}

			if (current.left == null) {
				return current.right;
			}

			// Case 3: 2 children
			T smallestValue = findSmallestValue(current.right);
			current.value = smallestValue;
			current.right = deleteRecursive(current.right, smallestValue);
			return current;
		}
		int cmp = comparator.compare(value, current.value);

		if (cmp < 0) {
			current.left = deleteRecursive(current.left, value);
			return current;
		} else {
			current.right = deleteRecursive(current.right, value);
			return current;
		}

	}

	private T findSmallestValue(Node<T> root) {
		return root.left == null ? root.value : findSmallestValue(root.left);
	}

	public void traverseInOrder() {
		traverseInOrder(root);
	}

	public void traverseInOrder(Node<T> node) {
		if (node != null) {
			traverseInOrder(node.left);
			System.out.print(" " + node.value);
			traverseInOrder(node.right);
		}
	}

	public void traversePreOrder(Node<T> node) {
		if (node != null) {
			System.out.print(" " + node.value);
			traversePreOrder(node.left);
			traversePreOrder(node.right);
		}
	}

	public void traversePostOrder(Node node) {
		if (node != null) {
			traversePostOrder(node.left);
			traversePostOrder(node.right);
			System.out.print(" " + node.value);
		}
	}

	public void traverseLevelOrder() {
		if (root == null) {
			return;
		}

		Queue<Node> nodes = new LinkedList<>();
		nodes.add(root);

		while (!nodes.isEmpty()) {

			Node node = nodes.remove();

			System.out.print(" " + node.value);

			if (node.left != null) {
				nodes.add(node.left);
			}

			if (node.left != null) {
				nodes.add(node.right);
			}
		}
	}

	class Node<T> {
		T value;
		Node<T> left;
		Node<T> right;

		Node(T value) {
			this.value = value;
			right = null;
			left = null;
		}
	}
}
