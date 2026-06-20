# Multi-Layer Perceptron (MLP) From Scratch in Java

## Overview
This project implements a Multi-Layer Perceptron (MLP) completely from scratch in Java without using any machine learning frameworks or external libraries.

The primary goal of this project was not just to build a working neural network, but to deeply understand how neural networks learn internally by manually implementing every component involved in the learning process.

Instead of relying on methods such as `fit()`, automatic differentiation, or pre-built training pipelines, every step of the neural network was implemented manually.

## Why Java?
Most neural network projects are built using Python libraries such as TensorFlow, PyTorch, Keras, or Scikit-Learn. For this project, I intentionally chose Java because I wanted to understand the fundamentals without relying on machine learning frameworks or automatic gradient computation.

Using Java forced me to manually implement:
* Neurons
* Weight initialization
* Bias handling
* Forward propagation
* Sigmoid activation function
* Sigmoid derivative
* Backpropagation
* Chain rule
* Gradient descent
* Weight updates

This approach helped me understand what happens internally when a neural network learns rather than treating it as a black box. Additionally, Java aligns with my long-term goal of becoming a Java Backend Engineer with strong AI and Machine Learning fundamentals.

## Features

### Neural Network Core
* Custom Neuron implementation
* Weight and Bias initialization
* Sigmoid Activation Function
* Sigmoid Derivative
* Forward Propagation
* Backpropagation
* Chain Rule implementation
* Gradient Descent based learning
* Hidden Layer Delta calculation
* Output Layer Delta calculation

### Model Training
* Supervised Learning
* Binary Classification
* Dataset Shuffling
* Learning Rate based updates
* Epoch-based Training Loop
* Error Tracking

### Model Evaluation
* Accuracy
* Precision
* Recall
* F1 Score
* Confusion Matrix

### User Interaction
* Interactive Student Pass/Fail Prediction
* Console-based Input System
* Real-time Prediction Output
* Pass Probability Display

## Neural Network Architecture
**Current Architecture:**
* **Input Layer:** (3 Inputs)
* **Hidden Layer:** (5 Neurons)
* **Output Layer:** (1 Neuron)

The network uses Sigmoid activation and is trained using Backpropagation with Gradient Descent.

## Dataset
This project currently uses a hardcoded synthetic dataset created specifically for learning and experimentation.

The dataset consists of:
* Three normalized student-related input values
* One binary output label

**Output Labels:**
* `0` → Fail
* `1` → Pass

**Example:**
* **Input:** `[0.6, 0.7, 0.6]`
* **Output:** `1` (Pass)

The objective of this dataset is educational. The goal is to understand neural network implementation rather than achieve state-of-the-art prediction accuracy.

## Concepts Implemented

### Machine Learning
* Supervised Learning
* Binary Classification
* Training Dataset
* Testing Dataset
* Model Evaluation

### Neural Networks
* Neurons
* Weights
* Bias
* Weighted Sum
* Activation Functions
* Forward Propagation
* Backpropagation
* Chain Rule
* Hidden Layer Error Propagation
* Output Layer Error Propagation

### Optimization
* Gradient Descent
* Learning Rate
* Weight Updates
* Error Minimization

### Software Engineering
* Object-Oriented Design
* Class Separation
* Dataset Management
* Evaluation Module Design
* Reusable Components

## Challenges Faced During Development

### Understanding Weight Updates
One of the first challenges was understanding how a neural network determines whether a weight should increase or decrease. This required learning:
* Error calculation
* Gradient descent
* Learning rates
* Weight adjustment strategies

### Understanding Backpropagation
Implementing backpropagation manually was one of the most difficult parts of the project. Important concepts learned:
* Output Delta
* Hidden Delta
* Error Propagation
* Chain Rule

### Understanding Sigmoid Derivative
Initially, the sigmoid derivative formula (`output × (1 − output)`) appeared to be a mathematical trick. After implementing and debugging it manually, it became clear how derivatives control the learning behavior of neural networks.

### Dead ReLU Experiment
While experimenting with ReLU activation functions, the model encountered the classic "Dead ReLU" problem where neurons stopped learning because gradients became zero. This provided practical insight into activation function behavior and training dynamics.

## Sample Evaluation Output

### Confusion Matrix
```text
      Actual
      0    1
Pred 0 2    0
Pred 1 0    3
```

### Metrics
* **Accuracy:** 100.0%
* **Precision:** 1.0
* **Recall:** 1.0
* **F1 Score:** 1.0

## Project Structure
```text
src/
├── Main.java
├── MLP.java
├── Neuron.java
├── TrainingData.java
├── TrainingDataSet.java
├── TestingDataSet.java
└── EvaluationMetrics.java
```

### Class Responsibilities
* **`TrainingData.java`** - Represents a single training sample.
* **`TrainingDataSet.java`** - Stores and manages training data.
* **`TestingDataSet.java`** - Stores and manages testing data.
* **`Neuron.java`** - Implements neuron logic, activation functions, and weight updates.
* **`MLP.java`** - Implements forward propagation, backpropagation, and training.
* **`EvaluationMetrics.java`** - Calculates Accuracy, Precision, Recall, F1 Score, and Confusion Matrix.
* **`Main.java`** - Application entry point and interactive prediction system.

## Current Limitations
This project was intentionally designed as an educational implementation. Current limitations include:
* Hardcoded dataset
* Single hidden layer architecture
* Fixed number of neurons
* Console-based interface
* No model persistence
* No CSV file support
* No dataset preprocessing pipeline
* No generic multi-layer architecture

## Future Roadmap

### Data Handling
* [ ] Load datasets from CSV files
* [ ] Dataset preprocessing pipeline
* [ ] Input normalization
* [ ] Data validation
* [ ] Support larger datasets

### Neural Network Improvements
* [ ] Multiple Hidden Layers
* [ ] Generic Layer Architecture
* [ ] ReLU Activation Function
* [ ] Leaky ReLU
* [ ] Binary Cross Entropy Loss
* [ ] Mini-Batch Gradient Descent

### Engineering Improvements
* [ ] Save and Load Trained Models
* [ ] Configuration-Based Architecture
* [ ] Improved Project Structure
* [ ] Unit Testing
* [ ] Logging Support
* [ ] Performance Benchmarking

### Advanced Topics
* [ ] Multi-Class Classification
* [ ] Deep Neural Networks
* [ ] Convolutional Neural Networks (CNN)
* [ ] Custom Activation Functions

## Learning Outcome
This project helped build a practical understanding of:
* Neural Networks
* Forward Propagation
* Backpropagation
* Chain Rule
* Gradient Descent
* Activation Functions
* Model Evaluation Metrics
* Java Object-Oriented Programming
* Software Engineering Principles

More importantly, it transformed neural networks from a theoretical concept into a system that can be built, debugged, tested, and improved through code.

## Author
**Ravikumar M**

*Aspiring Java Backend Engineer with AI Knowledge*
Built as part of my journey to understand Machine Learning from first principles by implementing core neural network concepts manually in Java.


## Sample Output
<img width="867" height="528" alt="Screenshot 2026-06-20 174811" src="https://github.com/user-attachments/assets/679780ad-61ae-4539-98c5-a306f859cae8" />
<img width="852" height="518" alt="Screenshot 2026-06-20 174902" src="https://github.com/user-attachments/assets/5ac6308e-9b1e-4c04-84b1-9664b52ac0e6" />
