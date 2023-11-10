public class Main {
    public static void main(String[] args) {
        // Type casting -> tiperi dzevapoxutyun

        // UpCasting -> javan automate anume ays gortsoxutyuny
        // Tar = tar _ $
        int myInt = 19; // 4 byte
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
        System.out.println(myChar);

        int tazaBan=7262;
    }
}