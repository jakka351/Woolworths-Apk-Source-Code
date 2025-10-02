package au.com.woolworths.android.onesite.analytics.adobe.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.appdata.AccountInteractor;
import au.com.woolworths.android.onesite.appdata.AppConfigurationInteractor;
import au.com.woolworths.android.onesite.repository.PreferencesManager;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/adobe/data/SearchData;", "Lau/com/woolworths/android/onesite/analytics/adobe/data/ActionData;", "Companion", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SearchData extends ActionData {
    public String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/adobe/data/SearchData$Companion;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // au.com.woolworths.android.onesite.analytics.adobe.data.ActionData
    public final HashMap a(AppConfigurationInteractor appConfigurationInteractor, PreferencesManager preferencesManager, AccountInteractor accountInteractor) {
        Intrinsics.h(appConfigurationInteractor, "appConfigurationInteractor");
        Intrinsics.h(preferencesManager, "preferencesManager");
        Intrinsics.h(accountInteractor, "accountInteractor");
        HashMap mapA = super.a(appConfigurationInteractor, preferencesManager, accountInteractor);
        String str = this.d;
        if (str != null && !StringsKt.D(str)) {
            String str2 = this.d;
            Intrinsics.e(str2);
            mapA.put("event1", str2);
        }
        return mapA;
    }
}
