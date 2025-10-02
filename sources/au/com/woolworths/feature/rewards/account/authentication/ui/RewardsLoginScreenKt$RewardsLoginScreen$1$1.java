package au.com.woolworths.feature.rewards.account.authentication.ui;

import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationContractNew;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationViewModelNew;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.authentication.ui.RewardsLoginScreenKt$RewardsLoginScreen$1$1", f = "RewardsLoginScreen.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RewardsLoginScreenKt$RewardsLoginScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RewardsAuthenticationViewModelNew q;
    public final /* synthetic */ Function0 r;
    public final /* synthetic */ Function3 s;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsLoginScreenKt$RewardsLoginScreen$1$1(RewardsAuthenticationViewModelNew rewardsAuthenticationViewModelNew, Function0 function0, Function3 function3, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.q = rewardsAuthenticationViewModelNew;
        this.r = function0;
        this.s = function3;
        this.t = function02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsLoginScreenKt$RewardsLoginScreen$1$1(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsLoginScreenKt$RewardsLoginScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flow = this.q.k;
            final Function3 function3 = this.s;
            final Function0 function0 = this.t;
            final Function0 function02 = this.r;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.rewards.account.authentication.ui.RewardsLoginScreenKt$RewardsLoginScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    RewardsAuthenticationContractNew.Action action = (RewardsAuthenticationContractNew.Action) obj2;
                    if (action instanceof RewardsAuthenticationContractNew.Action.LaunchHomepage) {
                        function02.invoke();
                    } else if (action instanceof RewardsAuthenticationContractNew.Action.LaunchAuth0Form) {
                        RewardsAuthenticationContractNew.Action.LaunchAuth0Form launchAuth0Form = (RewardsAuthenticationContractNew.Action.LaunchAuth0Form) action;
                        function3.invoke(Boolean.valueOf(launchAuth0Form.f5656a), launchAuth0Form.b, null);
                    } else {
                        if (!Intrinsics.c(action, RewardsAuthenticationContractNew.Action.LaunchContactUs.f5657a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        function0.invoke();
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
