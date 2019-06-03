package App;

public class MargeArrays {

    public int[] mergeArrays(int[] firstArray, int[] secondArray) {
        int[] newArray = new int[firstArray.length + secondArray.length];
        int firstCounter = 0, secondCounter = 0;

        for (int i = 0; i < newArray.length; i++) {
            if (firstCounter > firstArray.length - 1) {
                int temp = secondArray[secondCounter];
                newArray[i] = temp;
                secondCounter++;
            } else if (secondCounter > secondArray.length - 1) {
                int temp = firstArray[firstCounter];
                newArray[i] = temp;
                firstCounter++;
            } else if (firstArray[firstCounter] < secondArray[secondCounter]) {
                int temp = firstArray[firstCounter];
                newArray[i] = temp;
                firstCounter++;
            } else {
                int temp = secondArray[secondCounter];
                newArray[i] = temp;
                secondCounter++;
            }
        }
        return newArray;
    }
}
