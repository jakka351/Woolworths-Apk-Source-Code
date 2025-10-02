package au.com.woolworths.foundation.rewards.onboarding.ui;

import au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkContent;
import au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class OnboardingCoachMarkViewModelImpl$listener$3 extends FunctionReferenceImpl implements Function1<ProgressiveCoachMarkContent, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ProgressiveCoachMarkContent p0 = (ProgressiveCoachMarkContent) obj;
        Intrinsics.h(p0, "p0");
        ProgressiveCoachMarkManager progressiveCoachMarkManager = ((OnboardingCoachMarkViewModelImpl) this.receiver).f8641a.e;
        progressiveCoachMarkManager.getClass();
        progressiveCoachMarkManager.j.setValue(p0);
        return Unit.f24250a;
    }
}
