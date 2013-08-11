package example

/* Pretend we can't edit this file to remove the "final" */
class Base {
    
    /* We want to "override" this final method */
    final String foo(String s) {
        return "Base " + s
    }
    
    /* We want to leave this method alone */
    String bar(String s) {
        return "bar(${s})"
    }
}
