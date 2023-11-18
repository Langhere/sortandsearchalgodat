public class Main {
    public static void main(String[] args) {
        //membuat list baru untuk data1 dan mengisi data
        mergeAll data1 = new mergeAll();
        data1.createData("Demon Hunter Sword", 8,null, 0);
        data1.createData("Sea Halberd", 6,null, 0);
        data1.createData("Malefic Roar", 3,null, 0);
        data1.createData("Haas's Claws", 19,null, 0);
        data1.createData("Berseker's Fury", 3,null, 0);
        data1.createData("Endless Battle", 4,null, 0);
        data1.createData("Windtalker", 12,null, 0);
        data1.createData("Scarlet Phantom", 16,null, 0);
        data1.createData("Blade of Despair", 23,null, 0);
        data1.createData("Hunter Strike", 15,null, 0);
        data1.createData("Bloodlust Axe", 9,null, 0);
        data1.createData("Rose Gold Meteor", 17,null, 0);
        data1.createData("Golden Staff", 27,null, 0);
        data1.createData("Wind of Nature", 25,null, 0);
        data1.printList2();
        //by id
        System.out.println();
        System.out.println("Setelah");
        //diurutkan dengan bubble sort
        data1.bubbleSort();
        data1.printList2();
        //mencari nilai dengan stok 3
        data1.linearSearchByStok(3);
        System.out.println();
        //membuat list baru data2
        mergeAll data2 = new mergeAll();
        data2.createData("Enchanted Talisman", 9, null, 0);
        data2.createData("Divine Glaive", 11, null, 0);
        data2.createData("Winter Truncheon", 14, null, 0);
        data2.createData("Feather of Heaven", 1, null, 0);
        data2.createData("Holy Crystal", 0, null, 0);
        data2.createData("Genius Wand", 6, null, 0);
        data2.createData("Necklace of Durance", 10, null, 0);
        data2.createData("Concentrated Energy", 12, null, 0);
        data2.createData("Ice Queen Wand", 18, null, 0);
        data2.createData("Glowing Wand", 16, null, 0);
        data2.createData("Calamity Reaper", 15, null, 0);
        data2.createData("Clock of Destiny", 19, null, 0);
        data2.createData("Blood Wings", 20, null, 0);
        data2.createData("Fleeting Time", 21, null, 0);
        data2.createData("Lightning Turncheon", 17, null, 0);
        System.out.println("Sebelum diurutkan");
        data2.printList2();
        //melakukan seelction sort
        data2.selectionSortByStok();
        System.out.println("Selection sort");
        data2.printList2();
        System.out.println();
        //membuat data baru data 3
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
        //melakukan insertion sort
        System.out.println("Insertion sort");
        data3.head = data3.insertionSortByHargaDescending(data3.head);
        data3.printNotstok();
        search searching = new search();
        searching.searchByHargaDescending(data3.head, 2020);
        //membuat data baru 4
        mergeAll data4 = new mergeAll();
        data4.createData("Divine Glaive", 0, null, 1970);
        data4.createData("Genius Wand", 0, null, 2000);
        data4.createData("Winter Truncheon", 0, null, 1910);
        data4.createData("Feather of Heaven", 0, null, 2030);
        data4.createData("Holy Crystal", 0, null, 2180);
        data4.createData("Enchanted Talisman", 0, null, 1870);
        data4.createData("Ice Queen Wand", 0, null, 2240);
        data4.createData("Necklace of Durance", 0, null, 2110);
        data4.createData("Clock of Destiny", 0, null, 1950);
        data4.createData("Blood Wings", 0, null, 3000);
        data4.createData("Glowing Wand", 0, null, 2120);
        data4.createData("Concentrated Energy", 0, null, 2020);
        data4.createData("Fleeting Time", 0, null, 2050);
        data4.createData("Calamity Reaper", 0, null, 1950);
        data4.createData("Lightning Turncheon", 0, null, 2250);
        System.out.println("Sebelum urut");
        data4.printNotstok();
        System.out.println("Setelah urut");
        //melakukan shellsort
        data4.shellSortByHargaAscending(data4.head);
        data4.printNotstok();
        //membuat data baru5
        mergeAll data5 = new mergeAll();
        data5.createData("Windtalker", 12,null, 1870);
        data5.createData("Bloodlust Axe", 9,null, 1970);
        data5.createData("Haas's Claws", 19,null, 1810);
        data5.createData("Blade of Despair", 23,null, 3010);
        data5.createData("Rose Gold Meteor", 17,null, 2270);
        data5.createData("Blood Wings", 17,null, 3000);
        data5.createData("Sea Halberd", 6,null, 2200);
        data5.createData("Wind of Nature", 25,null, 1910);
        data5.createData("Golden Staff", 27,null, 2100);
        data5.createData("Hunter Strike", 15,null, 2010);
        data5.createData("Clock of Destiny", 15,null, 1950);
        data5.createData("Glowing Wand", 15,null, 2120);
        data5.createData("Fleeting Time", 15,null, 2050);
        data5.createData("Concentrated Energy", 0, null, 2020);
        data5.createData("Lightning Turncheon", 0, null, 2250);
        data5.createData("Calamity Reaper", 0, null, 1950);
        System.out.println("Sebelum");
        System.out.println();
        data5.printNotstok();
        System.out.println("Setelah");
        //melakukan quick sort
        data5.head = data5.quickSortByHargaAscending(data5.head);
        // System.out.println(data5.head.harga);
        data5.printNotstok();
        mergeAll data6 = new mergeAll();
        System.out.println("Sebelum");
        data6.createData("Divine Glaive", 0, null, 1970);
        data6.createData("Feather of Heaven", 0, null, 2030);
        data6.createData("Berseker's Fury", 3,null, 2350);
        data6.createData("Endless Battle", 4,null, 2470);
        data6.createData("Genius Wand", 0, null, 2000);
        data6.createData("Winter Truncheon", 0, null, 1910);
        data6.createData("Holy Crystal", 0, null, 2180);
        data6.createData("Ice Queen Wand", 0, null, 2240);
        //mencari kata kunci an
        data6.searchByKey("an");
        data6.printNotstok();
        System.out.println();
        System.out.println("Setelah");
        sort sort1 = new sort();
        data6.head = sort1.quickSortByHargaAscending(data6.head);
        data6.printNotstok();
        //membuat data baru 7
        mergeAll data7 = new mergeAll();
        data7.createData("Divine Glaive", 0, null, 1970);
        data7.createData("Feather of Heaven", 0, null, 2030);
        data7.createData("Berseker's Fury", 3,null, 2350);
        data7.createData("Endless Battle", 4,null, 2470);
        data7.createData("Genius Wand", 0, null, 2000);
        data7.createData("Winter Truncheon", 0, null, 1910);
        data7.createData("Holy Crystal", 0, null, 2180);
        data7.createData("Ice Queen Wand", 0, null, 2240);
        data7.createData("Scarlet Phantom", 16,null, 2020);
        data7.printList();
        //melakukan merge sort
        data7.mergeSortByHargaAscending();
        System.out.println("Setelah");
        data7.printList();

    }
}
