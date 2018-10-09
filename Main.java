package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------Kelas Kotak-----------");
        //Buat object dari kelas kotak
        Kotak main = new Kotak();
        //mengatur ukuran kotak
        main.setPanjang(93.47);
        main.setLebar(7.10);

        //memanggil object kotak
        System.out.println("panjang: " + main.getPanjang());
        System.out.println("lebar: " + main.getLebar());
        System.out.println("luas: " + main.getPanjang() * main.getLebar());
        System.out.println("keliling: " + main.getPanjang() * main.getLebar() * main.getPanjang() * main.getLebar());

        System.out.println("----------------Kelas Mahasiswa---------------");
        Mahasiswa Mahasiswa = new Mahasiswa();

        Mahasiswa.nama = "muhammad as'ad amri";
        Mahasiswa.nim = "D0217349";
        Mahasiswa.alamat = "mamuju";
        Mahasiswa.golonganDarah = "O";
        Mahasiswa.status = "Mahasiswa";
        Mahasiswa.tinggiBadan = "160";
        Mahasiswa.beratBadan = "40";

        //getter mahasiswa
        System.out.println("nama: " + Mahasiswa.getNama());
        System.out.println("nim: " + Mahasiswa.getNim());
        System.out.println("alamat: " + Mahasiswa.getAlamat());
        System.out.println("golongan darah: " + Mahasiswa.getGolonganDarah());
        System.out.println("status: " + Mahasiswa.getStatus());
        System.out.println("tinggi badan: " + Mahasiswa.getTinggiBadan());
        System.out.println("berat badan: " + Mahasiswa.getBeratBadan());

        System.out.println("---------------Kelas node---------------");
        //membuat object dari kelas note
        node node = new node();
        node.Label = "pamuttu";
        node.Value = 9;

        //getter node
        System.out.println("Nama Label: " + node.getLabel());
        System.out.println("Jumlah Label: " + node.getValue());

        System.out.println("-------------class stack-------------");
        //membuat object kelas stack
        stack stack = new stack();

        stack.value[0] ="muhammadasad";
        stack.value[1] = "amri";
        stack.value[2] = "passambosiri";
        stack.value[3] = "kaccul";
        stack.value[4] = "naruto";
        stack.value[5] = "yonkjaya";
        stack.value[6] = "yonkjaya";
        stack.value[7] = "yonkjaya";
        stack.value[8] = "yonkjaya";
        stack.value[9] = "yonkjaya";
        stack.value[10] = "yonkjaya";
        stack.value[11] = "yonkjaya";
        stack.value[12] = "yonkjaya";
        stack.value[13] = "yonkjaya";
        stack.value[14] = "yonkjaya";
        stack.value[15] = "yonkjaya";
        stack.value[16] = "yonkjaya";
        stack.value[17] = "yonkjaya";
        stack.value[18] = "yonkjaya";
        stack.value[19] = "yonkjaya";
        stack.value[20] = "yonkjaya";

        stack.setValueAt(6, "kaccul");

        for (int i = 0; i < stack.value.length; i++) {
            System.out.println(stack.value[i]);};

        }

    }