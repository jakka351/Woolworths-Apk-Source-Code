package me.oriient.ipssdk.realtime.ofs;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.SharedFlow;
import me.oriient.ipssdk.realtime.ips.Navigation;
import me.oriient.navigation.common.util.NavigationError;

/* loaded from: classes8.dex */
public final class L2 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25969a;

    public L2(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new L2(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new L2((Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25969a;
        if (i == 0) {
            ResultKt.b(obj);
            SharedFlow<NavigationError> liveNavigationErrors = Navigation.access$getNavigationManager(Navigation.INSTANCE).getLiveNavigationErrors();
            K2 k2 = K2.f25965a;
            this.f25969a = 1;
            if (liveNavigationErrors.collect(k2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
