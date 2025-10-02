package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.channels.SendChannel;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514, 308}, m = "toChannel")
/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$toChannel$1<E, C extends SendChannel<? super E>> extends ContinuationImpl {
    public SendChannel p;
    public ReceiveChannel q;
    public ChannelIterator r;
    public /* synthetic */ Object s;
    public int t;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.t |= Integer.MIN_VALUE;
        return ChannelsKt__DeprecatedKt.a(null, null, this);
    }
}
