package me.oriient.positioningengine.support;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.SharedFlow;
import me.oriient.internal.services.systemStateManager.SystemStateUpdate;

/* loaded from: classes8.dex */
public final class E extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26499a;
    public final /* synthetic */ OnDeviceSessionsUploadManagerImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(OnDeviceSessionsUploadManagerImpl onDeviceSessionsUploadManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.b = onDeviceSessionsUploadManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new E(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new E(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26499a;
        if (i == 0) {
            ResultKt.b(obj);
            SharedFlow<SystemStateUpdate> systemStateUpdate = this.b.getSystemStateProvider().getSystemStateUpdate();
            D d = new D(this.b);
            this.f26499a = 1;
            if (systemStateUpdate.collect(d, this) == coroutineSingletons) {
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
