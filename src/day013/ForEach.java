package day013;

public class ForEach {
    public static void main(String[] args) {

        String[] gunler={"Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"};
        System.out.println("Dizinin eleman Sayısı : "+gunler.length);
/*        for (int i = 0; i < gunler.length; i++) {
            System.out.println(gunler[i]);
        }*/

        //Lombok kütüphanesi: clean kod için
        //For Each Döngüsü
        for (String gun:gunler){
            System.out.println(gun);
        }

        //complexity
    }
}
