package au.com.woolworths.android.onesite.analytics.swrve;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.NotificationAction;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.marketing.SwrveInteractor;
import com.swrve.sdk.SwrveSDKBase;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/swrve/ShopAppSwrveTrackingManager;", "Lau/com/woolworths/android/onesite/analytics/AnalyticsManager;", "Companion", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShopAppSwrveTrackingManager implements AnalyticsManager {

    /* renamed from: a, reason: collision with root package name */
    public final SwrveInteractor f4071a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/swrve/ShopAppSwrveTrackingManager$Companion;", "", "", "SCREEN_PREFIX", "Ljava/lang/String;", "SECTION_DELIMITER", "WORD_DELIMITER", "SPACE", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ShopAppSwrveTrackingManager(SwrveInteractor swrveInteractor) {
        Intrinsics.h(swrveInteractor, "swrveInteractor");
        this.f4071a = swrveInteractor;
    }

    public static String k(String str) {
        Locale locale = Locale.ROOT;
        return CollectionsKt.M(new Regex("\\s").i(a.m(locale, "ROOT", str, locale, "toLowerCase(...)")), "_", null, null, null, 62);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.swrve.sdk.ISwrveBase, java.lang.Object] */
    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void a(Screen screen) {
        Intrinsics.h(screen, "screen");
        String strI = YU.a.i("screen.", k(screen.getE()), ".", k(screen.getD()));
        new SwrveScreenEvent(strI);
        SwrveInteractor swrveInteractor = this.f4071a;
        swrveInteractor.getClass();
        if (SwrveSDKBase.f19075a == null || ((Boolean) swrveInteractor.c.f8895a.invoke()).booleanValue()) {
            return;
        }
        SwrveSDKBase.a();
        SwrveSDKBase.f19075a.o(strI);
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void b(au.com.woolworths.analytics.Screen screen, TrackingMetadata trackingMetadata) {
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void c(Action action) {
        Intrinsics.h(action, "action");
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void d(NotificationAction action) {
        Intrinsics.h(action, "action");
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void e(Screen screen, TrackingMetadata trackingMetadata) {
        Intrinsics.h(screen, "screen");
        a(screen);
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void f(au.com.woolworths.analytics.Screen screen) {
        Intrinsics.h(screen, "screen");
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void g(Event action) {
        Intrinsics.h(action, "action");
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void h(NotificationAction action, TrackingMetadata trackingMetadata) {
        Intrinsics.h(action, "action");
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void i(Event action, TrackingMetadata trackingMetadata) {
        Intrinsics.h(action, "action");
        Intrinsics.h(trackingMetadata, "trackingMetadata");
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void j(Action action, TrackingMetadata trackingMetadata) {
        Intrinsics.h(action, "action");
        Intrinsics.h(trackingMetadata, "trackingMetadata");
    }
}
