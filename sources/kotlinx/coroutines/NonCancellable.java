package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.EmptySequence;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.selects.SelectClause0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/NonCancellable;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/Job;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NonCancellable extends AbstractCoroutineContextElement implements Job {
    public static final NonCancellable e = new NonCancellable(Job.Key.d);

    @Override // kotlinx.coroutines.Job
    public final ChildHandle attachChild(ChildJob childJob) {
        return NonDisposableHandle.d;
    }

    @Override // kotlinx.coroutines.Job
    public final /* synthetic */ void cancel() {
        throw null;
    }

    @Override // kotlinx.coroutines.Job
    public final void cancel(CancellationException cancellationException) {
    }

    @Override // kotlinx.coroutines.Job
    public final /* synthetic */ boolean cancel(Throwable th) {
        throw null;
    }

    @Override // kotlinx.coroutines.Job
    public final CancellationException getCancellationException() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    public final Sequence getChildren() {
        return EmptySequence.f24658a;
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
        return NonDisposableHandle.d;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCompleted() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    public final Object join(Continuation continuation) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    public final Job plus(Job job) {
        throw null;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // kotlinx.coroutines.Job
    public final DisposableHandle invokeOnCompletion(boolean z, boolean z2, Function1 function1) {
        return NonDisposableHandle.d;
    }
}
