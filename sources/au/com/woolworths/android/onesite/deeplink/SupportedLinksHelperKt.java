package au.com.woolworths.android.onesite.deeplink;

import android.util.Patterns;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base-shop-app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SupportedLinksHelperKt {
    public static final boolean a(String str) {
        Intrinsics.h(str, "<this>");
        return Patterns.WEB_URL.matcher(str).matches() || StringsKt.W(str, "com.woolworths.shop", false);
    }
}
