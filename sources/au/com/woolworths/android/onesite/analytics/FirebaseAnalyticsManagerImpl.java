package au.com.woolworths.android.onesite.analytics;

import android.os.Bundle;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.featuretoggles.BaseFeature;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.ParametersBuilder;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.salesforce.marketingcloud.sfmcsdk.components.behaviors.Behavior;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/FirebaseAnalyticsManagerImpl;", "Lau/com/woolworths/android/onesite/analytics/AnalyticsManager;", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class FirebaseAnalyticsManagerImpl implements AnalyticsManager {

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseAnalytics f4058a;
    public final Set b;
    public final FeatureToggleManager c;
    public final ApplicationType d;
    public final FirebaseCrashlytics e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/FirebaseAnalyticsManagerImpl$Companion;", "", "", "REPLACE_CHAR_DOT", "Ljava/lang/String;", "CHAR_UNDERSCORE", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public FirebaseAnalyticsManagerImpl(FirebaseAnalytics firebaseAnalytics, Set persistentMetadataProviders, FeatureToggleManager featureToggleManager, ApplicationType appType, FirebaseCrashlytics firebaseCrashlytics) {
        Intrinsics.h(persistentMetadataProviders, "persistentMetadataProviders");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(appType, "appType");
        this.f4058a = firebaseAnalytics;
        this.b = persistentMetadataProviders;
        this.c = featureToggleManager;
        this.d = appType;
        this.e = firebaseCrashlytics;
    }

    public static Bundle o(Map map) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString(StringsKt.Q((String) entry.getKey(), ".", "_", false), entry.getValue().toString());
        }
        return bundle;
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void a(Screen screen) {
        Intrinsics.h(screen, "screen");
        n(screen.d(), screen.l(), screen.c());
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void b(au.com.woolworths.analytics.Screen screen, TrackingMetadata trackingMetadata) {
        LinkedHashMap linkedHashMapS = MapsKt.s(screen.getData());
        linkedHashMapS.putAll(trackingMetadata.c());
        n(screen.getD(), linkedHashMapS, screen.getF());
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void c(Action action) {
        Intrinsics.h(action, "action");
        HashMap mapL = action.l();
        String str = action.getH().f;
        action.getI();
        if (m()) {
            this.e.a(str);
        } else {
            k(mapL);
            l(o(mapL), str);
        }
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void d(NotificationAction action) {
        Intrinsics.h(action, "action");
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void e(Screen screen, TrackingMetadata trackingMetadata) {
        Intrinsics.h(screen, "screen");
        HashMap mapL = screen.l();
        mapL.putAll(trackingMetadata.c());
        n(screen.d(), mapL, screen.c());
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void f(au.com.woolworths.analytics.Screen screen) {
        Intrinsics.h(screen, "screen");
        n(screen.getD(), MapsKt.s(screen.getData()), screen.getF());
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void g(Event action) {
        Intrinsics.h(action, "action");
        LinkedHashMap linkedHashMapS = MapsKt.s(action.getData());
        String d = action.getD();
        action.getData().get("event.Label");
        if (m()) {
            this.e.a(d);
        } else {
            k(linkedHashMapS);
            l(o(linkedHashMapS), d);
        }
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void h(NotificationAction action, TrackingMetadata trackingMetadata) {
        Intrinsics.h(action, "action");
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void i(Event action, TrackingMetadata trackingMetadata) {
        Intrinsics.h(action, "action");
        Intrinsics.h(trackingMetadata, "trackingMetadata");
        LinkedHashMap linkedHashMapS = MapsKt.s(action.getData());
        linkedHashMapS.putAll(trackingMetadata.c());
        String d = action.getD();
        action.getData().get("event.Label");
        if (m()) {
            this.e.a(d);
        } else {
            k(linkedHashMapS);
            l(o(linkedHashMapS), d);
        }
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void j(Action action, TrackingMetadata trackingMetadata) {
        Intrinsics.h(action, "action");
        Intrinsics.h(trackingMetadata, "trackingMetadata");
        HashMap mapL = action.l();
        mapL.putAll(trackingMetadata.c());
        String str = action.getH().f;
        action.getI();
        if (m()) {
            this.e.a(str);
        } else {
            k(mapL);
            l(o(mapL), str);
        }
    }

    public final void k(Map map) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            TrackingMetadata metadata = ((PersistentMetadataProvider) it.next()).getMetadata();
            if (metadata != null) {
                map.putAll(metadata.c());
            }
        }
    }

    public final void l(Bundle bundle, String str) {
        if (m()) {
            this.e.a(str);
        } else {
            this.f4058a.f15179a.zzh(str, bundle);
        }
    }

    public final boolean m() {
        if (!this.c.c(BaseFeature.n)) {
            return false;
        }
        Region region = ActivityNavigatorKt.f4556a;
        ApplicationType applicationType = this.d;
        Intrinsics.h(applicationType, "<this>");
        return applicationType == ApplicationType.e && ActivityNavigatorKt.f4556a == Region.i;
    }

    public final void n(String str, HashMap map, String str2) {
        if (m()) {
            this.e.a(str);
            return;
        }
        k(map);
        ParametersBuilder parametersBuilder = new ParametersBuilder();
        parametersBuilder.b(Behavior.ScreenEntry.KEY_NAME, str);
        for (Map.Entry entry : map.entrySet()) {
            parametersBuilder.b(StringsKt.Q((String) entry.getKey(), ".", "_", false), entry.getValue().toString());
        }
        this.f4058a.f15179a.zzh("screen_view", parametersBuilder.getF15180a());
        if (str2 != null) {
            l(o(map), str2);
        }
    }
}
