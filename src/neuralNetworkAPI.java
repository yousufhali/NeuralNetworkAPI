package neuralnetworkapi.src;

import neuralnetwork.src.imports.network;

public class neuralNetworkAPI extends Algorithms{

    network neuralNetwork;

    //Constructor
    public void neuralNetworkAPI(){
        neuralNetwork = new network();
    }

    public void neuralNetworkAPI(network duplicateNeuralNetwork){
        neuralNetwork = new network(duplicateNeuralNetwork);
    }

    public void printNetwork(network neuralNetwork){
        try{
            neuralNetwork.print();
        }
        catch(Exception nullPointer){
            System.out.println("Error: Please ensure that the network is initialized properly.");
        }
    }

    public void assignNumberOfLayers(Integer layersCount){
        neuralNetwork.assignNumberOfLayers(layersCount);
    }

    public void assignNumberOfNeuronsInLayer(Integer layerIndex, Integer numberOfNeurons){
        neuralNetwork.assignNumberOfNeuronsInLayer(layerIndex,numberOfNeurons);
    }

    public void assignWeightsForNeuron (Integer layerIndex, Integer neuronIndex, ArrayList<Double> weightsIn, ArrayList<Double> weightsOut){
        assignWeightsForNeuron(layerIndex, neuronIndex, weightsIn, weightsOut);
    }


    //@TODO: Add common configurations
}
