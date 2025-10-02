package au.com.woolworths.foundation.rewards.onboarding.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.foundation.rewards.onboarding.ui.OnboardingCoachMarkContract;
import kotlin.Metadata;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/onboarding/ui/OnboardingCoachMarkViewModelNoOp;", "Lau/com/woolworths/foundation/rewards/onboarding/ui/OnboardingCoachMarkViewModel;", "onboarding-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OnboardingCoachMarkViewModelNoOp implements OnboardingCoachMarkViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final MutableStateFlow f8642a = StateFlowKt.a(new OnboardingCoachMarkContract.ViewState(null));
    public final OnboardingCoachMarkContract.Listener b = new OnboardingCoachMarkContract.Listener(new h(20), new au.com.woolworths.feature.shop.modeselector.ui.b(25), new au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.a(16));

    @Override // au.com.woolworths.foundation.rewards.onboarding.ui.OnboardingCoachMarkViewModel
    /* renamed from: G */
    public final StateFlow getD() {
        return this.f8642a;
    }

    @Override // au.com.woolworths.foundation.rewards.onboarding.ui.OnboardingCoachMarkViewModel
    /* renamed from: H, reason: from getter */
    public final OnboardingCoachMarkContract.Listener getB() {
        return this.b;
    }
}
