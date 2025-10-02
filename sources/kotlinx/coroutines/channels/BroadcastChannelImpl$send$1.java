package kotlinx.coroutines.channels;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.BroadcastChannelImpl", f = "BroadcastChannel.kt", l = {179}, m = "send")
/* loaded from: classes7.dex */
final class BroadcastChannelImpl$send$1 extends ContinuationImpl {
    public Iterator p;
    public /* synthetic */ Object q;
    public final /* synthetic */ BroadcastChannelImpl r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastChannelImpl$send$1(BroadcastChannelImpl broadcastChannelImpl, Continuation continuation) {
        super(continuation);
        this.r = broadcastChannelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.z(null, this);
    }
}
