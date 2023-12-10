package phonefactory.moderboard;

public abstract class ModerBoard {
    protected int length;
    protected int width;
    protected int height;
    protected String name;

    public ModerBoard (String name, int width, int length, int height) {
        this.name = name;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    @Override
    public String toString() {
        return "ModerBoard{" + "length=" + length + ", width=" + width +
                ", height=" + height + ", name='" + name + '\'' + '}';
    }
}
