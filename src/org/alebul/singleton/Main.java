package org.alebul.singleton;

public class Main {
    public static void main(String[] args) {
        Database instance1 = Database.getInstance("Instance1");
        Database instance2 = Database.getInstance("Instance2");
        Database instance3 = Database.getInstance("Instance3");

        System.out.println(instance1.getName());
        System.out.println(instance2.getName());
        System.out.println(instance3.getName());

    }
}
