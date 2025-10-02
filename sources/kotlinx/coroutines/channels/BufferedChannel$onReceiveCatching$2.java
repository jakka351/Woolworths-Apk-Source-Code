package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.channels.ChannelResult;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class BufferedChannel$onReceiveCatching$2 extends FunctionReferenceImpl implements Function3<BufferedChannel<?>, Object, Object, Object> {
    public static final BufferedChannel$onReceiveCatching$2 d = new BufferedChannel$onReceiveCatching$2(3, BufferedChannel.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BufferedChannel bufferedChannel = (BufferedChannel) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = BufferedChannel.e;
        bufferedChannel.getClass();
        if (obj3 == BufferedChannelKt.l) {
            obj3 = new ChannelResult.Closed(bufferedChannel.A());
        }
        return new ChannelResult(obj3);
    }
}
