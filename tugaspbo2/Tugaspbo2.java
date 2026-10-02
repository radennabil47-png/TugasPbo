
package tugaspbo2;

import java.util.Scanner;

public class Tugaspbo2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("masukan tahun (1909 - 2024");
        int tahun = input.nextInt();
        
        if(tahun % 4 == 0){
            System.out.println(tahun + " adalah tahun kabisat");
        }else{
            System.out.println(tahun + " bukan tahun kabisat");
        }
        input.close();
    }
    
}
