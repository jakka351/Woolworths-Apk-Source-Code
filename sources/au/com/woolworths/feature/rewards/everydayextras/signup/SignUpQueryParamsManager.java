package au.com.woolworths.feature.rewards.everydayextras.signup;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.SignUpQueryParams;
import au.com.woolworths.rewards.base.featuretoggles.RewardsRemoteConfig;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/SignUpQueryParamsManager;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SignUpQueryParamsManager {

    /* renamed from: a, reason: collision with root package name */
    public final FeatureToggleManager f5971a;
    public SignUpQueryParams b;

    public SignUpQueryParamsManager(FeatureToggleManager featureToggleManager) {
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f5971a = featureToggleManager;
        this.b = new SignUpQueryParams(null);
    }

    public final String a() {
        String str = this.b.f6144a;
        if (str != null && str.length() != 0) {
            return this.b.f6144a;
        }
        return this.f5971a.e(RewardsRemoteConfig.e, true);
    }
}
