package ut.com.codyburleson.confluence;

import org.junit.Test;
import com.codyburleson.confluence.api.MyPluginComponent;
import com.codyburleson.confluence.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}