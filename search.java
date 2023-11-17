// search.java
public class search {
    // Linear Search berdasarkan stok
    public Node linearSearchByStok(Node head, int targetStok) {
        Node current = head;
        while (current != null) {
            if (current.stok == targetStok) {
                return current; // Mengembalikan node jika targetStok ditemukan
            }
            current = current.next;
        }
        return null; // Mengembalikan null jika targetStok tidak ditemukan
    }

    //search key
    public Node searchByKey(Node head, String key) {
        Node current = head;
        while (current != null) {
            if (current.namaSenjata.toLowerCase().contains(key.toLowerCase())) {
                // Node contains the key, print or handle as needed
                System.out.println("Senjata dengan nama '" + key + "' ditemukan:");
                System.out.println("Nama: " + current.namaSenjata);
                System.out.println("Stok: " + current.stok);
                System.out.println("ID: " + current.id);
                System.out.println("Harga: " + current.harga);
            }
            current = current.next;
        }
        return null; // You may choose to return the found node if needed
    }
        // Binary Search berdasarkan harga (Ascending)

        public void searchByHarga(Node head, int targetHarga) {
            sort sorter = new sort(); // Buat objek sorter
            int position = sorter.binarySearch(head, targetHarga); // Gunakan objek sorter
        
            if (position != -1) {
                Node foundNode = sorter.getNodeAtPosition(head, position); // Gunakan objek sorter
                Node nextNode = (foundNode.next != null) ? foundNode.next : null;
                Node prevNode = (position > 0) ? sorter.getNodeAtPosition(head, position - 1) : null;
        
                System.out.println("Senjata dengan harga " + targetHarga + " ditemukan pada posisi ke-" + position + ":");
                System.out.println("Nama: " + foundNode.namaSenjata);
                System.out.println("Stok: " + foundNode.stok);
                System.out.println("Harga: " + foundNode.harga);
        
                if (nextNode != null) {
                    System.out.println("Terletak setelah:");
                    System.out.println("Nama: " + nextNode.namaSenjata);
                    System.out.println("Stok: " + nextNode.stok);
                    System.out.println("Harga: " + nextNode.harga);
                }
        
                if (prevNode != null) {
                    System.out.println("Terletak sebelum:");
                    System.out.println("Nama: " + prevNode.namaSenjata);
                    System.out.println("Stok: " + prevNode.stok);
                    System.out.println("Harga: " + prevNode.harga);
                }
            } else {
                System.out.println("Senjata dengan harga " + targetHarga + " tidak ditemukan.");
            }
        }
        

    
}
