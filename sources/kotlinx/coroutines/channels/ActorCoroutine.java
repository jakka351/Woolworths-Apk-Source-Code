package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.ExceptionsKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/channels/ActorCoroutine;", "E", "Lkotlinx/coroutines/channels/ChannelCoroutine;", "Lkotlinx/coroutines/channels/ActorScope;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
class ActorCoroutine<E> extends ChannelCoroutine<E> implements ActorScope<E> {
    @Override // kotlinx.coroutines.JobSupport
    public final boolean U(Throwable th) {
        CoroutineExceptionHandlerKt.a(th, this.f);
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void e0(Throwable th) {
        if (th != null) {
            cancellationExceptionA = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = ExceptionsKt.a(getClass().getSimpleName().concat(" was cancelled"), th);
            }
        }
        this.g.i(cancellationExceptionA);
    }
}
