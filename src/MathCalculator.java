public class MathCalculator implements Calculator {
    @Override
    public double add(double first, double last) {
        return first + last;
    }

    @Override
    public double sub(double first, double last) {
        return first - last;
    }

    @Override
    public double mul(double first, double last) {
        return first*last;
    }

    @Override
    public double div(double first, double last) {
        return first/last;
    }
}
