import org.mozilla114.javascript.NullabilityDetector;
import org.mozilla114.javascript.RegExpLoader;
import org.mozilla114.javascript.config.RhinoPropertiesLoader;
import org.mozilla114.javascript.regexp.RegExpLoaderImpl;
import org.mozilla114.javascript.xml.XMLLoader;

module org.mozilla.rhino {
    uses NullabilityDetector;

    exports org.mozilla114.classfile;
    exports org.mozilla114.javascript;
    exports org.mozilla114.javascript.annotations;
    exports org.mozilla114.javascript.ast;
    exports org.mozilla114.javascript.commonjs.module;
    exports org.mozilla114.javascript.commonjs.module.provider;
    exports org.mozilla114.javascript.debug;
    exports org.mozilla114.javascript.optimizer;
    exports org.mozilla114.javascript.serialize;
    exports org.mozilla114.javascript.typedarrays;
    exports org.mozilla114.javascript.xml;
    exports org.mozilla114.javascript.config;
    exports org.mozilla114.javascript.lc.type;

    uses RegExpLoader;
    uses XMLLoader;
    uses RhinoPropertiesLoader;

    provides RegExpLoader with
            RegExpLoaderImpl;

    requires java.compiler;
    requires jdk.dynalink;
    requires transitive java.desktop;
}
