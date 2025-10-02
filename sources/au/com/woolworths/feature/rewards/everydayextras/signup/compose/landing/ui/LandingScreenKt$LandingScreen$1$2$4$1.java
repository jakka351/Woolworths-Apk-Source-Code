package au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui;

import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.EverydayExtraLandingViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasLandingFooterItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class LandingScreenKt$LandingScreen$1$2$4$1 extends FunctionReferenceImpl implements Function1<EverydayExtrasLandingFooterItem.Button, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        EverydayExtrasLandingFooterItem.Button p0 = (EverydayExtrasLandingFooterItem.Button) obj;
        Intrinsics.h(p0, "p0");
        ((EverydayExtraLandingViewModel) this.receiver).s6(p0);
        return Unit.f24250a;
    }
}
