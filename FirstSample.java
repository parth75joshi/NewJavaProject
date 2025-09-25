
// class A {
//     int age;
//     String name;
//     public int getAge() {
//         return age;
//     }
//     public void setAge(int age) {
//         this.age = age;
//     }
//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
// }
abstract class Vehicle {

    abstract void breaks();

    abstract void music();

    public void show() {
        System.out.println("This is from Vehicle class.");
    }

}

class Car extends Vehicle {

    @Override
    void breaks() {
        System.out.println("This is break method.");
    }

    @Override
    void music() {
        System.out.println("This is music method.");
    }

}

public class FirstSample {

    public static void main(String[] args) {

        Child child = new Child();
        child.childClassMethos();
        child.parentClassMethods();

        // Car car = new Car();
        // car.breaks();
        // car.music();
        // car.show();
        // System.out.println("First Demo");
        // int numArray[] = {1, 2, 4, 5, 8};
        // int numNewArray[] = new int[4];
        // System.out.println(numArray[0]);
        // System.out.println(numNewArray[0]);
        // // MultiDimensional Array
        // int nums[][] = new int[3][4];
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 4; j++) {
        //         nums[i][j] = (int) (Math.random() * 100);
        //     }
        // }
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 4; j++) {
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // for (int[] n : nums) {
        //     for (int m : n) {
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }
    }
}

class Child extends Parent {

    public void childClassMethos() {
        System.out.println("Child Class method!");
    }
}

class Parent {

    public void parentClassMethods() {
        System.out.println("Parent Class methos!");
    }
}
