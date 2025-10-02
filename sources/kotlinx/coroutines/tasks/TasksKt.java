package kotlinx.coroutines.tasks;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.DispatchException;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-play-services"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class TasksKt {
    public static final Object a(Task task, ContinuationImpl continuationImpl) {
        if (!task.isComplete()) {
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuationImpl));
            cancellableContinuationImpl.o();
            task.addOnCompleteListener(DirectExecutor.d, new OnCompleteListener() { // from class: kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) throws DispatchException {
                    Exception exception = task2.getException();
                    CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                    if (exception != null) {
                        cancellableContinuationImpl2.resumeWith(ResultKt.a(exception));
                    } else if (task2.isCanceled()) {
                        cancellableContinuationImpl2.cancel(null);
                    } else {
                        cancellableContinuationImpl2.resumeWith(task2.getResult());
                    }
                }
            });
            Object objN = cancellableContinuationImpl.n();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            return objN;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }
}
