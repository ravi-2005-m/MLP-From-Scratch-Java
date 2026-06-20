public class TrainingData {

    double[] inputs;
    double expectedOutput;

    public TrainingData(
        double[] inputs,
        double expectedOutput
    ){
        this.inputs = inputs;
        this.expectedOutput = expectedOutput;
    }
}