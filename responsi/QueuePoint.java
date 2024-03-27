/*
 * Nama :  Abisatya Hastarangga Pradana
 * NIM  : 24060122120004
 * Tgl  : 27 Maret 2024
 * Lab  : C1
 * Membuat class abstract QueuePoint.java
 */
public class QueuePoint extends Queue{
    public void del(){
        list.remove(0);
    }
    public Point getElmt(int i){
        return (Point) list.get(i-1);
    }
    public Point getHead(){
        return (Point) list.get(0);
    }
    public Point getTail(){
        return (Point) list.get(super.getSize()-1);
    }
    public void cetak(){
        for (int i = 0; i < super.getSize(); i++){
            System.out.println((Point) list.get(i));
        }
    }
}
