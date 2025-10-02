package au.com.woolworths.android.onesite.featuretoggles;

import au.com.woolworths.android.onesite.remoteconfig.RemoteConfig;
import au.com.woolworths.rewards.base.featuretoggles.RewardsRemoteConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleAccessListManager;", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "base-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FeatureToggleAccessListManager implements FeatureToggleManager {
    @Override // au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager
    public final StateFlow a(Feature feature) {
        throw null;
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager
    public final void activate() {
        throw null;
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager
    public final StateFlow b() {
        RewardsRemoteConfig rewardsRemoteConfig = RewardsRemoteConfig.e;
        throw null;
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager
    public final boolean c(Feature feature) {
        Intrinsics.h(feature, "feature");
        throw null;
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager
    public final void d() {
        throw null;
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager
    public final String e(RemoteConfig config, boolean z) {
        Intrinsics.h(config, "config");
        throw null;
    }
}
