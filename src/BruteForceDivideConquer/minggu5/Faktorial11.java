package BruteForceDivideConquer.minggu5;

public class Faktorial11 {
    int faktorialBF(int n) {
        int i= 1;
        int fakto = 1;
        while (i <= n) {
            fakto = fakto * i;
            i++;
        }
        return fakto;
    }

    int faktorialDC(int n) {
        if(n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
    
}
