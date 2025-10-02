package au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui;

import au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.EverydayExtraOnboardingViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtrasSubscribeFooterItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class OnboardingScreenKt$OnboardingScreen$3$2$2$1 extends FunctionReferenceImpl implements Function1<EverydayExtrasSubscribeFooterItem, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        EverydayExtrasSubscribeFooterItem p0 = (EverydayExtrasSubscribeFooterItem) obj;
        Intrinsics.h(p0, "p0");
        ((EverydayExtraOnboardingViewModel) this.receiver).p6(p0);
        return Unit.f24250a;
    }
}
