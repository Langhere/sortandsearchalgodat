// sort.java
public class sort {
    // Bubble sort berdasarkan stok
    // Metode untuk melakukan pengurutan menggunakan algoritma Insertion Sort berdasarkan atribut harga dari setiap node dalam linked list secara menurun (descending order). Mengembalikan head dari linked list yang sudah diurutkan.
    public Node bubbleSortByStok(Node head) {
        int swapped;
        Node ptr1;
        Node lptr = null;

        if (head == null)
            return null;

        do {
            swapped = 0;
            ptr1 = head;

            while (ptr1.next != lptr) {
                // Ubah kondisi perbandingan untuk membandingkan stok
                if (ptr1.stok > ptr1.next.stok) {
                    // Tukar stok jika diperlukan
                    int tempStok = ptr1.stok;
                    ptr1.stok = ptr1.next.stok;
                    ptr1.next.stok = tempStok;

                    // Tukar data lainnya juga jika diperlukan
                    String tempNama = ptr1.namaSenjata;
                    ptr1.namaSenjata = ptr1.next.namaSenjata;
                    ptr1.next.namaSenjata = tempNama;

                    String tempId = ptr1.id;
                    ptr1.id = ptr1.next.id;
                    ptr1.next.id = tempId;

                    swapped = 1;
                }
                ptr1 = ptr1.next;
            }
            lptr = ptr1;
        } while (swapped != 0);

        return head;
    }
    public Node selectionSortByStok(Node head) {
        // Memeriksa apakah linked list kosong atau hanya memiliki satu node. Jika ya, langsung mengembalikan head karena tidak perlu dilakukan pengurutan.
        if (head == null || head.next == null)
            return head;
        // Inisialisasi node current sebagai head untuk iterasi melalui linked list.
        Node current = head;
        // Memulai loop untuk iterasi melalui linked list.
        while (current != null) {
            // sebagai node saat ini (current) dan node temp sebagai node berikutnya.
            Node maxNode = current;
            Node temp = current.next;

            while (temp != null) {
                // Perbandingan untuk urutan descending berdasarkan stok
                // Membandingkan nilai stok antara temp dan maxNode, dan jika temp memiliki nilai stok yang lebih besar, maka maxNode diupdate menjadi temp.
                if (temp.stok > maxNode.stok) {
                    maxNode = temp;
                }
                temp = temp.next;
            }
            //  Setelah menemukan node dengan nilai stok terbesar, dilakukan pertukaran nilai stok antara current dan maxNode.
            // Tukar data jika diperlukan
            int tempStok = current.stok;
            current.stok = maxNode.stok;
            maxNode.stok = tempStok;

            String tempNama = current.namaSenjata;
            current.namaSenjata = maxNode.namaSenjata;
            maxNode.namaSenjata = tempNama;

            String tempId = current.id;
            current.id = maxNode.id;
            maxNode.id = tempId;

            current = current.next;
        }
        // Mengembalikan head dari linked list yang sudah diurutkan menggunakan algoritma Selection Sort.
        return head;
    }

    //insertion sort
    // sort.java

    // Insertion sort berdasarkan harga (Descending)
    // Di dalam kelas sort
public Node insertionSortByHargaDescending(Node head) {
    if (head == null || head.next == null) {
        return head;
    }

    Node sorted = null;
    Node current = head;

    while (current != null) {
        Node next = current.next;

        if (sorted == null || sorted.harga < current.harga) {
            current.next = sorted;
            sorted = current;
        } else {
            Node temp = sorted;
            while (temp.next != null && temp.next.harga > current.harga) {
                temp = temp.next;
            }
            current.next = temp.next;
            temp.next = current;
        }

        current = next;
    }

    return sorted;
}
//merge sort
  // Merge Sort berdasarkan harga (Ascending)
//   Metode untuk melakukan pengurutan menggunakan algoritma Merge Sort berdasarkan atribut harga dari setiap node dalam linked list secara menaik (ascending order). 
  public Node mergeSortByHargaAscending(Node head) {
    if (head == null || head.next == null) {
        return head;
    }

    Node middle = getMiddle(head);
    Node nextToMiddle = middle.next;

    middle.next = null;

    Node left = mergeSortByHargaAscending(head);
    Node right = mergeSortByHargaAscending(nextToMiddle);

    return merge(left, right);
}

private Node merge(Node left, Node right) {
    Node result = null;

    if (left == null) {
        return right;
    }
    if (right == null) {
        return left;
    }

    if (left.harga <= right.harga) {
        result = left;
        result.next = merge(left.next, right);
    } else {
        result = right;
        result.next = merge(left, right.next);
    }

    return result;
}

private Node getMiddle(Node head) {
    if (head == null) {
        return head;
    }

    Node slow = head, fast = head;

    while (fast.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    return slow;
}
//shell
// Shell Sort berdasarkan harga (Ascending)
public Node shellSortByHargaAscending(Node head) {
    // Memeriksa apakah linked list kosong atau hanya memiliki satu node. Jika ya, langsung mengembalikan head karena tidak perlu dilakukan pengurutan.
    if (head == null || head.next == null) {
        return head;
    }
    // Menghitung jumlah node dalam linked list.
    int n = getCount(head);
// /   nisialisasi variabel gap sebagai setengah dari jumlah node, dan melakukan perulangan dengan mengurangi nilai gap menjadi setengahnya pada setiap iterasi.
    for (int gap = n / 2; gap > 0; gap /= 2) {
        // Iterasi melalui linked list dimulai dari posisi gap hingga akhir linked list.
        for (int i = gap; i < n; i++) {
            // Menyimpan nilai atribut harga, namaSenjata, dan id dari node pada posisi i.
            int harga = getNodeAtPosition(head, i).harga;
            String namaSenjata = getNodeAtPosition(head, i).namaSenjata;
            String id = getNodeAtPosition(head, i).id;

            int j;
            for (j = i; j >= gap && getNodeAtPosition(head, j - gap).harga > harga; j -= gap) {
                // Memulai iterasi mundur untuk membandingkan dan menukar node dengan selisih gap jika nilai harga lebih kecil dari node yang lebih awal dalam urutan.
                // Menyimpan node sebelumnya dengan selisih gap dari posisi saat ini.
                Node prevNode = getNodeAtPosition(head, j - gap);

                // Pindahkan data jika diperlukan
                // Memindahkan data dari prevNode ke node pada posisi j.
                getNodeAtPosition(head, j).harga = prevNode.harga;
                getNodeAtPosition(head, j).namaSenjata = prevNode.namaSenjata;
                getNodeAtPosition(head, j).id = prevNode.id;
            }

            // Tempatkan elemen pada posisi yang benar
            getNodeAtPosition(head, j).harga = harga;
            getNodeAtPosition(head, j).namaSenjata = namaSenjata;
            getNodeAtPosition(head, j).id = id;
        }
    }

    return head;
}


//quick sort
// Quick Sort berdasarkan harga (Ascending)
// Dimulai dengan metode quick sort yang akan mengurutkan linked list berdasarkan harga secara menaik.
public Node quickSortByHargaAscending(Node head) {
    // Memeriksa apakah linked list kosong atau hanya memiliki satu node. Jika ya, langsung mengembalikan head karena tidak perlu dilakukan pengurutan.
    if (head == null || head.next == null) {
        return head;
    }
    // Memanggil metode partition untuk membagi linked list berdasarkan pivot dan mendapatkan nilai pivot.
    Node pivot = partition(head);
    // Memanggil rekursif quick sort untuk bagian linked list yang lebih kecil dari pivot (nilai yang lebih rendah).
    quickSortByHargaAscending(pivot.prev);
    // Memanggil rekursif quick sort untuk bagian linked list yang lebih besar dari pivot (nilai yang lebih tinggi).
    quickSortByHargaAscending(pivot.next);
    // Mengembalikan pivot sebagai bagian dari linked list yang sudah diurutkan.
    return pivot;
}
// Metode untuk membagi linked list berdasarkan nilai pivot.
private Node partition(Node head) {
    if (head == null || head.next == null) {
        return head;
    }
    // Memilih pivot dengan memanggil metode choosePivot.
    Node pivot = choosePivot(head);
    // Inisialisasi tiga linked list sementara untuk menyimpan node yang memiliki nilai harga lebih kecil, sama, dan lebih besar dari pivot.
    Node smaller = null, equal = null, larger = null;
    // Inisialisasi node current sebagai head untuk iterasi melalui linked list.
    Node current = head;
    // Memulai loop untuk iterasi melalui linked list.
    while (current != null) {
        // Blok if-else berikut ini membagi node-node ke dalam tiga kategori berdasarkan nilai harga terhadap pivot
// Jika nilai harga kurang dari pivot, node dimasukkan ke dalam kategori smaller.
// Jika nilai harga sama dengan pivot, node dimasukkan ke dalam kategori equal.
// Jika nilai harga lebih besar dari pivot, node dimasukkan ke dalam kategori larger.
        if (current.harga < pivot.harga) {
            if (smaller == null) {
                smaller = current;
            } else {
                current.next = smaller;
                smaller = current;
            }
        } else if (current.harga == pivot.harga) {
            if (equal == null) {
                equal = current;
            } else {
                current.next = equal;
                equal = current;
            }
        } else {
            if (larger == null) {
                larger = current;
            } else {
                current.next = larger;
                larger = current;
            }
        }
        // Pindah ke node berikutnya dalam linked list untuk melanjutkan iterasi.
        current = current.next;
    }   
    // Jika terdapat node-node yang memiliki nilai harga sama dengan pivot, menggabungkan linked list smaller dan equal.
    if (equal != null) {
        smaller = concatenate(smaller, equal);
    }
    //  Menggabungkan linked list smaller dan larger, kemudian mengembalikan hasilnya.
    return concatenate(smaller, larger);
}
// Metode untuk menggabungkan dua linked list.
// Blok ini menggabungkan dua linked list dengan mengatur pointer dari akhir linked list pertama ke awal linked list kedua.
private Node concatenate(Node smaller, Node larger) {
    if (smaller == null) {
        return larger;
    }

    Node current = smaller;
    while (current.next != null) {
        current = current.next;
    }

    current.next = larger;
    return smaller;
}
// Metode untuk memilih pivot, dalam hal ini, pivot diambil dari pertengahan linked list.
private Node choosePivot(Node head) {
    // emanggil metode getMiddle untuk mendapatkan node tengah sebagai pivot, kemudian mengembalikannya.
    Node middle = getMiddle(head);
    return middle;
}
// Metode untuk mendapatkan node pada posisi tertentu dalam linked list.
public Node getNodeAtPosition(Node head, int position) {
    Node current = head;
    for (int i = 0; i < position && current != null; i++) {
        current = current.next;
    }
    return current;
}
// Metode untuk menghitung jumlah node dalam linked list.
public int getCount(Node head) {
    int count = 0;
    Node temp = head;
    while (temp != null) {
        count++;
        temp = temp.next;
    }
    return count;
}


}
