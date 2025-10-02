package au.com.woolworths.android.onesite.analytics.adobe.data;

import au.com.woolworths.android.onesite.appdata.AccountInteractor;
import au.com.woolworths.android.onesite.appdata.AppConfigurationInteractor;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.repository.PreferencesManager;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/adobe/data/StoreChangedData;", "Lau/com/woolworths/android/onesite/analytics/adobe/data/ActionData;", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StoreChangedData extends ActionData {
    public CollectionMode d;
    public String e;
    public String f;
    public String g;
    public String h;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/adobe/data/StoreChangedData$Companion;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static StoreChangedData a() {
            StoreChangedData storeChangedData = new StoreChangedData("changedStore");
            storeChangedData.b = "Store Selector screen";
            storeChangedData.c = "1";
            return storeChangedData;
        }
    }

    @Override // au.com.woolworths.android.onesite.analytics.adobe.data.ActionData
    public final HashMap a(AppConfigurationInteractor appConfigurationInteractor, PreferencesManager preferencesManager, AccountInteractor accountInteractor) {
        Intrinsics.h(appConfigurationInteractor, "appConfigurationInteractor");
        Intrinsics.h(preferencesManager, "preferencesManager");
        Intrinsics.h(accountInteractor, "accountInteractor");
        HashMap mapA = super.a(appConfigurationInteractor, preferencesManager, accountInteractor);
        CollectionMode collectionMode = this.d;
        String modeName = collectionMode != null ? collectionMode.getModeName() : null;
        if (modeName != null) {
            mapA.put("digitalData.transaction.shippingMethod", modeName);
        }
        String str = this.f;
        if (str != null && !StringsKt.D(str)) {
            String str2 = this.f;
            Intrinsics.e(str2);
            mapA.put("currentStore", str2);
        }
        String str3 = this.e;
        if (str3 != null && !StringsKt.D(str3)) {
            String str4 = this.e;
            Intrinsics.e(str4);
            mapA.put("previousStore", str4);
        }
        String str5 = this.h;
        if (str5 != null && !StringsKt.D(str5)) {
            String str6 = this.h;
            Intrinsics.e(str6);
            mapA.put("currentStoreId", str6);
        }
        String str7 = this.g;
        if (str7 != null && !StringsKt.D(str7)) {
            String str8 = this.g;
            Intrinsics.e(str8);
            mapA.put("previousStoreId", str8);
        }
        return mapA;
    }

    public final void c(CollectionMode collectionMode) {
        Intrinsics.h(collectionMode, "collectionMode");
        this.d = collectionMode;
    }

    public final void d(String str) {
        this.h = str;
    }

    public final void e(String str) {
        this.f = str;
    }

    public final void f(String str) {
        this.g = str;
    }

    public final void g(String str) {
        this.e = str;
    }
}
