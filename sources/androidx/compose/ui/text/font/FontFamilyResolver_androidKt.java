package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontFamilyResolver_androidKt {
    public static final FontFamilyResolverImpl a(Context context) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), new AndroidFontResolveInterceptor(Build.VERSION.SDK_INT >= 31 ? FontWeightAdjustmentHelperApi31.f2101a.a(context) : 0));
    }
}
