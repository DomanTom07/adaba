public class App {
    public static void main(String[] args) throws Exception {
        Data data = new Data(new Mariadb());
        data.connect();
    }
}
