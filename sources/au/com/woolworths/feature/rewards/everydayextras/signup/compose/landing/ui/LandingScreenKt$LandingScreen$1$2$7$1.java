package au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui;

import au.com.woolworths.analytics.rewards.everydayextrasignup.EdxLandingAnalytics;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.EverydayExtraLandingContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.EverydayExtraLandingViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.LandingScreenKt$LandingScreen$1$2$7$1", f = "LandingScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class LandingScreenKt$LandingScreen$1$2$7$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ EverydayExtraLandingViewModel p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LandingScreenKt$LandingScreen$1$2$7$1(EverydayExtraLandingViewModel everydayExtraLandingViewModel, Continuation continuation) {
        super(2, continuation);
        this.p = everydayExtraLandingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LandingScreenKt$LandingScreen$1$2$7$1(this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        LandingScreenKt$LandingScreen$1$2$7$1 landingScreenKt$LandingScreen$1$2$7$1 = (LandingScreenKt$LandingScreen$1$2$7$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        landingScreenKt$LandingScreen$1$2$7$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        EverydayExtraLandingViewModel everydayExtraLandingViewModel = this.p;
        EverydayExtraLandingContract.ViewState.Content contentB = ((EverydayExtraLandingContract.ViewState) everydayExtraLandingViewModel.j.getValue()).b();
        if ((contentB != null ? contentB.f6093a : null) != null && !everydayExtraLandingViewModel.e.f5935a) {
            everydayExtraLandingViewModel.h.f(EdxLandingAnalytics.Landing.d);
        }
        return Unit.f24250a;
    }
}
