package ls_1;

public class StringAddCalculator {

    public static final int ZERO = 0;
    public static final String DELIMITER  = ",|:";

    public static int splitAndSum(String text) {
        if(isBlank(text)){
            return ZERO;
        }

        return sum(toInts(split(text)));
    }

    private static String[] split(String text) {
        return text.split(DELIMITER);
    }

    private static boolean isBlank(String text) {
        return text == null || text.isBlank();
    }

    private static int sum(int[] numbers) {
        int sum = ZERO;
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }

    private static int[] toInts(String[] values) {
        int[] numbers = new int[values.length];
        for(int i=0; i < values.length; i++){
            int number = toPositive(values[i]);
            numbers[i] = number;
        }
        return numbers;
    }

    private static int toPositive(String value) {
        int number = Integer.parseInt(value);
        if(number < 0){
            throw new RuntimeException("음수는 입력할 수 없습니다.");
        }
        return number;
    }
}
