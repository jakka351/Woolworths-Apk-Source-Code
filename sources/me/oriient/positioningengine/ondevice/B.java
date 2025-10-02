package me.oriient.positioningengine.ondevice;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.positioningengine.common.CalibrationContext;

/* loaded from: classes8.dex */
public final class B extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26394a;
    public final /* synthetic */ I b;
    public final /* synthetic */ CalibrationContext c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(I i, CalibrationContext calibrationContext, Continuation continuation) {
        super(2, continuation);
        this.b = i;
        this.c = calibrationContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new B(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new B(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0183, code lost:
    
        if (r2 != r1) goto L37;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.ondevice.B.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
