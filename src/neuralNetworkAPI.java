package neuralnetworkapi.src;

import neuralnetwork.src.imports.network;

public class neuralNetworkAPI{

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

    }

    public void ()
}

