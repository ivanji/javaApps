public class helloWorld {

    static String stringToPrint = "Random string"; // String Variable

    static final Double PIENUMBER = 3.14; //Constants = final. Must be uppercase;

    public static void main(String[]args) {
        int integerOne = 22;
        int integerTwo = 36;
        // System.out.println(integerOne + integerTwo);

        // Primitive Types
        byte bigByte = 127;
        short bigShort = 32767;
        int bigInt = 2100000000;
        long bigLong = 922000000L;
        float bigFloat = 3.14F;
        double bigDouble = 3.1482344444444444444444444444444444444444; //More precised float!
        boolean trueOrFalse = true;

        char randomChar = 65;
        char anotherChar = 'A';
        char escapedChar = '\b';

        // Converting to String
        String byteString = Byte.toString(bigByte);
        String intToString = Integer.toString(bigInt);

        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(escapedChar);
        System.out.println(randomChar);
        System.out.println("Byte Converted into string " + byteString);
        System.out.println(intToString);


        // Casting (converting one data type to another)
        int doubleToInt = (int) bigDouble;
        System.out.println(doubleToInt);

        int stringToInt = Integer.parseInt(intToString);
        System.out.println("Integer converted back to String " + stringToInt);

    }
}
