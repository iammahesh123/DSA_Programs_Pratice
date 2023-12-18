package matrix;

public class DiagonalSum {
    public int diagonalSum(int[][] mat) {
        int i, j, sum=0;

for(i=0; i<mat.length; i++)
{
    for(j=i; j<mat[0].length; j++)
    {
        if(i==j){
            sum+= mat[i][j];
            break;
        }

    }
} 
for(i=0; i<mat.length; i++)
{
    for(j=0; j<mat[0].length; j++)
    {
        if(i+j == mat.length-1)
        {
            sum+= mat[i][j];
            break;
        }

    }
} 

if(mat.length %2 ==1)
{
    i=mat.length/2;
    sum-=mat[i][i];
}

return sum;
}

}
