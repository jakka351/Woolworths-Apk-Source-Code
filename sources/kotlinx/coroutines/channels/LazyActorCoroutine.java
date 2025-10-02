package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.intrinsics.CancellableKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/channels/LazyActorCoroutine;", "E", "Lkotlinx/coroutines/channels/ActorCoroutine;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class LazyActorCoroutine<E> extends ActorCoroutine<E> {
    public static final /* synthetic */ int h = 0;

    @Override // kotlinx.coroutines.JobSupport
    public final void g0() {
        CancellableKt.b(null, this);
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    public final Object k(Object obj) {
        start();
        return super.k(obj);
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.JobSupport, kotlinx.coroutines.channels.SendChannel
    public final boolean y(Throwable th) {
        boolean zY = super.y(th);
        start();
        return zY;
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    public final Object z(Object obj, Continuation continuation) {
        start();
        Object objZ = super.z(obj, continuation);
        return objZ == CoroutineSingletons.d ? objZ : Unit.f24250a;
    }
}
