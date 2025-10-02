package androidx.work.impl;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.DispatchException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/work/impl/ToContinuation;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/lang/Runnable;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ToContinuation<T> implements Runnable {
    public final ListenableFuture d;
    public final CancellableContinuationImpl e;

    public ToContinuation(ListenableFuture listenableFuture, CancellableContinuationImpl cancellableContinuationImpl) {
        this.d = listenableFuture;
        this.e = cancellableContinuationImpl;
    }

    @Override // java.lang.Runnable
    public final void run() throws DispatchException {
        Object obj;
        ListenableFuture listenableFuture = this.d;
        boolean zIsCancelled = listenableFuture.isCancelled();
        CancellableContinuationImpl cancellableContinuationImpl = this.e;
        if (zIsCancelled) {
            cancellableContinuationImpl.cancel(null);
            return;
        }
        try {
            String str = WorkerWrapperKt.f3946a;
            boolean z = false;
            while (true) {
                try {
                    obj = listenableFuture.get();
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
            cancellableContinuationImpl.resumeWith(obj);
        } catch (ExecutionException e) {
            String str2 = WorkerWrapperKt.f3946a;
            Throwable cause = e.getCause();
            Intrinsics.e(cause);
            cancellableContinuationImpl.resumeWith(ResultKt.a(cause));
        }
    }
}
