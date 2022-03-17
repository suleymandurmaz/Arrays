package day014;

import java.util.Scanner;

public class FindingCar {
    public static void main(String[] args) {
        String[] cars={"Toyota","Mercedes","Ford","Honda","BMW"};
        Scanner input=new Scanner(System.in);
        System.out.print("Araba adı : ");
        String car=input.nextLine();
        findCar(car,cars);






    }


    /*
        İsmi verilen arabayı listeden bulup ekranda gösteren metot yazınız.
     */
    public static void findCar(String carName,String[] carNames){
        boolean flag=false;
        //int sayac=0;


        for(String car:carNames){
            //sayac++;
            //car.toLowerCase().equals(carName.toLowerCase())
            if(car.equalsIgnoreCase(carName)){
                System.out.println("Aradığınız araba bulundu. ["+car+"]");
                flag=true;
                break;
            }

        }

        //System.out.println(sayac+" kez döndü.");
        if(!flag){
            System.out.println("Araç bulunamadı.");
        }

    }

}
