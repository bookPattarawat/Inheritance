// ประกาศ Interface
interface MyInterface {
  // ตัวแปรคงที่
  int MY_CONSTANT = 42;

  // Abstract method
  void myAbstractMethod();

  // Default method
  default void myDefaultMethod() {
    System.out.println("Default implementation of myDefaultMethod.");
  }
}

// คลาสที่ Implement Interface
class MyClass implements MyInterface {
  // int MY_CONSTANT = 500;

  // Implement เมธอด Abstract
  public void myAbstractMethod() {
    System.out.println("Implementation of myAbstractMethod.");
  }

  // public void myDefaultMethod() {
  // System.out.println("55555");
  // }
}

// Main class ที่ใช้ทดสอบ
class TestInterface {
  public static void main(String[] args) {
    // สร้างอ็อบเจ็กต์จากคลาสที่ Implement Interface
    MyInterface myObject = new MyClass();
    myObject.myAbstractMethod(); // เรียกใช้เมธอด Abstract
    System.out.println(myObject.MY_CONSTANT); // เรียกใช้ใช้ตัวแปรคงที่ผ่าน object ของ Subclass
    myObject.myDefaultMethod(); // เรียกใช้เมธอด Default
    System.out.println(MyInterface.MY_CONSTANT); // ใช้ตัวแปรคงที่ผ่าน SuperClass
  }
}