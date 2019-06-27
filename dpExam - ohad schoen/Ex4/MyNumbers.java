package Ex4;

import java.util.Iterator;

public class MyNumbers implements Iterator, Iterable{

    ISort sort;
    int[] numbers;
    int iteratorNumber;

    public MyNumbers(ISort sort, int[] numbers) {
        this.sort = sort;
        this.numbers = numbers;
        iteratorNumber = -1;
    }

    public int sum() {
        int currentSum = 0;
        for (int number : numbers) {
            currentSum += number;
        }

        return currentSum;
    }

    @Override
    public boolean hasNext() {
         if(iteratorNumber < this.numbers.length - 1) {
             return true;
         } else {
             this.iteratorNumber = -1;
             return false;
         }
    }

    @Override
    public Object next() {
        return this.numbers[++iteratorNumber];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("you cant remove from and array");
    }

    @Override
    public Iterator iterator() {
        return this;
    }

    public void sort() {
        this.sort.sort(this.numbers);
    }

    public void mulArrayByTwo() {
        for (int numberIndex = 0; numberIndex < this.numbers.length; numberIndex++) {
            this.numbers[numberIndex] *= 2;
        }
    }
}
