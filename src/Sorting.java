public class Sorting {
    public static void main(String [] args) {

        //declare a string array called school with length 5
        String [] school = new String [5];

        //uninitialized values will default to null (nothing)
        //or 0 for ints, 0.0 for doubles, false for boolean
        school[0] = "pencils";
        school[1] = "humans";
        school[2] = "misha";
        school[4] = "more misha";

        for (int i = 0; i < school.length; i++) {
            System.out.println(school[i]);
        }

        //swap values between position 0 and 2
        String temp = school[0];
        school[0] = school[2];
        school[2] = temp;

        System.out.println();

        for (int i = 0; i < school.length; i++) {
            System.out.println(school[i]);
        }

        temp = school[2];
        school[2] = school[0];
        school[0] = temp;

        System.out.println();

        for (int i = 0; i < school.length; i++) {
            System.out.println(school[i]);
        }

        school[0] = school[2];
        school[2] = school[0];

        System.out.println();
        for (int i = 0; i < school.length; i++) {
            System.out.println(school[i]);
        }

        System.out.println();

        //for each loop aka enhanced for loop
        //-the variable type needs to match the data type of
        //the array
        for (String s: school) {
            //no indexing is used - this iterates through
            //all values stored in the array in order
            System.out.println(s);
        }

        //for-each loops don't work to set values in arrays
        for (String s: school) {
            s = "desks";
        }

        System.out.println();

        for (String s: school) {
            System.out.println(s);
        }

        //-use for each loops when you need to go through
        //all items in order and indexing is not relevant

        //when you know the initial values for your array,
        //you can initialize like this:
        String [] cars = {"ford", "mercedes", "lexus", "ford"};

        //once an array has been declared, this is no longer valid
        //cars = {"toyota", "mazda", "mitsubishi"};

        //count how many times ford appears
        int count = 0;

        //any kind of loop works for this bc indexing isn't used
        for(String c: cars) {
            if (c.equals("ford")) {
                count++;
            }
        }

        count = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].equals("ford")) {
                count++;
            }
        }

        int [] nums = {3, 5, 7, 2, 1}; //indices [0,4]
        //for each loop to print all values
        for(int n: nums) {
            System.out.println(n);

            //be careful not to use n as an index bc with
            //for-each loops, n iterates through values
            //so this will crash on nums[5] and nums[7]
//            System.out.println(nums[n]);
        }

        int [] cards = { 5, 2, 9, 7, 4, 5 };

        //selection sort - sorting algorithm to put values in an
        //array in increasing/decreasing order
        //for every position in the array, find the value that's smallest
        //and to the RIGHT of that position, then swap between that position
        //and that smallest value's position
        // 5, 2, 9, 7, 4, 5
        // 2, 5, 9, 7, 4, 5
        // 2, 4, 9, 7, 5, 5
        // 2, 4, 5, 7, 9, 5
        //as you go through each position and make the necessary swap,
        //that position and everything to its left will be in sorted order

        for (int i = 0; i < cards.length; i++) {
            //find which position to swap values with position i
            int smallestI = i;

            //nested loop to look at all positions after i
            for (int j = i+1; j < cards.length; j++) {

                //check whether the value at j is smaller than the value at smallestI
                if(cards[j] < cards[smallestI]) {           //changing the comparison will change the sort order
                    //update smallestI if you find a value that's smaller than current
                    smallestI = j;
                }
            }

            //swap values between indices i and smallestI
            int t = cards[i];
            cards[i] = cards[smallestI];
            cards[smallestI] = t;
        }

        System.out.println();
        for (int c: cards)
            System.out.println(c);

    }
}
