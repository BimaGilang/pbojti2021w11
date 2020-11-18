package Tugas;
/**
 * BimaGilangL
 */
public class Gorilla extends Binatang implements IKarnivora, IHerbivora {
    public String suara;
    public String warnaBulu;

    public void Gorilla(String nama, int jmlKaki, String suara, String warnaBulu) {
        this.Gorilla(nama, jmlKaki, suara, warnaBulu);
    }
    public void Binatang(String nama, int jmlKaki) {
        this.Binatang(nama, jmlKaki);
    }
    @Override
    public String nama() {
        System.out.println("Nama : Gulali");
        return suara;
    }
    @Override
    public int jmlKaki() {
        System.out.println("Jumlah Kaki : 4");
        return 4;
    }
    @Override
    public void displayMakan() {
        System.out.println("Makanan : Daging + Tumbuhan");
    }
    public void warnaBulu() {
        System.out.println("Warna Bulu : Hitam Manis");
    }

    public void Suara() {
        System.out.println("Suara : Haumm Haumm");
    }

    public void Jenis() {
        System.out.println("Jenis : Karnivora + Herbivora");
    }
}
