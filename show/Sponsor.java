/*Nama     :Abisatya Hastarangga Pradana
NIM        :24060122120004
Tanggal    :10 Mar 2024
/**Main dari Sponsor {
 * menampilkan dan mengatur informasi mengenai nama sponsor, 
 * banyak uang yang dikeluarkan sponsor untuk sebuah pertunjukan atau show, 
 * dan apakah sponsor tersebut masih tersedia untuk dimintai dana}**/

public class Sponsor {
    private String namaSponsor;
    private int pengeluaranSponsor;
    private boolean tersedia;

    //Konstruktor
    public Sponsor(){
        this.namaSponsor = null;
        this.pengeluaranSponsor = 0;
        this.tersedia = true;
    }

    public Sponsor(String namaSponsor, int pengeluaranSponsor){
        this.namaSponsor = namaSponsor;
        this.pengeluaranSponsor = pengeluaranSponsor;
        this.tersedia = true;
    }

    //Getter
    public String getNamaSponsor(){
        return this.namaSponsor;
    }
    public int getPengeluaranSponsor(){
        return this.pengeluaranSponsor;
    }
    public boolean getTersedia(){
        return this.tersedia;
    }

    //Setter
    public void setNamaSponsor(String namaSponsor){
        this.namaSponsor = namaSponsor;
    }
    public void setPengeluaranSponsor(int pengeluaranSponsor){
        this.pengeluaranSponsor = pengeluaranSponsor;
    }
    public void setTersedia(boolean tersedia){
        this.tersedia = tersedia;
    }
}
