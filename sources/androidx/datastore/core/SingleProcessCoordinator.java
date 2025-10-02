package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/datastore/core/SingleProcessCoordinator;", "Landroidx/datastore/core/InterProcessCoordinator;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SingleProcessCoordinator implements InterProcessCoordinator {

    /* renamed from: a, reason: collision with root package name */
    public final MutexImpl f2572a = MutexKt.a();
    public final AtomicInt b = new AtomicInt();
    public final Flow c = FlowKt.B(new SingleProcessCoordinator$updateNotifications$1(2, null));

    public SingleProcessCoordinator(String str) {
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    /* renamed from: a, reason: from getter */
    public final Flow getC() {
        return this.c;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public final Object b(ContinuationImpl continuationImpl) {
        return new Integer(this.b.f2559a.get());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(kotlin.jvm.functions.Function1 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.datastore.core.SingleProcessCoordinator$lock$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.datastore.core.SingleProcessCoordinator$lock$1 r0 = (androidx.datastore.core.SingleProcessCoordinator$lock$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessCoordinator$lock$1 r0 = new androidx.datastore.core.SingleProcessCoordinator$lock$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.p
            kotlinx.coroutines.sync.Mutex r8 = (kotlinx.coroutines.sync.Mutex) r8
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L2f
            goto L67
        L2f:
            r9 = move-exception
            goto L6f
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlinx.coroutines.sync.MutexImpl r8 = r0.q
            java.lang.Object r2 = r0.p
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlin.ResultKt.b(r9)
            r9 = r8
            r8 = r2
            goto L57
        L45:
            kotlin.ResultKt.b(r9)
            r0.p = r8
            kotlinx.coroutines.sync.MutexImpl r9 = r7.f2572a
            r0.q = r9
            r0.t = r4
            java.lang.Object r2 = r9.a(r0)
            if (r2 != r1) goto L57
            goto L63
        L57:
            r0.p = r9     // Catch: java.lang.Throwable -> L6b
            r0.q = r5     // Catch: java.lang.Throwable -> L6b
            r0.t = r3     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L6b
            if (r8 != r1) goto L64
        L63:
            return r1
        L64:
            r6 = r9
            r9 = r8
            r8 = r6
        L67:
            r8.c(r5)
            return r9
        L6b:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L6f:
            r8.c(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessCoordinator.c(kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(kotlin.jvm.functions.Function2 r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.datastore.core.SingleProcessCoordinator$tryLock$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.datastore.core.SingleProcessCoordinator$tryLock$1 r0 = (androidx.datastore.core.SingleProcessCoordinator$tryLock$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessCoordinator$tryLock$1 r0 = new androidx.datastore.core.SingleProcessCoordinator$tryLock$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            boolean r7 = r0.q
            kotlinx.coroutines.sync.MutexImpl r0 = r0.p
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L2c
            goto L53
        L2c:
            r8 = move-exception
            goto L5d
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.ResultKt.b(r8)
            kotlinx.coroutines.sync.MutexImpl r8 = r6.f2572a
            boolean r2 = r8.f()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L59
            r0.p = r8     // Catch: java.lang.Throwable -> L59
            r0.q = r2     // Catch: java.lang.Throwable -> L59
            r0.t = r3     // Catch: java.lang.Throwable -> L59
            java.lang.Object r7 = r7.invoke(r5, r0)     // Catch: java.lang.Throwable -> L59
            if (r7 != r1) goto L50
            return r1
        L50:
            r0 = r8
            r8 = r7
            r7 = r2
        L53:
            if (r7 == 0) goto L58
            r0.c(r4)
        L58:
            return r8
        L59:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L5d:
            if (r7 == 0) goto L62
            r0.c(r4)
        L62:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessCoordinator.d(kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public final Object e(Continuation continuation) {
        return new Integer(this.b.f2559a.incrementAndGet());
    }
}
