package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ImageVectorCache;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class PainterResources_androidKt {
    public static final Painter a(int i, int i2, Composer composer) {
        TypedValue typedValue;
        boolean z;
        Context context = (Context) composer.x(AndroidCompositionLocals_androidKt.b);
        composer.x(AndroidCompositionLocals_androidKt.f1950a);
        Resources resources = context.getResources();
        ResourceIdCache resourceIdCache = (ResourceIdCache) composer.x(AndroidCompositionLocals_androidKt.d);
        synchronized (resourceIdCache) {
            typedValue = (TypedValue) resourceIdCache.f2004a.b(i);
            z = true;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                MutableIntObjectMap mutableIntObjectMap = resourceIdCache.f2004a;
                int iD = mutableIntObjectMap.d(i);
                Object[] objArr = mutableIntObjectMap.c;
                Object obj = objArr[iD];
                mutableIntObjectMap.b[iD] = i;
                objArr[iD] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && StringsKt.x(charSequence, ".xml")) {
            composer.o(-803043333);
            Resources.Theme theme = context.getTheme();
            int i3 = typedValue.changingConfigurations;
            ImageVectorCache imageVectorCache = (ImageVectorCache) composer.x(AndroidCompositionLocals_androidKt.c);
            ImageVectorCache.Key key = new ImageVectorCache.Key(i, theme);
            WeakReference weakReference = (WeakReference) imageVectorCache.f2001a.get(key);
            ImageVectorCache.ImageVectorEntry imageVectorEntryA = weakReference != null ? (ImageVectorCache.ImageVectorEntry) weakReference.get() : null;
            if (imageVectorEntryA == null) {
                XmlResourceParser xml = resources.getXml(i);
                int next = xml.next();
                while (next != 2 && next != 1) {
                    next = xml.next();
                }
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!Intrinsics.c(xml.getName(), "vector")) {
                    throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                }
                imageVectorEntryA = VectorResources_androidKt.a(theme, resources, xml, i3);
                imageVectorCache.f2001a.put(key, new WeakReference(imageVectorEntryA));
            }
            VectorPainter vectorPainterE = VectorPainterKt.e(imageVectorEntryA.f2002a, composer);
            composer.l();
            return vectorPainterE;
        }
        composer.o(-802887899);
        Object theme2 = context.getTheme();
        boolean zN = composer.n(charSequence);
        if ((((i2 & 14) ^ 6) <= 4 || !composer.r(i)) && (i2 & 6) != 4) {
            z = false;
        }
        boolean zN2 = zN | z | composer.n(theme2);
        Object objG = composer.G();
        if (zN2 || objG == Composer.Companion.f1624a) {
            try {
                Drawable drawable = resources.getDrawable(i, null);
                Intrinsics.f(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                objG = new AndroidImageBitmap(((BitmapDrawable) drawable).getBitmap());
                composer.A(objG);
            } catch (Exception e) {
                throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e);
            }
        }
        BitmapPainter bitmapPainter = new BitmapPainter((ImageBitmap) objG, (r0.getWidth() << 32) | (r0.getHeight() & 4294967295L));
        composer.l();
        return bitmapPainter;
    }
}
