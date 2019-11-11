package be.intecbrussel.extraExercises.tree;

import java.util.Arrays;

public class Tree {
    //properties
    private TreeElements[] treeElementsList;
    private Counter counting = new Counter();

    //creating the array for the TreeElements
    Tree() {
        treeElementsList = new TreeElements[20];
    }

    //adding a new object
    void setElement (TreeElements treeelement) {
        for (int i=0; i<treeElementsList.length; i++){
            if (treeElementsList[i] == null) {
                treeElementsList[i] = new TreeElements();
                treeElementsList[i].setTreeElement(treeelement);
                counting.increment();
                break;
            }
        }
    }

    //removing an element
    void removeElement (int arrayPosition) {
        treeElementsList[arrayPosition] = null;
        counting.removeCount();
        Arrays.sort(treeElementsList);
    }

    void showNumberOfBranches () {
        System.out.println("There were " + counting.giveCounter() + " branches configured.");
    }

    int treeElementsLength () {
        return treeElementsList.length;
    }

}
