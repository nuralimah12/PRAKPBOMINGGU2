/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class pbosatu {
    //NUR ALIMAH
    //2141762004
    //2ESIB

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nim[] = {2,1,4,1,7,6,2,0,0,4};
        int index=0;
      System.out.println("=====================");
      System.out.println("Nama : Nur Alimah");
      System.out.println("Nama : 2141762004");
      System.out.println("Kelas : 2ESIB");
      System.out.println("=====================");

    int i=0;
    while(i<4){
        int j=4;
        while(j>i){
            System.out.print(" ");  
            j--;
        }  
        
       int k=0;
        while(k<=i){
            System.out.print(nim[index]+" ");  
            k++;
            index++;

        }
        
        System.out.println(" ");
        i++;
    }
    
}
}
