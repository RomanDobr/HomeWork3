package tree;

public abstract class Coniferous extends Tree {
    protected String typeNeedle;

    public Coniferous(int age, String typeNeedle) {
        super(age);
        this.typeNeedle = typeNeedle;
    }

}
