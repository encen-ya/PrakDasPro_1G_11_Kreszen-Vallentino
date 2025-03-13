package BruteForceDivideConquer.minggu5;

public class nilaiMahasiswa11 {
    public nilaiMahasiswa11() {

    }
    int nilaiTertinggi(int arr[], int l, int r) {
        if (l == r) { 
            return arr[l];
        }

        int mid = (l + r) / 2; 
        int leftMax = nilaiTertinggi(arr, l, mid); 
        int rightMax = nilaiTertinggi(arr, mid + 1, r);

        if (leftMax > rightMax) {
            return leftMax;
        } else {
            return rightMax;
        }
    }
    int niliaTerendah(int arr[], int l, int r) {
        if (l == r) { 
            return arr[l];
        }

        int mid = (l + r) / 2; 
        int leftMin = niliaTerendah(arr, l, mid); 
        int rightMin = niliaTerendah(arr, mid + 1, r); 

        if (leftMin < rightMin) {
            return leftMin;
        } else {
            return rightMin;
        }
    }
        double rataUAS(int arr[]) {
            int total = 0;
            for (int i = 0; i < arr.length; i++) { 
                total += arr[i]; 
            }
            return (double) total / arr.length; 
        }
    }


