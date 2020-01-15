public class main {
    public static void main(String[] args) {
        A1 a1 = new A1(8);
        a1.insert(1);
        a1.insert(2);
        a1.insert(6);
        System.out.println(a1.member(1));
        System.out.println(a1.member(2));
        System.out.println(a1.member(6));
        System.out.println(a1.member(7));
        a1.insert(7);
        System.out.println(a1.member(7));
        a1.delete(1);
        System.out.println(a1.member(1));
    }
}
