public interface IChain {
    public void setNext(IChain nextChain);
    //which will later be implemented by operation classes and set to NextInChain objects of those classes
    public void process(Request numbersRequested);
    // numbers objects will be forced for calculation

}
