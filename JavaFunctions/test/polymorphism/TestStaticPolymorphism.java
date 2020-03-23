package polymorphism;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import covariant.CovariantReturnType;
import covariant.CovariantReurnType1;

public class TestStaticPolymorphism
{
    private StaticPolyMorphism testStaticPolyMorphism;
    
    private CovariantReturnType testCovariant;
    
    @Before
    public void setUp()
    {
        testStaticPolyMorphism = new StaticPolyMorphism();
        testCovariant = new CovariantReurnType1();
    }
    
    @After
    public void tearDown()
    {
        testStaticPolyMorphism = null;
        testCovariant = null;
    }
    
    @Test
    public void testStaticPolymorphism() throws Exception
    {
        int result = testStaticPolyMorphism.coVariance(testCovariant);
        assertEquals(1, result);
        result = testStaticPolyMorphism.coVariance(new CovariantReurnType1());
        assertEquals(1, result);
    }
}
