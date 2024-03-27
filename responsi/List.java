/*
 * Nama :  Abisatya Hastarangga Pradana
 * NIM  : 24060122120004
 * Tgl  : 27 Maret 2024
 * Lab  : C1
 * Membuat class abstract List.java
 */
import java.util.ArrayList;
public abstract class List {
    protected ArrayList<Object> list; 
    public List() {
        list = new ArrayList<>();
    }
    public Object getElmt(int i) {
        return list.get(i - 1); 
    }
    public int getSize() {
        return list.size(); 
    }
    public void add(Object element){
        list.add(element);
    }
    public abstract void del(); 
    public abstract void cetak(); 
}
