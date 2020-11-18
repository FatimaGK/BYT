public class AddNum implements IChain {

    private IChain nextChain;

    @Override
    public void setNext(IChain chain) {
        nextChain = chain;
    }

    @Override
    public void process(Request req) {

        if (req.operator().equals("+")) {
            System.out.println( req.getNum1() + req.getNum2());
        } else {
            nextChain.process(req);
        }
    }


}
