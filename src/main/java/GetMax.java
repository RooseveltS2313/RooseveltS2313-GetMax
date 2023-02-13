public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){
        // doing this to always have a value incase array only has values less than 0 unless array is empty but then it hits OoB exception and can be handled in future
        int largest = arr[0];
        // which means this can start at 1 or be ++i instead of i++ but does not have to
        for (int i = 0; i < arr.length; ++i){
            // no reason to switch if equal to
            if( largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
}
