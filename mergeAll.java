//class untuk gabungan semua sort dan search
public class mergeAll {
    Node head;
    Node tail;
    //konstruktor
    public mergeAll(){
        this.head = null;
        this.tail = null;
    }
    //fungsi membuat data, jika kondisi kosong langsung menjadi head dan tail
    public void createData(String namaSenjata, int stok, String id, int harga){
        if(head == null){
            head = new Node(namaSenjata, stok, id, harga);
            tail = head;
        }
        else{
            //jka tidak ksong maka addlast
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
    //ini merupakan fungsi definisi dari insertion sort dari file sort.java
    public Node insertionSortByHargaDescending(Node head) {
        //membuat Node sort baru
        sort sorter = new sort();
        head = sorter.insertionSortByHargaDescending(head);
        return head;
        //mengembalikan nilai head yang sudah urut
    }

    //fungsi mendapat posisi tertentu
    public Node getNodeAtPosition(Node head, int position) {
        Node current = head;
        for (int i = 0; i < position && current != null; i++) {
            current = current.next;
        }
        return current;
    }
    //ini definisi quick sort pada file sort.java
    public Node quickSortByHargaAscending(Node head){
        sort sorter = new sort();
        head = sorter.quickSortByHargaAscending(head);
        return head;
    }
//ini definisi quick sort pada file selection.java
    public void selectionSortByStok(){
        sort sorter = new sort();
        head = sorter.selectionSortByStok(head);
    }
    ///ini fungsi menghitung jumlah node
    public int getCount(Node head, Node current) {
        int count = 0;
        Node temp = head;
        while (temp != null && temp != current) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    

    //ini fungsi mendefinsikan linearsearcg dari file search.java, paramater berupa stok
    public Node linearSearchByStok(int targetStok) {
        search searcher = new search();
        Node result = searcher.linearSearchByStok(head, targetStok);

        // Menampilkan data jika ditemukan,ini adalah tampilan console jika data yang dicari ada, ini
        //nilai debug jika ada masalah
        if (result != null) {
            System.out.println("Node dengan stok " + targetStok + " ditemukan:");
            System.out.println("Nama: " + result.namaSenjata);
            System.out.println("Stok: " + result.stok);
            System.out.println("id: " + result.id);
        } else {
            System.out.println("Node dengan stok " + targetStok + " tidak ditemukan.");
        }
        //mereturn hasil
        return result;
    }
    //ini merupakan fungsi deginisi shell sort dari file sort.java
    public Node shellSortByHargaAscending(Node head){
        sort sorter = new sort();
        head = sorter.shellSortByHargaAscending(head);
        return head;
    }
    //ini merupakan fungsi deginisi mergesort dari file sort.java
    public void mergeSortByHargaAscending(){
        sort sorter = new sort();
        head = sorter.mergeSortByHargaAscending(head);
    }
    //ini merupakan fungsi deginisi searchBykey  dari file search.java
    public void searchByKey(String key) {
        search searcher = new search();
        searcher.searchByKey(head, key);
    }
    //ini merupakan kondisi print dengan harga
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
    //kondisi print dengan stok
    public void printNotstok(){
        Node cur = head;
        while(cur != null){
            System.out.println("id = " + cur.id);
            System.out.println("Nama = " + cur.namaSenjata);
            System.out.println("Harga = " + cur.harga);
            cur = cur.next;
        }
    }
    //kondisi id dan harga
    public void printList(){
        Node cur = head;
        while(cur != null){
            System.out.println("id = " + cur.id);
            System.out.println("Nama = " + cur.namaSenjata);
            System.out.println("Harga = " + cur.harga);
            cur = cur.next;
        }
    }
    //kondisi id dan stok
    public void printList2(){
        Node cur = head;
        while(cur != null){
            System.out.println("id = " + cur.id);
            System.out.println("Nama = " + cur.namaSenjata);
            System.out.println("stok = " + cur.stok);
            cur = cur.next;
        }
    }

    
}
