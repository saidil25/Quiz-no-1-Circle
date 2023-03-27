public class Main {
    public static void main(String[] args){
//        Lingkaran
        lingkaran Circle = new lingkaran(1.0,"red");
        Double setradius = Circle.getradius();
        String setcolor = Circle.getcolor();
        System.out.println("Jari : " + setradius);
        System.out.println("Color : " + setcolor);
        System.out.println("Warna dan Jari : " + Circle);
        System.out.println("");

//        Tabung
        tabung cylinder = new tabung(1.0,1.0);
        double sethigh = cylinder.getTinggi();
        double setvolume = cylinder.getVolume();
        System.out.println("TInggi : " + sethigh);
        System.out.println("Volume : " + setvolume);


    }
}
