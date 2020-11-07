/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if110119024latihan38objectorientedperhitunganlingkaran;

/**
 *
 * @author acer
 * NAMA  : Kusnandi Pirmansyah
 * KELAS : IF-1
 * NIM   10119024
 */
public class If110119024Latihan38ObjectOrientedPerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.int);
        PerhitunganLingkaran lingkaran = new PerhitunganLingkaran();
        
        System.out.println("====Perhitungan Lingkaran====");
        System.out.print("Masukan nilai diameter lingkaran : ");
        while(true) {
            try {
                lingkaran.diameter = Double.parseDouble(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nilai Diamete Tidak Sesuai\n");
                System.out.print("Masukan nilai diameter lingkaran : ");
                continue;
            }
        }
        double jarijari = lingkaran.hitungJariJari();
        double luas = lingkaran.hitungLuas();
        double keliling = lingkaran.hitungKeliling();
        System.out.println();
        System.out.println("=====Hasil Perhitungan Lingkaran=====");
        System.out.println("jari-Jari Lingkaran\t\t= %.2f%n", jarijari);
        System.out.println("Luas Lingkaran\t\t= %.2f%n", luas);
        System.out.println("Keliling Lingkaran\t\t= %.2f%n", Keliling);
    }
    
}
