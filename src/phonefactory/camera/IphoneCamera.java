package phonefactory.camera;

import phonefactory.camera.Camera;

public class IphoneCamera extends Camera {

    private boolean isFlash;
    public IphoneCamera(String name, int zoom, boolean isFlash) {
        super(name, zoom);
        this.isFlash = true;
    }
}
