public class TernaryOperator {
    

    public static void main(String[] args) {


        // Ternary Operator

        // Ternary operator adalah operator sederhana dari if statement 
        // Ternary operator terdiri dari kondisi yang dievaluasi, 
        // jika menghasilkan true maka nilai pertama diambil, jika false, maka nilai kedua diambil


        // var nilai = 80;
        // String ucapan;

        // if (nilai >= 75){
        //     ucapan = "Selamat Anda Lulus";
        // } else{
        //     ucapan = "Silahkan Anda Coba Lagi"; 
        // }

        // System.out.println(ucapan);


        // contoh kode ternary operator
        
        var nilai = 7;
        String ucapan = nilai >= 75 ? "Selamat Anda Lulus" : "Silahkan Coba Lagi";

        System.out.println(ucapan);
    }
}
