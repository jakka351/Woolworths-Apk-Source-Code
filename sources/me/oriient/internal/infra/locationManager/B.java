package me.oriient.internal.infra.locationManager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.internal.services.config.InternalConfig;

/* loaded from: classes7.dex */
public final class B extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f24931a;
    public final /* synthetic */ ProxyLocationManager b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(ProxyLocationManager proxyLocationManager, Continuation continuation) {
        super(2, continuation);
        this.b = proxyLocationManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new B(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new B(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f24931a;
        Unit unit = Unit.f24250a;
        if (i == 0) {
            ResultKt.b(obj);
            StateFlow<InternalConfig> config = this.b.getConfig().getConfig();
            ProxyLocationManager proxyLocationManager = this.b;
            y yVar = new y(proxyLocationManager);
            this.f24931a = 1;
            Object objCollect = config.collect(new A(yVar, proxyLocationManager), this);
            if (objCollect != coroutineSingletons) {
                objCollect = unit;
            }
            if (objCollect == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return unit;
    }
}
