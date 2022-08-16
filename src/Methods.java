public class Methods {
    static int myAge = 21;

    public static void printMyName(String name) {
        System.out.println(name);
        System.out.println(myAge);
    }

    public static int addTwoNumbers(int num1, int num2) {
        int total = num1 + num2;
        return total;
    }
    public static double addTwoNumbers(double num1) {
        return num1 + 1.1;
    }

    public static double addTwoNumbers(double num1, double num2) {
        return num1 + num2;
    }

    public static String getStatus(int age) {
        if (age < 18) {
            return "child";
        } else {
            return "adult";
        }
    }

    public static void main(String[] args) {
        printMyName("Simon");
        printMyName("Jenny");
        System.out.println(addTwoNumbers(2, 4));
        System.out.println(getStatus(17));
        System.out.println(getStatus(27));

        Book book1 = new Book();
        book1.setTitle("Java for Dummies");
        book1.setAuthor("Doug Lowe");
        book1.setNumberOfPages(27);

        Book book2 = new Book();
        book2.setTitle("Pythone in easy steps");
        book2.setAuthor("Mike McGrath");
        book2.setNumberOfPages(102);
        System.out.println(book2.getAuthor());
    }
}
