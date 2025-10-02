package me.oriient.ipssdk.realtime.ofs;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableStateFlow;
import me.oriient.ipssdk.realtime.ips.automatic.ChargingBasedPositioningControllerImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1725t extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26147a;
    public final /* synthetic */ ChargingBasedPositioningControllerImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1725t(ChargingBasedPositioningControllerImpl chargingBasedPositioningControllerImpl, Continuation continuation) {
        super(2, continuation);
        this.b = chargingBasedPositioningControllerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1725t(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1725t(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26147a;
        if (i == 0) {
            ResultKt.b(obj);
            MutableStateFlow mutableStateFlow = this.b.j;
            C1719s c1719s = new C1719s(this.b);
            this.f26147a = 1;
            if (mutableStateFlow.collect(c1719s, this) == coroutineSingletons) {
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
