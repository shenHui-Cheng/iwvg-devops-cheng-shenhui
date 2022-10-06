package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchesTest {
    @Test
    void testFindUserIdBySomeProperFraction(){
        List<String> list = Arrays.asList("1","2","3","5");
        assertTrue(new Searches().findUserIdBySomeProperFraction().collect(Collectors.toList()).equals(list));
    }
}
