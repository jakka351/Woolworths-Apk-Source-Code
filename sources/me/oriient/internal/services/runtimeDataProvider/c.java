package me.oriient.internal.services.runtimeDataProvider;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.internal.infra.utils.android.appState.AppState;

/* loaded from: classes7.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25548a;
    public final /* synthetic */ RuntimeDataManagerImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RuntimeDataManagerImpl runtimeDataManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.b = runtimeDataManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new c(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25548a;
        if (i == 0) {
            ResultKt.b(obj);
            StateFlow<AppState> appState = this.b.getAppStateProvider().getAppState();
            b bVar = new b(this.b);
            this.f25548a = 1;
            if (appState.collect(bVar, this) == coroutineSingletons) {
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
