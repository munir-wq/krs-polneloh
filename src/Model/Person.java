package Model;

public abstract class Person {
    String nama;
    boolean angka = true;
    public abstract void showprofil();
    public void setNama(String nama){
       if(nama == "" ) {
           System.out.println("nama tidak boleh kosong");

       }else if(!angka){
           System.out.println("isi tidak boleh angka");
       }else if (nama.matches("[0-9]+[a-zA-Z]+[a-zA-Z0-9]*$")){
           System.out.println("isi tidak boleh karakter di kuar huruf");
       }else {
           return;
       }

    }
    public String getNama(){
        return this.nama;
    }


}