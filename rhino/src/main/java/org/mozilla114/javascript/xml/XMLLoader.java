package org.mozilla114.javascript.xml;

import org.mozilla114.javascript.ScriptableObject;

/** This interface is used to load the XML implementation using the ServiceLoader pattern. */
public interface XMLLoader {
    void load(ScriptableObject scope, boolean sealed);

    XMLLib.Factory getFactory();
}
