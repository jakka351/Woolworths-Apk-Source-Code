package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class VectorResources_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry a(android.content.res.Resources.Theme r41, android.content.res.Resources r42, android.content.res.XmlResourceParser r43, int r44) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 954
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.res.VectorResources_androidKt.a(android.content.res.Resources$Theme, android.content.res.Resources, android.content.res.XmlResourceParser, int):androidx.compose.ui.res.ImageVectorCache$ImageVectorEntry");
    }

    public static final ImageVector b(int i, int i2, Composer composer) throws XmlPullParserException, Resources.NotFoundException, IOException {
        Context context = (Context) composer.x(AndroidCompositionLocals_androidKt.b);
        Resources resourcesA = Resources_androidKt.a(composer);
        Resources.Theme theme = context.getTheme();
        boolean zN = ((((i2 & 112) ^ 48) > 32 && composer.r(i)) || (i2 & 48) == 32) | composer.n(resourcesA) | composer.n(theme) | composer.n(resourcesA.getConfiguration());
        Object objG = composer.G();
        if (zN || objG == Composer.Companion.f1624a) {
            TypedValue typedValue = new TypedValue();
            resourcesA.getValue(i, typedValue, true);
            XmlResourceParser xml = resourcesA.getXml(i);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            objG = a(theme, resourcesA, xml, typedValue.changingConfigurations).f2002a;
            composer.A(objG);
        }
        return (ImageVector) objG;
    }
}
