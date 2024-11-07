public class ElectronicGadgets {
    int imei_number = 99999;

    public void getBatteryPercentage() {
        System.out.println("90% Battery percentage");
    }

    public String getLifeSpan() {
        String lifeSpan = "4 year";
        return lifeSpan;
    }
}

class Mobile extends ElectronicGadgets{
    int imei_number = 100000;

    public String getLifeSpan() {
        String lifeSpan = "8 year";
        return lifeSpan;
    }
}