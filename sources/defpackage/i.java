package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class i extends SuspendLambda implements Function2 {
    public int p;
    public final /* synthetic */ RemoteLogImpl q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(RemoteLogImpl remoteLogImpl, Continuation continuation) {
        super(2, continuation);
        this.q = remoteLogImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new i(this.q, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
    
        if (r4.trySendingBatchInternal(r9) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r9.p
            r2 = 2
            r3 = 1
            RemoteLogImpl r4 = r9.q
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.b(r10)
            goto L6e
        L12:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1a:
            kotlin.ResultKt.b(r10)
            goto L65
        L1e:
            kotlin.ResultKt.b(r10)
            me.oriient.internal.services.remoteLog.models.b r10 = defpackage.RemoteLogImpl.access$getBatchData$p(r4)
            long r5 = r10.d
            long r7 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r7
            me.oriient.internal.infra.utils.core.Logger r10 = defpackage.RemoteLogImpl.access$getLogger(r4)
            if (r10 == 0) goto L5c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r7 = "scheduling batch "
            r1.<init>(r7)
            me.oriient.internal.services.remoteLog.models.b r7 = defpackage.RemoteLogImpl.access$getBatchData$p(r4)
            java.lang.String r7 = r7.f25540a
            java.lang.String r7 = me.oriient.internal.services.remoteLog.models.c.a(r7)
            r1.append(r7)
            java.lang.String r7 = " to be sent in "
            r1.append(r7)
            r1.append(r5)
            java.lang.String r7 = " millis"
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.String r7 = "RemoteLog"
            r10.d(r7, r1)
        L5c:
            r9.p = r3
            java.lang.Object r10 = kotlinx.coroutines.DelayKt.b(r5, r9)
            if (r10 != r0) goto L65
            goto L6d
        L65:
            r9.p = r2
            java.lang.Object r10 = defpackage.RemoteLogImpl.access$trySendingBatchInternal(r4, r9)
            if (r10 != r0) goto L6e
        L6d:
            return r0
        L6e:
            kotlin.Unit r10 = kotlin.Unit.f24250a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
