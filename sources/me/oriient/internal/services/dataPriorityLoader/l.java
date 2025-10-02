package me.oriient.internal.services.dataPriorityLoader;

import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes7.dex */
public final class l implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f25435a;

    public l(FlowCollector flowCollector) {
        this.f25435a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof me.oriient.internal.services.dataPriorityLoader.k
            if (r0 == 0) goto L13
            r0 = r6
            me.oriient.internal.services.dataPriorityLoader.k r0 = (me.oriient.internal.services.dataPriorityLoader.k) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            me.oriient.internal.services.dataPriorityLoader.k r0 = new me.oriient.internal.services.dataPriorityLoader.k
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f25434a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L4c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r6)
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f25435a
            me.oriient.internal.services.config.InternalConfig r5 = (me.oriient.internal.services.config.InternalConfig) r5
            me.oriient.internal.services.config.CommonDataRepositoryConfig r5 = r5.getCommonDataRepositoryConfig()
            int r5 = r5.getMaxConcurrentDownloadTasks()
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r5)
            r0.b = r3
            java.lang.Object r5 = r6.emit(r2, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataPriorityLoader.l.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
