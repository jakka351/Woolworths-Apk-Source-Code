package me.oriient.internal.services.dataPriorityLoader;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes7.dex */
public final class b implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataPriorityLoaderImpl f25425a;

    public b(DataPriorityLoaderImpl dataPriorityLoaderImpl) {
        this.f25425a = dataPriorityLoaderImpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof me.oriient.internal.services.dataPriorityLoader.a
            if (r0 == 0) goto L13
            r0 = r7
            me.oriient.internal.services.dataPriorityLoader.a r0 = (me.oriient.internal.services.dataPriorityLoader.a) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            me.oriient.internal.services.dataPriorityLoader.a r0 = new me.oriient.internal.services.dataPriorityLoader.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r6 = r0.c
            java.util.Iterator r2 = r0.b
            me.oriient.internal.services.dataPriorityLoader.b r4 = r0.f25424a
            kotlin.ResultKt.b(r7)
            goto L48
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.b(r7)
            me.oriient.internal.services.dataPriorityLoader.DataPriorityLoaderImpl r7 = r5.f25425a
            me.oriient.internal.services.dataPriorityLoader.DataPriorityLoaderImpl.access$setShouldCancelAll$p(r7, r3)
            me.oriient.internal.services.dataPriorityLoader.DataPriorityLoaderImpl r7 = r5.f25425a
            java.util.List r7 = me.oriient.internal.services.dataPriorityLoader.DataPriorityLoaderImpl.access$getJobs$p(r7)
            java.util.Iterator r2 = r7.iterator()
            r4 = r5
        L48:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L63
            java.lang.Object r7 = r2.next()
            kotlinx.coroutines.Job r7 = (kotlinx.coroutines.Job) r7
            r0.f25424a = r4
            r0.b = r2
            r0.c = r6
            r0.f = r3
            java.lang.Object r7 = kotlinx.coroutines.JobKt.c(r7, r0)
            if (r7 != r1) goto L48
            return r1
        L63:
            me.oriient.internal.services.dataPriorityLoader.DataPriorityLoaderImpl r7 = r4.f25425a
            java.util.List r7 = me.oriient.internal.services.dataPriorityLoader.DataPriorityLoaderImpl.access$getJobs$p(r7)
            r7.clear()
            me.oriient.internal.services.dataPriorityLoader.DataPriorityLoaderImpl r7 = r4.f25425a
            r0 = 0
            me.oriient.internal.services.dataPriorityLoader.DataPriorityLoaderImpl.access$setShouldCancelAll$p(r7, r0)
            me.oriient.internal.services.dataPriorityLoader.DataPriorityLoaderImpl r7 = r4.f25425a
            me.oriient.internal.services.dataPriorityLoader.DataPriorityLoaderImpl.access$setupJobs(r7, r6)
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataPriorityLoader.b.a(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return a(((Number) obj).intValue(), continuation);
    }
}
