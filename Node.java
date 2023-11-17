import java.util.UUID;
class Node {
    Node next;
    Node prev;
    String id;
    String namaSenjata;
    int harga;
    int stok;
    private String generateRandomId() {
        // Menghasilkan UUID dan mengambil bagian terakhirnya
        String uuid = UUID.randomUUID().toString();
        return "Node@" + uuid.substring(uuid.lastIndexOf('-') + 1);
    }
    public Node(String namaSenjata, int stok, String id,int harga){
        this.namaSenjata = namaSenjata;
        this.id = generateRandomId();
        this.harga = harga;
        this.stok = stok;
        this.next = null;
        this.prev = null;
    }
}