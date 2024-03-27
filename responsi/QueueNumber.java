/*
 * Nama :  Abisatya Hastarangga Pradana
 * NIM  : 24060122120004
 * Tgl  : 27 Maret 2024
 * Lab  : C1
 * Membuat class QueueNumber.java
 */
public class QueueNumber extends Queue{
    public void del(){
        list.remove(0);
    }
    public void cetak(){
        for (int i = 0; i < super.getSize(); i++){
            System.out.println(list.get(i));
        }
    }
}
