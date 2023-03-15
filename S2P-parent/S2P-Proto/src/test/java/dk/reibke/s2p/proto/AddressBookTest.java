package dk.reibke.s2p.proto;

import dk.reibke.s2p.protos.AddressBook;
import dk.reibke.s2p.protos.Person;
import org.junit.Test;

public class AddressBookTest {

    @Test
    public void addressBookCreationTest() {
        AddressBook someName = AddressBook.newBuilder()
                .addPeople(
                        Person.newBuilder()
                                .addPhones(Person.PhoneNumber.newBuilder()
                                        .setNumber("123123132")
                                        .setType(Person.PhoneType.MOBILE)
                                )
                                .setEmail("asdasd@123qas.com")
                                .setName("some name")
                                .build()
                ).build();

        System.out.println(someName);
    }
}
