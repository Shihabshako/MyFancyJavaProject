public class App {
    public static void main(String[] args) throws Exception {
        BangladeshPresident president = BangladeshPresident.getPresident("Fluffylord");
        System.out.println(president.getPresidentName());
    }
}
