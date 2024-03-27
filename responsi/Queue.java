/*
 * Nama :  Abisatya Hastarangga Pradana
 * NIM  : 24060122120004
 * Tgl  : 27 Maret 2024
 * Lab  : C1
 * Membuat abstract class Queue.java
 */
public abstract class Queue extends List{
    public Object getHead(){
        return list.get(0);
    }
    public Object getTail(){
        return list.get(super.getSize()-1);
    }
}
