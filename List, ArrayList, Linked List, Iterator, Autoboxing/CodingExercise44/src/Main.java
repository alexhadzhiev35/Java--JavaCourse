public class Main {

    public static void main(String[] args) {

        MobilePhone myPhone = new MobilePhone("+3693921321");

        Contact mama = new Contact("Mama", "+3129381209");
        Contact tata = new Contact("Tata", "328179381278");
        Contact papa = new Contact("Papa", "7273798126398712");
        Contact dida = new Contact("Dida", "4124");
        Contact pida = new Contact("Pida", "321412");
        Contact mida = new Contact("Mida", "312515");

        myPhone.addNewContact(mama);
        myPhone.addNewContact(tata);
        myPhone.addNewContact(papa);
        myPhone.printContacts();
        System.out.println();


        System.out.println(myPhone.removeContact(dida));
        System.out.println(myPhone.queryContact("Tata"));
        System.out.println(myPhone.removeContact(mama));

        myPhone.printContacts();



    }
}
