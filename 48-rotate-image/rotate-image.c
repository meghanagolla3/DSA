void reverse(int* a,int n){
    for(int i=0;i<n/2;i++){
        int swap = a[i];
        a[i]=a[n-1-i];
        a[n-1-i]= swap;
    }
    return;
}
void rotate(int** matrix, int matrixSize, int* matrixColSize) {
    for(int i=0;i<matrixSize;i++){
        for(int j=i;j<matrixSize;j++){
            int swap = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = swap;
        }
    }
    int a[matrixSize];
    for(int i=0;i<matrixSize;i++){
        for(int j=0;j<matrixSize;j++){
            a[j]=matrix[i][j];
        }
        reverse(a,matrixSize);
        for(int j=0;j<matrixSize;j++){
            matrix[i][j]=a[j];
        }
    }
    return ;
}