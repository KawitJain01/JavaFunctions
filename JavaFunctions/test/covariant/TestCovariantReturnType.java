package covariant;

import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestCovariantReturnType
{
    @Mock
    private CovariantReturnType covariantMock;
    
    @Mock
    private CovariantReurnType1 covariantMock1;
    
    @Before
    public void setUp() throws Exception
    {
        
    }
    
    @After
    public void tearDown() throws Exception
    {
        
    }
    
    @Test
    public void test1() throws Exception
    {
        when(covariantMock.getHeader()).thenReturn(covariantMock1);
        assertNull(covariantMock1.getHeader(1));
    }
}
