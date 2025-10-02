package kotlinx.coroutines.rx2;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlinx.coroutines.AbstractCoroutine;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/rx2/RxMaybeCoroutine;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/AbstractCoroutine;", "kotlinx-coroutines-rx2"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class RxMaybeCoroutine<T> extends AbstractCoroutine<T> {
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
            if (obj != null) {
                throw null;
            }
            throw null;
        } catch (Throwable th) {
            RxCancellableKt.a(th, this.f);
        }
    }
}
