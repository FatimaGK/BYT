public class DivideNum implements IChain {
    private IChain nextChain;

    @Override
    public void setNext(IChain chain) {
        nextChain = chain;
    }

    @Override
    public void process(Request numbersRequested) {

        if (numbersRequested.operator().equals("/")) {
            System.out.println( numbersRequested.getNum1() /numbersRequested.getNum2());
        } else {
            nextChain.process(numbersRequested);
        }
    }


}
