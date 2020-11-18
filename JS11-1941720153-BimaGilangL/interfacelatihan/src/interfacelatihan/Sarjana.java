
package interfacelatihan;
/**
 * BimaGilangL
 */
public class Sarjana extends Mahasiswa implements ICumlaude, IBerprestasi {
    public Sarjana(String nama){
        super(nama);
    }
    public void lulus(){
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }
    public void meraihIPKTinggi(){
        System.out.println("IPK-ku lebih dari 3,51");
    }

    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Saya Telah Menjuarai Kompetesi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIONAL");
    }
}
