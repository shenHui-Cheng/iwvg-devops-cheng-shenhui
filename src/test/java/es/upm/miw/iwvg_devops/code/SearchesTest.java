package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SearchesTest {
    @Test
    void testFindUserIdBySomeProperFraction(){
        List<String> list = Arrays.asList("1","2","3","5");
        assertEquals(list,new Searches().findUserIdBySomeProperFraction().collect(Collectors.toList()));
    }

    @Test
    void testFindUserFamilyNameInitialBySomeProperFraction(){
        assertEquals(Arrays.asList("Fernandez","Blanco","López","Blanco"),new Searches().findUserFamilyNameInitialBySomeProperFraction().collect(Collectors.toList()));
    }

    @Test
    void testFindDecimalFractionByUserName() {
        List list = List.of(0.0,1.0,2.0,0.2,-0.5,0.5,1.0);
        Stream<Double> stream = new Searches().findDecimalFractionByUserName("Oscar");
        assertEquals(list,stream.collect(Collectors.toList()));
    }

    @Test
    void testFindUserFamilyNameByUserNameDistinct() {
        List list = List.of("Torres");
        Stream<String> stream = new Searches().findUserFamilyNameByUserNameDistinct("Paula");
        assertEquals(list, stream.collect(Collectors.toList()));
    }
}
