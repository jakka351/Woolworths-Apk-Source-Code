package au.com.woolworths.android.onesite.analytics.adobe.data;

import au.com.woolworths.android.onesite.appdata.AccountInteractor;
import au.com.woolworths.android.onesite.appdata.AppConfigurationInteractor;
import au.com.woolworths.android.onesite.models.authentication.Member;
import au.com.woolworths.android.onesite.repository.PreferencesManager;
import java.util.HashMap;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Deprecated
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/adobe/data/ScreenState;", "Lau/com/woolworths/android/onesite/analytics/adobe/data/ContextData;", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class ScreenState implements ContextData {

    /* renamed from: a, reason: collision with root package name */
    public final String f4069a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/adobe/data/ScreenState$Companion;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static ScreenState a(String pageName) {
            Intrinsics.h(pageName, "pageName");
            return new ScreenState(pageName);
        }
    }

    public ScreenState(String pageName) {
        Intrinsics.h(pageName, "pageName");
        this.f4069a = pageName;
    }

    public HashMap a(AppConfigurationInteractor appConfigurationInteractor, PreferencesManager preferencesManager, AccountInteractor accountInteractor) {
        Intrinsics.h(appConfigurationInteractor, "appConfigurationInteractor");
        Intrinsics.h(preferencesManager, "preferencesManager");
        Intrinsics.h(accountInteractor, "accountInteractor");
        HashMap map = new HashMap();
        Member memberN = accountInteractor.n();
        String shopperId = memberN != null ? memberN.getShopperId() : null;
        if (!accountInteractor.d() || shopperId == null || StringsKt.D(shopperId)) {
            map.put("digitalData.user.profile.profileInfo.profileID", appConfigurationInteractor.getDeviceId());
        } else {
            map.put("digitalData.user.profile.profileInfo.profileID", shopperId);
            map.put("digitalData.user.profile.shopperID", shopperId);
        }
        map.put("digitalData.user.status", accountInteractor.d() ? "Authenticated" : "Guest");
        String strA = preferencesManager.a();
        map.put("digitalData.user.profile.EDR", (strA == null || StringsKt.D(strA)) ? "N" : "Y");
        map.put("digitalData.page.sysEnv", "Android");
        map.put("digitalData.user.analyticsIdentifier", accountInteractor.u());
        String str = this.f4069a;
        if (!StringsKt.D(str)) {
            map.put("digitalData.page.pageName", str);
        }
        return map;
    }
}
