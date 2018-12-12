package com.company;

class fclass1 {

    public static void main(String[] args) {
        System.out.println("fclass1 содержит main()");
        new fclass2().method1();
        new fclass3().method1();
    }
}
class fclass2 extends fclass3 {
    void method1() {
        System.out.println("наследует fclass3");
    }
}
class fclass3 extends fclass1 {
    void method1() {
        System.out.println("наследует fclass1");
    }
}