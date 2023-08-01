public class Demo3 {
    public static void main(String[] args) {
        int number1 = 123;
        int number2 = 456;
        int number3 = 7890;

        System.out.printf("(%1$s%2$d%3$s)%4$d-%5$d\n", "\033[45m" , number1, "\033[0m",number2, number3);
    }
}
