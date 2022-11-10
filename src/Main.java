public class Main {

    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        String petr = user2.getName("Petr");
        String boris = user1.setName("Boris");
        System.out.println(petr + boris);
    }
}