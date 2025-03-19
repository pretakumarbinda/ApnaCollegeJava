public class methods {
    public static void printJava(){
        System.out.println("Hello!");
    }

    public static void printName(String name){
        System.out.println(name);
    }

    public static void printSum(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }
    public static void main(String[] args){
        printJava();
        printJava();
        printJava();

        printName("Aman");
        printName("Akku");

        printSum(1,3);
    }
}
