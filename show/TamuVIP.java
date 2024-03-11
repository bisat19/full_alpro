/*Nama     :Abisatya Hastarangga Pradana
NIM        :24060122120004
Tanggal    :10 Mar 2024
/**Main dari TamuVIP {
 *  menampilkan serta mengedit informasi mengenai nama tamu, 
 * alamat, nomor telepon, 
 * serta banyak tamu VIP yang dimiliki oleh sang event organizer.}**/
public class TamuVIP {
    private String nama;
    private String nomorHp;
    private String alamat;
    private static int banyakTamuVIP;

    //Konstruktor
    public TamuVIP(){
        this.nama = null;
        this.nomorHp = null;
        this.alamat = null;
        banyakTamuVIP++;
    }

    public TamuVIP(String nama, String nomorHp, String alamat){
        this.nama = nama;
        this.nomorHp = nomorHp;
        this.alamat = alamat;
        banyakTamuVIP++;
    }

    //Getter
    public String getNama(){
        return this.nama;
    }
    public String getNomorHp(){
        return this.nomorHp;
    }
    public String getAlamat(){
        return this.alamat;
    }
    public static int getBanyakTamuVIP(){
        return banyakTamuVIP;
    }

    //Setter
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNomorHp(String nomorHp){
        this.nomorHp = nomorHp;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
}
