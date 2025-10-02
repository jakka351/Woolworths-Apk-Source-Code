package androidx.work.impl;

import androidx.work.DirectExecutor;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class WorkerWrapperKt {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3946a;

    static {
        String strG = Logger.g("WorkerWrapper");
        Intrinsics.g(strG, "tagWithPrefix(\"WorkerWrapper\")");
        f3946a = strG;
    }

    public static final Object a(final ListenableFuture listenableFuture, final ListenableWorker listenableWorker, SuspendLambda suspendLambda) {
        V v;
        try {
            if (!listenableFuture.isDone()) {
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(suspendLambda));
                cancellableContinuationImpl.o();
                listenableFuture.addListener(new ToContinuation(listenableFuture, cancellableContinuationImpl), DirectExecutor.d);
                cancellableContinuationImpl.r(new Function1<Throwable, Unit>() { // from class: androidx.work.impl.WorkerWrapperKt$awaitWithin$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Throwable th = (Throwable) obj;
                        if (th instanceof WorkerStoppedException) {
                            listenableWorker.stop(((WorkerStoppedException) th).d);
                        }
                        listenableFuture.cancel(false);
                        return Unit.f24250a;
                    }
                });
                Object objN = cancellableContinuationImpl.n();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                return objN;
            }
            boolean z = false;
            while (true) {
                try {
                    v = listenableFuture.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return v;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            Intrinsics.e(cause);
            throw cause;
        }
    }
}
