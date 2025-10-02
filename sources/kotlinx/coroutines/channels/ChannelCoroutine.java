package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.selects.SelectClause1;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/channels/ChannelCoroutine;", "E", "Lkotlinx/coroutines/AbstractCoroutine;", "", "Lkotlinx/coroutines/channels/Channel;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class ChannelCoroutine<E> extends AbstractCoroutine<Unit> implements Channel<E> {
    public final BufferedChannel g;

    public ChannelCoroutine(CoroutineContext coroutineContext, BufferedChannel bufferedChannel) {
        super(coroutineContext, true, true);
        this.g = bufferedChannel;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void E(Throwable th) {
        CancellationException cancellationExceptionK0 = JobSupport.k0(this, th);
        this.g.i(cancellationExceptionK0);
        D(cancellationExceptionK0);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final Object c(Continuation continuation) {
        return this.g.c(continuation);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public final /* synthetic */ void cancel() {
        throw null;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(I(), null, this);
        }
        E(cancellationException);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public final /* synthetic */ boolean cancel(Throwable th) {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final ChannelIterator iterator() {
        BufferedChannel bufferedChannel = this.g;
        bufferedChannel.getClass();
        return new BufferedChannel.BufferedChannelIterator();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final void j(Function1 function1) {
        this.g.j(function1);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object k(Object obj) {
        return this.g.k(obj);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final SelectClause1 n() {
        return this.g.n();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final Object o() {
        return this.g.o();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean r() {
        return this.g.r();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final Object s(ContinuationImpl continuationImpl) {
        BufferedChannel bufferedChannel = this.g;
        bufferedChannel.getClass();
        Object objO = BufferedChannel.O(bufferedChannel, continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objO;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final SelectClause1 t() {
        return this.g.t();
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.channels.SendChannel
    public boolean y(Throwable th) {
        return this.g.l(th, false);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object z(Object obj, Continuation continuation) {
        return this.g.z(obj, continuation);
    }
}
