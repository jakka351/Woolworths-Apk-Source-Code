package au.com.woolworths.android.onesite.featuretoggles;

import au.com.woolworths.android.onesite.remoteconfig.RemoteConfig;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FeatureToggleManager {
    StateFlow a(Feature feature);

    void activate();

    StateFlow b();

    boolean c(Feature feature);

    void d();

    String e(RemoteConfig remoteConfig, boolean z);
}
