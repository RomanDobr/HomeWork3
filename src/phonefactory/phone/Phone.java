package phonefactory.phone;

import phonefactory.camera.Camera;
import phonefactory.moderboard.ModerBoard;

public abstract class Phone {
    protected String name;
    protected String osName;
    protected ModerBoard moderBoard;
    protected Camera camera;

    public Phone(String name, String osName, ModerBoard moderBoard, Camera camera) {
        this.name = name;
        this.osName = osName;
        this.moderBoard = moderBoard;
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", osName='" + osName + '\'' +
                ", moderBoard=" + moderBoard +
                ", camera=" + camera +
                '}';
    }
}
