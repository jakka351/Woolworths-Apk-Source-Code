package au.com.woolworths.android.onesite.analytics.tealium;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.BaseAction;
import au.com.woolworths.android.onesite.analytics.DeviceAccessibilityTracker;
import au.com.woolworths.android.onesite.analytics.NotificationAction;
import au.com.woolworths.android.onesite.analytics.PersistentMetadataProvider;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.UserAttributionManager;
import au.com.woolworths.android.onesite.featuretoggles.BaseFeature;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.tealium.dispatcher.TealiumEvent;
import com.tealium.dispatcher.TealiumView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/tealium/TealiumAnalyticsManagerImpl;", "Lau/com/woolworths/android/onesite/analytics/AnalyticsManager;", "base-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class TealiumAnalyticsManagerImpl implements AnalyticsManager {

    /* renamed from: a, reason: collision with root package name */
    public final TealiumSelector f4073a;
    public final Set b;
    public final DeviceAccessibilityTracker c;
    public final TealiumEventLogRecorder d;
    public final UserAttributionManager e;
    public final TealiumEventBundleManager f;
    public final Lazy g;
    public final Lazy h;
    public final boolean i;

    public TealiumAnalyticsManagerImpl(TealiumSelector tealiumSelector, Set persistentMetadataProviders, DeviceAccessibilityTracker deviceAccessibilityTracker, TealiumEventLogRecorder tealiumEventLogRecorder, UserAttributionManager userAttributionManager, TealiumEventBundleManager bundleManager, final FeatureToggleManager featureToggleManager) {
        Intrinsics.h(persistentMetadataProviders, "persistentMetadataProviders");
        Intrinsics.h(deviceAccessibilityTracker, "deviceAccessibilityTracker");
        Intrinsics.h(tealiumEventLogRecorder, "tealiumEventLogRecorder");
        Intrinsics.h(userAttributionManager, "userAttributionManager");
        Intrinsics.h(bundleManager, "bundleManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f4073a = tealiumSelector;
        this.b = persistentMetadataProviders;
        this.c = deviceAccessibilityTracker;
        this.d = tealiumEventLogRecorder;
        this.e = userAttributionManager;
        this.f = bundleManager;
        final int i = 0;
        Lazy lazyB = LazyKt.b(new Function0() { // from class: au.com.woolworths.android.onesite.analytics.tealium.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i) {
                    case 0:
                        zC = featureToggleManager.c(BaseFeature.o);
                        break;
                    default:
                        zC = featureToggleManager.c(BaseFeature.p);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
        this.g = lazyB;
        final int i2 = 1;
        Lazy lazyB2 = LazyKt.b(new Function0() { // from class: au.com.woolworths.android.onesite.analytics.tealium.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i2) {
                    case 0:
                        zC = featureToggleManager.c(BaseFeature.o);
                        break;
                    default:
                        zC = featureToggleManager.c(BaseFeature.p);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
        this.h = lazyB2;
        this.i = ((Boolean) lazyB.getD()).booleanValue() || ((Boolean) lazyB2.getD()).booleanValue();
        ProcessLifecycleOwner.l.i.a(new DefaultLifecycleObserver() { // from class: au.com.woolworths.android.onesite.analytics.tealium.TealiumAnalyticsManagerImpl.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onStop(LifecycleOwner lifecycleOwner) {
                TealiumAnalyticsManagerImpl.this.q();
            }
        });
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void a(Screen screen) {
        Intrinsics.h(screen, "screen");
        p(screen, null);
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void b(au.com.woolworths.analytics.Screen screen, TrackingMetadata trackingMetadata) {
        o(screen, trackingMetadata);
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void c(Action action) {
        Intrinsics.h(action, "action");
        n(action, null);
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void d(NotificationAction action) {
        Intrinsics.h(action, "action");
        n(action, null);
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void e(Screen screen, TrackingMetadata trackingMetadata) {
        Intrinsics.h(screen, "screen");
        p(screen, trackingMetadata);
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void f(au.com.woolworths.analytics.Screen screen) {
        Intrinsics.h(screen, "screen");
        o(screen, null);
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void g(Event action) {
        Intrinsics.h(action, "action");
        m(action, null);
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void h(NotificationAction action, TrackingMetadata trackingMetadata) {
        Intrinsics.h(action, "action");
        n(action, trackingMetadata);
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void i(Event action, TrackingMetadata trackingMetadata) {
        Intrinsics.h(action, "action");
        Intrinsics.h(trackingMetadata, "trackingMetadata");
        m(action, trackingMetadata);
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void j(Action action, TrackingMetadata trackingMetadata) {
        Intrinsics.h(action, "action");
        Intrinsics.h(trackingMetadata, "trackingMetadata");
        n(action, trackingMetadata);
    }

    public final void k(Map map) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            TrackingMetadata metadata = ((PersistentMetadataProvider) it.next()).getMetadata();
            if (metadata != null) {
                map.putAll(metadata.c());
            }
        }
        TealiumSelector tealiumSelector = this.f4073a;
        String strG = tealiumSelector.a().w.G("google_adid");
        if (strG != null && !StringsKt.D(strG)) {
            map.put("device.AdID", strG);
        }
        DeviceAccessibilityTracker deviceAccessibilityTracker = this.c;
        map.put("device.VoiceOver", Boolean.valueOf(deviceAccessibilityTracker.getB()));
        map.put("device.DarkMode", Boolean.valueOf(deviceAccessibilityTracker.d()));
        map.put("device.DynamicType", deviceAccessibilityTracker.getC().e);
        String strC = tealiumSelector.c();
        if (strC.length() <= 0) {
            strC = null;
        }
        if (strC != null) {
            map.put("rewards_region", strC);
        }
    }

    public final void l(String str, HashMap map, boolean z) {
        boolean z2 = this.i;
        TealiumSelector tealiumSelector = this.f4073a;
        if (!z2) {
            k(map);
            tealiumSelector.a().b(new TealiumEvent(str, map));
            return;
        }
        TealiumEventBundleManager tealiumEventBundleManager = this.f;
        boolean zC = tealiumEventBundleManager.c(map);
        boolean zE = tealiumEventBundleManager.e(str, map, z);
        if (zE && zC) {
            tealiumEventBundleManager.b(map);
            return;
        }
        if (zE && !zC) {
            q();
            tealiumEventBundleManager.b(map);
        } else {
            if (!zC) {
                q();
            }
            k(map);
            tealiumSelector.a().b(new TealiumEvent(str, map));
        }
    }

    public final void m(Event event, TrackingMetadata trackingMetadata) {
        LinkedHashMap linkedHashMapS = MapsKt.s(event.getData());
        if (trackingMetadata != null) {
            linkedHashMapS.putAll(trackingMetadata.c());
        }
        String e = event.getE();
        event.getData().get("event.Label");
        l(e, linkedHashMapS, event.getG().f4017a);
    }

    public final void n(BaseAction baseAction, TrackingMetadata trackingMetadata) {
        HashMap mapL = baseAction.l();
        if (trackingMetadata != null) {
            mapL.putAll(trackingMetadata.c());
        }
        String str = baseAction.getI().f;
        baseAction.getJ();
        l(str, mapL, false);
    }

    public final void o(au.com.woolworths.analytics.Screen screen, TrackingMetadata trackingMetadata) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.e.a());
        linkedHashMap.putAll(MapsKt.s(screen.getData()));
        if (trackingMetadata != null) {
            linkedHashMap.putAll(trackingMetadata.c());
        }
        String e = screen.getE();
        screen.getD();
        q();
        k(linkedHashMap);
        this.f4073a.a().b(new TealiumView(e, linkedHashMap));
    }

    public final void p(Screen screen, TrackingMetadata trackingMetadata) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.e.a());
        linkedHashMap.putAll(screen.l());
        if (trackingMetadata != null) {
            linkedHashMap.putAll(trackingMetadata.c());
        }
        String f = screen.getF();
        screen.getD();
        q();
        k(linkedHashMap);
        this.f4073a.a().b(new TealiumView(f, linkedHashMap));
    }

    public final void q() {
        TealiumEventBundleManager tealiumEventBundleManager;
        Event eventD;
        if (this.i && (eventD = (tealiumEventBundleManager = this.f).d()) != null) {
            k(MapsKt.s(eventD.getData()));
            this.f4073a.a().b(new TealiumEvent(eventD.getE(), eventD.getData()));
            tealiumEventBundleManager.a();
        }
    }
}
