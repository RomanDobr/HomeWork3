package phonefactory.camera;

public abstract class Camera {
    protected String name;
    protected int zoom;

    public Camera (String name, int zoom) {
        this.name = name;
        this.zoom = zoom;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "name='" + name + '\'' +
                ", zoom=" + zoom +
                '}';
    }
}
