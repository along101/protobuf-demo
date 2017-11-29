package test;

import com.example.tutorial.AddressBookProtos;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yinzuolong on 2017/11/29.
 */
public class TestProtobuff {
    @Test
    public void testProto() throws Exception {

        AddressBookProtos.Person person = AddressBookProtos.Person.newBuilder()
                .setId(100).setName("yinzuolong").setEmail("yinzuolong@gmail.com").build();
        System.out.println(person);
        Assert.assertEquals(100, person.getId());
        System.out.println(person.toByteString());

        byte[] b = person.toByteArray();

        AddressBookProtos.Person p = AddressBookProtos.Person.parseFrom(b);
        System.out.println(p.getEmail());

    }
}
