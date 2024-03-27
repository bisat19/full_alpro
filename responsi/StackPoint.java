/*
 * Nama :  Abisatya Hastarangga Pradana
 * NIM  : 24060122120004
 * Tgl  : 27 Maret 2024
 * Lab  : C1
 * Membuat class StackPoint.java
 */
public class StackPoint extends Stack{
    public void del(){
        list.remove(super.getSize()-1);
    }
    public Point getElmt(int i){
        return (Point) list.get(i-1);
    }
    public Point getTop(){
        return (Point) list.get(super.getSize()-1);
    }
    public void cetak(){
        for (int i = super.getSize()-1; i >= 0; i--){
            System.out.println((Point) list.get(i));
        }
    }
}
