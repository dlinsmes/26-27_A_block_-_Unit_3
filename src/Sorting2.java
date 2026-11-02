public class Sorting2 {
    public static void main(String [] args) {

        int [] cards = {4, 2, 1, 3, 4, 2, 5};

        //sorting cards probably the way you do it physically
        //-for each position, find the next smallest value to
        //the right, then pick it up, move the other cards
        //over by one position to make space for the card
        //that you picked up

        //loop through every position
        for (int i = 0; i < cards.length; i++) {

            //find the card to the RIGHT that's the smallest
            //-same as selection sort
            int smallestI = i;
            for (int j = i+1; j < cards.length; j++) {
                if (cards[j] < cards[smallestI]) {
                    smallestI = j;
                }
            }

            //instead of swapping like in selection sort, pick up
            //the card at smallestI so then you can move over the other cards
            int hold = cards[smallestI];

            //for all cards from position i to smallestI-1, move them UP by one position
            //-need to loop backwards bc smallestI is the first position open
            for (int j = smallestI-1; j >= i; j--) {
                cards[j+1] = cards[j]; //take what's at position j and move it up one spot
            }

            //place the held card into position i
            cards[i] = hold;

        }

        for (int c: cards) {
            System.out.println(c);
        }

    }
}
