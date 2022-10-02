public class Main {
    public static void main(String[] args) {
        Flat flat1 = new Flat(2, "Wrocław", true);
        System.out.println(flat1.getFloor());
        System.out.println(flat1.getCity());
        System.out.println(flat1.getBalcony());
    }
}