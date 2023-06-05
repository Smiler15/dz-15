public class Main {
    public static void main(String[] args) {
        Person id001 = new Man("Serhii", "Krasikov", 67);
        Person id002 = new Woman("Olha", "Krasikova", 60);

        boolean retired = id002.isRetired();
        System.out.println(retired);
    }
}