package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BufferedChannel$receiveImpl$1 implements Function3 {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).intValue();
        ((Number) obj3).longValue();
        throw new IllegalStateException("unexpected");
    }
}
