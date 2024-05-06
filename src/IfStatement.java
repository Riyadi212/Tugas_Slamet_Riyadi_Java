    public class IfStatement {
    
    public static void main(String[] args) {
        

        //    If Statement

        // Dalam Java, if adalah salah satu kata kunci yang digunakan untuk percabangan

        // Percabangan artinya kita bisa mengeksekusi kode program tertentu ketika suatu 
        // kondisi terpenuhi Hampir di semua bahasa pemrograman mendukung if expression


        var nilai = 80;
        var absen = 90;

        var lulusNilai = nilai >= 75;
        var lulusAbsen = absen >= 75;

        var lulus = lulusNilai && lulusAbsen;

        if (nilai >= 75 && absen >= 75){
            System.out.println("Selamat Anda Lulus");
        }




    }
}
