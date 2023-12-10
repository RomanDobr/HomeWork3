package tree;

public class Birch extends Deciduous {
    public Birch(int age, boolean isSheet) {
        super(age, isSheet);
    }
    @Override
    public void toBlooms() {
        super.toBlooms();
        System.out.println("Источают аллергены");
        isSheet = true;
    }

}
