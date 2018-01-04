package grafok;

public class Main {

    public static void main(String[] args) {

        //nodes();
        grafNodes();
    }


    public static void grafNodes() {
        Grafnodes gnode1 = new Grafnodes(1, 4);
        Grafnodes gnode2 = new Grafnodes(2, 2);
        Grafnodes gnode3 = new Grafnodes(3, 3);
        Grafnodes gnode4 = new Grafnodes(4, 1);
        Grafnodes gnode5 = new Grafnodes(5, 3);
        Grafnodes gnode6 = new Grafnodes(6, 0);
        Grafnodes gnode7 = new Grafnodes(7, 0);
        Grafnodes gnode8 = new Grafnodes(8, 0);
        Grafnodes gnode9 = new Grafnodes(9, 0);
        Grafnodes gnode10 = new Grafnodes(10, 0);
        Grafnodes gnode11 = new Grafnodes(11, 1);
        Grafnodes gnode12 = new Grafnodes(12, 0);
        Grafnodes gnode13 = new Grafnodes(13, 1);
        Grafnodes gnode14 = new Grafnodes(14, 0);
        Grafnodes gnode15 = new Grafnodes(15, 0);
        Grafnodes gnode16 = new Grafnodes(16, 0);

        gnode1.setNeighbour(0, gnode2);
        gnode1.setNeighbour(1, gnode3);
        gnode1.setNeighbour(2, gnode4);
        gnode1.setNeighbour(3, gnode5);

        gnode2.setNeighbour(0, gnode6);
        gnode2.setNeighbour(1, gnode7);

        gnode3.setNeighbour(0, gnode8);
        gnode3.setNeighbour(1, gnode9);
        gnode3.setNeighbour(2, gnode10);

        gnode4.setNeighbour(0, gnode11);

        gnode5.setNeighbour(0, gnode12);
        gnode5.setNeighbour(1, gnode13);
        gnode5.setNeighbour(2, gnode14);

        gnode11.setNeighbour(0, gnode15);

        gnode13.setNeighbour(0, gnode16);

        // gnode1.printNeighbours(gnode1);

        Grafnodes.szelessegiBejaras(gnode1);

        System.out.println("Mélységi rendezés: ");
        Grafnodes.melysegiBejaras(gnode1);
    }

    public static void nodes() { // bináris gráf
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

        System.out.println("Mélységi bejárás: ");
        Node.melysegiRendezes(root);

        System.out.println();

        System.out.println("Szélességi bejárás: ");
        Node.szelessegiRendezes(root);
    }
}
