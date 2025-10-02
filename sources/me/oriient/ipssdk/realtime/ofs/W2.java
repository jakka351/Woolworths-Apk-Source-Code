package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.ipssdk.realtime.ips.calibration.PeriodicAutomaticCalibratorImpl;

/* loaded from: classes8.dex */
public final class W2 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26026a;
    public final /* synthetic */ PeriodicAutomaticCalibratorImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W2(PeriodicAutomaticCalibratorImpl periodicAutomaticCalibratorImpl, Continuation continuation) {
        super(2, continuation);
        this.b = periodicAutomaticCalibratorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        W2 w2 = new W2(this.b, continuation);
        w2.f26026a = obj;
        return w2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        W2 w2 = new W2(this.b, (Continuation) obj2);
        w2.f26026a = (CoroutineScope) obj;
        return w2.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        return BuildersKt.c((CoroutineScope) this.f26026a, null, null, new V2(this.b, null), 3);
    }
}
