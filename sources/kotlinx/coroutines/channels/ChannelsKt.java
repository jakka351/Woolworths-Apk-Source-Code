package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.channels.ChannelResult;

@Metadata(d1 = {"kotlinx/coroutines/channels/ChannelsKt__ChannelsKt", "kotlinx/coroutines/channels/ChannelsKt__Channels_commonKt", "kotlinx/coroutines/channels/ChannelsKt__DeprecatedKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChannelsKt {
    public static final void a(ReceiveChannel receiveChannel, Throwable th) {
        CancellationException cancellationExceptionA = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationExceptionA == null) {
            cancellationExceptionA = ExceptionsKt.a("Channel was consumed, consumer had failed", th);
        }
        receiveChannel.cancel(cancellationExceptionA);
    }

    public static final void b(SendChannel sendChannel, Object obj) {
        Object objK = sendChannel.k(obj);
        if (!(objK instanceof ChannelResult.Failed)) {
        } else {
            Object obj2 = ((ChannelResult) BuildersKt.d(EmptyCoroutineContext.d, new ChannelsKt__ChannelsKt$trySendBlocking$2(sendChannel, obj, null))).f24699a;
        }
    }
}
