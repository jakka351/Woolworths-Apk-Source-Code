package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StringKt {
    public static final String a(String str, Locale locale) {
        String upperCase = str.toUpperCase(locale.f2136a);
        Intrinsics.g(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
