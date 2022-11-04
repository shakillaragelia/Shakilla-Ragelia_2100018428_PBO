class Maskapai extends Apron{
    int idMaskapai,idPesawat;
    String namaMaskapai;
    @Override
    public void setApron(){
        System.out.print("Masukkan Nama Maskapai  : ");
        this.namaMaskapai=str.nextLine();
        System.out.print("Masukkan Kode Apron/ID Maskapai : ");
        this.idMaskapai=in.nextInt();
        System.out.print("Masukkan ID Pesawat: ");
        this.idPesawat=in.nextInt();
    }
    @Override
    public void tampil(){
        System.out.println("Nama Maskapai  : " + this.namaMaskapai);
        System.out.println("Kode Apron/Id Maskapai   : " + this.idMaskapai);
        System.out.println("ID Pesawat : " + this.idPesawat);
    }
    @Override
    public int getId(){
        return this.idMaskapai;
    }
    @Override
    public void setId(){
        this.idMaskapai=153400;
    }
    @Override
    public void setId(int id){
        this.idMaskapai=id+1;
    }
}