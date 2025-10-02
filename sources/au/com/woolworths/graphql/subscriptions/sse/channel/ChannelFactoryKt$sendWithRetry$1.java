package au.com.woolworths.graphql.subscriptions.sse.channel;

import au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactoryKt", f = "ChannelFactory.kt", l = {117}, m = "sendWithRetry")
/* loaded from: classes4.dex */
final class ChannelFactoryKt$sendWithRetry$1 extends ContinuationImpl {
    public ChannelFactory.SideChannel p;
    public Function1 q;
    public int r;
    public int s;
    public long t;
    public /* synthetic */ Object u;
    public int v;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.v |= Integer.MIN_VALUE;
        return ChannelFactoryKt.a(null, 0, 0L, null, this);
    }
}
