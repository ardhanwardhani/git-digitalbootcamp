import interfaces.Phone;

public class Xiaomi implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Xiaomi(){
        //Set volume default
        this.volume = 50;
    }

    //Override semua method abstract yang ada di interface Phone

    @Override
    public void powerOn(){
        isPowerOn = true;
        System.out.println("Handphone menyala...");
        System.out.println("Selamat Datang di Xiaomi");
        System.out.println("Andrid version 10");
    }

    @Override
    public void powerOff(){
        isPowerOn = false;
        System.out.println("Mematikan handphone");
    }

    @Override
    public void volumeUp(){
        if(isPowerOn){
            if(this.volume == MAX_VOLUME){
                System.out.println("Volume sudah maksimal!");
            }else{
                this.volume += 10;
                System.out.println("Volume sekarang "+ this.volume);
            }
        }else{
            System.out.println("Handphone mati, silakan nyalakan terlebih dahulu!");
        }
    }

    @Override
    public void volumeDown(){
        if(isPowerOn){
            if(this.volume == MIN_VOLUME){
                System.out.println("Volume " + this.volume + "%");
            }else{
                this.volume -= 10;
                System.out.println("Volume sekarang "+ this.volume + "%");
            }
        }else{
            System.out.println("Handphone mati, silakan nyalakan terlebih dahulu!");
        }
    }

    //Getter & Setter
    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public boolean isPowerOn(){
        return isPowerOn;
    }

    public void setPowerOn(boolean isPowerOn){
        this.isPowerOn = isPowerOn;
    }
}