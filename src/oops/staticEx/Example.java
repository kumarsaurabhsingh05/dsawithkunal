package oops.staticEx;

class Example {
    static int num = 5;

    void updateNum() {
        num = 10;  // Update the static variable num using a non-static method
    }

    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();

        System.out.println("Original num: " + num);  // Original num: 5

        obj1.updateNum();  // Call the non-static method to update num

        System.out.println("Updated num: " + num);   // Updated num: 10

        obj2.updateNum();  // Call the non-static method on a different instance

        System.out.println("Updated num again: " + num);  // Updated num again: 10
    }
}
