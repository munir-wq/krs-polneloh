package Model;

public class Mahasiswa extends Person {


    private String nim;
    private KRS krs;
    int a = 7;
    char huruf;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        if (nama+nim == ""){
            System.out.println("nama dan nim tidak boleh kosong");

        }
        else if (nama.matches("[a-zA-Z]") ){
            System.out.println("nim tidak boleh huruf");

        }else if (nama.length() <=50){
            System.out.println("nama maksimal 50 karakter");
        }else if (nama == ""){
            System.out.println("nama tidak boleh kosong");
        }else if (!angka){
            System.out.println("nama tidak boleh angka");
        }else if (nama.matches("[0-9]+[a-zA-Z]+[a-zA-Z0-9]*$")) {
            System.out.println("nama tidak boleh karakter");
        }

        }

    public Mahasiswa() {

    }

    public void cetakKRS(){
     System.out.println("cetak krs");

    }
    public void setNim(String nim) {
        if (nim.length() == 7) {
            System.out.println("nim harus berisi 7 digit");
        }
    }
    public String getNim(){
      return this.nim;
    }
    public void pilihPaketKRS(KRS krs){

    }
    public KRS getKRS(){
        return this.krs;

    }

    @Override
    public void showprofil() {
        System.out.printf("selamat datang mahasiswa");
    }
}
