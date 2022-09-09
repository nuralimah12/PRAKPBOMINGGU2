/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class pbojumlah {
    //NUR ALIMAH
    //2141762004
    //2ESIB
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
      System.out.println("=====================");
      System.out.println("Nama : Nur Alimah");
      System.out.println("Nama : 2141762004");
      System.out.println("Kelas : 2ESIB");
      System.out.println("=====================");
        int nim[] = {2,1,4,1,7,6,2,0,0,4};
        int jumlah = 0;
        
        
        for(int i=0;i<nim.length;i++){
            jumlah+=nim[i];
        }
        System.out.println("JUMLAH NIM ADALAH "+jumlah);
    }
    
}
