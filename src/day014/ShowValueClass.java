package day014;

public class ShowValueClass {
    public static void main(String[] args) {
        String[] isimler={"Hakan Şükür","İlhan Mansız","Ahmet Dursun","Hasan Şaş"};
//        isimler=new String[5];
        showValues(isimler,true);
    }

    public static void showValues(String[] values,boolean line){
        //if (values==null) return;

        if (values!=null) {
            for (int i = 0; i < values.length; i++) {
                System.out.print(values[i] + (line ? "\n" : "\t"));
            }
        }
    }

}
