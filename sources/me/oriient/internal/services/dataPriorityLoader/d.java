package me.oriient.internal.services.dataPriorityLoader;

import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes7.dex */
public final class d implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f25427a;
    public final /* synthetic */ DataPriorityLoaderImpl b;

    public d(FlowCollector flowCollector, DataPriorityLoaderImpl dataPriorityLoaderImpl) {
        this.f25427a = flowCollector;
        this.b = dataPriorityLoaderImpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof me.oriient.internal.services.dataPriorityLoader.c
            if (r0 == 0) goto L13
            r0 = r7
            me.oriient.internal.services.dataPriorityLoader.c r0 = (me.oriient.internal.services.dataPriorityLoader.c) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            me.oriient.internal.services.dataPriorityLoader.c r0 = new me.oriient.internal.services.dataPriorityLoader.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f25426a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r7)
            goto L50
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            kotlin.ResultKt.b(r7)
            kotlinx.coroutines.flow.FlowCollector r7 = r5.f25427a
            r2 = r6
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            me.oriient.internal.services.dataPriorityLoader.DataPriorityLoaderImpl r4 = r5.b
            java.util.List r4 = me.oriient.internal.services.dataPriorityLoader.DataPriorityLoaderImpl.access$getJobs$p(r4)
            int r4 = r4.size()
            if (r2 == r4) goto L50
            r0.b = r3
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataPriorityLoader.d.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
