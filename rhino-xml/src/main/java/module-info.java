import org.mozilla114.javascript.xml.XMLLoader;

module org.mozilla.javascript.xml {
    exports org.mozilla.javascript.xmlimpl;

    provides XMLLoader with
            org.mozilla.javascript.xmlimpl.XMLLoaderImpl;

    requires transitive org.mozilla.rhino;
    requires transitive java.xml;
}
