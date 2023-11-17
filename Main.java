public class Main {
    public static void main(String[] args) {
        // mergeAll data1 = new mergeAll();
        // data1.createData("Demon Hunter Sword", 8,null, 0);
        // data1.createData("Sea Halberd", 6,null, 0);
        // data1.createData("Malefic Roar", 3,null, 0);
        // data1.createData("Haas's Claws", 19,null, 0);
        // data1.createData("Berseker's Fury", 3,null, 0);
        // data1.createData("Endless Battle", 4,null, 0);
        // data1.createData("Windtalker", 12,null, 0);
        // data1.createData("Scarlet Phantom", 16,null, 0);
        // data1.createData("Blade of Despair", 23,null, 0);
        // data1.createData("Hunter Strike", 15,null, 0);
        // data1.createData("Bloodlust Axe", 9,null, 0);
        // data1.createData("Rose Gold Meteor", 17,null, 0);
        // data1.createData("Golden Staff", 27,null, 0);
        // data1.createData("Wind of Nature", 25,null, 0);
        // data1.printList();
        // //by id
        // System.out.println();
        // System.out.println("Setelah");
        // data1.bubbleSort();
        // data1.printList();
        // data1.linearSearchByStok(3);
        // System.out.println();
        // mergeAll data2 = new mergeAll();
        // data2.createData("Enchanted Talisman", 9, null, 0);
        // data2.createData("Divine Glaive", 11, null, 0);
        // data2.createData("Winter Truncheon", 14, null, 0);
        // data2.createData("Feather of Heaven", 1, null, 0);
        // data2.createData("Holy Crystal", 0, null, 0);
        // data2.createData("Genius Wand", 6, null, 0);
        // data2.createData("Necklace of Durance", 10, null, 0);
        // data2.createData("Concentrated Energy", 12, null, 0);
        // data2.createData("Ice Queen Wand", 18, null, 0);
        // data2.createData("Glowing Wand", 16, null, 0);
        // data2.createData("Calamity Reaper", 15, null, 0);
        // data2.createData("Clock of Destiny", 19, null, 0);
        // data2.createData("Blood Wings", 20, null, 0);
        // data2.createData("Fleeting Time", 21, null, 0);
        // data2.createData("Lightning Turncheon", 17, null, 0);
        // System.out.println("Sebelum diurutkan");
        // data2.printList();
        // data2.selectionSortByStok();
        // System.out.println("Selection sort");
        // data2.printList();
        System.out.println();
        mergeAll data3 = new mergeAll();
        data3.createData("Enchanted Talisman", 9, null, 1870);
        data3.createData("Divine Glaive", 11, null, 1970);
        data3.createData("Winter Truncheon", 14, null, 1910);
        data3.createData("Feather of Heaven", 1, null, 2030);
        data3.createData("Holy Crystal", 0, null, 2180);
        data3.createData("Genius Wand", 6, null, 2000);
        data3.createData("Necklace of Durance", 10, null, 2110);
        data3.createData("Concentrated Energy", 12, null, 2020);
        data3.createData("Ice Queen Wand", 18, null, 2240);
        data3.createData("Glowing Wand", 16, null, 2120);
        data3.createData("Calamity Reaper", 15, null, 1950);
        data3.createData("Clock of Destiny", 19, null, 1950);
        data3.createData("Blood Wings", 20, null, 3000);
        data3.createData("Fleeting Time", 21, null, 2050);
        data3.createData("Lightning Turncheon", 17, null, 2250);
        System.out.println("Sebelum diurutkan");
        data3.printNotstok();
        System.out.println();
        System.out.println("Insertion sort");
        data3.head = data3.insertionSortByHargaDescending(data3.head);
        data3.printNotstok();
        search searcher = new search();
        searcher.searchByHarga(data3.head, 3000);
        // // Descending insertion
        // System.out.println("Search by harga");
        // data2.searchByHarga(1970);
        // System.out.println("Insertion sort descending");
        // sort sorter = new sort();
        // // Perbarui head dari objek mergeAll
        // data2.head = sorter.insertionSortByHargaDescending(data2.head);
        // data2.printNotstok();
        
        
 
        
}
}
