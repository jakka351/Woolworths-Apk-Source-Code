package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastCoroutine;", "E", "Lkotlinx/coroutines/AbstractCoroutine;", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlinx/coroutines/channels/BroadcastChannel;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
class BroadcastCoroutine<E> extends AbstractCoroutine<Unit> implements ProducerScope<E>, BroadcastChannel<E> {
    @Override // kotlinx.coroutines.JobSupport
    public final void E(Throwable th) {
        JobSupport.k0(this, th);
        throw null;
    }

    @Override // kotlinx.coroutines.channels.ProducerScope
    public final SendChannel b() {
        return this;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(I(), null, this);
        }
        JobSupport.k0(this, cancellationException);
        throw null;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public final /* synthetic */ boolean cancel(Throwable th) {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final void j(Function1 function1) {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final Object k(Object obj) {
        throw null;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public final void n0(Throwable th, boolean z) {
        throw null;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public final void o0(Object obj) {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean r() {
        throw null;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.channels.SendChannel
    public final boolean y(Throwable th) {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final Object z(Object obj, Continuation continuation) {
        throw null;
    }
}
