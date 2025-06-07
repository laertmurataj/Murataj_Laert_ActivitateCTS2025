//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void activation(SmartDevice smartDevice){
        System.out.println("Starting");
        smartDevice.turnOn();

    }
    public static void main(String[] args) {
        SmartDevice tv = new SmartDevice("Smart TV");
        activation(tv);

        System.out.println("----------------");
        SmartLight oldLight = new SmartLight("Old light");
        Adapter oldLightAdapter = new Adapter(oldLight);
        activation(oldLightAdapter);





        }
    }
