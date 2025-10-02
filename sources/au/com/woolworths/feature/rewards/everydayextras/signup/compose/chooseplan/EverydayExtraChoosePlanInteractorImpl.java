package au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.SignUpQueryParamsManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/chooseplan/EverydayExtraChoosePlanInteractorImpl;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/chooseplan/EverydayExtraChoosePlanInteractor;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EverydayExtraChoosePlanInteractorImpl implements EverydayExtraChoosePlanInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final EverydayExtraChoosePlanRepository f6072a;
    public final SignUpQueryParamsManager b;

    public EverydayExtraChoosePlanInteractorImpl(EverydayExtraChoosePlanRepository everydayExtraChoosePlanRepository, SignUpQueryParamsManager signUpQueryParamsManager) {
        Intrinsics.h(signUpQueryParamsManager, "signUpQueryParamsManager");
        this.f6072a = everydayExtraChoosePlanRepository;
        this.b = signUpQueryParamsManager;
    }
}
