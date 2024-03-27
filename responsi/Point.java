/*
 * Nama :  Abisatya Hastarangga Pradana
 * NIM  : 24060122120004
 * Tgl  : 27 Maret 2024
 * Lab  : C1
 * Membuat class Point.java 
 */

public class Point {
        double absis;
        double ordinat;
        public Point(){
            absis = 0;
            ordinat = 0;
        }
        public Point(double absis, double ordinat){
            this.absis = absis;
            this.ordinat = ordinat;
        }
        public double getAbsis(){
            return this.absis;
        }
        public double getOrdinat(){
            return this.ordinat;
        }
        public void cetak(){
            System.err.println("("+this.getAbsis()+","+this.getOrdinat()+")");

        }
}
