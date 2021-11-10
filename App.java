import java.util.*; 
public class App {
   // hàm tìm số nguyên tố 
    public static boolean isnst(int n) {
        if (n < 2) {
            return false;
        }
        
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    // hàm sắp xếp tăng dần theo cột
    public static void sxcot(int A[][], int n, int m)
    {
        for(int k = 0; k<m ; k++)
        for(int i = 0; i<n-1 ; i++)
        for(int j = n-1; j>i ; j--)
            if(A[k][j]<A[k][j-1])
            {
                int temp = A[k][j];
                A[k][j] = A[k][j-1];
                A[k][j-1] = temp;
            }
    }

    public static void main(String args[]) {
    // nhập hàng và cột
        int n;
        int m;
     
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng n: ");
        n = scanner.nextInt();
        System.out.println("Nhập vào số cột m: ");
        m = scanner.nextInt();
        
        int A[][] = new int[n][m];
// nhập ma trận nxm
        System.out.println("Nhập vào ma trân NxM: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
// đặt max là số đầu tiên của hàng 1 và so sánh để tìm ra số lớn nhất 
        int max = A[0][0];
        int n2= 0, m2 =0 ;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                    n2 = i;
                    m2 = j;
                }
            }
        }
             // in ra số lớn nhất
        System.out.println("phan a: A[" + n2 + "]" + "[" + m2 + "]" + " = " + max);
        System.out.println("phan b: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
      // nếu số nào là số nguyên tố in ra màn hình còn số nào k là số nguyên tố in ra 0
                if ( isnst(A[i][j]) == true ) {
                    System.out.printf("%d ", A[i][j] );
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.print("\n");
        }
// in ra màn hình sắp xếp theo cột
        System.out.println("phan c: ");    
        sxcot(A,m,n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%d ", A[i][j]);
            }
            System.out.print("\n");
        }
    }
}

// ddaay A[2]0] là phần tử ở hàng 3 cột 1
