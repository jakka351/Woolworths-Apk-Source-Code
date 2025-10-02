package au.com.woolworths.feature.rewards.everydayextras.signup.common;

import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"everyday-extras-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscribePlanExtensionsKt {
    public static final boolean a(int i) {
        return new Regex("^0+$").a(String.format(Locale.getDefault(), "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i % 100)}, 1)));
    }
}
