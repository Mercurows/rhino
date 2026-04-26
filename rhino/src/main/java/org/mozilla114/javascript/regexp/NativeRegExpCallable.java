package org.mozilla114.javascript.regexp;

import org.mozilla114.javascript.Context;
import org.mozilla114.javascript.Function;
import org.mozilla114.javascript.Scriptable;

/**
 * Legacy implementation of RegExp was callable, this class exists to preserve this functionality
 */
class NativeRegExpCallable extends NativeRegExp implements Function {

    NativeRegExpCallable(Scriptable scope, RECompiled compiled) {
        super(scope, compiled);
    }

    NativeRegExpCallable() {
        super();
    }

    @Override
    public Object call(Context cx, Scriptable scope, Scriptable thisObj, Object[] args) {
        return execSub(cx, scope, args, MATCH);
    }

    @Override
    public Scriptable construct(Context cx, Scriptable scope, Object[] args) {
        return (Scriptable) execSub(cx, scope, args, MATCH);
    }
}
