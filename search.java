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

    //search key, ini fungsi untuk mencari key kunci
    public Node searchByKey(Node head, String key) {
        Node current = head;
        while (current != null) {
            //mengubah nama senjata ke lowercase agar mudah dibandingkan
            if (current.namaSenjata.toLowerCase().contains(key.toLowerCase())) {
                // print semua data node yang mengandung key
                System.out.println("Senjata dengan nama '" + key + "' ditemukan:");
                System.out.println("Nama: " + current.namaSenjata);
                System.out.println("Stok: " + current.stok);
                System.out.println("id: " + current.id);
                System.out.println("Harga: " + current.harga);
            }
            current = current.next;
        }
        return null; 
        //retunr null jika tidak ada
    }
    //ini fungsi untuk binary search dengan paramater head dan target harga(harga)
    private Node binarySearchDescending(Node head, int targetHarga) {
        Node current = head;

        while (current != null) {
            if (current.harga == targetHarga) {
                return current; // Mengembalikan node jika targetHarga ditemukan
            } else if (current.harga < targetHarga) {
                current = current.prev; // Cari di sebelah kiri
            } else {
                current = current.next; // Cari di sebelah kanan
            }
        }

        return null; // Tidak ditemukan
    }
    //ini fungsi search harga dengan binary search
    public void searchByHargaDescending(Node head, int targetHarga) {
        //isi node result dengan hasil binary search
        Node result = binarySearchDescending(head, targetHarga);
        //tampilkan nilai yang dicari
        if (result != null) {
            System.out.println("Senjata dengan harga " + targetHarga + " ditemukan");
            System.out.println("Nama: " + result.namaSenjata);
            System.out.println("Stok: " + result.stok);
            System.out.println("Harga: " + result.harga);
    
            Node nextNode = result.next;
            Node prevNode = result.prev.prev.prev;
            
            //tampilkan nilai yang sebelum key yang dicari
            if (nextNode != null) {
                System.out.println("Terletak sebelum:");
                System.out.println("Nama: " + nextNode.namaSenjata);
                System.out.println("Stok: " + nextNode.stok);
                System.out.println("Harga: " + nextNode.harga);
            }
            
            //tampilkan nilai yang setelah key yang dicari
            if (prevNode != null) {
                // Perbaikan disini
                Node prevPrevNode = prevNode.prev;
                System.out.println("Terletak setelah:");
                System.out.println("Nama: " + prevPrevNode.namaSenjata);
                System.out.println("Stok: " + prevPrevNode.stok);
                System.out.println("Harga: " + prevPrevNode.harga);
            }
        } else {
            System.out.println("Senjata dengan harga " + targetHarga + " tidak ditemukan.");
        }
    }
    

}

