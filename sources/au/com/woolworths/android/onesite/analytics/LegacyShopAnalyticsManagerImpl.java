package au.com.woolworths.android.onesite.analytics;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.adobe.data.ActionData;
import au.com.woolworths.android.onesite.analytics.adobe.data.ScreenState;
import au.com.woolworths.android.onesite.analytics.adobe.data.StoreChangedData;
import au.com.woolworths.android.onesite.appdata.AppConfigurationInteractor;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.repository.PreferencesManager;
import au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import com.google.common.collect.ImmutableSet;
import com.salesforce.marketingcloud.UrlHandler;
import com.tealium.core.Tealium;
import com.tealium.dispatcher.TealiumEvent;
import com.tealium.dispatcher.TealiumView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Singleton;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/LegacyShopAnalyticsManagerImpl;", "Lau/com/woolworths/base/shopapp/appdata/LegacyShopAnalyticsManager;", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Singleton
@Deprecated
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LegacyShopAnalyticsManagerImpl implements LegacyShopAnalyticsManager {

    /* renamed from: a, reason: collision with root package name */
    public final Tealium f4060a;
    public final Set b;
    public final ShopAccountInteractor c;
    public final AppConfigurationInteractor d;
    public final PreferencesManager e;
    public final DeviceAccessibilityTracker f;

    public LegacyShopAnalyticsManagerImpl(Tealium tealium, ImmutableSet persistentMetadataProviders, ShopAccountInteractor accountInteractor, AppConfigurationInteractor appConfigurationInteractor, PreferencesManager preferencesManager, DeviceAccessibilityTracker deviceAccessibilityTracker) {
        Intrinsics.h(tealium, "tealium");
        Intrinsics.h(persistentMetadataProviders, "persistentMetadataProviders");
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(appConfigurationInteractor, "appConfigurationInteractor");
        Intrinsics.h(preferencesManager, "preferencesManager");
        Intrinsics.h(deviceAccessibilityTracker, "deviceAccessibilityTracker");
        this.f4060a = tealium;
        this.b = persistentMetadataProviders;
        this.c = accountInteractor;
        this.d = appConfigurationInteractor;
        this.e = preferencesManager;
        this.f = deviceAccessibilityTracker;
    }

    @Override // au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager
    public final void a(ScreenState screenState) {
        HashMap mapA = screenState.a(this.d, this.e, this.c);
        e(mapA);
        this.f4060a.b(new TealiumView("screen", mapA));
    }

    @Override // au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager
    public final void b(String str, String str2, String str3, String str4, CollectionMode collectionMode) {
        Intrinsics.h(collectionMode, "collectionMode");
        StoreChangedData storeChangedDataA = StoreChangedData.Companion.a();
        storeChangedDataA.c(collectionMode);
        if (str2 == null) {
            str2 = "null";
        }
        storeChangedDataA.g(str2);
        if (str4 == null) {
            str4 = "null";
        }
        storeChangedDataA.e(str4);
        if (str3 == null) {
            str3 = "null";
        }
        storeChangedDataA.d(str3);
        if (str == null) {
            str = "null";
        }
        storeChangedDataA.f(str);
        HashMap mapA = storeChangedDataA.a(this.d, this.e, this.c);
        e(mapA);
        this.f4060a.b(new TealiumEvent(UrlHandler.ACTION, mapA));
    }

    @Override // au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager
    public final void c(String screenName) {
        Intrinsics.h(screenName, "screenName");
        a(ScreenState.Companion.a(screenName));
    }

    @Override // au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager
    public final void d(ActionData actionData) {
        HashMap mapA = actionData.a(this.d, this.e, this.c);
        e(mapA);
        this.f4060a.b(new TealiumEvent(UrlHandler.ACTION, mapA));
    }

    public final void e(HashMap map) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            TrackingMetadata metadata = ((PersistentMetadataProvider) it.next()).getMetadata();
            if (metadata != null) {
                map.putAll(metadata.c());
            }
        }
        String strG = this.f4060a.w.G("google_adid");
        if (strG != null && !StringsKt.D(strG)) {
            map.put("device.AdID", strG);
        }
        DeviceAccessibilityTracker deviceAccessibilityTracker = this.f;
        map.put("device.VoiceOver", Boolean.valueOf(deviceAccessibilityTracker.getB()));
        map.put("device.DarkMode", Boolean.valueOf(deviceAccessibilityTracker.d()));
        map.put("device.DynamicType", deviceAccessibilityTracker.getC().e);
    }
}
