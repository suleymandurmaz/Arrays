package day014;

public class ChangeValueClass {
    public static void main(String[] args) {
        int x=20;
        System.out.println("Değer = "+x);
        x=changeValue(x);
        System.out.println("Değer = "+x);
        System.out.println("---------------------");
        int[] sayilar={5,7,9};
        for(int sayi:sayilar){
            System.out.print(sayi+" ");
        }
        changeValue(sayilar);
        for(int sayi:sayilar){
            System.out.print(sayi+" ");
        }
    }



    public static void changeValue(int[] values){
        values[0]=15;
        if(values[0]==15){
            System.out.println("Değişti.");
        }
    }

    public static int changeValue(int value){
        value=5;
        if(value==5){
            System.out.println("Değişti.");
        }
        return value;
    }
}
