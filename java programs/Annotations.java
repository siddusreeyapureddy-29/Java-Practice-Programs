
class A {
    void show() {
        System.out.println("in A show");
    }
}

class B extends A {
    @Override
    void show() {
        System.out.println("in B show");
    }
}

class Annotations {
    public static void main(String args[]) {
        B obj = new B();
        obj.show();
    }
}
