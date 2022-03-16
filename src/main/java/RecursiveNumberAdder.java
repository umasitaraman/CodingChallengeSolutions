class RecursiveNumberAdder {

    public int addNumbers(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + addNumbers(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 20;
        RecursiveNumberAdder adder = new RecursiveNumberAdder();
        int result = adder.addNumbers(number);
        System.out.println("Sum of numbers up to " + number + ": " + result);
    }
}

