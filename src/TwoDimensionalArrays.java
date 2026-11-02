public class TwoDimensionalArrays {
    public static void main(String [] args) {

        int [] nums = {6, 1, 2, 5};
        int [] nums2 = {4, 1, 2, 7};

        //a 2d array is an array made up of subarrays
        //nums is row 0 in the 2d numbers array
        //nums2 is row 1
        //{9, 8, 4, 1} is row 2
        int [][] numbers = { nums,
                            nums2,
                            {9, 8, 4, 1}};

        //access the 5 in the numbers 2d array - need two indices: row then col
        System.out.println("row 0 col 3 is " + numbers[0][3]);

        //length of a 2d array is how many subarrays/rows it has
        System.out.println("length of numbers is " + numbers.length);

        //to get the number of cols (values per row)
        //-get the length of one of the subarrays
        System.out.println(numbers[0].length);

        //-technically 2d arrays can have different row lengths,
        //but for this class, assume all 2d arrays have rows of the same length

        //print out the 2d array as a rectangular grid
        //-need nested loops -
        // outer loop for each row
        // inner loop to print the values of each rows

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                //i is the row index, j is the col index
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        //print just the column that contains 2 2 4
        //one index will stay the same, the other will vary
        //print numbers[row changes][col stays the same]
        //numbers[i][2]

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i][2]);
        }

        System.out.println();


        //to get the total quantity of values in a 2d array,
        // multiply number of rows and number of cols
        System.out.println(numbers.length * numbers[0].length);

        System.out.println();

        //output the sum of values of each row
        for (int i = 0; i < numbers.length; i++) {

            int rowSum = 0;

            //instead of getting numbers[0].length, also valid to use numbers[i].length
            //bc i will always be a valid row index
            for (int j = 0; j < numbers[i].length; j++) {
                rowSum += numbers[i][j];
            }

            System.out.println("row sum of row " + i + " is " + rowSum);
        }

        //for each loop for 1d int array
        for (int n: nums)
            System.out.print(n + " ");

        System.out.println();
        System.out.println();

        //for each loops to print a 2d array
        //-a 2d array can be thought of as an array of int arrays
        for ( int [] row:  numbers) {

            //iterate through each row as a 1d array
            for (int n: row) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

    }
}
