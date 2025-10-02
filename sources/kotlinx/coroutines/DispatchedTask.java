package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.scheduling.Task;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/DispatchedTask;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/scheduling/Task;", "Lkotlinx/coroutines/SchedulerTask;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class DispatchedTask<T> extends Task {
    public int f;

    public DispatchedTask(int i) {
        super(0L, false);
        this.f = i;
    }

    public void b(CancellationException cancellationException) {
    }

    /* renamed from: c */
    public abstract Continuation getG();

    public Throwable d(Object obj) {
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        if (completedExceptionally != null) {
            return completedExceptionally.f24689a;
        }
        return null;
    }

    public Object e(Object obj) {
        return obj;
    }

    public final void f(Throwable th) {
        CoroutineExceptionHandlerKt.a(new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), getG().getE());
    }

    public abstract Object g();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Continuation g = getG();
            Intrinsics.f(g, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) g;
            ContinuationImpl continuationImpl = dispatchedContinuation.h;
            Object obj = dispatchedContinuation.j;
            CoroutineContext e = continuationImpl.getE();
            Object objC = ThreadContextKt.c(e, obj);
            Job job = null;
            UndispatchedCoroutine undispatchedCoroutineC = objC != ThreadContextKt.f24732a ? CoroutineContextKt.c(continuationImpl, e, objC) : null;
            try {
                CoroutineContext e2 = continuationImpl.getE();
                Object objG = g();
                Throwable thD = d(objG);
                if (thD == null) {
                    int i = this.f;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        job = (Job) e2.get(Job.Key.d);
                    }
                }
                if (job != null && !job.isActive()) {
                    CancellationException cancellationException = job.getCancellationException();
                    b(cancellationException);
                    continuationImpl.resumeWith(ResultKt.a(cancellationException));
                } else if (thD != null) {
                    continuationImpl.resumeWith(ResultKt.a(thD));
                } else {
                    continuationImpl.resumeWith(e(objG));
                }
                if (undispatchedCoroutineC == null || undispatchedCoroutineC.r0()) {
                    ThreadContextKt.a(e, objC);
                }
            } catch (Throwable th) {
                if (undispatchedCoroutineC == null || undispatchedCoroutineC.r0()) {
                    ThreadContextKt.a(e, objC);
                }
                throw th;
            }
        } catch (DispatchException e3) {
            CoroutineExceptionHandlerKt.a(e3.d, getG().getE());
        } catch (Throwable th2) {
            f(th2);
        }
    }
}
