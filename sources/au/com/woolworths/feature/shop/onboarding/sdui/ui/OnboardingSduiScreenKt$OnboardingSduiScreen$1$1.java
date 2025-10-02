package au.com.woolworths.feature.shop.onboarding.sdui.ui;

import au.com.woolworths.feature.shop.onboarding.sdui.OnboardingSduiContract;
import au.com.woolworths.feature.shop.onboarding.sdui.OnboardingSduiViewModel;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.onboarding.sdui.ui.OnboardingSduiScreenKt$OnboardingSduiScreen$1$1", f = "OnboardingSduiScreen.kt", l = {78}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class OnboardingSduiScreenKt$OnboardingSduiScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ OnboardingSduiViewModel q;
    public final /* synthetic */ Function1 r;
    public final /* synthetic */ Function0 s;
    public final /* synthetic */ Function0 t;
    public final /* synthetic */ Function1 u;
    public final /* synthetic */ Function0 v;
    public final /* synthetic */ Function0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingSduiScreenKt$OnboardingSduiScreen$1$1(OnboardingSduiViewModel onboardingSduiViewModel, Function1 function1, Function0 function0, Function0 function02, Function1 function12, Function0 function03, Function0 function04, Continuation continuation) {
        super(2, continuation);
        this.q = onboardingSduiViewModel;
        this.r = function1;
        this.s = function0;
        this.t = function02;
        this.u = function12;
        this.v = function03;
        this.w = function04;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnboardingSduiScreenKt$OnboardingSduiScreen$1$1(this.q, this.r, this.s, this.t, this.u, this.v, this.w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingSduiScreenKt$OnboardingSduiScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flow = this.q.j;
            final Function0 function0 = this.v;
            final Function0 function02 = this.w;
            final Function1 function1 = this.r;
            final Function0 function03 = this.s;
            final Function0 function04 = this.t;
            final Function1 function12 = this.u;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.onboarding.sdui.ui.OnboardingSduiScreenKt$OnboardingSduiScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    OnboardingSduiContract.NavigationAction navigationAction = (OnboardingSduiContract.NavigationAction) obj2;
                    if (navigationAction instanceof OnboardingSduiContract.NavigationAction.ContinueAsGuest) {
                        function1.invoke(navigationAction);
                    } else if (Intrinsics.c(navigationAction, OnboardingSduiContract.NavigationAction.LaunchLogin.f7965a)) {
                        function03.invoke();
                    } else if (Intrinsics.c(navigationAction, OnboardingSduiContract.NavigationAction.LaunchSignup.f7966a)) {
                        function04.invoke();
                    } else if (navigationAction instanceof OnboardingSduiContract.NavigationAction.NavigateToBranchLink) {
                        function12.invoke(navigationAction);
                    } else if (Intrinsics.c(navigationAction, OnboardingSduiContract.NavigationAction.NavigateToCollectionMode.f7968a)) {
                        function0.invoke();
                    } else {
                        if (!Intrinsics.c(navigationAction, OnboardingSduiContract.NavigationAction.NavigateToHomePage.f7969a)) {
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
