package androidx.paging;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/SingleRunner;", "", "CancelIsolatedRunnerException", "Companion", "Holder", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleRunner {

    /* renamed from: a, reason: collision with root package name */
    public final Holder f3588a;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/paging/SingleRunner$CancelIsolatedRunnerException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CancelIsolatedRunnerException extends CancellationException {
        public final SingleRunner d;

        public CancelIsolatedRunnerException(SingleRunner singleRunner) {
            super("Cancelled isolated runner");
            this.d = singleRunner;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/SingleRunner$Companion;", "", "", "DEFAULT_PRIORITY", "I", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/SingleRunner$Holder;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Holder {

        /* renamed from: a, reason: collision with root package name */
        public final SingleRunner f3589a;
        public final boolean b;
        public final MutexImpl c = MutexKt.a();
        public Job d;
        public int e;

        public Holder(SingleRunner singleRunner, boolean z) {
            this.f3589a = singleRunner;
            this.b = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(kotlinx.coroutines.Job r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof androidx.paging.SingleRunner$Holder$onFinish$1
                if (r0 == 0) goto L13
                r0 = r6
                androidx.paging.SingleRunner$Holder$onFinish$1 r0 = (androidx.paging.SingleRunner$Holder$onFinish$1) r0
                int r1 = r0.u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.u = r1
                goto L18
            L13:
                androidx.paging.SingleRunner$Holder$onFinish$1 r0 = new androidx.paging.SingleRunner$Holder$onFinish$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.s
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r2 = r0.u
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                kotlinx.coroutines.sync.MutexImpl r5 = r0.r
                kotlinx.coroutines.Job r1 = r0.q
                java.lang.Object r0 = r0.p
                androidx.paging.SingleRunner$Holder r0 = (androidx.paging.SingleRunner.Holder) r0
                kotlin.ResultKt.b(r6)
                r6 = r5
                r5 = r1
                goto L4e
            L31:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L39:
                kotlin.ResultKt.b(r6)
                r0.p = r4
                r0.q = r5
                kotlinx.coroutines.sync.MutexImpl r6 = r4.c
                r0.r = r6
                r0.u = r3
                java.lang.Object r0 = r6.a(r0)
                if (r0 != r1) goto L4d
                return r1
            L4d:
                r0 = r4
            L4e:
                r1 = 0
                kotlinx.coroutines.Job r2 = r0.d     // Catch: java.lang.Throwable -> L56
                if (r5 != r2) goto L58
                r0.d = r1     // Catch: java.lang.Throwable -> L56
                goto L58
            L56:
                r5 = move-exception
                goto L5e
            L58:
                r6.c(r1)
                kotlin.Unit r5 = kotlin.Unit.f24250a
                return r5
            L5e:
                r6.c(r1)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.Holder.a(kotlinx.coroutines.Job, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r11v0, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r11v1, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r11v12 */
        /* JADX WARN: Type inference failed for: r11v13 */
        /* JADX WARN: Type inference failed for: r11v4, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r11v7, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r11v9, types: [kotlinx.coroutines.sync.Mutex] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object b(int r10, kotlinx.coroutines.Job r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
            /*
                r9 = this;
                boolean r0 = r12 instanceof androidx.paging.SingleRunner$Holder$tryEnqueue$1
                if (r0 == 0) goto L13
                r0 = r12
                androidx.paging.SingleRunner$Holder$tryEnqueue$1 r0 = (androidx.paging.SingleRunner$Holder$tryEnqueue$1) r0
                int r1 = r0.v
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.v = r1
                goto L18
            L13:
                androidx.paging.SingleRunner$Holder$tryEnqueue$1 r0 = new androidx.paging.SingleRunner$Holder$tryEnqueue$1
                r0.<init>(r9, r12)
            L18:
                java.lang.Object r12 = r0.t
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r2 = r0.v
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L4f
                if (r2 == r4) goto L41
                if (r2 != r3) goto L39
                int r10 = r0.s
                kotlinx.coroutines.sync.Mutex r11 = r0.r
                kotlinx.coroutines.Job r1 = r0.q
                java.lang.Object r0 = r0.p
                androidx.paging.SingleRunner$Holder r0 = (androidx.paging.SingleRunner.Holder) r0
                kotlin.ResultKt.b(r12)     // Catch: java.lang.Throwable -> L36
                goto La0
            L36:
                r10 = move-exception
                goto Lae
            L39:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L41:
                int r10 = r0.s
                kotlinx.coroutines.sync.Mutex r11 = r0.r
                kotlinx.coroutines.Job r2 = r0.q
                java.lang.Object r6 = r0.p
                androidx.paging.SingleRunner$Holder r6 = (androidx.paging.SingleRunner.Holder) r6
                kotlin.ResultKt.b(r12)
                goto L68
            L4f:
                kotlin.ResultKt.b(r12)
                r0.p = r9
                r0.q = r11
                kotlinx.coroutines.sync.MutexImpl r12 = r9.c
                r0.r = r12
                r0.s = r10
                r0.v = r4
                java.lang.Object r2 = r12.a(r0)
                if (r2 != r1) goto L65
                goto L9d
            L65:
                r6 = r9
                r2 = r11
                r11 = r12
            L68:
                kotlinx.coroutines.Job r12 = r6.d     // Catch: java.lang.Throwable -> L36
                if (r12 == 0) goto L7f
                boolean r7 = r12.isActive()     // Catch: java.lang.Throwable -> L36
                if (r7 == 0) goto L7f
                int r7 = r6.e     // Catch: java.lang.Throwable -> L36
                if (r7 < r10) goto L7f
                if (r7 != r10) goto L7d
                boolean r7 = r6.b     // Catch: java.lang.Throwable -> L36
                if (r7 == 0) goto L7d
                goto L7f
            L7d:
                r4 = 0
                goto La6
            L7f:
                if (r12 == 0) goto L8b
                androidx.paging.SingleRunner$CancelIsolatedRunnerException r7 = new androidx.paging.SingleRunner$CancelIsolatedRunnerException     // Catch: java.lang.Throwable -> L36
                androidx.paging.SingleRunner r8 = r6.f3589a     // Catch: java.lang.Throwable -> L36
                r7.<init>(r8)     // Catch: java.lang.Throwable -> L36
                r12.cancel(r7)     // Catch: java.lang.Throwable -> L36
            L8b:
                if (r12 == 0) goto La2
                r0.p = r6     // Catch: java.lang.Throwable -> L36
                r0.q = r2     // Catch: java.lang.Throwable -> L36
                r0.r = r11     // Catch: java.lang.Throwable -> L36
                r0.s = r10     // Catch: java.lang.Throwable -> L36
                r0.v = r3     // Catch: java.lang.Throwable -> L36
                java.lang.Object r12 = r12.join(r0)     // Catch: java.lang.Throwable -> L36
                if (r12 != r1) goto L9e
            L9d:
                return r1
            L9e:
                r1 = r2
                r0 = r6
            La0:
                r6 = r0
                r2 = r1
            La2:
                r6.d = r2     // Catch: java.lang.Throwable -> L36
                r6.e = r10     // Catch: java.lang.Throwable -> L36
            La6:
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L36
                r11.c(r5)
                return r10
            Lae:
                r11.c(r5)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.Holder.b(int, kotlinx.coroutines.Job, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }
    }

    public SingleRunner(boolean z) {
        this.f3588a = new Holder(this, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r5, kotlin.jvm.functions.Function1 r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.paging.SingleRunner$runInIsolation$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.paging.SingleRunner$runInIsolation$1 r0 = (androidx.paging.SingleRunner$runInIsolation$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.paging.SingleRunner$runInIsolation$1 r0 = new androidx.paging.SingleRunner$runInIsolation$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            androidx.paging.SingleRunner r5 = r0.p
            kotlin.ResultKt.b(r7)     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L29
            goto L4d
        L29:
            r6 = move-exception
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.b(r7)
            androidx.paging.SingleRunner$runInIsolation$2 r7 = new androidx.paging.SingleRunner$runInIsolation$2     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L47
            r2 = 0
            r7.<init>(r4, r5, r6, r2)     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L47
            r0.p = r4     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L47
            r0.s = r3     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L47
            java.lang.Object r5 = kotlinx.coroutines.CoroutineScopeKt.c(r7, r0)     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L47
            if (r5 != r1) goto L4d
            return r1
        L47:
            r6 = move-exception
            r5 = r4
        L49:
            androidx.paging.SingleRunner r7 = r6.d
            if (r7 != r5) goto L50
        L4d:
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        L50:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.a(int, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
