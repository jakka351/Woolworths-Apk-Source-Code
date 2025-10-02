package au.com.woolworths.android.onesite.utils;

import kotlin.Metadata;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/utils/Strings;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Strings {
    public static final boolean a(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static final boolean b(CharSequence charSequence) {
        return charSequence == null || StringsKt.D(charSequence);
    }
}
