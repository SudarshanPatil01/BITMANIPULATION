public class BitmaniQue {

    public static void OddorEven(int n) {
        // FIND ODD OR EVEN
        int bitmask = 1;
        if((n & bitmask) == 0) {
            System.out.println("Num is even");
        } else {
            System.out.println("Num is odd");
        }
    }

    public static int get_i_th(int num,int index) {
        // FOUND THE ITH ELMENT IF IT IS 1 OR 0;
        int bitmask = 1<<index;
        if((num & bitmask)==0) {
            return 0;
        }

        return 1;
    }


    public static int set_ith_elment(int num,int i) {
        // SET ITH BIT
        int bitmask = 1<<i;
        
        return (num|bitmask); 
    }

    public static int clear_ith_bit(int n,int i) {
        // CLEAR ITH BIT
        int bitmask = ~(1<<i);
        return n & bitmask;
        
    }

    public static int updath_ith_bit(int num,int index,int bit) {
        if(bit == 0) {
            return clear_ith_bit(num, index);
        } else {
            return set_ith_elment(num, index);
        }
    }

    public static int updath_last_ith_bit(int num,int i,int new1) {
        num = clear_ith_bit(num, i);
        int bitmask = new1<<i;
        return num | bitmask;
    }

    public static int clear_range_of_bits(int num,int i,int j) {
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitmask = a|b;
        return num & bitmask;
    }

    public static boolean power_of_2_or_not(int num) {
        return ((num & num-1) == 0);
    }

    public static int set_bits_in_no(int num) {
        int counter = 0;
        while (num > 0) {
            if((num & 1) != 0) {
                counter++;
            }

            num = num>>1;
        }

        return counter;
    }

    public static int fastExpo(int a,int n) {
        int ans = 1;
        while (n > 0) {
            if((n & 1)!=0) {
                ans = ans * a;
            }

            a = a * a;
            n=n>>1;
        }

        return ans;
    }

    // BIT MANIPULATION EXERCISE QUESTION
    public static int XOR_for_any_value(int n) {
        return n^n;
    }

    public static void swap_two_no_withou_using_third_variable() {
        int x=3,y=4;
        System.out.println("Before swap: x = "+x+" and y = "+y);
        // swap using xor
          x=x^y;
          y=x^y;
          x=x^y;
        System.out.println("After swap: x = "+x+" and y = "+y);
    }

    public static void main(String[] args) {
        int x = 3,y=4;
        System.out.println(x^y);
       swap_two_no_withou_using_third_variable();
    }
}