package com.gilang.modul1.Object;

public class Objek {
    public static void main(String[] args) {
        //Deklarasi ojbect tanpa Parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        mahasiswaTanpa.setNama("Gilang");
        mahasiswaTanpa.setNim(19104043);

        System.out.println("Mahasiswa 1 ");
        System.out.println("Nama\t: "+mahasiswaTanpa.getNama());
        System.out.println("Nim\t\t: "+mahasiswaTanpa.getNim());

        Mahasiswa mahasiswa1 = new Mahasiswa("adi",19040083);
        System.out.println("Mahasiswa 2 ");
        System.out.println("Nama\t: "+mahasiswa1.getNama());
        System.out.println("Nim\t\t: "+mahasiswa1.getNim());

        Mahasiswa mahasiswa2 = new Mahasiswa("sulis",19104040);
        System.out.println("Mahasiswa 3");
        System.out.println("Nama\t: "+mahasiswa2.getNama());
        System.out.println("Nim\t\t: "+mahasiswa2.getNim());

    }
}