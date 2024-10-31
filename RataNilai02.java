import java.util.Scanner;

public class RataNilai02 {
    public static void main(String[] args) {
        int i, j;
        int nilaiMhs;
        float rataNilai, totalNilai;

        Scanner sc = new Scanner(System.in);
        
      
        for (i = 1; i <= 5; i++) {
            totalNilai = 0; 
            System.out.println("Input Nilai Mahasiswa ke " + i);
            
           
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                nilaiMhs = sc.nextInt();
                totalNilai += nilaiMhs;
            }
            
          
            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata Nilai Mahasiswa ke " + i + " adalah " + rataNilai);
            System.out.println();
        }
        sc.close();
    }
}
