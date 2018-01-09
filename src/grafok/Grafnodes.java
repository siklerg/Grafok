package grafok;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;

public class Grafnodes {

    private int data;
    private int neighboursNumber;
    private Grafnodes[] neighbourNodes;
    private static ArrayList<Grafnodes> gnodes = new ArrayList<>(); // ebbe fogjuk tárolni azokat a node-kat, amelyeket elértünk

    public Grafnodes(int data, int neighboursNumber) {
        this.data = data;
        this.neighboursNumber = neighboursNumber;
        this.neighbourNodes = new Grafnodes[neighboursNumber];
    }


    public int getData() {
        return data;
    }

    public void setNeighbour(int index, Grafnodes node) {
        this.neighbourNodes[index] = node;
    }

    private Grafnodes getNeighbour(int index) {
        return neighbourNodes[index];
    }

    public static void printNeighbours(Grafnodes node) {
        System.out.println(node.getData() + "\'s neighbours: ");
        for (int i = 0; i < node.neighbourNodes.length; i++) {
            System.out.println(node.getNeighbour(i).getData());
        }
    }

    private static void useNeighbours(Grafnodes node) {
        if (node.neighbourNodes != null) { // itt nézzük meg, hogy a node-nak van-e, vannak-e szomszédai
            for (int i = 0; i < node.neighbourNodes.length; i++) { // ha igen, akkor kiírjuk, és beletesszük a tömbjébe
                System.out.println(node.getNeighbour(i).getData());
                gnodes.add(node.neighbourNodes[i]);
            }
        }
    }

    public static void szelessegiBejaras(Grafnodes node) { // szélességi bejárás - bármelyik csúcsra meghívhatjuk
        System.out.println("Szélességi bejárás:");
        System.out.println(node.getData()); // kiírjuk a root adatát
        useNeighbours(node); // kiírjuk az első csúcshoz kapcsolódó csúcsok adatát, ha vannnak, és beletesszük őket a listába
        while (gnodes.size() != 0) { // addif fut a ciklus, amíg ki nem ürül a lista
            useNeighbours(gnodes.get(0)); // a lista első elemére meghívjuk a metódust, hogy kiírassuk a kapcsolódó csúcsokat, és lementsük őket
            gnodes.remove(0); /* törli a lista első elemét, így a soron következő csúcs lesz az első.
            Mivel sorba kerültek bele a csúcsok, ezért a sorrend megfelelő lesz a kiíráshoz*/
        }
    }

    public static void melysegiBejaras(Grafnodes node) { // mélységi bejárás
        if (node != null) {
            System.out.println(node.getData());
            for (int i = 0; i < node.neighboursNumber; i++) {
                melysegiBejaras(node.getNeighbour(i));
            }
        }
    }
}
