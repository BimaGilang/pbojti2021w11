import interfacelatihan.IBerprestasi;
import interfacelatihan.ICumlaude;
import interfacelatihan.Mahasiswa;
import interfacelatihan.PascaSarjana;
import interfacelatihan.Rektor;
import interfacelatihan.Sarjana;

/**
 * BimaGilangL
 */
public class interfacemain {
    public static void main(String[] args){
        Rektor pakrektor = new Rektor();
        Mahasiswa mhsBiasa = new Mahasiswa("Mumet");
        Sarjana sarjanaCum = new Sarjana("Dini");
        PascaSarjana masterCum = new PascaSarjana("Elok");
        
        pakrektor.berisertifikatMawapres(sarjanaCum);
        pakrektor.berisertifikatMawapres(masterCum);
        // pakrektor.beriSertifikatCumlaude(mhsBiasa);
        //pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        //pakrektor.beriSertifikatCumlaude(masterCumlaude);
    }
}
