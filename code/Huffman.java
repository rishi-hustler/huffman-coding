import java.util.PriorityQueue;
import java.util.Scanner;

// BY RISHI HUSTLER

// Node of Huffman Tree
class HuffmanNode {
    char ch;
    int freq;
    HuffmanNode left, right;

    HuffmanNode(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
        left = right = null;
    }
}

public class Huffman{

    // Print Huffman Codes by traversing the tree
    static void printCodes(HuffmanNode root, String code) {
        if (root == null)
            return;

        // If leaf node, print character and its code
        if (root.left == null && root.right == null) {
            System.out.println(root.ch + " : " + code);
        }

        printCodes(root.left, code + "0");
        printCodes(root.right, code + "1");
    }

    // Build Huffman Tree
    static void buildHuffmanTree(char[] chars, int[] freqs) {

        PriorityQueue<HuffmanNode> pq =
                new PriorityQueue<>((a, b) -> a.freq - b.freq);

        // Create leaf nodes and add to priority queue
        for (int i = 0; i < chars.length; i++) {
            pq.add(new HuffmanNode(chars[i], freqs[i]));
        }

        // Build the tree
        while (pq.size() > 1) {
            HuffmanNode left = pq.poll();
            HuffmanNode right = pq.poll();

            HuffmanNode parent =
                    new HuffmanNode('-', left.freq + right.freq);
            parent.left = left;
            parent.right = right;

            pq.add(parent);
        }

        HuffmanNode root = pq.poll();

        System.out.println("\nHuffman Codes:");
        printCodes(root, "");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of characters: ");
        int n = sc.nextInt();

        char[] chars = new char[n];
        int[] freqs = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter character and frequency: ");
            chars[i] = sc.next().charAt(0);
            freqs[i] = sc.nextInt();
        }

        buildHuffmanTree(chars, freqs);
        sc.close();
    }
}
