package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class BufferedChannelKt$createSegmentFunction$1 extends FunctionReferenceImpl implements Function2<Long, ChannelSegment<Object>, ChannelSegment<Object>> {
    public static final BufferedChannelKt$createSegmentFunction$1 d = new BufferedChannelKt$createSegmentFunction$1(2, BufferedChannelKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long jLongValue = ((Number) obj).longValue();
        ChannelSegment channelSegment = (ChannelSegment) obj2;
        ChannelSegment channelSegment2 = BufferedChannelKt.f24697a;
        BufferedChannel bufferedChannel = channelSegment.h;
        Intrinsics.e(bufferedChannel);
        return new ChannelSegment(jLongValue, channelSegment, bufferedChannel, 0);
    }
}
