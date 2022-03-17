package day014;

public class Isimler {
    public static void main(String[] args) {
        String[] isimler={"Ali","Veli","Ayşe"};
        isimler[1]="Fatma";

        String[] isimler2=isimler;
        String[] isimler30=isimler2;
        String[] isimler100=new String[isimler.length];
        for (int i = 0; i < isimler100.length; i++) {
            isimler100[i]=isimler[i];
        }
        for (String isim:isimler){
            System.out.println(isim);
        }
        System.out.println("----------------------");
        for (String isim:isimler2){
            System.out.println(isim);
        }
        System.out.println("---------------------");
        isimler2[2]="Osman";
        for (String isim:isimler2){
            System.out.println(isim);
        }
        System.out.println("---------------------");
        for (String isim:isimler){
            System.out.println(isim);
        }
    }
}
