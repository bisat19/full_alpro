/*Nama     :Abisatya Hastarangga Pradana
NIM        :24060122120004
Tanggal    :10 Mar 2024
/**Main dari Show**/

public class Show {
    private String showId;
    private String namaShow;
    private String lokasiShow;
    private int hargaTiketShow;
    private String tanggalShow;
    private double durasiShow;
    private int maxPenonton;
    private int maxPerformance;
    private int jumlahSewaPerformance;
    private Performance[] sewaPerformance;
    private int jumlahSponsor;
    private Sponsor[] dapatSponsor;
    private TamuVIP tamuVIP;
    private static int banyakShow;

    //Konstruktor Show
    public Show(){
        this.showId = null;
        this.namaShow = null;
        this.lokasiShow = null;
        this.hargaTiketShow = 0;
        this.tanggalShow = null;
        this.durasiShow = 0;
        this.maxPenonton = 0;
        this.maxPerformance = 0;
        this.jumlahSewaPerformance = 0;
        this.sewaPerformance = new Performance[this.maxPerformance];
        this.jumlahSponsor = 0;
        this.dapatSponsor = new Sponsor[10];
        this.tamuVIP = new TamuVIP();
        banyakShow ++;
    }
    public Show(String showId, String namaShow, String lokasiShow, 
    int hargaTiketShow, String tanggalShow, double durasiShow, TamuVIP tamuVIP){
        this.showId = showId;
        this.namaShow = namaShow;
        this.lokasiShow = lokasiShow;
        this.hargaTiketShow = hargaTiketShow;
        this.tanggalShow = tanggalShow;
        this.durasiShow = durasiShow;
        this.maxPenonton = Integer.parseInt(showId.substring(showId.length() 
        - 2, showId.length() - 1)) * 1000;
        this.maxPerformance = Integer.parseInt(showId.substring(showId.length() - 1));
        this.jumlahSewaPerformance = 0;
        this.sewaPerformance = new Performance[this.maxPerformance];
        this.jumlahSponsor = 0;
        this.dapatSponsor = new Sponsor[10];
        this.tamuVIP = tamuVIP;
        banyakShow ++;
    }

    //Getter 
    public String getShowId(){
        return this.showId;
    }
    public String getNamaShow(){
        return this.namaShow;
    }
    public String getLokasiShow(){
        return this.lokasiShow;
    }
    public String getTanggalShow(){
        return this.tanggalShow;
    }
    public double getDurasiShow(){
        return this.durasiShow;
    }
    public int getMaxPenonton(){
        return this.maxPenonton;
    }
    public int getMaxPerformance(){
        return this.maxPerformance;
    }
    public int getJumlahSponsor(){
        return this.jumlahSponsor;
    }
    public static int getBanyakShow(){
        return banyakShow;
    }
    public int getKeuntunganMaximum(){
        return maxPenonton * hargaTiketShow;
    }
    public TamuVIP getTamuVIP(){
        return tamuVIP;
    }

    //Setter
    public void setShowId(String showId){
        this.showId = showId;
    }
    public void setNamaShow(String namaShow){
        this.namaShow = namaShow;
    }
    public void setLokasiShow(String lokasiShow){
        this.lokasiShow = lokasiShow;
    }
    public void setTanggalShow(String tanggalShow){
        this.tanggalShow = tanggalShow;
    }
    public void setDurasiShow(double durasiShow){
        this.durasiShow = durasiShow;
    }
    public void setMaxPenonton(String showId){
        this.maxPenonton = Integer.parseInt(showId.substring(showId.length() 
        - 2, showId.length() - 1)) * 1000;
    }
    public void setMaxPerformance(String showId){
        this.maxPerformance = Integer.parseInt(showId.substring(showId.length() - 1));
    }
    public void setTamuVIP(TamuVIP tamuVIP){
        this.tamuVIP = tamuVIP;
    }
    public void sewaPerformance(Performance performance){
        if (jumlahSewaPerformance >= maxPerformance){
            System.out.println("Performance melebihi batas maksimum");
        }
        performance.setTersedia(false);
        sewaPerformance[jumlahSewaPerformance] = performance;
        jumlahSewaPerformance++;
    }
    public void dapatSponsor(Sponsor sponsor){
        if (jumlahSponsor >= 10){
            System.out.println("Sponsor tidak boleh lebih dari 10");
        }
        sponsor.setTersedia(false);
        dapatSponsor[jumlahSponsor] = sponsor;
        jumlahSponsor++;
    }
    //Fungsi lainnya
    public void cetakNamaPerformance(){
        System.out.println("Performance yang akan Perform di "+namaShow+" :");
        for(int i = 0; i < jumlahSewaPerformance;i++){
            System.out.println("Performance "+(i+1)+": "+
            sewaPerformance[i].getNamaPerformance());
        }
    }
    public void cetakNamaSponsor(){
        System.out.println("Sponsor yang mendanai "+namaShow+": ");
        for(int i = 0; i < jumlahSponsor;i++){
            System.out.println("Sponsor ke- "+(i+1)+": "+
            dapatSponsor[i].getNamaSponsor());
        }
    }
    public void cetakFinancial(){
        System.out.println("--------"+showId+"--------");
        System.out.println("Maksimum Keuntungan: "+this.getKeuntunganMaximum());
        //Kamus Lokal
        int sewa = 0;
        int hibah = 0;
        //Algoritma
        for (int i = 0; i < jumlahSewaPerformance;i++){
            sewa = sewa + sewaPerformance[i].getHargaPerformance();
        }
        System.out.println("Harga Sewa Performance: "+sewa);
        for (int i = 0; i < jumlahSponsor;i++){
            hibah = hibah + dapatSponsor[i].getPengeluaranSponsor();
        }
        System.out.println("Pemasukan Sponsor: "+hibah);
        System.out.println("Estimasi Laba/Rugi: "+(this.getKeuntunganMaximum()+hibah-sewa));
    }
    public void cetak(){
        System.out.println("Show Id: "+showId);
        System.out.println("Nama Show: "+namaShow);
        System.out.println("Lokasi Show: "+lokasiShow);
        System.out.println("Harga Tiket Show: "+hargaTiketShow);
        System.out.println("Tanggal Show: "+tanggalShow);
        System.out.println("Durasi Show: "+durasiShow);
        System.out.println("Maksimum Penonton: "+maxPenonton);
        System.out.println("Maksimum Performance: "+maxPerformance);
        System.out.println("Tamu VIP yang hadir: "+tamuVIP.getNama());
        this.cetakNamaPerformance();
        this.cetakNamaSponsor();
    }
}
