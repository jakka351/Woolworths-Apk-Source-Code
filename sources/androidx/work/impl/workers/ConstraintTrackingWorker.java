package androidx.work.impl.workers;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.ExecutorsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "ConstraintUnsatisfiedException", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {
    public final WorkerParameters h;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker$ConstraintUnsatisfiedException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ConstraintUnsatisfiedException extends CancellationException {
        public final int d;

        public ConstraintUnsatisfiedException(int i) {
            this.d = i;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        Intrinsics.h(appContext, "appContext");
        Intrinsics.h(workerParameters, "workerParameters");
        this.h = workerParameters;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(androidx.work.impl.workers.ConstraintTrackingWorker r4, androidx.work.ListenableWorker r5, androidx.work.impl.constraints.WorkConstraintsTracker r6, androidx.work.impl.model.WorkSpec r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$1 r0 = (androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$1 r0 = new androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r4 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r0.r
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            kotlin.ResultKt.b(r4)
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            kotlin.ResultKt.b(r4)
            androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2 r4 = new androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2
            r1 = 0
            r4.<init>(r5, r6, r7, r1)
            r0.r = r2
            java.lang.Object r4 = kotlinx.coroutines.CoroutineScopeKt.c(r4, r0)
            if (r4 != r8) goto L41
            return r8
        L41:
            java.lang.String r5 = "delegate: ListenableWork….cancel()\n        }\n    }"
            kotlin.jvm.internal.Intrinsics.g(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.b(androidx.work.impl.workers.ConstraintTrackingWorker, androidx.work.ListenableWorker, androidx.work.impl.constraints.WorkConstraintsTracker, androidx.work.impl.model.WorkSpec, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(androidx.work.impl.workers.ConstraintTrackingWorker r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.c(androidx.work.impl.workers.ConstraintTrackingWorker, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    public final Object a(Continuation continuation) {
        Executor backgroundExecutor = getBackgroundExecutor();
        Intrinsics.g(backgroundExecutor, "backgroundExecutor");
        return BuildersKt.f(ExecutorsKt.a(backgroundExecutor), new ConstraintTrackingWorker$doWork$2(this, null), continuation);
    }
}
