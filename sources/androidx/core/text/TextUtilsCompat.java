package androidx.core.text;

import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class TextUtilsCompat {
    public static int a(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
