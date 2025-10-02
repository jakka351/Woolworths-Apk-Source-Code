package me.oriient.internal.services.eventManager;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final class v extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25472a;
    public final /* synthetic */ w b;
    public final /* synthetic */ me.oriient.internal.services.eventManager.model.c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, me.oriient.internal.services.eventManager.model.c cVar, Continuation continuation) {
        super(2, continuation);
        this.b = wVar;
        this.c = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new v(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new v(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (kotlinx.coroutines.BuildersKt.f(r7, r1, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.f25472a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r7)
            goto L4b
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            kotlin.ResultKt.b(r7)
            goto L30
        L1c:
            kotlin.ResultKt.b(r7)
            me.oriient.internal.services.eventManager.w r7 = r6.b
            me.oriient.internal.services.eventManager.model.EventManagerConfig r7 = r7.b
            long r4 = r7.getTimeoutMillis()
            r6.f25472a = r3
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.b(r4, r6)
            if (r7 != r0) goto L30
            goto L4a
        L30:
            me.oriient.internal.services.eventManager.w r7 = r6.b
            kotlinx.coroutines.CoroutineScope r7 = r7.j
            kotlin.coroutines.CoroutineContext r7 = r7.getE()
            me.oriient.internal.services.eventManager.u r1 = new me.oriient.internal.services.eventManager.u
            me.oriient.internal.services.eventManager.w r3 = r6.b
            me.oriient.internal.services.eventManager.model.c r4 = r6.c
            r5 = 0
            r1.<init>(r3, r4, r5)
            r6.f25472a = r2
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.f(r7, r1, r6)
            if (r7 != r0) goto L4b
        L4a:
            return r0
        L4b:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.eventManager.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
