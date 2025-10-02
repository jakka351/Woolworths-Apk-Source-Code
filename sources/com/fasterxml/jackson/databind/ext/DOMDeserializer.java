package com.fasterxml.jackson.databind.ext;

import YU.a;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/* loaded from: classes4.dex */
public abstract class DOMDeserializer<T> extends FromStringDeserializer<T> {
    public static final DocumentBuilderFactory h;

    public static class DocumentDeserializer extends DOMDeserializer<Document> {
        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public final Object o0(DeserializationContext deserializationContext, String str) {
            return DOMDeserializer.u0(str);
        }
    }

    public static class NodeDeserializer extends DOMDeserializer<Node> {
        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public final Object o0(DeserializationContext deserializationContext, String str) {
            return DOMDeserializer.u0(str);
        }
    }

    static {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        documentBuilderFactoryNewInstance.setNamespaceAware(true);
        documentBuilderFactoryNewInstance.setExpandEntityReferences(false);
        try {
            documentBuilderFactoryNewInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
        } catch (Error | ParserConfigurationException unused) {
        }
        try {
            documentBuilderFactoryNewInstance.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        } catch (Throwable unused2) {
        }
        try {
            documentBuilderFactoryNewInstance.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        } catch (Throwable unused3) {
        }
        h = documentBuilderFactoryNewInstance;
    }

    public static Document u0(String str) {
        try {
            return h.newDocumentBuilder().parse(new InputSource(new StringReader(str)));
        } catch (Exception e) {
            throw new IllegalArgumentException(a.f(e, new StringBuilder("Failed to parse JSON String as XML: ")), e);
        }
    }
}
