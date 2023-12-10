package tree;

public abstract class Deciduous extends Tree {

    protected boolean isSheet;

    public Deciduous(int age, boolean isSheet) {
        super(age);
        this.isSheet = isSheet;
    }

    public void toFall() {
        System.out.println("Листья опадают");
        isSheet = false;
    }

    public void toBlooms() {
        System.out.println("Листья появляются");
        isSheet = true;
    }

}
