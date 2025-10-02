package androidx.compose.animation.graphics.res;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.animation.graphics.vector.AnimatedImageVector;
import androidx.compose.animation.graphics.vector.AnimatedVectorTarget;
import androidx.compose.animation.graphics.vector.compat.AndroidVectorResources;
import androidx.compose.animation.graphics.vector.compat.XmlPullParserUtils_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.VectorResources_androidKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AnimatedVectorResources_androidKt {
    /* JADX WARN: Finally extract failed */
    public static final AnimatedImageVector a(int i, int i2, Composer composer) {
        TypedArray typedArrayObtainAttributes;
        TypedArray typedArrayObtainAttributes2;
        Context context = (Context) composer.x(AndroidCompositionLocals_androidKt.b);
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        boolean z = (((i2 & 112) ^ 48) > 32 && composer.r(i)) || (i2 & 48) == 32;
        Object objG = composer.G();
        if (z || objG == Composer.Companion.f1624a) {
            XmlResourceParser xml = resources.getXml(i);
            XmlPullParserUtils_androidKt.b(xml);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            int[] iArr = AndroidVectorResources.f822a;
            if (theme == null || (typedArrayObtainAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0)) == null) {
                typedArrayObtainAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr);
            }
            try {
                int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
                ArrayList arrayList = new ArrayList();
                xml.next();
                while (!XmlPullParserUtils_androidKt.a(xml) && (xml.getEventType() != 3 || !Intrinsics.c(xml.getName(), "animated-vector"))) {
                    if (xml.getEventType() == 2 && Intrinsics.c(xml.getName(), "target")) {
                        int[] iArr2 = AndroidVectorResources.b;
                        if (theme == null || (typedArrayObtainAttributes2 = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, 0, 0)) == null) {
                            typedArrayObtainAttributes2 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr2);
                        }
                        try {
                            String string = typedArrayObtainAttributes2.getString(0);
                            if (string == null) {
                                string = "";
                            }
                            AnimatedVectorTarget animatedVectorTarget = new AnimatedVectorTarget(string, AnimatorResources_androidKt.a(typedArrayObtainAttributes2.getResourceId(1, 0), theme, resources));
                            typedArrayObtainAttributes2.recycle();
                            arrayList.add(animatedVectorTarget);
                        } catch (Throwable th) {
                            typedArrayObtainAttributes2.recycle();
                            throw th;
                        }
                    }
                    xml.next();
                }
                TypedValue typedValue = new TypedValue();
                resources.getValue(resourceId, typedValue, true);
                XmlResourceParser xml2 = resources.getXml(resourceId);
                int next = xml2.next();
                while (next != 2 && next != 1) {
                    next = xml2.next();
                }
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                AnimatedImageVector animatedImageVector = new AnimatedImageVector(VectorResources_androidKt.a(theme, resources, xml2, typedValue.changingConfigurations).f2002a, arrayList);
                typedArrayObtainAttributes.recycle();
                composer.A(animatedImageVector);
                objG = animatedImageVector;
            } catch (Throwable th2) {
                typedArrayObtainAttributes.recycle();
                throw th2;
            }
        }
        return (AnimatedImageVector) objG;
    }
}
