package neuralnetworkapi.src.imports;

import java.util.ArrayList;

public class unitNeuron{

    ArrayList<Double> weightsIn;
    ArrayList<Double> weightsOut;

    public void unitNeuron(){
        weightsIn = new ArrayList<Double>();
        weightsOut = new ArrayList<Double>();
    }

    public void unitNeuron(unitNeuron duplicateNeuron){
        //Initialize neuron
        unitNeuron();

        //Deep copy weightsIn
        deepCopyIn(duplicateNeuron.weightsIn);
        
        //Deep copy weightsOut
        deepCopyOut(duplicateNeuron.weightsOut);
    }

    public void assignWeightIn(ArrayList<Double> copyWeightIn){
        weightsIn = copyWeightIn;
    }

    public void assignWeightOut(ArrayList<Double> copyWeightOut){
        weightsOut = copyWeightOut;
    }
    public ArrayList<Double> getWeightsIn(){
        return weightsIn;
    }
    public ArrayList<Double> getWeightsOut(){
        return weightsOut;
    }
    public void deepCopyIn(ArrayList<Double> copyWeights){
        weightsIn = new ArrayList<Double>();

        for (int index = 0 ; index < copyWeights.size();){

        }

    }
    public void deepCopyOut(ArrayList<Double> copyWeights){

    }
    public void copyNeuron(unitNeuron neuronToCopy){
        neuronToCopy.unitNeuron(neuronToCopy);
    }
}


