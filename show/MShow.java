/*Nama     :Abisatya Hastarangga Pradana
NIM        :24060122120004
Tanggal    :10 Mar 2024
/**Main dari MShow {Main driver dari Program Event Organizer}**/

public class MShow {
    public static void main(String[] args) {
        TamuVIP tamu1 = new TamuVIP("Jeudah","345-987-090","Jl Ngawi 45"); 
        Show show1 = new Show("ADE123","Euro-Crimes"
        ,"Stadion GBK, Jakarta",150,"23-03-2024",
        3.6, 
        new TamuVIP("Mr. Satya","867-908-456","Jhonson St. 45"));
        Show show2 = new Show("AGK155","SenoGampita"
        ,"Senocity Vil, New York",150,"23-03-2024",
        6.6,
        new TamuVIP("Mr. Smith","957-788-456","Jminsmith St. 99"));
        //Mengetahui banyak show dan tamu VIP yang dimiliki EO
        System.out.println("Banyak Show yang dimiliki EO: " + Show.getBanyakShow());
        System.out.println("Banyak tamu VIP yang dimiliki EO: " + TamuVIP.getBanyakTamuVIP());
        //Menampilkan nama tamu1, tamu di show2, mengubah nama tamu di show 2
        System.err.println("Nama tamu VIP 1: "+tamu1.getNama());
        System.out.println("Nama tamu VIP di show 2: "+show2.getTamuVIP().getNama());
        show2.getTamuVIP().setNama("Amardilo");
        System.out.println("Nama tamu VIP di show 2: "+show2.getTamuVIP().getNama());
        //Assign Performance
        Performance performance1 = new Performance("Mitski",
        "Pop Alt",2000);
        Performance performance2 = new Performance("LDR",
        "Pop Alt",4500);
        Performance performance3 = new Performance("Simon R",
        "Pop Alt",1500);
        Performance performance4 = new Performance("JKK",
        "EDM",500);
        Performance performance5 = new Performance("IU",
        "Pop",2500);
        Performance performance6 = new Performance("TxT",
        "Pop",3500);
        //Memasukan performance 1-3 di show 1 dan menampilkannya, 
        //ingat maksimum performance berdasarkan id terakhir 
        //jika tidak akan terjadi exception program berhenti
        show1.sewaPerformance(performance1);
        show1.sewaPerformance(performance2);
        show1.sewaPerformance(performance3);
        show1.cetakNamaPerformance();
        //Asign sponsor
        Sponsor sponsor1 = new Sponsor("Bank BCA",5000);
        Sponsor sponsor2 = new Sponsor("Bank BRI",300);
        Sponsor sponsor3 = new Sponsor("Bank Mandiri",1300);
        Sponsor sponsor4 = new Sponsor("Bank Bangunin",1300);
        Sponsor sponsor5 = new Sponsor("Vobalagi Inc",5000);
        Sponsor sponsor6 = new Sponsor("PT Lagilagi",4500);
        //Memasukan performance 4-6 di show 2 serta memasukkan semua sponsor ke show 2
        show2.sewaPerformance(performance4);show2.sewaPerformance(performance5);
        show2.sewaPerformance(performance6);show2.dapatSponsor(sponsor1);
        show2.dapatSponsor(sponsor2);show2.dapatSponsor(sponsor3);
        show2.dapatSponsor(sponsor4);show2.dapatSponsor(sponsor5);
        show2.dapatSponsor(sponsor6);
        //Tampilkan semua fungsi cetak tentang show 2
        System.out.println("-------SHOW 2-------");
        show2.cetakNamaPerformance();
        System.out.println("-------SHOW 2-------");
        show2.cetakNamaSponsor();
        System.out.println("-------SHOW 2-------");
        show2.cetakFinancial();
        System.out.println("-------SHOW 2-------");
        show2.cetak();

    }
}
