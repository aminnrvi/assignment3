import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, String> table = new MyHashTable<>();
        Random rand = new Random();

        for (int i = 0; i < 10000; i++) {
            int id = rand.nextInt(10000);
            String name = "Name" + rand.nextInt(10000);
            MyTestingClass key = new MyTestingClass(id, name);
            table.put(key, "Value" + i);
        }

        BST<Integer, String> tree = new BST<>();
        tree.put(5, "five");
        tree.put(3, "three");
        tree.put(7, "seven");
        tree.put(2, "two");
        tree.put(4, "four");
        tree.put(6, "six");
        tree.put(8, "eight");

        System.out.println("BST Size: " + tree.size());

        System.out.println("\nBST Contents:");
        for (BST<Integer, String>.Node node : tree.iterator()) {
            System.out.println("key is " + node.getKey() + " and value is " + node.getValue());
        }

        tree.delete(5);
        System.out.println("\nAfter deleting 5:");
        for (BST<Integer, String>.Node node : tree.iterator()) {
            System.out.println("key is " + node.getKey() + " and value is " + node.getValue());
        }
        System.out.println("New size: " + tree.size());

        System.out.println("\nHashTable Distribution:");
        int[] distribution = table.getBucketDistribution();
        for (int i = 0; i < distribution.length; i++) {
            System.out.println("Bucket " + i + ": " + distribution[i] + " elements");
        }
    }
}