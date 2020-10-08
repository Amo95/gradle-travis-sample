package io.turntabl;

public class Numbers {
    public static boolean isGreaterThanZeroAndLessThanAThousand(int i){
        return greaterThanZero(i) && lessThanAThousand(i);
    }

    private static boolean greaterThanZero(int i){
        return i > 0;
    }

    private static boolean lessThanAThousand(int a){
        return a < 1000;
    }
}
