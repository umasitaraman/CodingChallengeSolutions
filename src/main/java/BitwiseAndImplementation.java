public class BitwiseAndImplementation {
        public boolean isPowerOfTwo(int n) {
            if(((n & (n-1)) == 0) && (n > 0)) {
                return true;
            }
            return false;
        }

    public static void main(String[] args) {
        BitwiseAndImplementation bit = new BitwiseAndImplementation();
        int n = 1;
        //n = 16;
        //n = 3;
        System.out.println(bit.isPowerOfTwo(n));
    }
}
