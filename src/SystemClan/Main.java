package SystemClan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       DetailClan sc = new DetailClan();
       Scanner input = new Scanner(System.in);
       int menu = 0; 
       
       while (menu != 2){
        
        System.out.println("\n===Clan Game Drot===");
        System.out.println("1. Daftar Peringkat Clan");
        System.out.println("2. Pertarungan Antar Clan");
        System.out.print("Masukkan menu pilihan : ");
        menu = input.nextInt();
        
        switch (menu){
            case 1 :
                System.out.println("\n===Daftar Peringkat Clan===");
                sc.showclanPeringkat();
                Scanner input1 = new Scanner(System.in);
                int cmenu =0;
                char bmenu;
                
                while(cmenu!=3){
                    System.out.println("\n===Menu Pilihan===");
                    System.out.print("Lihat detail clan : ");
                    cmenu = input1.nextInt();
                    
                    sc.showdetailclan(cmenu);
                    
                    System.out.print("Balik ke menu awal input y/n : ");
                    bmenu = input1.next().trim().charAt(0);
                    if (bmenu == 'y'){
                    break;
                    }
                }
                
                
                
        }
    }
    }
}
