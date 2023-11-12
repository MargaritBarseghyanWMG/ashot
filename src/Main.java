public class Main {
    public static void main(String[] args) {
        // Type casting -> tiperi dzevapoxutyun

        // UpCasting -> javan automate anume ays gortsoxutyuny
        // Tar = tar _ $
 /*       int myInt = 19; // 4 byte
        double myDouble = myInt; // 8 byte//
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myInt == myDouble);

        // byte -> short -> int -> float-> double -> long

        byte myByte = 6;
        float myFloat = myInt;

        char myChar = 'a';
        myInt = myChar;
        System.out.println(myChar);
        System.out.println(myInt);


        // DownCasting
        myDouble = 17.8;
        myInt = (int) myDouble;
        System.out.println(myInt);
        System.out.println(myDouble);

        myInt = 60;
        myChar = (char) myInt;
        System.out.println(myInt);
        System.out.println(myChar);*/


        int a=16;
        int s=3;
        if (a/(double)s>7) {
            System.out.println(a/(double)s);
            System.out.println(a&s);

        } else if(5*4>100){

            System.out.println(a*s);
        } else if(4-4==0){
            System.out.println(4);
        }

        short d=5;
        if (d%2==0)
            System.out.println(0);

        else System.out.println(1);

        // ete tivy 10in patike tpel 10
        int g=500;
        if (g%10==0)
            System.out.println(10);

        //ete tivy 3in bajanelis talise 1 mnacord tpel 1
        // hakarak depqum tpel 2

        long h=7;
        if (h%3==1)
            System.out.println(1);
        else System.out.println(2);

    }
}