package ArrayBalok;

public class Balok {
    private int panjang;
    private int lebar;
    private int tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public int hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public static void main(String[] args) {
        Balok[] blArray = new Balok[3];
        blArray[0] = new Balok(100, 30, 12);
        blArray[1] = new Balok(120, 40, 15);
        blArray[2] = new Balok(210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke " + i + ": " + blArray[i].hitungVolume());
        }

        System.out.println("Volume total: " + hitungVolumeTotal(blArray));
    }

    private static int hitungVolumeTotal(Balok[] blArray) {
        int totalVolume = 0;
        for (Balok balok : blArray) {
            totalVolume += balok.hitungVolume();
        }
        return totalVolume;
    }
}

