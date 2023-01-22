/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seminarka;

/**
 *
 * @author jony1
 */
public class Tools {
    /**
     * creats an arrey with inputed numbers
     * @param input
     * @return array with numbers
     */
    public static int[] CreateArray(String input) {
        String[] numberString = input.split(" ");
        int negativeIndex = 0;
        int[] numbers = new int[numberString.length];

        for (int i = 0; i < numberString.length; i++) {
            numbers[i] = Integer.parseInt(numberString[i]);
            if (numbers[i] < 0) {
                negativeIndex = i;
                break;
            }
        }
        int[] numbersNegative = new int[negativeIndex];

        for (int i = 0; i < numbersNegative.length; i++) {
            numbersNegative[i] = numbers[i];
        }
        return numbersNegative;
    }
/**
 * merges all three arrays to one big array and sorts the numbers
 * @param firstArray
 * @param secondArray
 * @param thirdArray 
 */
    public static void SortArray(int[] firstArray, int[] secondArray, int[] thirdArray) {
        int length = firstArray.length + secondArray.length + thirdArray.length;
        int[] mergedArray = new int[length];
        int pos = 0;
        for (int element : firstArray) {
            mergedArray[pos] = element;
            pos++;
        }
        for (int element : secondArray) {
            mergedArray[pos] = element;
            pos++;
        }
        for (int element : thirdArray) {
            mergedArray[pos] = element;
            pos++;
        }

        //Arrays.sort(mergedArray);
        int temp=0;
        for (int i = 0; i < mergedArray.length; i++) {
            for (int j = 1; j < (mergedArray.length - i); j++) {
                if (mergedArray[j - 1] > mergedArray[j]) {
                   temp=mergedArray[j];
                   mergedArray[j]=mergedArray[j-1];
                   mergedArray[j-1]=temp;
                }
            }
        }

        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }
}
