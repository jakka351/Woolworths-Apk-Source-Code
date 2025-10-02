package au.com.woolworths.feature.rewards.everydayextras.signup;

import au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpInteractor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpInteractor$Event;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpInteractor$events$1", f = "EverydayExtrasSignUpInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EverydayExtrasSignUpInteractor$events$1 extends SuspendLambda implements Function2<EverydayExtrasSignUpInteractor.Event, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ EverydayExtrasSignUpInteractor q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EverydayExtrasSignUpInteractor$events$1(EverydayExtrasSignUpInteractor everydayExtrasSignUpInteractor, Continuation continuation) {
        super(2, continuation);
        this.q = everydayExtrasSignUpInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        EverydayExtrasSignUpInteractor$events$1 everydayExtrasSignUpInteractor$events$1 = new EverydayExtrasSignUpInteractor$events$1(this.q, continuation);
        everydayExtrasSignUpInteractor$events$1.p = obj;
        return everydayExtrasSignUpInteractor$events$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        EverydayExtrasSignUpInteractor$events$1 everydayExtrasSignUpInteractor$events$1 = (EverydayExtrasSignUpInteractor$events$1) create((EverydayExtrasSignUpInteractor.Event) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        everydayExtrasSignUpInteractor$events$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.q.f5935a = ((EverydayExtrasSignUpInteractor.Event) this.p) instanceof EverydayExtrasSignUpInteractor.Event.NavigateToOnBoarding;
        return Unit.f24250a;
    }
}
