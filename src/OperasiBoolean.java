public class OperasiBoolean {
    
    public static void main(String[] args) {
        

        // Operasi Booolean

        // Operator                 Keterangan
        //   &&                         Dan
        //   ||                         Atau
        //   !                          Kebalikan

        // operasi &&
        //      Kondisi 1	Kondisi 2	Hasil (&&)

        //       true	     true	     true
        //       true	     false   	false
        //      false	     true	     false
        //      false	     false	     false

        // Operasi ||

        //    | Kondisi 1 | Kondisi 2 | Hasil (||) |

        //     | true |      true |      true |
        //     | true |      false |     true |
        //     | false |     true |      true |
        //     | false |     false |     false |

       
       
        // Operasi !

        //   Ekspresi      	NOT (Ekspresi)
        //     true	          false
        //     false	      true

        var absen = 70;
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;
        
        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);
    






    }
}
