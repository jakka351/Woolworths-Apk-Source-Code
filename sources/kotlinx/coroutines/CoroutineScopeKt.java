package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoroutineScopeKt {
    public static final ContextScope a(CoroutineContext coroutineContext) {
        if (coroutineContext.get(Job.Key.d) == null) {
            coroutineContext = coroutineContext.plus(JobKt.a());
        }
        return new ContextScope(coroutineContext);
    }

    public static final void b(CoroutineScope coroutineScope, CancellationException cancellationException) {
        Job job = (Job) coroutineScope.getD().get(Job.Key.d);
        if (job != null) {
            job.cancel(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + coroutineScope).toString());
        }
    }

    public static final Object c(Function2 function2, Continuation continuation) {
        ScopeCoroutine scopeCoroutine = new ScopeCoroutine(continuation, continuation.getD());
        Object objA = UndispatchedKt.a(scopeCoroutine, scopeCoroutine, function2);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objA;
    }

    public static final boolean d(CoroutineScope coroutineScope) {
        Job job = (Job) coroutineScope.getD().get(Job.Key.d);
        if (job != null) {
            return job.isActive();
        }
        return true;
    }
}
