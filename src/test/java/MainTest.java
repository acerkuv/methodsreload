
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.example.Main.*;


public class MainTest {

    @Test
    public void myTest(){
        //Тест sum()
        Assertions.assertEquals(sum(7, 5), 12);
        Assertions.assertEquals(sum(-1, 1978), 1977);
        Assertions.assertEquals(sum(7777), 28);
        Assertions.assertEquals(sum(0), 0);
        Assertions.assertEquals(sum(0, 1977), 1977);
        //Тест fact()
        Assertions.assertEquals(fact(0), 1);
        Assertions.assertEquals(fact(1), 1);
        Assertions.assertEquals(fact(3), 6);
        //Тест myOverload()
        Assertions.assertEquals(myOverload("VV"), "VV_VV_VV");
        Assertions.assertEquals(printArr(myOverload(new int[]{1, 1, 9, 0})),  printArr( new int[]{1, 1, 81, 0}));
    }
    public static String printArr(int[] m){
        return Arrays.toString(m);
    }
}
