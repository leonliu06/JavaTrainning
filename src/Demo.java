public class Demo {
    public static void main(String[] args){
        Animal obj = new Cat();
        obj.cry();
        obj = new Dog();
        obj.cry();
    }
}
class Animal{
    // 动物的叫声
    //public void cry(){
      //  System.out.println("不知道怎么叫");
    //}
   
}
class Cat extends Animal{
    // 猫的叫声
    public char cry(int args){
        System.out.println("喵喵~");
    }
	public int cry(int args){
		System.out.println("xxx");
		return 0;
	}
}
class Dog extends Animal{
    // 狗的叫声
    public void cry(){
        System.out.println("汪汪~");
    }
}