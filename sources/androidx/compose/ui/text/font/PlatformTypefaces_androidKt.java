package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Paint;
import androidx.compose.ui.text.font.FontVariation;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.util.ListUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlatformTypefaces_androidKt {
    public static final android.graphics.Typeface a(android.graphics.Typeface typeface, FontVariation.Settings settings, Context context) {
        ThreadLocal threadLocal = TypefaceCompatApi26.f2105a;
        if (typeface == null) {
            return null;
        }
        if (settings.f2100a.isEmpty()) {
            return typeface;
        }
        ThreadLocal threadLocal2 = TypefaceCompatApi26.f2105a;
        Paint paint = (Paint) threadLocal2.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal2.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        final Density densityA = AndroidDensity_androidKt.a(context);
        paint.setFontVariationSettings(ListUtilsKt.b(settings.f2100a, null, new Function1<FontVariation.Setting, CharSequence>() { // from class: androidx.compose.ui.text.font.TypefaceCompatApi26$toAndroidString$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                FontVariation.Setting setting = (FontVariation.Setting) obj;
                StringBuilder sb = new StringBuilder("'null' ");
                setting.getClass();
                sb.append(setting.a(densityA));
                return sb.toString();
            }
        }, 31));
        return paint.getTypeface();
    }
}
