package neuralnetworkapi.src.algos;

import neuralnetworkapi.src.imports.network;

abstract public class Algorithms{

  //Common Training Algorithms:
  private enum trainingAlgos{
    NEWTON,
    CONJUGATEGRADIENT,
    PERCEPTRON,
    QUASINEWTON,
    ADALINE,
    LEVENBERGMAR,
    CUSTOM;
  }

  //Common Activation Functions:
  private enum activationFuncs{
    SIGMOID,
    TANH,
    STEP,
    RELU,
    LINEAR;
  }

  
  //Variables:
  private int epoch;

  //Methods:

}
