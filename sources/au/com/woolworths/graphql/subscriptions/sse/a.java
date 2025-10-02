package au.com.woolworths.graphql.subscriptions.sse;

import au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory;
import au.com.woolworths.graphql.subscriptions.sse.data.SseTransportMessage;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ SseTransportMessage.Request e;

    public /* synthetic */ a(SseTransportMessage.Request request, int i) {
        this.d = i;
        this.e = request;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ChannelFactory.SideChannel sendWithRetry = (ChannelFactory.SideChannel) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(sendWithRetry, "$this$sendWithRetry");
                break;
            case 1:
                Intrinsics.h(sendWithRetry, "$this$sendWithRetry");
                break;
            default:
                Intrinsics.h(sendWithRetry, "$this$sendWithRetry");
                break;
        }
        return sendWithRetry.a(this.e);
    }
}
