// FieldAccess.java
// Direct field access is determined at compile time.

class Super{
    public int field = 0;
    public int getField(){return field;}
}
class Sub extends Super{
    public int field = 1;
    public int getField(){return field;}
    public int getSuperField(){return super.getField();}
}
public class FieldAccess{
    public static void main(String[] args){
        Super sup = new Sub();  // Upcast
        System.out.println("sup.field = " + sup.field + ". sup.getField() = " + sup.getField());
        Sub sub = new Sub();
        System.out.println("sub.field = " + sub.field + ". sub.getFiled() = " + sub.getField() + ". sub.getSuperField() = " + sub.getSuperField());
    }
}
/** Output:
 *  sup.field = 0. sup.getField() = 1
 *  sub.field = 1. sub.getFiled() = 1. sub.getSuperField() = 0
 */
