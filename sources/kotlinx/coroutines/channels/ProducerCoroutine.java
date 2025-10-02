package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/channels/ProducerCoroutine;", "E", "Lkotlinx/coroutines/channels/ChannelCoroutine;", "Lkotlinx/coroutines/channels/ProducerScope;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class ProducerCoroutine<E> extends ChannelCoroutine<E> implements ProducerScope<E> {
    @Override // kotlinx.coroutines.channels.ProducerScope
    public final SendChannel b() {
        return this;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public final void n0(Throwable th, boolean z) {
        if (this.g.l(th, false) || z) {
            return;
        }
        CoroutineExceptionHandlerKt.a(th, this.f);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public final void o0(Object obj) {
        this.g.y(null);
    }
}
