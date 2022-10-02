public class Main {
    public static void main(String[] args) {
        Flat flat1 = new Flat(2, "Wrocław", true);
        System.out.println(flat1.getFloor());
        flat1.setBalcony(false);
        System.out.println(flat1.getBalcony());
        flat1.setCity("Gliwice");
        System.out.println(flat1.getCity());

        Flat flat2 = new Flat(3, "Katowice", true);
        flat2.setFloor(1);
        System.out.println(flat2.getFloor());
    }
}