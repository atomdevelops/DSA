package recursion;

class Rec_01_first {
    // this is the first recursion program i am writing
    static int num = 0;

    static void printIt() {
        if (num == 3)
            return;
        System.out.println(num);
        num++;
        printIt();
    }

    public static void main(String args[]) {
        System.out.println("Atom is Great");
        printIt();
    }
}