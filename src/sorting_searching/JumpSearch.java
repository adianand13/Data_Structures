package sorting_searching;

public class JumpSearch {
    private int[] array;
    private int N;

    public JumpSearch(int[] array) {
        this.array = array;
        N=array.length;
    }

    public int search(int key){
        /*In the worst case, we have to do n/m jumps
        if the last checked value is greater than the element to be searched for,
        we perform m-1 comparisons more for linear search.
        Therefore the total number of comparisons in the worst case will be ((n/m) + m-1).
        The value of the function ((n/m) + m-1) will be minimum when m = √n.
        Therefore, the best step size is m = √n.*/

        // Finding block size to be jumped
        int size = (int)Math.floor(Math.sqrt(N));
        int block = size;
        int prevBlock = 0; //
        // Math.min(block,N)-1 is to ensure that value of block is always less than size of array

        // loop to find the right block
        while(array[Math.min(block,N)-1]<key){
            prevBlock = block;
            //incrementing to next block size
            block += size;
            //if the value of previous block exceeds range, return -1 since not in range
            if (prevBlock >= N)
                return -1;
        }

        //loop to perform linear search in the right block
        while (array[prevBlock] < key)
        {
            prevBlock++;

            // If we reached next block or end of
            // array, element is not present.
            if (prevBlock == Math.min(block, N))
                return -1;
        }

        // If element is found
        if (array[prevBlock] == key)
            return prevBlock;

        return -1;
    }
}
