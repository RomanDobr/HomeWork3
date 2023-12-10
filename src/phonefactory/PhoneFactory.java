package phonefactory;

import phonefactory.camera.IphoneCamera;
import phonefactory.camera.SamsungCamera;
import phonefactory.moderboard.GalaxyModerBoard;
import phonefactory.moderboard.IphoneModerboard;
import phonefactory.phone.Iphone;
import phonefactory.phone.Phone;
import phonefactory.phone.SamsungGalaxyPhone;

public class PhoneFactory {

    private SamsungGalaxyPhone samsungGalaxyPhone;
    private Iphone iphone;

    public void collector(SamsungGalaxyPhone samsungGalaxyPhone) {
        samsungGalaxyPhone = new SamsungGalaxyPhone(
                "Samsung galaxy",
                "Android",
                new GalaxyModerBoard("j-108", 10, 12, 13),
                new SamsungCamera("Samsung", 20));
        System.out.println(samsungGalaxyPhone.toString());
    }

    public void collector(Iphone iphone) {
        iphone = new Iphone(
                "Iphone 15",
                "Ios",
                new IphoneModerboard("7uik", 15, 12, 13),
                new IphoneCamera("iphone", 15, true)
        );
        System.out.println(iphone.toString());
    }

    public void run() {
        collector(iphone);
        collector(samsungGalaxyPhone);
    }

}
