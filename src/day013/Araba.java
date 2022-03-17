package day013;

import java.util.Scanner;

public class Araba {
    public static void main(String[] args) {
        //Markalar: Ford, Mercedes, BMW, Honda, Toyota

        Scanner input=new Scanner(System.in);
        String[] carNames={"Ford","Mercedes","BMW","Honda","Toyota"};
        double[] carPrices={20000,50000,55000,15000,18000};
        int[] carKms={80000,20000,15000,150000,110000};

        System.out.println("Araç Listesi");
        System.out.println("---------------------------");
        for (int i = 0; i < carNames.length; i++) {
            System.out.println((i+1)+" - "+carNames[i]);
        }
        System.out.print("Seçim : ");
        int secim=input.nextInt();
        System.out.println("Seçiminiz : "+carNames[secim-1]);
        System.out.println("Fiyatı    : "+carPrices[secim-1]);
        System.out.println("Kaç Km'de?: "+carKms[secim-1]);
    }
}
