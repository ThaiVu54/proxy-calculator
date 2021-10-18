public class MathCalculatorProxy implements Calculator {
    private MathCalculator mathCalculator;

    public MathCalculatorProxy() {
        this.mathCalculator = new MathCalculator();
    }

    @Override
    public double add(double first, double last) {
        if (first / 2 + last / 2 >= Double.MAX_VALUE / 2) {
            throw new RuntimeException("Out of range");
        }
        return mathCalculator.add(first, last);
    }

    @Override
    public double sub(double first, double last) {
        if (first / 2 - last / 2 >= Double.MIN_VALUE / 2){
            throw new RuntimeException("Out of range");
        }
            return mathCalculator.sub(first,last);
    }

    @Override
    public double mul(double first, double last) {
        double result = mathCalculator.mul(first,last);
        if (result != 0 && result/first != last){
throw new RuntimeException("Out of range");
        }
        return result;
    }

    @Override
    public double div(double first, double last) {
        if (last == 0){
            throw new RuntimeException("Can't divide by zero");
        }

        return mathCalculator.div(first,last);
    }
}
