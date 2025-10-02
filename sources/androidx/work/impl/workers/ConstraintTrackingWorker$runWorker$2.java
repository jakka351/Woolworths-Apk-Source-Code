package androidx.work.impl.workers;

import androidx.work.ListenableWorker;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2", f = "ConstraintTrackingWorker.kt", l = {134}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class ConstraintTrackingWorker$runWorker$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ListenableWorker.Result>, Object> {
    public ListenableFuture p;
    public Object q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ ListenableWorker t;
    public final /* synthetic */ WorkConstraintsTracker u;
    public final /* synthetic */ WorkSpec v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker$runWorker$2(ListenableWorker listenableWorker, WorkConstraintsTracker workConstraintsTracker, WorkSpec workSpec, Continuation continuation) {
        super(2, continuation);
        this.t = listenableWorker;
        this.u = workConstraintsTracker;
        this.v = workSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ConstraintTrackingWorker$runWorker$2 constraintTrackingWorker$runWorker$2 = new ConstraintTrackingWorker$runWorker$2(this.t, this.u, this.v, continuation);
        constraintTrackingWorker$runWorker$2.s = obj;
        return constraintTrackingWorker$runWorker$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ConstraintTrackingWorker$runWorker$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r13.r
            r2 = 0
            r3 = -256(0xffffffffffffff00, float:NaN)
            androidx.work.ListenableWorker r4 = r13.t
            r5 = 1
            java.lang.String r6 = "Delegated worker "
            if (r1 == 0) goto L2e
            if (r1 != r5) goto L26
            java.lang.Object r0 = r13.q
            r1 = r0
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            com.google.common.util.concurrent.ListenableFuture r7 = r13.p
            java.lang.Object r0 = r13.s
            r8 = r0
            java.util.concurrent.atomic.AtomicInteger r8 = (java.util.concurrent.atomic.AtomicInteger) r8
            kotlin.ResultKt.b(r14)     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> L23
            goto L63
        L20:
            r0 = move-exception
            r14 = r0
            goto L6e
        L23:
            r0 = move-exception
            r14 = r0
            goto L90
        L26:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L2e:
            kotlin.ResultKt.b(r14)
            java.lang.Object r14 = r13.s
            kotlinx.coroutines.CoroutineScope r14 = (kotlinx.coroutines.CoroutineScope) r14
            java.util.concurrent.atomic.AtomicInteger r10 = new java.util.concurrent.atomic.AtomicInteger
            r10.<init>(r3)
            com.google.common.util.concurrent.ListenableFuture r11 = r4.startWork()
            java.lang.String r1 = "delegate.startWork()"
            kotlin.jvm.internal.Intrinsics.g(r11, r1)
            androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1 r7 = new androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1
            androidx.work.impl.model.WorkSpec r9 = r13.v
            r12 = 0
            androidx.work.impl.constraints.WorkConstraintsTracker r8 = r13.u
            r7.<init>(r8, r9, r10, r11, r12)
            r1 = 3
            kotlinx.coroutines.Job r1 = kotlinx.coroutines.BuildersKt.c(r14, r2, r2, r7, r1)
            r13.s = r10     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> L69
            r13.p = r11     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> L69
            r13.q = r1     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> L69
            r13.r = r5     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> L69
            java.lang.Object r14 = androidx.concurrent.futures.ListenableFutureKt.a(r11, r13)     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> L69
            if (r14 != r0) goto L61
            return r0
        L61:
            r8 = r10
            r7 = r11
        L63:
            androidx.work.ListenableWorker$Result r14 = (androidx.work.ListenableWorker.Result) r14     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> L23
            r1.cancel(r2)
            return r14
        L69:
            r0 = move-exception
            r14 = r0
            r8 = r10
            r7 = r11
            goto L90
        L6e:
            java.lang.String r0 = androidx.work.impl.workers.ConstraintTrackingWorkerKt.f4015a     // Catch: java.lang.Throwable -> L8d
            androidx.work.Logger r3 = androidx.work.Logger.e()     // Catch: java.lang.Throwable -> L8d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L8d
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Throwable -> L8d
            r5.append(r4)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r4 = " threw exception in startWork."
            r5.append(r4)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L8d
            r3.b(r0, r4, r14)     // Catch: java.lang.Throwable -> L8d
            throw r14     // Catch: java.lang.Throwable -> L8d
        L8d:
            r0 = move-exception
            r14 = r0
            goto Lc9
        L90:
            java.lang.String r0 = androidx.work.impl.workers.ConstraintTrackingWorkerKt.f4015a     // Catch: java.lang.Throwable -> L8d
            androidx.work.Logger r9 = androidx.work.Logger.e()     // Catch: java.lang.Throwable -> L8d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r10.<init>(r6)     // Catch: java.lang.Throwable -> L8d
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Throwable -> L8d
            r10.append(r4)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r4 = " was cancelled"
            r10.append(r4)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r4 = r10.toString()     // Catch: java.lang.Throwable -> L8d
            r9.b(r0, r4, r14)     // Catch: java.lang.Throwable -> L8d
            int r0 = r8.get()     // Catch: java.lang.Throwable -> L8d
            if (r0 == r3) goto Lb5
            goto Lb6
        Lb5:
            r5 = 0
        Lb6:
            boolean r0 = r7.isCancelled()     // Catch: java.lang.Throwable -> L8d
            if (r0 == 0) goto Lc8
            if (r5 == 0) goto Lc8
            androidx.work.impl.workers.ConstraintTrackingWorker$ConstraintUnsatisfiedException r14 = new androidx.work.impl.workers.ConstraintTrackingWorker$ConstraintUnsatisfiedException     // Catch: java.lang.Throwable -> L8d
            int r0 = r8.get()     // Catch: java.lang.Throwable -> L8d
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L8d
            throw r14     // Catch: java.lang.Throwable -> L8d
        Lc8:
            throw r14     // Catch: java.lang.Throwable -> L8d
        Lc9:
            r1.cancel(r2)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
