package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {
    private User user;

    @BeforeEach
    public void setup(){
        this.user = new User("1234", "shenhui cheng", "bella",new ArrayList<>());
    }

    @Test
     void testEmpetyConstructorUser(){
        User u2 = new User();
        assertEquals(new ArrayList<>(), u2.getFractions());
    }

    @Test
    void testGetId(){
        assertEquals("1234", this.user.getId());
    }

    @Test
     void testGetName(){
        assertEquals("shenhui cheng", this.user.getName());
    }

    @Test
     void testSetName(){
        String nameTest = "shenhui cheng2";
        this.user.setName(nameTest);
        assertEquals("shenhui cheng2", this.user.getName());
    }

    @Test
    void testGetFamilyName(){
        assertEquals("bella", this.user.getFamilyName());
    }

    @Test
     void testSetFamilyName(){
        String familyName = "bella2";
        this.user.setFamilyName(familyName);
        assertEquals("bella2", this.user.getFamilyName());
    }

    @Test
     void testGetFractions(){
        assertEquals(new ArrayList(){}, this.user.getFractions());
    }

    @Test
     void testSetFractions(){
        Fraction frac = new Fraction();
        List<Fraction> fracs = new ArrayList();
        fracs.add(frac);
        this.user.setFractions(fracs);
        assertEquals(fracs , this.user.getFractions());
    }

    @Test
     void testAddFraction(){
        Fraction frac1 = new Fraction();
        this.user.addFraction(frac1);
        assertEquals(1, this.user.getFractions().size());

        Fraction frac2 = new Fraction();
        this.user.addFraction(frac2);
        assertEquals(2,this.user.getFractions().size());
    }

    @Test
     void testFullName(){
        assertEquals("shenhui cheng bella", this.user.fullName());
    }

    @Test
     void testInitials(){
        assertEquals("s.b.", this.user.initials());
    }

}
