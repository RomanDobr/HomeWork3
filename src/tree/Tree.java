package tree;

public abstract class Tree {
    protected int age;

    public Tree(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
