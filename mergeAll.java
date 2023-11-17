public class mergeAll {
    Node head;
    Node tail;
    
    public mergeAll(){
        this.head = null;
        this.tail = null;
    }
    public void createData(String namaSenjata, int stok, String id, int harga){
        if(head == null){
            head = new Node(namaSenjata, stok, id, harga);
            tail = head;
        }
        else{
            Node newnode = new Node(namaSenjata, stok, id, harga);
            newnode.prev = tail;
            tail.next = newnode;
            tail = newnode;
        }
    }
    
    //sorting
    public void bubbleSort() {
        // Membuat objek dari kelas sort
        sort sorter = new sort();
        // Memanggil bubbleSortById dan memperbarui head setelah pengurutan
        head = sorter.bubbleSortByStok(head);
    }

    public Node insertionSortByHargaDescending(Node head) {
        sort sorter = new sort();
        head = sorter.insertionSortByHargaDescending(head);
        return head;
    }

    
    public Node getNodeAtPosition(Node head, int position) {
        Node current = head;
        for (int i = 0; i < position && current != null; i++) {
            current = current.next;
        }
        return current;
    }
    

    public void selectionSortByStok(){
        sort sorter = new sort();
        head = sorter.selectionSortByStok(head);
    }
    
    public int getCount(Node head, Node current) {
        int count = 0;
        Node temp = head;
        while (temp != null && temp != current) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    

    
    public Node linearSearchByStok(int targetStok) {
        search searcher = new search();
        Node result = searcher.linearSearchByStok(head, targetStok);

        // Menampilkan data jika ditemukan
        if (result != null) {
            System.out.println("Node dengan stok " + targetStok + " ditemukan:");
            System.out.println("Nama: " + result.namaSenjata);
            System.out.println("Stok: " + result.stok);
            System.out.println("id: " + result.id);
        } else {
            System.out.println("Node dengan stok " + targetStok + " tidak ditemukan.");
        }

        return result;
    }
    
    
    public void mergeSortByHargaAscending(){
        sort sorter = new sort();
        head = sorter.mergeSortByHargaAscending(head);
    }
    public void searchByKey(String key) {
        search searcher = new search();
        searcher.searchByKey(head, key);
    }
    public void printwithHarga(){
        Node cur = head;
        while(cur != null){
            System.out.println("id = " + cur.id);
            System.out.println("Nama = " + cur.namaSenjata);
            System.out.println("stok = " + cur.stok);
            System.out.println("Harga = " + cur.harga);
            cur = cur.next;
        }
    }
    public void printNotstok(){
        Node cur = head;
        while(cur != null){
            System.out.println("id = " + cur.id);
            System.out.println("Nama = " + cur.namaSenjata);
            System.out.println("Harga = " + cur.harga);
            cur = cur.next;
        }
    }
    public void printList(){
        Node cur = head;
        while(cur != null){
            System.out.println("id = " + cur.id);
            System.out.println("Nama = " + cur.namaSenjata);
            System.out.println("stok = " + cur.stok);
            cur = cur.next;
        }
    }

    
}
