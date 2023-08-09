
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user3
 */
public class WarunkGenji {
    public static void main(String[] args) {
        System.out.println("Menu modif: ");
        System.out.println("1. Turbo Charger (15.000)");
        System.out.println("2. Super Charger (25.000)");
        System.out.println("3. Nitro (35000)");
        System.out.println("4. Rims (50.000)");
        System.out.println("5. Spoiler (150.000)");
        System.out.println("6. M Power Bodykit (250.000)");
        
        int turbo,supercharger,nitro,rims,spoiler,Mpower;
        turbo=15000;
        supercharger=25000;
        nitro=35000;
        rims=50000;
        spoiler=150000;
        Mpower=250000;
        
        int jumlahBeli,total,bayar,kembali;
        Scanner input = new Scanner (System.in);   
        System.out.println("Jumlah beli Turbo: ");
        int jumlahBeliturbo= input.nextInt(); 
        total=jumlahBeliturbo*turbo; 
        System.out.println("Jumlah beli Super Charge: ");
        int jumlahBelisupercharger= input.nextInt(); 
        total+=jumlahBelisupercharger*supercharger; 
        System.out.println("Jumlah beli Nitro: ");
        int jumlahBelinitro= input.nextInt(); 
        total+=jumlahBelinitro*nitro; 
        System.out.println("Jumlah beli Rims: ");
        int jumlahBelirims= input.nextInt(); 
        total+=jumlahBelirims*rims; 
        System.out.println("Jumlah beli Spoiler: ");
        int jumlahBelispoiler= input.nextInt(); 
        total+=jumlahBelispoiler*spoiler; 
        System.out.println("Jumlah beli M power Bodykit: ");
        int jumlahBeliMpower= input.nextInt(); 
        total+=jumlahBeliMpower*Mpower; 
        
        System.out.println("total Pembelian :"+total);
        System.out.println("Masukkan Pembayaran: ");
        bayar= input.nextInt();
        kembali=bayar-total;
        System.out.println("Jumlah Kembalian: "+kembali);
       
        
    }
    
}
