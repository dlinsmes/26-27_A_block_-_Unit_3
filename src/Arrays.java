public class Arrays {
    public static void main(String [] args) {

        String word = "potato";

        //a string's length is the number of characters
        System.out.println(word.length());

        //strings have characters at each index (position)
        //indexing begins at 0
        //-substring() will give the portion of the string
        //beginning at the index provided
        System.out.println(word.substring(2));

        //indexing begins at 0
        System.out.println(word.substring(0));

        //another form of substring takes two indices:
        //[beginning, end)
        //this will give the characters at index 2 and 3 (but not 4)
        System.out.println(word.substring(2,4));

        //if you use an index that doesn't exist for that string,
        //the program will crash with an out of bounds error
        //System.out.println(word.substring(5, 10));

        //use substring to isolate only the first letter o
        //for a single character, use consecutive indices
        System.out.println(word.substring(1,2));

        //using the same index won't crash but won't produce anything
        System.out.println(word.substring(1,1));

        //use a loop to print each letter of the word on its own line
        //-the last valid index is always one less than the length
        for (int i = 0; i < word.length(); i++) {
            //i and i+1 will always be consecutive numbers
            //i will range through all valid character indices in the string
            System.out.println(word.substring(i, i+1));
        }

        //arrays - similar to lists
        //arrays hold multiple values to a single variable name
        //different from lists in other languages - an array's
        //length cannot be changed once it's declared
        //(can't add, remove, insert into the list and size does
        //not change)

        //declare a string array called zoo and sets the length to 5
        String [] zoo = new String [5];

        //to assign a value to a specific position in the array,
        //use the index to say where you are referencing
        //say as "zoo sub 0" (sub means subscript)
        zoo[0] = "panda";
        zoo[1] = "cat";
        zoo[2] = "cow";
        zoo[4] = "octopus";

        //when you don't assign an initial value (like at zoo[3]) arrays
        //get assigned default values:
        //String - null (nothing)
        //int - 0
        //double - 0.0
        //boolean - false

        //index 5 is out of bounds for length 5
//        zoo[5] = "fdasfdsa";

        //to access a value in an array, specify which index
        System.out.println(zoo[1]);

        //printing the array variable name does NOT output all values
        //stored - outputs the memory location (not useful)
        System.out.println(zoo);

        //an array.length is how many values it holds
        //(no parenetheses for array,
        // yes parenthesesdfsese for string.length())
        for (int i = 0; i < zoo.length; i++) {
            System.out.println(i + " - " + zoo[i]);
        }

        //million die roll problem using an array instead of 6 counter variables
        int [] rolls = new int [6];

        //values will default to 0 - don't need to manually set

        for (int i = 0; i < 1000000; i++) {
            int r = (int)(Math.random() * 6 + 1); //[1,6]

            //since indexing for this array is [0,5] and r is [1,6],
            //offset r by -1 to use as a valid index
            rolls[r-1]++;
        }

        //print the final roll results
        for (int i = 0; i < rolls.length; i++) {
            System.out.println(rolls[i]);
        }

    }
}
