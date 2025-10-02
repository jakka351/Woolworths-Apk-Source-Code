package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"concurrent-futures-ktx"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class ListenableFutureKt {
    public static final Object a(final ListenableFuture listenableFuture, ContinuationImpl continuationImpl) throws Throwable {
        try {
            if (listenableFuture.isDone()) {
                return AbstractResolvableFuture.f(listenableFuture);
            }
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuationImpl));
            listenableFuture.addListener(new ToContinuation(listenableFuture, cancellableContinuationImpl), DirectExecutor.d);
            cancellableContinuationImpl.r(new Function1<Throwable, Unit>() { // from class: androidx.concurrent.futures.ListenableFutureKt$await$$inlined$suspendCancellableCoroutine$lambda$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    listenableFuture.cancel(false);
                    return Unit.f24250a;
                }
            });
            Object objN = cancellableContinuationImpl.n();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            return objN;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                throw cause;
            }
            Intrinsics.n();
            throw null;
        }
    }
}
