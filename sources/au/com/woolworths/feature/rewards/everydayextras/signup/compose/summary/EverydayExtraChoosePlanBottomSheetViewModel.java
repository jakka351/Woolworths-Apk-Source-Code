package au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpInteractor;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanInteractorImpl;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanViewModel;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessageInteractorImpl;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraChoosePlanBottomSheetViewModel;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/chooseplan/EverydayExtraChoosePlanViewModel;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EverydayExtraChoosePlanBottomSheetViewModel extends EverydayExtraChoosePlanViewModel {
    public final EverydayExtraChoosePlanInteractorImpl m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EverydayExtraChoosePlanBottomSheetViewModel(EverydayExtrasSignUpInteractor signUpInteractor, EverydayExtraChoosePlanInteractorImpl everydayExtraChoosePlanInteractorImpl, RewardsServiceMessageInteractorImpl rewardsServiceMessageInteractorImpl, AnalyticsManager analyticsManager) {
        super(signUpInteractor, everydayExtraChoosePlanInteractorImpl, rewardsServiceMessageInteractorImpl, analyticsManager);
        Intrinsics.h(signUpInteractor, "signUpInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.m = everydayExtraChoosePlanInteractorImpl;
    }

    @Override // au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanViewModel
    public final void p6() {
        q6(new EverydayExtraChoosePlanBottomSheetViewModel$fetchChoosePlanFeed$1(this, null));
    }
}
