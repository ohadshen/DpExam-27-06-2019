package Ex4;

public class BubbleSort implements ISort {
    @Override
    public void sort(int[] numbersList) {

        boolean wasBubble = true;
        int helper;

        for (int lastIndex = numbersList.length - 1; lastIndex >= 0 && wasBubble; lastIndex--) {
            wasBubble = false;

            for (int currentIndex = 0; currentIndex < lastIndex; currentIndex++) {

                if(numbersList[currentIndex] > numbersList[currentIndex + 1]) {
                    helper = numbersList[currentIndex];
                    numbersList[currentIndex] = numbersList[currentIndex + 1];
                    numbersList[currentIndex + 1] = helper;
                    wasBubble = true;
                }
            }
        }
    }
}
