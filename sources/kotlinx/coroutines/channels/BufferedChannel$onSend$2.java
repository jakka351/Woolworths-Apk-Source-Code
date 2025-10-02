package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class BufferedChannel$onSend$2 extends FunctionReferenceImpl implements Function3<BufferedChannel<?>, Object, Object, Object> {
    public static final BufferedChannel$onSend$2 d = new BufferedChannel$onSend$2(3, BufferedChannel.class, "processResultSelectSend", "processResultSelectSend(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        BufferedChannel bufferedChannel = (BufferedChannel) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = BufferedChannel.e;
        bufferedChannel.getClass();
        if (obj3 != BufferedChannelKt.l) {
            return bufferedChannel;
        }
        throw bufferedChannel.C();
    }
}
