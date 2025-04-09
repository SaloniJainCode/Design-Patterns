package org.example;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Constructor;

public class SingletonEnum {
    public static void main(String[] args){
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println("No direct object creation possible : " + (instance1 == instance2));
        try {
            Constructor<Singleton> c = Singleton.class.getDeclaredConstructor();
            c.setAccessible(true);
            Singleton instance3 = c.newInstance();
        } catch (Exception e) {
            System.out.println("Reflection not possible");
        }

    }
}
enum Singleton{
    INSTANCE;
}


