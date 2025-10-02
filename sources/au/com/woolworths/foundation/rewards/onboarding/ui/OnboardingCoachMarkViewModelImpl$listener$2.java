package au.com.woolworths.foundation.rewards.onboarding.ui;

import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkContent;
import au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class OnboardingCoachMarkViewModelImpl$listener$2 extends FunctionReferenceImpl implements Function2<String, ContentCta, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ProgressiveCoachMarkContent progressiveCoachMarkContent;
        String str;
        String p0 = (String) obj;
        ContentCta p1 = (ContentCta) obj2;
        Intrinsics.h(p0, "p0");
        Intrinsics.h(p1, "p1");
        ProgressiveCoachMarkManager progressiveCoachMarkManager = ((OnboardingCoachMarkViewModelImpl) this.receiver).f8641a.e;
        progressiveCoachMarkManager.getClass();
        progressiveCoachMarkManager.l.f(new ProgressiveCoachMarkManager.Action.CtaClicked(p0, p1));
        if (progressiveCoachMarkManager.e.k && (progressiveCoachMarkContent = (ProgressiveCoachMarkContent) progressiveCoachMarkManager.j.getValue()) != null && (str = progressiveCoachMarkContent.h) != null) {
            progressiveCoachMarkManager.n.f(str);
        }
        return Unit.f24250a;
    }
}
