package edu.kis.vh.nursery;

/**
 * klasa FIFORhymer dziedziczy po klasie DefaultCountingOutRhymer
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    /**
     * Obiekt typu DefaultCountingOutRhymer o nazwie temp
     */
    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * @return int - metoda wyciaga element ze stosu i zwraca jego wartość
     */
    @Override
    protected int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
