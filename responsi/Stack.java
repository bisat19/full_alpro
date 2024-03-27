/*
 * Nama :  Abisatya Hastarangga Pradana
 * NIM  : 24060122120004
 * Tgl  : 27 Maret 2024
 * Lab  : C1
 * Membuat abstract class Stack.java 
 */
public abstract class Stack extends List{
    public Object getTop(){
        return list.get(super.getSize()-1);
    }
}
