import java.util.Arrays;
import java.util.Random;

public class RecursiveRandomSort {
    public static void main(String[] args)
    {
        int[] array = {9,31,5,1,2,61};
        RecursiveRandomSort rs = new RecursiveRandomSort();
        rs.randomSort(array);
        System.out.println(rs.isSorted(array));
        System.out.println(Arrays.toString(array));
    }

    public int[] randomSort(int[] array)
    {
        if (!isSorted(array))
        {
            Random dice = new Random();
            swapAtIndex(array,dice.nextInt(array.length),dice.nextInt(array.length));
            return randomSort(array);
        }
        else {
            return array;
        }
    }

    public void swapAtIndex(int[] array, int one, int two)
    {
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }

    public boolean isSorted(int[] array)
    {
        if (_lookUp(array,1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean _lookUp(int[] array, int value)
    {
        if (value == array.length) {
            return true;
        }
        else if (array[value] >= array[value-1])
        {
            return _lookUp(array,++value);
        }
        else {
            return false;
        }
    }
}
