package section4;

public class StatementsWhiteSpaceAndIndenting {
    public static void main(String[] args) {
        int myVariable = 50; // whole line is a statement
        if (myVariable == 50) {
            System.out.println("Print");
        }
        myVariable++; // statement
        System.out.println("This is a test."); // statement

        System.out.println("This is" +
                "another" +
                " still more."); // whole thing is a statement still

        int anotherVariable = 5;myVariable--;System.out.println("another one"); // three separate statements
    }
}
