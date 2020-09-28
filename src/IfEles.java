public class IfEles {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        if (x > y) {
            System.out.println("this is if");

        } else {
            System.out.println("this is else");
        }
        Lala();
    }


    public static void Lala() {

        int color = 1;
        switch (color) {
            case 1:
                System.out.println("red");
                break;
            case 2:
                System.out.println("blue");
                break;
            case 3:
                System.out.println("green");
        }

    }
}