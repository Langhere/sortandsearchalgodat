// sort.java
public class sort {
    // Bubble sort berdasarkan stok
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
        if (head == null || head.next == null)
            return head;

        Node current = head;

        while (current != null) {
            Node maxNode = current;
            Node temp = current.next;

            while (temp != null) {
                // Perbandingan untuk urutan descending berdasarkan stok
                if (temp.stok > maxNode.stok) {
                    maxNode = temp;
                }
                temp = temp.next;
            }

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

//quick sort
// Quick Sort berdasarkan harga (Ascending)
public Node quickSortByHargaAscending(Node head) {
    if (head == null || head.next == null) {
        return head;
    }

    Node pivot = partition(head);
    quickSortByHargaAscending(pivot.prev);
    quickSortByHargaAscending(pivot.next);

    return pivot;
}

private Node partition(Node head) {
    if (head == null || head.next == null) {
        return head;
    }

    Node pivot = choosePivot(head);
    Node smaller = null, equal = null, larger = null;
    Node current = head;

    while (current != null) {
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
        current = current.next;
    }

    if (equal != null) {
        smaller = concatenate(smaller, equal);
    }
    return concatenate(smaller, larger);
}

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

private Node choosePivot(Node head) {
    // You can choose a pivot in various ways, e.g., random pivot, middle element, etc.
    // For simplicity, let's choose the middle element as the pivot.
    Node middle = getMiddle(head);
    return middle;
}

public Node getNodeAtPosition(Node head, int position) {
    Node current = head;
    for (int i = 0; i < position && current != null; i++) {
        current = current.next;
    }
    return current;
}

public int getCount(Node head) {
    int count = 0;
    Node temp = head;
    while (temp != null) {
        count++;
        temp = temp.next;
    }
    return count;
}
public int binarySearch(Node head, int targetHarga) {
    int low = 0;
    int high = getCount(head) - 1;

    while (low <= high) {
        int mid = (low + high) / 2;
        Node midNode = getNodeAtPosition(head, mid);

        if (midNode.harga == targetHarga) {
            return mid;
        } else if (midNode.harga < targetHarga) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    return -1; // Not found
}

///


}
