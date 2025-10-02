package androidx.compose.ui.text;

import android.text.Editable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/AnnotationContentHandler;", "Lorg/xml/sax/ContentHandler;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class AnnotationContentHandler implements ContentHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ContentHandler f2034a;
    public final Editable b;
    public int c;
    public BulletSpanWithLevel d;

    public AnnotationContentHandler(ContentHandler contentHandler, Editable editable) {
        this.f2034a = contentHandler;
        this.b = editable;
    }

    public final void a() {
        BulletSpanWithLevel bulletSpanWithLevel = this.d;
        if (bulletSpanWithLevel != null) {
            int i = bulletSpanWithLevel.c;
            Editable editable = this.b;
            editable.setSpan(bulletSpanWithLevel, i, editable.length(), 33);
        }
        this.d = null;
    }

    @Override // org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) throws SAXException {
        this.f2034a.characters(cArr, i, i2);
    }

    @Override // org.xml.sax.ContentHandler
    public final void endDocument() throws SAXException {
        this.f2034a.endDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) throws SAXException {
        if (str2 != null) {
            int iHashCode = str2.hashCode();
            if (iHashCode != -1555043537) {
                if (iHashCode != 3453) {
                    if (iHashCode == 3735 && str2.equals("ul")) {
                        a();
                        this.c--;
                        return;
                    }
                } else if (str2.equals("li")) {
                    a();
                    return;
                }
            } else if (str2.equals("annotation")) {
                Editable editable = this.b;
                Object[] spans = editable.getSpans(0, editable.length(), AnnotationSpan.class);
                ArrayList arrayList = new ArrayList();
                for (Object obj : spans) {
                    if (editable.getSpanFlags((AnnotationSpan) obj) == 17) {
                        arrayList.add(obj);
                    }
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    AnnotationSpan annotationSpan = (AnnotationSpan) arrayList.get(i);
                    int spanStart = editable.getSpanStart(annotationSpan);
                    int length = editable.length();
                    editable.removeSpan(annotationSpan);
                    if (spanStart != length) {
                        editable.setSpan(annotationSpan, spanStart, length, 33);
                    }
                }
                return;
            }
        }
        this.f2034a.endElement(str, str2, str3);
    }

    @Override // org.xml.sax.ContentHandler
    public final void endPrefixMapping(String str) throws SAXException {
        this.f2034a.endPrefixMapping(str);
    }

    @Override // org.xml.sax.ContentHandler
    public final void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
        this.f2034a.ignorableWhitespace(cArr, i, i2);
    }

    @Override // org.xml.sax.ContentHandler
    public final void processingInstruction(String str, String str2) throws SAXException {
        this.f2034a.processingInstruction(str, str2);
    }

    @Override // org.xml.sax.ContentHandler
    public final void setDocumentLocator(Locator locator) {
        this.f2034a.setDocumentLocator(locator);
    }

    @Override // org.xml.sax.ContentHandler
    public final void skippedEntity(String str) throws SAXException {
        this.f2034a.skippedEntity(str);
    }

    @Override // org.xml.sax.ContentHandler
    public final void startDocument() throws SAXException {
        this.f2034a.startDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        if (str2 != null) {
            int iHashCode = str2.hashCode();
            Editable editable = this.b;
            if (iHashCode != -1555043537) {
                if (iHashCode != 3453) {
                    if (iHashCode == 3735 && str2.equals("ul")) {
                        a();
                        this.c++;
                        return;
                    }
                } else if (str2.equals("li")) {
                    a();
                    this.d = new BulletSpanWithLevel(BulletKt.b, this.c, editable.length());
                    return;
                }
            } else if (str2.equals("annotation")) {
                if (attributes != null) {
                    int length = attributes.getLength();
                    for (int i = 0; i < length; i++) {
                        String localName = attributes.getLocalName(i);
                        if (localName == null) {
                            localName = "";
                        }
                        String value = attributes.getValue(i);
                        String str4 = value != null ? value : "";
                        if (localName.length() > 0 && str4.length() > 0) {
                            int length2 = editable.length();
                            editable.setSpan(new AnnotationSpan(localName, str4), length2, length2, 17);
                        }
                    }
                    return;
                }
                return;
            }
        }
        this.f2034a.startElement(str, str2, str3, attributes);
    }

    @Override // org.xml.sax.ContentHandler
    public final void startPrefixMapping(String str, String str2) throws SAXException {
        this.f2034a.startPrefixMapping(str, str2);
    }
}
