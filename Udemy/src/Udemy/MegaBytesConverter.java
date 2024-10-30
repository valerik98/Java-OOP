package Udemy;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        if (kiloBytes<0){
            System.out.println("Invalid Value");
            return;
        }
        int megaBytes = kiloBytes/1024;
        int kiloBytesLeft = kiloBytes%1024;
        System.out.printf("%d KB = %d MB and %d KB",kiloBytes,megaBytes,kiloBytesLeft);

    }

}
