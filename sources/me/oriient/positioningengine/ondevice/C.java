package me.oriient.positioningengine.ondevice;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.positioningengine.common.PositioningContext;

/* loaded from: classes8.dex */
public final class C extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26395a;
    public final /* synthetic */ I b;
    public final /* synthetic */ PositioningContext c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(I i, PositioningContext positioningContext, Continuation continuation) {
        super(2, continuation);
        this.b = i;
        this.c = positioningContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d8, code lost:
    
        if (r10 == r0) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af A[PHI: r10
  0x00af: PHI (r10v35 java.lang.Object) = (r10v33 java.lang.Object), (r10v0 java.lang.Object) binds: [B:27:0x00ab, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0134 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0135 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.ondevice.C.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
