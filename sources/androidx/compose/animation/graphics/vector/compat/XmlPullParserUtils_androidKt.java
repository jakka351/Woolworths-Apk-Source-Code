package androidx.compose.animation.graphics.vector.compat;

import android.content.res.XmlResourceParser;
import java.io.IOException;
import kotlin.Metadata;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class XmlPullParserUtils_androidKt {
    public static final boolean a(XmlResourceParser xmlResourceParser) {
        return xmlResourceParser.getEventType() == 1 || (xmlResourceParser.getDepth() < 1 && xmlResourceParser.getEventType() == 3);
    }

    public static final void b(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int next = xmlResourceParser.next();
        while (next != 2 && next != 1) {
            next = xmlResourceParser.next();
        }
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
    }
}
