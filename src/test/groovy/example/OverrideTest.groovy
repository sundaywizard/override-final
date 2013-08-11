package example

import static org.junit.Assert.*

import org.junit.Test

class OverrideTest {
    
    @Test
    void testFinalOverride() {
        Base base = new Child()
        String answer = base.foo('happy')
        assertEquals('Child class should override Base class method',
            'Child happy', answer)
    }
    
    @Test
    void testOtherMethodsUnaffected() {
        Base base = new Child()
        String answer = base.bar('sad')
        assertEquals('Other methods should be unaffected',
            'bar(sad)', answer)
    }

}
