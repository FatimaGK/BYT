public class Request {
    private int num1;
    private int num2;
    private String operator;

    public Request(int num1, int num2, String operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public String operator() {
        return operator;
    }


}
