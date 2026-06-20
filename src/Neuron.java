import java.util.*;

public class Neuron {

    double[] weights;
    double bias;
    double z;
    double output;

    public Neuron(int inputCount) {
        weights = new double[inputCount];
        Random random = new Random();

        for (int i = 0; i < weights.length; i++) {
            weights[i] = random.nextDouble() * 2 - 1;
        }

        bias = random.nextDouble() * 2 - 1;
    }

    public double calculate(double[] inputs) {
        z = 0;

        for (int i = 0; i < inputs.length; i++) {
            z += inputs[i] * weights[i];
        }

        z += bias;
        output = sigmoid(z);

        return output;
    }

    private double sigmoid(double z) {
        return 1.0 / (1.0 + Math.exp(-z));
    }

    private double relu(double z) {
        return Math.max(0, z);
    }

    public double reluDerivative() {
        if (z > 0) return 1;
        return 0;
    }

    public double sigmoidDerivative() {
        return output * (1 - output);
    }

    public void updateWeight(double delta, double learningRate, double[] inputs) {
        for (int i = 0; i < weights.length; i++) {
            weights[i] += learningRate * delta * inputs[i];
        }
        bias += learningRate * delta;
    }

    public double[] getWeights() {
        return weights;
    }

    public double getBias() {
        return bias;
    }

    public void printWeight() {
        System.out.println(Arrays.toString(weights));
        System.out.println("Bias = " + bias);
    }
}
