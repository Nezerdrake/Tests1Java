public class Functions_Tutorial {
    static void sayHi(){
        System.out.println("Hi!");
    }

    public static void main(String[] args) {
        int a = 123;
        switch (a){
            case 1:
                System.out.println("a");
                break;
            case 10:
                System.out.println("b");
                break;
            default:
                System.out.println("LUL");
                break;
        }
        for (int i = 0; i < 10; i++) {
//            if (i % 2 != 0)
//                continue;
//            System.out.println(i);
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}