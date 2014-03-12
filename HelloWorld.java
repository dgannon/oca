public class HelloWorld implements HelloInterface{
    public static void main(String[] args) {
        System.out.println("Hello "+args[0]+". How are you doing today?");
    }

    public void changeChannel(int ChannelNumber) {
        System.out.println("Channel is "+ChannelNumber);
    } 

    public void increaseVolume(){};
    public void decreaseVolume(){};
}

