# Huffman Coding (Java)

## 📌 Overview

**Huffman Coding** is a **lossless data compression algorithm** that assigns **variable-length binary codes** to characters based on their frequencies.

Characters with **higher frequency** get **shorter codes**, reducing overall storage size.

This implementation uses a **Greedy Algorithm** and a **Priority Queue (Min-Heap)**.

---

## 🚀 Algorithm Used

**Greedy Algorithm (Huffman’s Algorithm)**

### Steps:

1. Create a leaf node for each character with its frequency
2. Insert all nodes into a min-heap
3. Repeatedly:

   * Remove two nodes with minimum frequency
   * Combine them into a new node
   * Insert the new node back into the heap
4. Traverse the final Huffman Tree to generate codes

---

## 🧮 Time and Space Complexity

* **Time Complexity:** `O(N log N)`
* **Space Complexity:** `O(N)`

---

## 🛠️ Requirements

* Java 8 or later
* Any Java IDE or command-line environment

---

## 📂 Project Structure

```
HuffmanCoding.java
README.md
```

---

## ▶️ How to Run

1. Compile the program:

   ```bash
   javac HuffmanCoding.java
   ```
2. Run the program:

   ```bash
   java HuffmanCoding
   ```

---

## ⌨️ Sample Input

```
Enter number of characters: 6
Enter character and frequency: a 5
Enter character and frequency: b 9
Enter character and frequency: c 12
Enter character and frequency: d 13
Enter character and frequency: e 16
Enter character and frequency: f 45
```

---

## ✅ Sample Output

```
Huffman Codes:
f : 0
c : 100
d : 101
a : 1100
b : 1101
e : 111
```

*(Codes may vary but total cost remains optimal)*

---

## 🧠 Key Concepts

* Greedy Algorithms
* Priority Queue (Min-Heap)
* Binary Trees
* Data Compression

---

## 🔧 Customization Ideas

* Encode an actual string using the generated codes
* Decode a binary string back to text
* Print tree structure
* Use file input instead of console input

---

## 📚 Applications

* File compression (ZIP, GZIP)
* Multimedia compression
* Network data transmission
* Text encoding systems

---

## 📝 License

Free to use for educational, academic, and interview preparation.

