package example

/* GroovyInterceptable is a "tag" interface we need */
class Child extends Base implements GroovyInterceptable {
    
    /* We want to call this method instead of foo */
    String overridden_foo(String s) {
        return "Child " + s
    }
    
    /* Intercept calls to the foo method */
    @Override
    def invokeMethod(String name, args) {
        if ('foo'.equals(name)) {
            def metaMethod = metaClass.getMetaMethod('overridden_foo', args)
            return metaMethod.invoke(this, args);
        }
        else {
            return super.invokeMethod(name, args)
        }
    }

}
