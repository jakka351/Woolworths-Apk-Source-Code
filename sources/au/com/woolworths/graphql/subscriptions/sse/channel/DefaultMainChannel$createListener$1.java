package au.com.woolworths.graphql.subscriptions.sse.channel;

import au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.SendChannel;
import okhttp3.sse.EventSourceListener;
import okhttp3.sse.internal.RealEventSource;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/graphql/subscriptions/sse/channel/DefaultMainChannel$createListener$1", "Lokhttp3/sse/EventSourceListener;", "sse-protocol"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class DefaultMainChannel$createListener$1 extends EventSourceListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SendChannel f9040a;

    public DefaultMainChannel$createListener$1(SendChannel sendChannel) {
        this.f9040a = sendChannel;
    }

    public final void a(RealEventSource realEventSource, Exception exc) {
        ChannelFactory.MainChannel.SseEvent.SseError sseError = new ChannelFactory.MainChannel.SseEvent.SseError(new IOException("SSE server connection is now closed for request: " + realEventSource.d.f26690a, exc));
        SendChannel sendChannel = this.f9040a;
        sendChannel.k(sseError);
        sendChannel.y(null);
    }
}
