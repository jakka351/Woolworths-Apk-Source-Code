package me.oriient.internal.services.sensorsManager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: me.oriient.internal.services.sensorsManager.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1491e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25571a;
    public final /* synthetic */ ForegroundServiceMonitorImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1491e(ForegroundServiceMonitorImpl foregroundServiceMonitorImpl, Continuation continuation) {
        super(2, continuation);
        this.b = foregroundServiceMonitorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1491e(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1491e(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25571a;
        if (i == 0) {
            ResultKt.b(obj);
            ForegroundServiceMonitorImpl foregroundServiceMonitorImpl = this.b;
            this.f25571a = 1;
            if (foregroundServiceMonitorImpl.backgroundPollingTask(this) == coroutineSingletons) {
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
