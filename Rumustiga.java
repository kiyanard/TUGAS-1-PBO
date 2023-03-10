public class Rumustiga {
    
    public static void main(String[] args) {
        double d, t,volume, r;
        final double phi = 3.14;
        t = 10;
        d = 5;
        r = d * 0.5;
        
        System.out.println("Volume tabung: ");
        System.out.print("Jari-jari alas: ");
        System.out.print("Tinggi tabung: ");
        volume = (phi * r* r) * t;
    
        System.out.println("Volume Tabung = " + volume);
    }
}
