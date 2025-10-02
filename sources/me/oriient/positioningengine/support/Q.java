package me.oriient.positioningengine.support;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final class Q extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26511a;
    public final /* synthetic */ OnDeviceSessionsUploadManagerImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(OnDeviceSessionsUploadManagerImpl onDeviceSessionsUploadManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.b = onDeviceSessionsUploadManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Q(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Q(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r7.updateMetadata(r6) == r0) goto L15;
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
            int r1 = r6.f26511a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r7)
            goto L39
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            kotlin.ResultKt.b(r7)
            goto L2e
        L1c:
            kotlin.ResultKt.b(r7)
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r7 = r6.b
            long r4 = me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl.access$getUpdateMetadataIntervalMillis$p(r7)
            r6.f26511a = r3
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.b(r4, r6)
            if (r7 != r0) goto L2e
            goto L38
        L2e:
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r7 = r6.b
            r6.f26511a = r2
            java.lang.Object r7 = me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl.access$updateMetadata(r7, r6)
            if (r7 != r0) goto L39
        L38:
            return r0
        L39:
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r7 = r6.b
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl.access$startMetadataUpdateTask(r7)
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.support.Q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
