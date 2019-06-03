public class Main {

    public static void main(String args[]) {
        int hours = 11;
        int minutes = 12;
        int seconds = 13;
        int div = 0;
        int mod = 0;


        if(seconds % 2 == 0){
            System.out.println("P");
        }else{
            System.out.println("I");
        }
        //pentru ore
        div = hours / 5;
        mod = hours % 5;

        for (int i = 0; i < div; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < mod; i++) {
            System.out.print("-");
        }
        //pentru minute
        System.out.println();
        div = minutes / 5;
        mod = minutes % 5;

        for (int i = 0; i < div; i++) {
            System.out.print("-");
        }
        //pentru secunde
        System.out.println();
        for (int i = 0; i < mod; i++) {
            System.out.print("-");
        }

    }
}
