// Write a complete multi-threaded program to meet following requirements:a.Read matrix[A]m x n b.Create m number of threads c.Each thread computes summation of elements of one row,i.e.ith row of the matrix is processed by ith thread.Where 0<=i<m.d.Print the results.

class T1 extends Thread {   
    int rows,col,i;
    int matrix[][] =new int[rows][col];
    public T1(int rows,int col,int [][] matrix,int i)
    {
        this.rows=rows;
        this.col=col;
        this.matrix=matrix;
        this.i=i;
    }

    public void run(){
        try{
            Thread.sleep(100);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
            int sum=0;
            for (int j=0; j < col;j++ ) {
                sum+= matrix[i][j];
            }
            System.out.printf("sum of row[%d] : %d \n",i,sum);
    }
}

public class ThreadDemo3 {
    public static void main(String[] args) throws Exception
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter Number of rows ");
        int rows = sc.nextInt();
        System.out.println("Enter Number of columns ");
        int col = sc.nextInt();

        int matrix[][] = new int[rows][col];
        for (int i=0; i<rows ;i++){
            for (int j=0;j<col ;j++){
                System.out.printf("Enter number at  matrix[%d][%d] ",i,j);
                matrix[i][j] =sc.nextInt();
            }
        }
       
        T1 obj []= new T1[rows];
        for (int i=0 ;i<rows ; i++ ) {
            obj[i] = new T1(rows,col,matrix,i);
            obj[i].start();
            obj[i].join();  
        }
    }
}