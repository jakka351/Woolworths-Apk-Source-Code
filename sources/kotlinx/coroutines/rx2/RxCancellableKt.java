package kotlinx.coroutines.rx2;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-rx2"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RxCancellableKt {
    public static final void a(Throwable th, CoroutineContext coroutineContext) {
        if (th instanceof CancellationException) {
            return;
        }
        try {
            RxJavaPlugins.b(th);
        } catch (Throwable th2) {
            ExceptionsKt.a(th, th2);
            CoroutineExceptionHandlerKt.a(th, coroutineContext);
        }
    }
}
