public class tabung extends lingkaran {
    private double tinggi;

    public tabung() {
        this.tinggi = 1.0;
    }

    public tabung(double jari) {
        super(jari);
    }

    public tabung(double jari, double tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }

    public tabung(double jari, double tinggi, String color) {
        super(jari,color);
        this.tinggi = tinggi;

    }
    public double getTinggi(){
        return tinggi;
    }
    public double getVolume(){
        return super.area() * this.tinggi;
    }
}
