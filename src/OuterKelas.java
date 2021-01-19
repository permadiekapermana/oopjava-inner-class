public class OuterKelas {

    private class Band{
        private String nama = "Ada Band";
        private String vokalis = "Indra Sinaga";
        private String thnTerbentuk = "1996";
        private String situsWeb = "adaband.com";
        private void debut(){
            System.out.println("Nama Band : "+nama);
            System.out.println("Vokalis : "+vokalis);
            System.out.println("Tahun Terbentuk : "+thnTerbentuk);
            System.out.println("Situs Web : "+situsWeb);
        }
    }
    private class Song{
        private String lagu = "Siap Melepasmu";
        private String album = "Chemistry";
        private String thnRilis = "2016";
        private String ciptaan = "Marshal & Donnie";
        private void release() {
            System.out.println("Judul Lagu : "+lagu);
            System.out.println("Album : "+album);
            System.out.println("Tahun Rilis : "+thnRilis);
            System.out.println("Ciptaan : "+ciptaan);
        }
    }
    public static void main(String[] args) throws Exception {
        OuterKelas kelasLuar = new OuterKelas();
        OuterKelas.Band band1 = kelasLuar.new Band();
        System.out.println("Identitas Band --");
        band1.debut();

        OuterKelas.Song song1 = kelasLuar.new Song();        
        System.out.println("\nIdentitas Lagu --");
        song1.release();
    }
}
