package kotlinx.coroutines.rx2;

import io.reactivex.Observable;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-rx2"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RxConvertKt {
    public static final Flow a(Observable observable) {
        return FlowKt.d(new RxConvertKt$asFlow$1(observable, null));
    }
}
