public class lingkaran {
    private double jari ;
    private String color;

    public lingkaran(){
        this.jari = 1.0;
        this.color = "red";
    }
    public lingkaran(double jari){
        this.jari = jari;
    }
    public lingkaran(double jari,String color){
        this.jari = jari;
        this.color = color;
    }
    public double getradius(){
        return jari;
    }
    public String getcolor(){
        return color;
    }
    public double area(){
    return this.jari *  this.jari * 3.14;
    }

    @Override
    public String toString() {
        return "lingkaran{" +
                "jari=" + jari +
                ", color='" + color + '\'' +
                '}';
    }
}
