package me.oriient.internal.services.geofence;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;

/* loaded from: classes7.dex */
public final class v extends SuspendLambda implements Function4 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f25521a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;

    public v(Continuation continuation) {
        super(4, continuation);
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        v vVar = new v((Continuation) obj4);
        vVar.f25521a = zBooleanValue;
        vVar.b = zBooleanValue2;
        vVar.c = zBooleanValue3;
        return vVar.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        return Boolean.valueOf(this.f25521a || this.b || this.c);
    }
}
