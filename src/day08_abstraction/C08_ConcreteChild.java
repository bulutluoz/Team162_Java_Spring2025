package day08_abstraction;

public class C08_ConcreteChild extends C07_AbstractParent{

    // Abstract bir silsileden sonra gelen
    // ILK CONCRETE CHILD CLASS
    // parent abstract class'lardaki
    // tum method'lari kontrol edip
    // hicbir abstract method kalmayacak sekilde
    // method'lari override etmelidir

    @Override
    public String method2() {
        return null;
    }

    @Override
    public String method5() {
        return null;
    }
}
