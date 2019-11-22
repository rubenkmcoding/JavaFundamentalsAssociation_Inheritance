package be.intecbrussel.extraExercises.boats;

public class Deckhand extends Person  {

    //properties
    private String nickName;

    //constructor
    Deckhand () {
        super();
    }

    Deckhand (String nickName) {
        super(nickName);
        this.nickName = nickName;
    }

    Deckhand (String nickName, int age) {
        super(nickName, age);
        this.nickName = nickName;
    }

    //setter
    @Override
    public void setName(String nickName) {
        this.nickName = nickName;
    }

    //getter
    @Override
    public String getName() {
        return nickName;
    }
}
