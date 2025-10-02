package au.com.woolworths.feature.shop.inbox.tracking;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.feature.shop.inbox.InboxFeature;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/tracking/InboxAnalyticsFactoryImpl;", "Lau/com/woolworths/feature/shop/inbox/tracking/InboxAnalyticsFactory;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InboxAnalyticsFactoryImpl extends InboxAnalyticsFactory {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7294a;

    public InboxAnalyticsFactoryImpl(FeatureToggleManager featureToggleManager) {
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f7294a = featureToggleManager.c(InboxFeature.d);
    }
}
