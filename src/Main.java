public class Main {
    public static void main(String[] args) {

        Tariff online = new Tariff();

        online.id = "Онлайн";
        online.price = 340;
        online.totalGb = "16 Gb";


        System.out.println(online.id);
        System.out.println(online.price);
        System.out.println(online.totalGb);


    }
}
