package be.intecbrussel.extraExercises.animals;

public class Main {
    public static void main(String[] args) {

        //properties
        Zoo zooList = new Zoo();

        zooList.setNewPenguin("Westley", "Male", 6 );
        zooList.setNewPenguin("Buttercup", "Female", 5);
        zooList.setNewPenguin("Fiona", "Female", 1);
        zooList.setNewPenguin("Prancer", "Male", 1);
        zooList.setNewPenguin("Dancer", "Male", 10);
        zooList.setWolf("Remus", "Male", 12);
        zooList.setWolf("Luna", "Female", 10);
        zooList.setWolf("Lupus", "Male", 9);
        zooList.setWolf("Serena", "Female", 1);
        zooList.setWolf("Selena", "Female", 1);
        zooList.setWolf("Moon Moon", "Male", 1);
        zooList.setWolf("Stumpy", "Male", 13);
        zooList.setCrocodile("Snappy", "Male", 30);
        zooList.setCrocodile("Clock", "Female", 35);
        zooList.setGorilla("Silver", "Male", 25);
        zooList.setGorilla("Cary", "Female", 20);
        zooList.setGorilla("Tarzan", "Female", 2);
        zooList.setLion("Simba", "Male", 10);
        zooList.setLion("Nala", "Female", 7);
        zooList.setLion("Scar", "Male", 2);
        zooList.setLion("Sarah", "Female", 7);

        zooList.printingAll();
    }

}
