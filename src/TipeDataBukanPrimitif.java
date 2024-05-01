public class TipeDataBukanPrimitif {


    public static void main(String[] args) {

        // Tipe Data Bukan Primitif

        // *Tipe data primitif adalah tipe bawaan di dalam bahasa pemrograman. Tipe data primitif tidak bisa diubah lagi.

        // *Tipe data number, char, boolean adalah tipe data primitif. Tipe data primitif selalu memiliki default value.

        // *Tipe data String bukan tipe data primitif, tipe data bukan primitif tidak memiliki default value, dan bisa bernilai null.

        // *Tipe data bukan primitif bisa memiliki method/function (yang akan dibahas nanti).

        // *Di Java, semua tipe data primitif memiliki representasi tipe data bukan primitif nya.
          
        Integer iniInteger = 100;
        Long iniLong = 10000L;
        Boolean iniBoolean = true;

        Short iniShort = null;
        
        iniShort = 100;

        System.out.println(iniShort);


        Byte iniByte = null;
        System.out.println(iniByte);


        int iniInt = 100;

        Integer iniInteger2 = iniInt;

        System.out.println(iniInteger2);


        // kode : Contoh Konversi DariTipe Primitif

        int age = 29;
        Integer ageObject = age;

        int ageAgain = ageObject;

        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();







    }
    
}
