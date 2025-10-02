package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.ipssdk.realtime.ips.automatic.AutomaticSessionStopperImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1672k extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26096a;
    public final /* synthetic */ AutomaticSessionStopperImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1672k(AutomaticSessionStopperImpl automaticSessionStopperImpl, Continuation continuation) {
        super(2, continuation);
        this.b = automaticSessionStopperImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1672k(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1672k(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26096a;
        if (i == 0) {
            ResultKt.b(obj);
            AutomaticSessionStopperImpl automaticSessionStopperImpl = this.b;
            this.f26096a = 1;
            if (AutomaticSessionStopperImpl.access$observeGeofence(automaticSessionStopperImpl, this) == coroutineSingletons) {
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
