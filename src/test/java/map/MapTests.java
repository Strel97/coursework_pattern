package map;

import game.objects.Map;
import game.utils.ArrayUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by sergey on 03.05.2015.
 */
public class MapTests {

    private Map map;


    @Before
    public void setUp() throws Exception {
        map = new Map(5, 5);
    }

    @Test
    public void testParseTile() {
        Assert.assertTrue(map.parseTile('2', 2, 2));
    }

    @Test
    public void testParseMap() {
        ArrayList<String> content = new ArrayList<String>();

        content.add("01010102030403021");
        content.add("0101010203040");
        content.add("01010102030400");
        content.add("010101020300");

        Assert.assertTrue(map.parseMap(content));
    }

    @Test
    public void testLoadMap() {
        String filename ="src/main/resources/map.txt";
        Assert.assertTrue(map.loadMap(filename));

        ArrayUtils.showArray(map.getMapArray());
    }
}
