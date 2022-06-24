public class Strings {
    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        String myString = "This is a string";
        System.out.println("myString = " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString = " + myString);
        myString = myString + " \u00A9 2022";
        System.out.println("myString = " + myString);
        String numString = "250.45";
        numString = numString + "49.55";
        System.out.println("numString = " + numString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString = " + lastString);
        double doubleNum = 120.00;
        lastString = lastString + doubleNum;
        System.out.println("lastString = " + lastString);
    }
}
