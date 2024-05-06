public class KataKunciYield {
    

    public static void main(String[] args) {
        
        //  Kata kunci yield
        // Dijava 14, ada kata kunci baru yaitu yield, dimana kita menggunakan kata kunci yield untuk mengembalikan nilai pada switch statement
        // ini sangat mempermudah kita ketika butuh membuat data berdasarkan kondisi switch statement




        var nilai = "L";



        String ucapan;
        switch (nilai){
            case "A" -> ucapan = "Wow,Nilai Anda Cukup Baik";
            case "B", "C" -> ucapan = "Nilai Anda Cukup Baik";
            case "D" -> ucapan = "Maaf, Anda Belum Lulus";
            default-> {
            ucapan = "Mungkin Anda Sudah Gila";
            }
               
        }

        System.out.println(ucapan);



        ucapan = switch (nilai){
            case "A":
            yield "Wow, Anda Lulus Dengan Baik";
            case "B", "C":
            yield "Nilai Anda Cukup Baik";
            case "D":
            yield "Anda Tidak Lulus";
            default:
            yield "Mungkin Anda Sudah Gila";
        };
        System.out.println(ucapan);
        }


    }

