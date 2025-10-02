package au.com.woolworths.feature.rewards.account.authentication.ui;

import androidx.compose.runtime.MutableState;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationContractNew;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.authentication.ui.RewardsSignUpScreenKt$RewardsSignUpScreen$1$1", f = "RewardsSignUpScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RewardsSignUpScreenKt$RewardsSignUpScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;
    public final /* synthetic */ MutableState r;
    public final /* synthetic */ MutableState s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsSignUpScreenKt$RewardsSignUpScreen$1$1(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, Continuation continuation) {
        super(2, continuation);
        this.p = mutableState;
        this.q = mutableState2;
        this.r = mutableState3;
        this.s = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsSignUpScreenKt$RewardsSignUpScreen$1$1(this.p, this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        RewardsSignUpScreenKt$RewardsSignUpScreen$1$1 rewardsSignUpScreenKt$RewardsSignUpScreen$1$1 = (RewardsSignUpScreenKt$RewardsSignUpScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        rewardsSignUpScreenKt$RewardsSignUpScreen$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        MutableState mutableState = this.p;
        if (((RewardsAuthenticationContractNew.ViewState) mutableState.getD()) instanceof RewardsAuthenticationContractNew.ViewState.Signup) {
            RewardsAuthenticationContractNew.ViewState viewState = (RewardsAuthenticationContractNew.ViewState) mutableState.getD();
            Intrinsics.f(viewState, "null cannot be cast to non-null type au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationContractNew.ViewState.Signup");
            this.q.setValue(((RewardsAuthenticationContractNew.ViewState.Signup) viewState).f5662a);
            RewardsAuthenticationContractNew.ViewState viewState2 = (RewardsAuthenticationContractNew.ViewState) mutableState.getD();
            Intrinsics.f(viewState2, "null cannot be cast to non-null type au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationContractNew.ViewState.Signup");
            this.r.setValue(((RewardsAuthenticationContractNew.ViewState.Signup) viewState2).b);
            RewardsAuthenticationContractNew.ViewState viewState3 = (RewardsAuthenticationContractNew.ViewState) mutableState.getD();
            Intrinsics.f(viewState3, "null cannot be cast to non-null type au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationContractNew.ViewState.Signup");
            this.s.setValue(((RewardsAuthenticationContractNew.ViewState.Signup) viewState3).c);
        }
        return Unit.f24250a;
    }
}
