import java.util.*;

public class MLP {

    private Neuron[] hiddenLayer;
    private Neuron outputLayer;
    private double[] hiddenOutputs;
    private double learningRate = 0.1;
    private double outputDelta;

    public MLP() {
        hiddenLayer = new Neuron[5];
        
        for (int i = 0; i < hiddenLayer.length; i++) {
            hiddenLayer[i] = new Neuron(3);
        }

        outputLayer = new Neuron(5);
    }

    public double predict(double[] inputs) {
        hiddenOutputs = new double[hiddenLayer.length];

        for (int i = 0; i < hiddenLayer.length; i++) {
            hiddenOutputs[i] = hiddenLayer[i].calculate(inputs);
        }

        return outputLayer.calculate(hiddenOutputs);
    }

    public void train(ArrayList<TrainingData> dataset) {
        for (int epoch = 0; epoch <= 10000; epoch++) {
            double totalError = 0;
            
            Collections.shuffle(dataset);

            for (TrainingData row : dataset) {
                double prediction = predict(row.inputs);
                double squaredError = Math.pow(row.expectedOutput - prediction, 2);
                double error = row.expectedOutput - prediction;
                
                double[] outputWeights = outputLayer.getWeights();
                outputDelta = outputLayer.sigmoidDerivative() * error;

                for (int i = 0; i < hiddenLayer.length; i++) {
                    double hiddenDelta = outputDelta * outputWeights[i] * hiddenLayer[i].sigmoidDerivative();
                    hiddenLayer[i].updateWeight(hiddenDelta, learningRate, row.inputs);
                }

                outputLayer.updateWeight(outputDelta, learningRate, hiddenOutputs);
                totalError += squaredError;
            }

            if (epoch % 1000 == 0) {
                System.out.println("Epoch = " + epoch + " totalError = " + totalError);
            }
        }
    }
}
