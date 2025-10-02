package au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui;

import au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.EverydayExtraOnboardingContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.EverydayExtraOnboardingViewModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.OnboardingScreenKt$OnboardingScreen$1$1", f = "OnboardingScreen.kt", l = {78}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class OnboardingScreenKt$OnboardingScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ EverydayExtraOnboardingViewModel q;
    public final /* synthetic */ Function0 r;
    public final /* synthetic */ Function1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingScreenKt$OnboardingScreen$1$1(EverydayExtraOnboardingViewModel everydayExtraOnboardingViewModel, Function0 function0, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.q = everydayExtraOnboardingViewModel;
        this.r = function0;
        this.s = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnboardingScreenKt$OnboardingScreen$1$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingScreenKt$OnboardingScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flow = this.q.i;
            final Function0 function0 = this.r;
            final Function1 function1 = this.s;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.OnboardingScreenKt$OnboardingScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    EverydayExtraOnboardingContract.Action action = (EverydayExtraOnboardingContract.Action) obj2;
                    boolean z = action instanceof EverydayExtraOnboardingContract.Action.GetStarted;
                    Function0 function02 = function0;
                    if (z) {
                        function02.invoke();
                    } else if (action instanceof EverydayExtraOnboardingContract.Action.OpenUrl) {
                        function1.invoke(((EverydayExtraOnboardingContract.Action.OpenUrl) action).f6111a);
                    } else {
                        if (!(action instanceof EverydayExtraOnboardingContract.Action.Cancel)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        function02.invoke();
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (flow.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
