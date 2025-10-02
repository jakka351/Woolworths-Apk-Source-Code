package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.data;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"redemption-settings_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SecureDollarsConfigKt {
    public static final SecureDollarsText a(SecureDollarsConfig secureDollarsConfig, String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.g(lowerCase, "toLowerCase(...)");
        return lowerCase.equals("lock") ? secureDollarsConfig.f6467a : lowerCase.equals("unlock") ? secureDollarsConfig.b : new SecureDollarsText("", "", "");
    }
}
