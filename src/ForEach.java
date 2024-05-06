public class ForEach {
    
    public static void main(String[] args) {
        

        // For Each

        // Kadang kita biasa mengakses data array menggunakann perulangan

        // Mengakses data array menggunakan perulangan sangat bertele-tele, kita harus membuat counter,

        // lalu mengakses array menggunakan counter yang kita buat

        // Namun untungnya, di Java terdapat perulangan for each, 
        // yang bisa digunakan untuk mengakses seluruh data di Array secara otomatis
    
            String[] names ={
                "Slamet", "Riyadi", "Ganteng",
                "Programmer", "Ganteng", "Zaman", "Now"

            };

            for (int i = 0; i < names.length; i++) {
                System.out.println(names[i]);
                
            }




            System.out.println("For Each");

            for(var name : names) {
                System.out.println(name);
                
            }




    }

}
