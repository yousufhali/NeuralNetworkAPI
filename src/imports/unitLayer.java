package neuralnetworkapi.src.imports;

import java.util.ArrayList;

public class unitLayer{

    private Integer neuronsCount;
    private ArrayList<unitNeuron> neurons;
    private enum layerType {input,output,hidden;}
    private layerType type;


    public void unitLayer(){
        neuronsCount = 0;
        neurons = new ArrayList<unitNeuron>();
        type = layerType.hidden;
    }

    public void unitLayer(layerType typeToSet, Integer neuronCount){
        type = typeToSet;
        this.neuronsCount = neuronCount;

        for (int i = 0 ; i<neuronCount; i++){
            neurons.add(new unitNeuron());
        }
    }

    public void unitLayer(Integer neuronCount){
        this.neuronsCount = neuronCount;
        for (int i = 0 ; i< neuronCount; i++){
            neurons.add(new unitNeuron());
        }
    }

    public void unitLayer(layerType typeToSet){
        type = typeToSet;
    }

    public void assignNeuronList (ArrayList<unitNeuron> neurons ){
        this.neurons = new ArrayList<unitNeuron>();
        for (int i = 0; i< neurons.size(); i++){
            this.neurons.add(neurons.get(i));
        }
    }

    public void copyLayer (unitLayer layerToCopy){
        neurons =  new ArrayList<unitNeuron>();
        for (int counter = 0; counter< layerToCopy.neuronsCount; counter ++){
            neurons.add(new unitNeuron());
            this.neurons.get(counter).copyNeuron(layerTCopy.neuron.get(counter));
        }
    }



}