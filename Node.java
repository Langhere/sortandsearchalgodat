//ini library untuk id
import java.util.UUID;
//class Node sebagai wadah untuk Node next dan prev serta konstruktor default value untuk variabel" yang dibuthkan
//sepeti variabel dibawah ini
class Node {
    Node next;
    Node prev;
    String id;
    String namaSenjata;
    int harga;
    int stok;
    private String generateRandomId() {
        // Menghasilkan UUID dan mengambil bagian terakhirnya, ini akan menhgasilkan random id setiap di run
        String uuid = UUID.randomUUID().toString();
        return "Node@" + uuid.substring(uuid.lastIndexOf('-') + 1);
    }
    //default value untuk Node setiap dipanggil
    public Node(String namaSenjata, int stok, String id,int harga){
        this.namaSenjata = namaSenjata;
        this.id = generateRandomId();
        this.harga = harga;
        this.stok = stok;
        this.next = null;
        this.prev = null;
    }
}