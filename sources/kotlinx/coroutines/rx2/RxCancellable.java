package kotlinx.coroutines.rx2;

import io.reactivex.functions.Cancellable;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.AbstractCoroutine;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/rx2/RxCancellable;", "Lio/reactivex/functions/Cancellable;", "kotlinx-coroutines-rx2"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RxCancellable implements Cancellable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractCoroutine f24737a;

    public RxCancellable(AbstractCoroutine abstractCoroutine) {
        this.f24737a = abstractCoroutine;
    }

    @Override // io.reactivex.functions.Cancellable
    public final void cancel() {
        this.f24737a.cancel((CancellationException) null);
    }
}
