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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/adobe/data/ErrorData;", "Lau/com/woolworths/android/onesite/analytics/adobe/data/ActionData;", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ErrorData extends ActionData {
    public String d;
    public String e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/adobe/data/ErrorData$Companion;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static ErrorData a(String str, String str2) {
            ErrorData errorData = new ErrorData("Error on Mobile App");
            errorData.b = str;
            errorData.d = str2;
            errorData.e = "1";
            return errorData;
        }
    }

    @Override // au.com.woolworths.android.onesite.analytics.adobe.data.ActionData
    public final HashMap a(AppConfigurationInteractor appConfigurationInteractor, PreferencesManager preferencesManager, AccountInteractor accountInteractor) {
        Intrinsics.h(appConfigurationInteractor, "appConfigurationInteractor");
        Intrinsics.h(preferencesManager, "preferencesManager");
        Intrinsics.h(accountInteractor, "accountInteractor");
        HashMap mapA = super.a(appConfigurationInteractor, preferencesManager, accountInteractor);
        Member memberN = accountInteractor.n();
        String shopperId = memberN != null ? memberN.getShopperId() : null;
        if (!accountInteractor.d() || shopperId == null || StringsKt.D(shopperId)) {
            mapA.put("digitalData.user.profile.profileInfo.profileID", appConfigurationInteractor.getDeviceId());
        } else {
            mapA.put("digitalData.user.profile.profileInfo.profileID", shopperId);
            mapA.put("digitalData.user.profile.shopperID", shopperId);
        }
        mapA.put("digitalData.user.status", accountInteractor.d() ? "Authenticated" : "Guest");
        String strA = preferencesManager.a();
        if (strA != null && !StringsKt.D(strA)) {
            mapA.put("digitalData.user.profile.EDR", strA);
        }
        String str = this.d;
        if (str != null && !StringsKt.D(str)) {
            String str2 = this.d;
            Intrinsics.e(str2);
            mapA.put("digitalData.errorMessage", str2);
        }
        mapA.put("digitalData.page.sysEnv", "Android");
        mapA.put("digitalData.user.analyticsIdentifier", accountInteractor.u());
        String str3 = this.b;
        if (str3 != null && !StringsKt.D(str3)) {
            String str4 = this.b;
            Intrinsics.e(str4);
            mapA.put("digitalData.page.pageName", str4);
        }
        String str5 = this.e;
        if (str5 != null && !StringsKt.D(str5)) {
            String str6 = this.e;
            Intrinsics.e(str6);
            mapA.put("event6", str6);
        }
        return mapA;
    }
}
