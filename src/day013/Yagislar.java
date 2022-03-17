package day013;

public class Yagislar {
    public static void main(String[] args) {
        String[] aylar={"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran",
                        "Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık"};
        double[] yagislar={40.5,35.3,39.3,42.2,51.3,35.2,14.1,12.5,18.0,27.5,31.5,44.6};
        //Yıllık toplam yağış miktarı
        //En çok yağış olan ay?
        //En az yağış alan ay?
        double toplam=0.0;
        double enFazla=0.0;
        int index=0;
        int enAz=0;
        for (int i = 0; i < yagislar.length; i++) {
            toplam+=yagislar[i];

            if(yagislar[i]>enFazla){
                enFazla=yagislar[i];
                index=i;
            }

        }
        System.out.println("En fazla  "+enFazla);
        System.out.println("Ay "+aylar[index]);

        System.out.println(String.format("Toplam yağış miktarı = %5.1f",toplam));
    }
}
