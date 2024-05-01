public class TipeDataArray {
    
    public static void main(String[] args) {
        


        //  Tipe Data Array
        // * Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
        // * Jumlah data array tidak bisa berubah setelah pertama kali dibuat.

        // String[] stringArray;

        // stringArray = new String[3];

        // stringArray[0] = "Slamet";
        // stringArray[1] = "Riyadi";
        // stringArray[2] = "Ganteng";

        // System.out.println(stringArray[0]);
        // System.out.println(stringArray[1]);
        // System.out.println(stringArray[2]);

        // Bisa di persingkat
        String[] stringArray = new String[3];

        String[] namaNama = {
            "Slamet", "Riyadi","Ganteng"
        };

       System.out.println();
    

        int[] arrayInt = new int[]{
            1,2,3,4,5,6,7,8,9,10
        };

        System.out.println(arrayInt.length);




        long[] arrayLong = {
            10L, 20L, 30L
        };

        System.out.println(arrayLong.length);


        // contoh Array dalam Array
        
        String [][] members = {
            {"Slamet", "Riyadi"},
            {"Salsa", "Tifani"},
            {"Istri Masih Dalam Proses Pencarian"}
        
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
        System.out.println(members[1][1]);
        System.out.println(members[2][0]);
        
    }



}
