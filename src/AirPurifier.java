public class AirPurifier {
    String model;
    int serialNo;
    int electricConsume;
    boolean power;
    double price;
    boolean certified = true;
    int fanSpeed;
    void turnOn(){
        power = true;
    }
    void turnOff(){
        power = false;
    }
    void setFanSpeed(int i){
        fanSpeed = i;
    }


    AirPurifier(String model, int serialNo, int electricConsume, int price){
        this.model = model;
        this.serialNo = serialNo;
        this.electricConsume = electricConsume;
        this.price = price;
    }

    public static void main(String[] args){
        AirPurifier a = new AirPurifier("Promax", 120044, 750, 10000);
        System.out.println(a.power);
        a.turnOn();
        a.turnOff();
        System.out.println(a.power);
        System.out.println(a.model);
        System.out.println(a.serialNo);
        System.out.println(a.electricConsume);
        System.out.println(a.price);
        System.out.println(a.fanSpeed);
        a.setFanSpeed(4);
        System.out.println(a.fanSpeed);
        System.out.println(a.certified);
    }
    /*1) Instance variables:     1.model - บอกว่าเป็นเครื่องฟอกอากาศรุ่นไหน
            2.serialNo - บอกหมายเลขของเครื่อง
            3.electricConsume - กินไฟเท่าไหร่ / ชม
            4.power - บอกว่าเครื่องเปิดอยู่มั้ย
            5.price - ราคา
            6.certified - ได้มาตราฐานหรือไม่
            7.fanSpeed  - ความเร็วของเครื่อง
    2) Instance methods :    1.turnOn - เปิดเครื่อง
            2.turnOff - ปิดเครื่อง
            3.setFanSpeed - ตั้งความเร็วเครื่อง
    3)class varibles :    1.modelCount - ผลิตรุ่นไหนไปกี่เครื่อง
    4)class methods :    1.mostPopularModel - รุ่นไหนขายดีที่สุด*/
}
