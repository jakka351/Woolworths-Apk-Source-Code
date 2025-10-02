package kotlinx.coroutines.reactive;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class PublisherCoroutine$onSend$2 extends FunctionReferenceImpl implements Function3<PublisherCoroutine<?>, Object, Object, Object> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = PublisherCoroutine.g;
        ((PublisherCoroutine) obj).q0(obj2);
        throw null;
    }
}
