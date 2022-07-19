/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ucakbileti;

/**
 *
 * @author Samsung
 */
import java.util.Scanner;
public class UcakBileti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.print("Mesafe Giriniz:");
        int mesafe=input.nextInt();
        
        System.out.print("Yasinizi Giriniz:");
        int yas=input.nextInt();
        
        System.out.print("Tek Yon ise '1'/Gidis-Donus ise'2' Giriniz:");
        int secim=input.nextInt();
        
        double fpk=0.10;
        double biletFiyati=0.00;
        
        
        if(mesafe>0&&yas>0&&secim==1){
            if(yas<12){
                biletFiyati=mesafe*fpk*0.5;
            }else if(yas>=12&&yas<24){
                biletFiyati=mesafe*fpk*0.9;
            }else if(yas>65){
                biletFiyati=mesafe*fpk*0.7;
            }else{
                biletFiyati=mesafe*fpk;
            }
            System.out.println("Toplam Tutar : "+biletFiyati+" TL");
        }else if(mesafe>0&&yas>0&&secim==2){
            if(yas<12){
                biletFiyati=mesafe*fpk*0.5*2*0.8;
            }else if(yas>=12&&yas<24){
                biletFiyati=mesafe*fpk*0.9*2*0.8;
            }else if(yas>65){
                biletFiyati=mesafe*fpk*0.7*2*0.8;
            }else{
                biletFiyati=mesafe*fpk*2*0.8;
            }
            System.out.println("Toplam Tutar : "+biletFiyati+" TL");
            
        }else
            System.out.println("Hatali Veri Girdiniz!");
            
                
            
            
        
        
        
        
    }
    
}
