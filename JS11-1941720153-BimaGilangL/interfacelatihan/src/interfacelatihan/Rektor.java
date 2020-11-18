
package interfacelatihan;
/**
 * BimaGilangL
 */
public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswa){
        System.out.println("Saya Rektor!!, memberikan sertifikat cumlaude");
        System.out.println("Selamat! silahkan perkenalkan diri anda..");
        
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
        
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
     public void berisertifikatMawapres(Sarjana sarjanaCum){
         System.out.println("Saya REKTOR, memberikan setifikat MAWAPRES.");
         System.out.println("Selamat! Bagaimana anda bisa berprestasi?");
         
         sarjanaCum.menjuaraiKompetisi();
         sarjanaCum.membuatPublikasiIlmiah();
         
         System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
     }
      public void berisertifikatMawapres(PascaSarjana masterCum){
         System.out.println("Saya REKTOR, memberikan setifikat MAWAPRES.");
         System.out.println("Selamat! Bagaimana anda bisa berprestasi?");
         
         masterCum.menjuaraiKompetisi();
         masterCum.membuatPublikasiIlmiah();
         
         System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
     }
}
