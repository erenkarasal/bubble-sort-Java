 class Sorting
 {

    void BubbleSort(int A[],int N)
    {
        for (int i=0;i<N;i++)//From start to the end of unsorted part
        {
            for (int j = 1; j < (N - i);j++)//If adjacent items out of order,swap.
            {
                if(A[j-1]>A[j])//If point number bigger than next number,
                {
                int temp=A[j-1];//Swapping here numbers
                A[j-1]=A[j];
                A[j]=temp;

                }//end of if.
            }//end of inner for.
        }//end of outer for
    }//end of Bubblesort() method
 }//end of class

