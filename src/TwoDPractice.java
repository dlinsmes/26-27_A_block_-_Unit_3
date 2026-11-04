public class TwoDPractice {
    public static void main(String [] args) {

        //declaring with the dimensions rather than the
        //exact values
        //20 rows, 10 cols
        int [][] nums = new int [10][20];

        //fill nums with all values of 10

        //nested loops - rows on the outside, cols on inside
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                //i is the row index, j is the col index
                nums[i][j] = 10;
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        //20 times -
        // generate random valid indices
        // and place a random number [11,99] into that position
        for (int i = 0; i < 20; i++) {
            //the 2d array length is the number of rows (10)
            int rowI = (int)(Math.random() * nums.length);

            //number of cols is nums[0].length (20)
            int colI = (int)(Math.random() * nums[0].length);

            int val = (int)(Math.random() * 90 ) + 11;

            nums[rowI][colI] = val;
        }

        for (int [] row: nums) {
            for (int n: row) {
                System.out.print(n + " ");
            }
            System.out.println();
        }



        //find and print the sum of every col
        //-outer loop needs to iterate through the col indices
        //be careful with index variable naming since i tends to be
        //use for row and j for col
        for (int col = 0; col < nums[0].length; col++) {
            int sum = 0;
            for (int row = 0; row < nums.length; row++) {
                sum += nums[row][col];
            }
            System.out.println(sum);
        }

    }
}
