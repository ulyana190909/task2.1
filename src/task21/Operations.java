package task21;

public class Operations {
    public static void main(String[] value) {
        int intValue = 198;
        long longValue = 698;
        double doubleValue = 25.58;
        float floatValue = 100;
        byte byteValue = 68;
        short shortValue = 85;

        // задание №2

        double sum = intValue + doubleValue;
        float subtraction = floatValue - shortValue;
        float multiplication = floatValue * byteValue;
        long division = longValue / shortValue;
        long divisionWithRemainder = longValue % intValue;

        System.out.println(sum);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(divisionWithRemainder);

        //Задание №3

        sumValue(intValue, doubleValue);
        subtractionValue(floatValue, shortValue);
        multiplicationValue(floatValue, byteValue);
        divisionValue(longValue, shortValue);
        divisionWithRemainderValue(longValue, intValue);
    }

    public static void sumValue(int intValue, double doubleValue) {
        System.out.println(intValue + doubleValue);
    }

    public static void subtractionValue(float floatValue, short shortValue) {
        System.out.println(floatValue - shortValue);
    }

    public static void multiplicationValue(float floatValue, byte byteValue) {
        System.out.println(floatValue * byteValue);
    }

    public static void divisionValue(long longValue, short shortValue) {
        System.out.println(longValue / shortValue);
    }

    public static void divisionWithRemainderValue(long longValue, int intValue) {
        System.out.println(longValue % intValue);
    }
}
