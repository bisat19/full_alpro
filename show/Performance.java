/*Nama     :Abisatya Hastarangga Pradana
NIM        :24060122120004
Tanggal    :10 Mar 2024
/**Main dari Performance {
 * menampilkan dan mengatur informasi mengenai nama performance, 
 * genre yang dibawakan performance, 
 * harga yang harus dikeluarkan oleh event organizer saat mengundangnya 
 * dan juga apakah performance masih tersedia untuk sebuah show.}**/

public class Performance {
    private String namaPerformance;
    private String genrePerformance;
    private int hargaPerformance;
    private boolean tersedia;

    //Konstrutor
    public Performance(){
        this.namaPerformance = null;
        this.genrePerformance = null;
        this.hargaPerformance = 0;
        this.tersedia = true;
    }

    public Performance(String namaPerformance, String genrePerformance, int hargaPerformance){
        this.namaPerformance = namaPerformance;
        this.genrePerformance = genrePerformance;
        this.hargaPerformance = hargaPerformance;
        this.tersedia = true;
    }

    //Getter
    public String getNamaPerformance(){
        return this.namaPerformance;
    }
    public String getGenrePerformance(){
        return this.genrePerformance;
    }
    public int getHargaPerformance(){
        return this.hargaPerformance;
    }
    public boolean getTersedia(){
        return this.tersedia;
    }

    //Setter
    public void setNamaPerformance(String namaPerformance){
        this.namaPerformance = namaPerformance;
    }
    public void setGenrePerformance(String genrePerformance){
        this.genrePerformance = genrePerformance;
    }
    public void sethargaPerformance(int hargaPerformance){
        this.hargaPerformance = hargaPerformance;
    }
    public void setTersedia(boolean tersedia){
        this.tersedia = tersedia;
    }
}
