package au.com.woolworths.marketing;

import android.app.Application;
import android.content.SharedPreferences;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.PersistentMetadataProvider;
import au.com.woolworths.android.onesite.notification.SwrveConfigData;
import au.com.woolworths.foundation.swrve.embedded.campaign.EmbeddedCampaignProcessor;
import com.swrve.sdk.SwrveSDKBase;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/marketing/SwrveInteractor;", "Lau/com/woolworths/android/onesite/analytics/PersistentMetadataProvider;", "Companion", "marketing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SwrveInteractor implements PersistentMetadataProvider {

    /* renamed from: a, reason: collision with root package name */
    public final SwrveConfigData f9049a;
    public final Application b;
    public final EmbeddedCampaignProcessor c;
    public final SharedPreferences d;
    public final SwrveInteractor$identityResponse$1 e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/marketing/SwrveInteractor$Companion;", "", "", "SHARED_PREFS_NAME", "Ljava/lang/String;", "IS_LOGGED_IN", "marketing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public SwrveInteractor(SwrveConfigData swrveConfigData, Application application, EmbeddedCampaignProcessor embeddedCampaignProcessor) {
        Intrinsics.h(embeddedCampaignProcessor, "embeddedCampaignProcessor");
        this.f9049a = swrveConfigData;
        this.b = application;
        this.c = embeddedCampaignProcessor;
        this.d = application.getSharedPreferences("au.com.woolworths.marketing.SwrveInteractor", 0);
        this.e = new SwrveInteractor$identityResponse$1();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.swrve.sdk.ISwrveBase, java.lang.Object] */
    public static void d(SwrveUserProperty swrveUserProperty) {
        if (SwrveSDKBase.f19075a != null) {
            Map mapI = MapsKt.i(new Pair(swrveUserProperty.getKey(), swrveUserProperty.getF9051a()));
            SwrveSDKBase.a();
            SwrveSDKBase.f19075a.t(mapI);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.swrve.sdk.ISwrveBase, java.lang.Object] */
    @Override // au.com.woolworths.android.onesite.analytics.PersistentMetadataProvider
    public final TrackingMetadata getMetadata() {
        if (!this.d.getBoolean("is_logged_in", false)) {
            return null;
        }
        SwrveSDKBase.a();
        String userId = SwrveSDKBase.f19075a.getUserId();
        if (userId != null) {
            return TrackingMetadata.Companion.a(TrackableValue.F3, userId);
        }
        return null;
    }
}
