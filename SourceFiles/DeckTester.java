/**
 * This is a class that tests the Deck class.
 */
public class DeckTester  {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        Deck a  = new Deck(new String[]{"A", "B", "C"},new String[]{"Giraffes", "Lions  "},new int[]{2,1,6});
        System.out.println(a.isEmpty());
        System.out.println(a.size());
        System.out.println(a.deal());
        System.out.println(a.toString());
    }
}
