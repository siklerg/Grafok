package grafok;

import java.util.ArrayList;

public class Node {

    private int data;
    private Node left;
    private Node rigth;
    private static ArrayList<Node> nodes = new ArrayList<Node>(); // ebbe fogjuk tárolni zokat a node-kat, amelyeket elértünk

    Node(int data) {

        this.data = data;
    }

    public static void melysegiRendezes(Node node) { // mélységi bejárás
        if (node != null) {
            System.out.println((node.getData()));
            melysegiRendezes(node.getLeft());
            melysegiRendezes(node.getRigth());
        }
    }

    public static void szelessegiRendezes(Node node) { // szélességi bejárás - bármelyik csúcsra meghívhatjuk
        System.out.println(node.getData()); // kiírjuk a root adatát
        getNodes(node); // kiírjuk az első csúcshoz kapcsolódó csúcsok adatát, ha vannnak, és beletesszük őket a listába
        while (nodes.size()!=0) { // addif fut a ciklus, amíg ki nem ürül a lista
            getNodes(nodes.get(0)); // a lista első elemére meghívjuk a metódust, hogy kiírassuk a kapcsolódó csúcsokat, és lementsük őket
            nodes.remove(0); /* törli a lista első elemét, így a soron következő csúcs lesz az első.
            Mivel sorba kerültek bele a csúcsok, ezért a sorrend megfelelő lesz a kiíráshoz*/
        }
    }

    private static void getNodes(Node node) { // kiírjuk a kapcsolódó csúcsok értékeit( ha vannak), és lementjük a listába az adott csúcsot
        if (node != null) {
            if (node.getLeft() != null) {
                System.out.println(node.getLeft().getData());
                nodes.add(node.getLeft());
            }
            if (node.getRigth() != null) {
                System.out.println(node.getRigth().getData());
                nodes.add(node.getRigth());
            }
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRigth() {
        return rigth;
    }

    public void setRigth(Node rigth) {
        this.rigth = rigth;
    }
}
