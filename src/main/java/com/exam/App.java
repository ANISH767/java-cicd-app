package com.exam;

public class App {
    public int add(int a, int b) {
        return a + b;
    }

    public String getStatus() {
        return "Java Maven Build Successful!";
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getStatus());
        System.out.println("2 + 3 = " + app.add(2, 3));
    }
}

