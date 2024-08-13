package l01.t5l1;

public class t5l1 {
    public static void main(String[] args) {
        Address address= new Address();
        address.setIndex("12345");
        address.setCountry("USA");
        address.setCity("Tulsa");
        address.setStreet("234 line");
        address.setHouse("34");
        address.setApartment("456");



        System.out.println("Index: "+address.getIndex() );
        System.out.println("Country: "+address.getCountry() );
        System.out.println("City: "+address.getCity() );
        System.out.println("Street: "+address.getStreet());
        System.out.println("House: "+address.getHouse() );
        System.out.println("Apartment: "+address.getApartment() );
    }
}
