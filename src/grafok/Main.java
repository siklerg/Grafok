package grafok;

public class Main {

    public static void main(String[] args) {


        Node root = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);

        root.setLeft(node1);
        root.setRigth(node2);

        node1.setLeft(node3);
        node1.setRigth(node4);

        node2.setLeft(node5);

        node4.setLeft(node6);
        node4.setRigth(node7);

        node5.setLeft(node8);

        //System.out.println("Mélységi bejárás: ");
        //Node.szOrder(root);

        //System.out.println("Szélességi bejárás: ");
        //Node.mOrder(root);


    }
}
