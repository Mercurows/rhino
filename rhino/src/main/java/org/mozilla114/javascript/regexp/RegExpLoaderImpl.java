package org.mozilla114.javascript.regexp;

import org.mozilla114.javascript.RegExpLoader;
import org.mozilla114.javascript.RegExpProxy;

/** This class loads the default RegExp implementation. */
public class RegExpLoaderImpl implements RegExpLoader {
    @Override
    public RegExpProxy newProxy() {
        return new RegExpImpl();
    }
}
