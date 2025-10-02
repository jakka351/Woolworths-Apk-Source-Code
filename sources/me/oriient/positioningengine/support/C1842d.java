package me.oriient.positioningengine.support;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.elog.Metric;
import me.oriient.positioningengine.ondevice.models.OnDeviceEngineSession;

/* renamed from: me.oriient.positioningengine.support.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1842d extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f26520a;
    public final /* synthetic */ C1846f b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1842d(C1846f c1846f, String str, long j, Continuation continuation) {
        super(1, continuation);
        this.b = c1846f;
        this.c = str;
        this.d = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C1842d(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1842d) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26520a;
        if (i == 0) {
            ResultKt.b(obj);
            InterfaceC1847g interfaceC1847g = (InterfaceC1847g) this.b.f.getD();
            String str = this.c;
            this.f26520a = 1;
            obj = ((C1852l) interfaceC1847g).a(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        Outcome outcome = (Outcome) obj;
        C1846f c1846f = this.b;
        long j = this.d;
        if (outcome instanceof Outcome.Success) {
            c1846f.h = (OnDeviceEngineSession) ((Outcome.Success) outcome).getValue();
            ((Metric) c1846f.g.getD()).i("OnDeviceEngineSessionRepository", "loginTimeEngineSessionId", ((TimeProvider) c1846f.c.getD()).timeIntervalSinceNowInSeconds(j));
        }
        return outcome;
    }
}
