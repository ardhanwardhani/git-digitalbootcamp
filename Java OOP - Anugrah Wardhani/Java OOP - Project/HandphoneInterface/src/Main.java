import java.util.Scanner;
import interfaces.Phone;

public class Main {
    public static void main(String[] args) {
        //Membuat object phone dengan instansiasi dari class Xiaomi
        Phone redmiNote10 = new Xiaomi();

        //Membuat object PhoneUser
        PhoneUser dian = new PhoneUser(redmiNote10);

        //Menyalakan Hp
        dian.turnOnThePhone();

        //Membuat tampilan
        Scanner input = new Scanner(System.in);
        String aksi;
        boolean isLooping = true;

        do{
            System.out.println("=== Aplikasi Interface ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Perkecil Volume");
            System.out.println("[0] Keluar");
            System.out.println("==========================");

            System.out.println("Pilih Aksi: ");
            aksi = input.next();

            if(aksi.equalsIgnoreCase("1")){
                dian.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")) {
                dian.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")) {
                dian.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")) {
                dian.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")) {
                isLooping = false;
            }else{
                System.out.println("Aksi yang Anda pilih tidak tersedia.");
                System.out.println("Pilih aksi yang ada!");
            }
        }while(isLooping);
    }
}