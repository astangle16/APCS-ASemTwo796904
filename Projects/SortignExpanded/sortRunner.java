
/**
 * Write a description of class sortRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sortRunner
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class sortRunner
     */
    public sortRunner()
    {
    int[] numbers = {7,10,9,4,6,5,2,56,8,6,9,56,34,5} ;    // initialise instance variables
        x = 0;
        SortTester mix = new SortTester(numbers);
       
        mix.mergeSort(mix.sort,mix.sort.length);
       for(int i = 0;i < numbers.length; i++){ 
    System.out.print(numbers[i] + " ");
    }
}
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
