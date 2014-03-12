package com.dustingannon.code.oca;

import com.dustingannon.code.oca.*;

public class HelloWorld implements HelloInterface{
    public void hello(String name) {
        System.out.println("Hello "+name+". How are you doing today?");
    }

    public void changeChannel(int ChannelNumber) {
        System.out.println("Channel is "+ChannelNumber);
    } 

    public void increaseVolume(){};
    public void decreaseVolume(){};
}

