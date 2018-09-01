package neuralnetworkapi.src.imports;

import java.util.ArrayList;

import neuralnetworkapi.src.imports.unitLayer;

public class network{

    public ArrayList<unitLayer> layers;

    public void network(){
        layers = new ArrayList<unitLayer>();
    }

    public void network (network duplicatNetwork){
        Integer sizeOfNetwork = duplicatNetwork.layers.size();
        layers = new ArrayList<unitLayer>();

        for (int counter = 0 ; counter < sizeOfNetwork ; counter++){
            this.layers.add(new unitLayer());
            this.layers.get(counter).copyLayer(duplicateNetwork.layers.get(counter));
        }
    }

    public void assignNumberOfLayers(Integer layerCount){
        for (int counter = 0 ; counter < layerCount; counter++){
            layers.add(new unitLayer());
        }
    }


    
}