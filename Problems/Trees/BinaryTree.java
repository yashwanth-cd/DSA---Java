package Problems.Trees;

public class BinaryTree {

  static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  static int index = -1;

  public Node BuildTree(int nodes[]) {
    index++;
    if (nodes[index] == -1) {
      return null;
    }
    Node newNode = new Node(nodes[index]);
    newNode.left = BuildTree(nodes);
    newNode.right = BuildTree(nodes);

    return newNode;
  }

  public static void preOrder(Node root) {
    if (root == null) {
      System.out.print("-1" + " ");
      return;
    }
    System.out.print(root.data + "  ");
    preOrder(root.left);
    preOrder(root.right);
  }

  public static void main(String[] args) {
    int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
    BinaryTree tree = new BinaryTree();
    Node root = tree.BuildTree(nodes);
    preOrder(root);
  }
}
