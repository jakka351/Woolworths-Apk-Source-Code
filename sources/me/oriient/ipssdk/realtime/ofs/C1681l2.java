package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.ipssdk.realtime.ips.automatic.GeofencePositioningAutoStarterImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.l2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1681l2 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GeofencePositioningAutoStarterImpl f26105a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1681l2(GeofencePositioningAutoStarterImpl geofencePositioningAutoStarterImpl, int i, Continuation continuation) {
        super(2, continuation);
        this.f26105a = geofencePositioningAutoStarterImpl;
        this.b = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1681l2(this.f26105a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1681l2(this.f26105a, this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.f26105a.i.setValue(new Integer(this.b));
        return Unit.f24250a;
    }
}
