package au.com.woolworths.feature.rewards.everydayextras.signup;

import au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpInteractor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpViewModel$handleSignUpInteractorEvent$3", f = "EverydayExtrasSignUpViewModel.kt", l = {73}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EverydayExtrasSignUpViewModel$handleSignUpInteractorEvent$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ EverydayExtrasSignUpViewModel q;
    public final /* synthetic */ EverydayExtrasSignUpInteractor.Event r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EverydayExtrasSignUpViewModel$handleSignUpInteractorEvent$3(EverydayExtrasSignUpViewModel everydayExtrasSignUpViewModel, EverydayExtrasSignUpInteractor.Event event, Continuation continuation) {
        super(2, continuation);
        this.q = everydayExtrasSignUpViewModel;
        this.r = event;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EverydayExtrasSignUpViewModel$handleSignUpInteractorEvent$3(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EverydayExtrasSignUpViewModel$handleSignUpInteractorEvent$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            BufferedChannel bufferedChannel = this.q.g;
            EverydayExtrasSignUpContract.Action.NavigateToOnBoarding navigateToOnBoarding = new EverydayExtrasSignUpContract.Action.NavigateToOnBoarding(((EverydayExtrasSignUpInteractor.Event.NavigateToOnBoarding) this.r).f5937a);
            this.p = 1;
            if (bufferedChannel.z(navigateToOnBoarding, this) == coroutineSingletons) {
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
