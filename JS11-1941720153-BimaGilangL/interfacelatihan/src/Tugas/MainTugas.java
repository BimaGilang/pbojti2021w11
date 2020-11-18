package Tugas;
/**
 * BimaGilangL
 */
public class MainTugas {
    public static void main(String[] args) {
        Singa sg = new Singa();
        Keledai kl = new Keledai();
        Gorilla gl = new Gorilla();

        kl.Jenis();
        kl.displayMakan();
        kl.nama();
        kl.jmlKaki();
        kl.Suara();
        kl.warnaBulu();
        System.out.println("");

        gl.Jenis();
        gl.displayMakan();
        gl.nama();
        gl.jmlKaki();
        gl.Suara();
        gl.warnaBulu();
        System.out.println("");

        sg.Jenis();
        sg.displayMakan();
        sg.nama();
        sg.jmlKaki();
        sg.Suara();
        sg.warnaBulu();

    }
}
