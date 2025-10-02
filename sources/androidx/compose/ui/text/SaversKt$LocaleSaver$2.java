package androidx.compose.ui.text;

import android.util.Log;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.PlatformLocaleKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/intl/Locale;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SaversKt$LocaleSaver$2 extends Lambda implements Function1<Object, Locale> {
    public static final SaversKt$LocaleSaver$2 h = new SaversKt$LocaleSaver$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        PlatformLocaleKt.f2137a.getClass();
        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str);
        if (Intrinsics.c(localeForLanguageTag.toLanguageTag(), "und")) {
            Log.e("Locale", "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return new Locale(localeForLanguageTag);
    }
}
