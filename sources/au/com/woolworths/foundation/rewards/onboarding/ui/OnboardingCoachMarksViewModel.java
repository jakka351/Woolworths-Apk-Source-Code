package au.com.woolworths.foundation.rewards.onboarding.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/onboarding/ui/OnboardingCoachMarksViewModel;", "Landroidx/lifecycle/ViewModel;", "onboarding-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OnboardingCoachMarksViewModel extends ViewModel {
    public final ProgressiveCoachMarkManager e;

    public OnboardingCoachMarksViewModel(ProgressiveCoachMarkManager onboardingManager) {
        Intrinsics.h(onboardingManager, "onboardingManager");
        this.e = onboardingManager;
    }
}
