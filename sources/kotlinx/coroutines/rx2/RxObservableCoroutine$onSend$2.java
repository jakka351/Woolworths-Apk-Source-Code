package kotlinx.coroutines.rx2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class RxObservableCoroutine$onSend$2 extends FunctionReferenceImpl implements Function3<RxObservableCoroutine<?>, Object, Object, Object> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RxObservableCoroutine rxObservableCoroutine = (RxObservableCoroutine) obj;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = RxObservableCoroutine.i;
        rxObservableCoroutine.getClass();
        Intrinsics.f(obj2, "null cannot be cast to non-null type T of kotlinx.coroutines.rx2.RxObservableCoroutine");
        IllegalStateException illegalStateExceptionQ0 = rxObservableCoroutine.q0(obj2);
        if (illegalStateExceptionQ0 == null) {
            return rxObservableCoroutine;
        }
        throw illegalStateExceptionQ0;
    }
}
