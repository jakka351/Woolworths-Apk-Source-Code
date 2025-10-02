package kotlinx.coroutines;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"kotlinx/coroutines/JobKt__FutureKt", "kotlinx/coroutines/JobKt__JobKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JobKt {
    public static JobImpl a() {
        return new JobImpl(null);
    }

    public static final void b(CoroutineContext coroutineContext, CancellationException cancellationException) {
        Job job = (Job) coroutineContext.get(Job.Key.d);
        if (job != null) {
            job.cancel(cancellationException);
        }
    }

    public static final Object c(Job job, ContinuationImpl continuationImpl) {
        job.cancel((CancellationException) null);
        Object objJoin = job.join(continuationImpl);
        return objJoin == CoroutineSingletons.d ? objJoin : Unit.f24250a;
    }

    public static void d(CoroutineContext coroutineContext) {
        Sequence children;
        Job job = (Job) coroutineContext.get(Job.Key.d);
        if (job == null || (children = job.getChildren()) == null) {
            return;
        }
        Iterator it = children.getF24664a();
        while (it.hasNext()) {
            ((Job) it.next()).cancel((CancellationException) null);
        }
    }

    public static final void e(CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.get(Job.Key.d);
        if (job != null && !job.isActive()) {
            throw job.getCancellationException();
        }
    }

    public static final Job f(CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.get(Job.Key.d);
        if (job != null) {
            return job;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    public static DisposableHandle g(Job job, JobNode jobNode) {
        return job instanceof JobSupport ? ((JobSupport) job).X(true, jobNode) : job.invokeOnCompletion(jobNode.k(), true, new JobKt__JobKt$invokeOnCompletion$1(jobNode));
    }

    public static final boolean h(CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.get(Job.Key.d);
        if (job != null) {
            return job.isActive();
        }
        return true;
    }
}
