package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int NEGATIVE_VALUE = -1;
    public static final int CAPACITY = 12;
    public static final int MEDIUM_CAPACITY = 11;
    private final int[] NUMBERS = new int[CAPACITY];

    public int total = NEGATIVE_VALUE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == NEGATIVE_VALUE;
    }

    public boolean isFull() {
        return total == MEDIUM_CAPACITY;
    }

    protected int peekaboo() {
        if (callCheck())
            return NEGATIVE_VALUE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return NEGATIVE_VALUE;
        return NUMBERS[total--];
    }

}
