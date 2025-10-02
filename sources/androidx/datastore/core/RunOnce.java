package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/datastore/core/RunOnce;", "", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class RunOnce {

    /* renamed from: a, reason: collision with root package name */
    public final MutexImpl f2569a = MutexKt.a();
    public final CompletableDeferred b = CompletableDeferredKt.a();

    public abstract Object a(ContinuationImpl continuationImpl);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.datastore.core.RunOnce$runIfNeeded$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.datastore.core.RunOnce$runIfNeeded$1 r0 = (androidx.datastore.core.RunOnce$runIfNeeded$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            androidx.datastore.core.RunOnce$runIfNeeded$1 r0 = new androidx.datastore.core.RunOnce$runIfNeeded$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 2
            r4 = 1
            kotlin.Unit r5 = kotlin.Unit.f24250a
            r6 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            kotlinx.coroutines.sync.Mutex r1 = r0.q
            androidx.datastore.core.RunOnce r0 = r0.p
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L31
            goto L7f
        L31:
            r8 = move-exception
            goto L8b
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            kotlinx.coroutines.sync.Mutex r2 = r0.q
            androidx.datastore.core.RunOnce r4 = r0.p
            kotlin.ResultKt.b(r8)
            r8 = r2
            goto L62
        L44:
            kotlin.ResultKt.b(r8)
            kotlinx.coroutines.CompletableDeferred r8 = r7.b
            kotlinx.coroutines.JobSupport r8 = (kotlinx.coroutines.JobSupport) r8
            boolean r8 = r8.isCompleted()
            if (r8 == 0) goto L52
            return r5
        L52:
            r0.p = r7
            kotlinx.coroutines.sync.MutexImpl r8 = r7.f2569a
            r0.q = r8
            r0.t = r4
            java.lang.Object r2 = r8.a(r0)
            if (r2 != r1) goto L61
            goto L7c
        L61:
            r4 = r7
        L62:
            kotlinx.coroutines.CompletableDeferred r2 = r4.b     // Catch: java.lang.Throwable -> L88
            kotlinx.coroutines.JobSupport r2 = (kotlinx.coroutines.JobSupport) r2     // Catch: java.lang.Throwable -> L88
            boolean r2 = r2.isCompleted()     // Catch: java.lang.Throwable -> L88
            if (r2 == 0) goto L70
            r8.c(r6)
            return r5
        L70:
            r0.p = r4     // Catch: java.lang.Throwable -> L88
            r0.q = r8     // Catch: java.lang.Throwable -> L88
            r0.t = r3     // Catch: java.lang.Throwable -> L88
            java.lang.Object r0 = r4.a(r0)     // Catch: java.lang.Throwable -> L88
            if (r0 != r1) goto L7d
        L7c:
            return r1
        L7d:
            r1 = r8
            r0 = r4
        L7f:
            kotlinx.coroutines.CompletableDeferred r8 = r0.b     // Catch: java.lang.Throwable -> L31
            r8.h(r5)     // Catch: java.lang.Throwable -> L31
            r1.c(r6)
            return r5
        L88:
            r0 = move-exception
            r1 = r8
            r8 = r0
        L8b:
            r1.c(r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.RunOnce.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
