/*
/**
 * Write a description of class SortTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class SortTester{
    // instance variables - replace the example below with your own
 ///   ArrayList
  int[] sort;
 
 /*/**
     * Constructor for objects of class SortTester
     */
    public SortTester(int[]mixNumbers)
    {

         sort = mixNumbers;
    }
/*
    public void loadNumbers(int n){

    }

    public void bubbleSort(){
        int n = array.length;
        for(int i = 0; i < 1; j++){
            for(intj = 0;j<n-i-1;k++){
                if(array [j] > array[j+1}{
                int temp = array[j];
                array [j] = array[j +1] = temp;
            }
        }
    }

    public void insertSort(){     
        int n = numList.size();
        for(int i = 1; i < n; i++){
            for(int j = i; j >0; j--){
                if(numList.get(j) > numList.get(j-1)){
                    int temp = numList.get(j);
                    numList.set(j,j-1);
                    numlist.set(j-1,temp);

                }
            }
        }
    }
*/
/*public static int[] mergeSort([] a, int l, int r){
int - a.length();
itf(n<2) {return a;}
int mid = n/2;
int[]l1 = new int[mid];
int[]r1 = new int[mid];
}
*/


public static void mergeSort(int[] a, int n) {
    if (n < 2) {return;} //  Base Case
    int mid = n / 2;
    int[] l = new int[mid];
    int[] r = new int[n - mid];
     for (int i = 0; i < mid; i++) {
        l[i] = a[i];
    }
    for (int i = mid; i < n; i++) {
        r[i - mid] = a[i];
    }
    mergeSort(l, mid);
    mergeSort(r, n - mid);
 //+++++++++ Helper Function ++++++++++++
    merge(a, l, r, mid, n - mid);
}
public static void merge(int[] a, int[] l, int[] r, int left, int right) {
      int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
        if (l[i] <= r[j]) {
            a[k++] = l[i++];
        }else {
            a[k++] = r[j++];
        }
    }
    while (i < left) { a[k++] = l[i++];}
    while (j < right) {a[k++] = r[j++];}
}


}
