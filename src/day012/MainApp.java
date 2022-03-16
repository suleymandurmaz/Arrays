package day012;

public class MainApp {
    public static void main(String[] args) {
        //Array (dizi) nasıl tanımlanır?
        int[] sayilar=new int[5];
        sayilar[0]=15;
        sayilar[1]=24;
        sayilar[2]=12;
        sayilar[3]=7;
        sayilar[4]=23;

        int toplam=0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam=toplam+sayilar[i];
        }
        double ort=(double) toplam/sayilar.length;
        System.out.println("Toplam = "+toplam);
        System.out.println("Ortalama = "+ort);





/*        String[] futbolcular=new String[3];
        String[] days=new String[7];
        String[] aylar=new String[12];*/
    }
}
