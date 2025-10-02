package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager;
import me.oriient.positioningengine.common.PositioningEngine;

/* loaded from: classes8.dex */
public final class T0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26010a;
    public final /* synthetic */ PositioningEngine b;
    public final /* synthetic */ RemoteConfigManager c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(PositioningEngine positioningEngine, RemoteConfigManager remoteConfigManager, Continuation continuation) {
        super(2, continuation);
        this.b = positioningEngine;
        this.c = remoteConfigManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new T0(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new T0(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26010a;
        if (i == 0) {
            ResultKt.b(obj);
            FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1I = FlowKt.i(this.b.getPositioningUpdates(), this.b.getState(), this.c.getConfig(), new me.oriient.ipssdk.realtime.ips.f(null));
            this.f26010a = 1;
            if (FlowKt.g(flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1I, this) == coroutineSingletons) {
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
