package kotlinx.coroutines.rx2;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.selects.SelectInstance;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class RxObservableCoroutine$onSend$1 extends FunctionReferenceImpl implements Function3<RxObservableCoroutine<?>, SelectInstance<?>, Object, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RxObservableCoroutine rxObservableCoroutine = (RxObservableCoroutine) obj;
        SelectInstance selectInstance = (SelectInstance) obj2;
        boolean zF = rxObservableCoroutine.h.f();
        Unit unit = Unit.f24250a;
        if (zF) {
            selectInstance.c(unit);
            return unit;
        }
        BuildersKt.c(rxObservableCoroutine, null, null, new RxObservableCoroutine$registerSelectForSend$1(rxObservableCoroutine, selectInstance, null), 3);
        return unit;
    }
}
