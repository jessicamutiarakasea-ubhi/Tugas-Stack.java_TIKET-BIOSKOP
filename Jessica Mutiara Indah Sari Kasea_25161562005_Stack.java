public class TiketBioskop {

    //=== BAGIAN 1: Deklarasi Stack ===
    static String [] stack = new String [10]; //array untuk menyimpan data tiket
    static int top = -1; //data paling atas

    //=== BAGIAN 2: Bagian Stack ===

    // Method Push () "digunakan untuk menambahkan tiket ke dalam stack"
    static void push (String tiket) {
         if (top == 10 - 1) {  // mengecek stack penuh
            System.out.println ("Stack penuh!");  //pesan jika stack penuh
        } else {
            top++;   //update posisi top
            stack[top] = tiket;  //menyimpan tiket ke stack
        }
    }

    // Method Pop () "Digunakan untuk menghapus data paling atas"
    static String pop() {
        if (top == -1) {  //mengecek stack kosong
        return "Stack kosong!";  //pesan jika stack kosong
    }
     return stack [top--];  //menghapus data teratas
    }


    // Method peek() "digunakan untuk melihat data paling atas tanpa menghapus"
    static String peek() {
        if (top == -1) {   //mengecek stack kosong
        return "Stack kosong";    //pesan jika stack kosong
    }
    return stack[top]; //mengembalikan data paling atas
    }

    static boolean isEmpty() {
        return top == -1;
    }

    static void tampilkanStack(){
    System.out.println("=== Isi Stack (TOP -> BOTTOM) ===");
        for (int i = top; i >= 0; i--) {  //perulangan dari data paling atas ke bawah
        System.out.println("| " + stack[i] + " |"); //menampilkan isi stack
        }
        System.out.println ("=================================");
    }


// === BAGIAN 3: Main Program ===
public static void main(String[] args) {
        //TODO: push 3 transaksi berikut ke dalam stack:
     push("Tiket-A01: Avengers Rp50.000");
     push("Tiket-B02: Interstellar Rp45.000");
     push("Tiket-C03: Inception Rp45.000");
      
     hitungTotal();

     tampilkanStack();

        // TODO: tampilkan tiket paling atas (peek)
     System.out.println("Tiket terakhir masuk: " + peek());

        // TODO: batalkan 1 transaksi teratas (pop) dan tampilkan
     System.out.println("Tiket dibatalkan: " + pop());
        
     tampilkanStack();
    }

    static void hitungTotal() {  // Menghitung total harga seluruh tiket
        int total = 0;  //penyimpan total harga 
        for (int i = 0; i <= top; i++) {
             if (stack[i].contains("50.000")) {  // Jika tiket berharga 50.000
                total += 50000;  // Jika tiket berharga 50.000
             }
             else if (stack[i].contains("45.000")) {  // Jika tiket berharga 45.000
                total += 45000;  // Tambahkan 45.000 ke total
             }
            System.out.println("Total transaksi: Rp" + total);  // Menampilkan total transaksi
        }
    }
}
