package kotlinx.coroutines.rx2;

import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.AbstractCoroutine;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/rx2/RxCompletableCoroutine;", "Lkotlinx/coroutines/AbstractCoroutine;", "", "kotlinx-coroutines-rx2"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class RxCompletableCoroutine extends AbstractCoroutine<Unit> {
    @Override // kotlinx.coroutines.AbstractCoroutine
    public final void n0(Throwable th, boolean z) {
        try {
            throw null;
        } catch (Throwable th2) {
            ExceptionsKt.a(th, th2);
            RxCancellableKt.a(th, this.f);
        }
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public final void o0(Object obj) {
        try {
            throw null;
        } catch (Throwable th) {
            RxCancellableKt.a(th, this.f);
        }
    }
}
