# Multi-Layer Perceptron (MLP) From Scratch in Java

## Overview

This project implements a Multi-Layer Perceptron (MLP) completely from scratch in Java without using any machine learning frameworks or external libraries.

The objective of this project was to understand the internal working of neural networks by implementing every component manually, including neurons, forward propagation, backpropagation, gradient descent, and evaluation metrics.

---

## Features

* Custom Neuron implementation
* Weight and Bias initialization
* Sigmoid Activation Function
* Forward Propagation
* Backpropagation using Chain Rule
* Gradient Descent based learning
* Train/Test Dataset separation
* Accuracy Calculation
* Precision Calculation
* Recall Calculation
* F1 Score Calculation
* Confusion Matrix
* Interactive Student Pass/Fail Prediction

---

## Neural Network Architecture

Input Layer (3 Features)

↓

Hidden Layer (5 Neurons)

↓

Output Layer (1 Neuron)

---

## Concepts Implemented

### Machine Learning

* Supervised Learning
* Binary Classification
* Training and Testing
* Model Evaluation

### Neural Networks

* Weighted Sum
* Bias
* Sigmoid Activation
* Sigmoid Derivative
* Forward Propagation
* Backpropagation
* Chain Rule
* Hidden Layer Delta
* Output Layer Delta

### Optimization

* Gradient Descent
* Learning Rate
* Weight Updates

---

## Evaluation Metrics

The model supports:

* Accuracy
* Precision
* Recall
* F1 Score
* Confusion Matrix

Example Output:

Confusion Matrix

```
     Actual
     0    1
```

Pred 0   2    0
Pred 1   0    3

Accuracy  : 100.0%
Precision : 1.0
Recall    : 1.0
F1 Score  : 1.0

---

## Project Structure

src/
├── Main.java
├── MLP.java
├── Neuron.java
├── TrainingData.java
├── TrainingDataSet.java
├── TestingDataSet.java
└── EvaluationMetrics.java

---

## Why This Project?

Most machine learning tutorials rely on libraries such as TensorFlow, PyTorch, or Scikit-Learn.

This project was built to understand what happens internally when a neural network learns, rather than relying on pre-built abstractions.

Every neuron, weight update, gradient calculation, and learning step was implemented manually in Java.

---

## Future Improvements

* ReLU Activation Function
* Leaky ReLU
* Multiple Hidden Layers
* Generic Layer Architecture
* Binary Cross Entropy Loss
* Mini-Batch Gradient Descent
* Model Serialization
* CSV Dataset Support

---

## Author

Ravikumar M
Aspiring Java Backend Engineer with AI Knowledge
