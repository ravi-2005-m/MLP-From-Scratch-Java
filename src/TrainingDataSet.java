import java.util.*;

class TrainingDataSet{
    ArrayList<TrainingData> dataset;
    
    TrainingDataSet(){
        dataset = new ArrayList<>();
        dataset.add(new TrainingData(new double[]{0.2, 0.5, 0.4}, 0));
        dataset.add(new TrainingData(new double[]{0.3, 0.55, 0.45}, 0));
        dataset.add(new TrainingData(new double[]{0.4, 0.6, 0.5}, 0));
        dataset.add(new TrainingData(new double[]{0.5, 0.65, 0.55}, 0));
        dataset.add(new TrainingData(new double[]{0.6, 0.7, 0.6}, 1));
        dataset.add(new TrainingData(new double[]{0.7, 0.75, 0.65}, 1));
        dataset.add(new TrainingData(new double[]{0.8, 0.8, 0.7}, 1));
        dataset.add(new TrainingData(new double[]{0.9, 0.85, 0.75}, 1));
        dataset.add(new TrainingData(new double[]{1.0, 0.9, 0.8}, 1));
        dataset.add(new TrainingData(new double[]{1.1, 0.92, 0.85}, 1));
        dataset.add(new TrainingData(new double[]{0.2, 0.45, 0.35}, 0));
        dataset.add(new TrainingData(new double[]{0.3, 0.5, 0.4}, 0));
        dataset.add(new TrainingData(new double[]{0.55, 0.69, 0.59}, 1));
dataset.add(new TrainingData(new double[]{0.57, 0.68, 0.58}, 0));
dataset.add(new TrainingData(new double[]{0.58, 0.70, 0.60}, 1));
dataset.add(new TrainingData(new double[]{0.56, 0.67, 0.57}, 0));
        dataset.add(new TrainingData(new double[]{0.4, 0.58, 0.48}, 0));
        dataset.add(new TrainingData(new double[]{0.5, 0.68, 0.58}, 0));
        dataset.add(new TrainingData(new double[]{0.6, 0.72, 0.62}, 1));
        dataset.add(new TrainingData(new double[]{0.7, 0.78, 0.68}, 1));
        dataset.add(new TrainingData(new double[]{0.8, 0.82, 0.74}, 1));
        dataset.add(new TrainingData(new double[]{0.9, 0.88, 0.82}, 1));
        dataset.add(new TrainingData(new double[]{1.0, 0.94, 0.88}, 1));
        dataset.add(new TrainingData(new double[]{1.1, 0.96, 0.92}, 1));
        Collections.shuffle(dataset);
    }

    public ArrayList<TrainingData> getData() {
        return dataset;
    }
}
