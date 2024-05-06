
public class SwitchStatement {

    public static void main(String[] args) {

        // Switch Statement
        // Kadang kita hanya butuh menggunakan kondisi sederhana di if statement, seperti hanya menggunakan perbandingan ==
        // Switch adalah statement percabangan yang sama dengan if, namun lebih sederhana cara pembuatannya
        // Kondisi di switch statement hanya untuk perbandingan ==

        var nilai = "A";

        switch (nilai) {
                case "A":
                System.out.println("Wow, Anda Lulus Dengan Baik");
                break;

                case "B":
                case "C":
                System.out.println("Nilai Anda Cukup Baik");
                break;
                case "D":
                System.out.println("Anda Tidak Lulus");
                break;
                default:
                System.out.println("Mungkin Anda Gila");
        }



        // switch lamda
        // Dijava versi 14, diperkenalkan switch expression dengan lamda
        // ini lebih mempermudah saat penggunaan switch expression karena tidak perlu lagi menggunakan kata kunci break.

        switch (nilai){
            case "A" ->System.out.println("Wow,Nilai Anda Cukup Baik");
            case "B", "C" ->System.out.println("Nilai Anda Cukup Baik");
            case "D" ->System.out.println("Maaf, Anda Belum Lulus");
            default->{
                System.out.println("Mungkin Anda Sudah Gila");
        }
    }


        







    }
}
