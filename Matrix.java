class Matrix {
    public static void main(String[] args) {
            int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
            for(int i=0;i<arr.length;i++) {
                    for(int j=0;j<arr.length;j++) {
                            if(i==j) {
                                    System.out.println("Diagonal 1: "+arr[i][j]);
                            }
                    }
            }
            for(int i=0;i<arr.length;i++) {
                    for(int j=0;j<arr.length;j++) {
                            if(i+j==arr.length-1) {
                                    System.out.println("Diagonal 2: "+arr[i][j]);
                            }
                
                    }
            }
            for(int j=0;j<arr.length;j++) {
                    System.out.println("row 1: "+arr[0][j]);
            }
            for(int i=0;i<arr.length;i++) {
                    System.out.println("Column 1 : "+arr[i][0]);
            }
    }
}
       