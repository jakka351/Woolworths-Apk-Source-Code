package kotlinx.coroutines.tasks;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.ChildJob;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.selects.SelectClause0;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/tasks/TasksKt$asDeferredImpl$3", "Lkotlinx/coroutines/Deferred;", "kotlinx-coroutines-play-services"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TasksKt$asDeferredImpl$3 implements Deferred<Object> {
    @Override // kotlinx.coroutines.Job
    public final ChildHandle attachChild(ChildJob childJob) {
        throw null;
    }

    @Override // kotlinx.coroutines.Deferred
    public final Object await(Continuation continuation) {
        throw null;
    }

    @Override // kotlinx.coroutines.Job
    public final /* synthetic */ void cancel() {
        throw null;
    }

    @Override // kotlinx.coroutines.Job
    public final void cancel(CancellationException cancellationException) {
        throw null;
    }

    @Override // kotlinx.coroutines.Job
    public final /* synthetic */ boolean cancel(Throwable th) {
        throw null;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        throw null;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        throw null;
    }

    @Override // kotlinx.coroutines.Job
    public final CancellationException getCancellationException() {
        throw null;
    }

    @Override // kotlinx.coroutines.Job
    public final Sequence getChildren() {
        throw null;
    }

    @Override // kotlinx.coroutines.Deferred
    public final Object getCompleted() {
        throw null;
    }

    @Override // kotlinx.coroutines.Deferred
    public final Throwable getCompletionExceptionOrNull() {
        throw null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    /* renamed from: getKey */
    public final CoroutineContext.Key getD() {
        throw null;
    }

    @Override // kotlinx.coroutines.Job
    public final SelectClause0 getOnJoin() {
        throw null;
    }

    @Override // kotlinx.coroutines.Job
    public final Job getParent() {
        throw null;
    }

    @Override // kotlinx.coroutines.Job
    public final DisposableHandle invokeOnCompletion(Function1 function1) {
        throw null;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isActive() {
        throw null;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
        throw null;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCompleted() {
        throw null;
    }

    @Override // kotlinx.coroutines.Job
    public final Object join(Continuation continuation) {
        throw null;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        throw null;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        throw null;
    }

    @Override // kotlinx.coroutines.Job
    public final Job plus(Job job) {
        throw null;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
        throw null;
    }

    @Override // kotlinx.coroutines.Job
    public final DisposableHandle invokeOnCompletion(boolean z, boolean z2, Function1 function1) {
        throw null;
    }
}
