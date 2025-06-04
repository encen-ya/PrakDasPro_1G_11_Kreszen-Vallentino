package ALSD.Pertemuan14;

public class BinaryTreeArrayMain11 {
    public static void main(String[] args) {
            BinaryTreeArray11 bta = new BinaryTreeArray11();
Mahasiswa11 mhs1 = new Mahasiswa11("24416121", "Ali", "A", 3.57);
Mahasiswa11 mhs2 = new Mahasiswa11("24416185", "Candra", "C", 3.41);
Mahasiswa11 mhs3 = new Mahasiswa11("24416221", "Badar", "B", 3.75);
Mahasiswa11 mhs4 = new Mahasiswa11("24416220", "Dewi", "B", 3.35);

Mahasiswa11 mhs5 = new Mahasiswa11("24416131", "Devi", "A", 3.48);
Mahasiswa11 mhs6 = new Mahasiswa11("24416025", "Ehsan", "D", 3.61);
Mahasiswa11 mhs7 = new Mahasiswa11("24416170", "Fizi", "B", 3.86);

Mahasiswa11[] dataMahasiswas = {mhs1,mhs2,mhs3,mhs4,mhs5,mhs6,mhs7,null, null, null};
int idxLast = 6;
bta.populateData(dataMahasiswas,idxLast);
System.out.println("\nInorder Traversal Mahasiswa: ");
bta.traverseInOrder(0);
    }
}
