package au.com.woolworths.feature.shop.storelocator.analytics.adobe.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.adobe.data.ActionData;
import au.com.woolworths.android.onesite.appdata.AccountInteractor;
import au.com.woolworths.android.onesite.appdata.AppConfigurationInteractor;
import au.com.woolworths.android.onesite.repository.PreferencesManager;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/analytics/adobe/data/StoreSearchData;", "Lau/com/woolworths/android/onesite/analytics/adobe/data/ActionData;", "Companion", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StoreSearchData extends ActionData {
    public String d;
    public String e;
    public String f;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/analytics/adobe/data/StoreSearchData$Companion;", "", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
            mapA.put("event48", str2);
        }
        String str3 = this.e;
        if (str3 != null && !StringsKt.D(str3)) {
            String str4 = this.e;
            Intrinsics.e(str4);
            mapA.put("event49", str4);
        }
        String str5 = this.f;
        if (str5 != null && !StringsKt.D(str5)) {
            String str6 = this.f;
            Intrinsics.e(str6);
            mapA.put("digitalData.store.storeName", str6);
        }
        return mapA;
    }
}
