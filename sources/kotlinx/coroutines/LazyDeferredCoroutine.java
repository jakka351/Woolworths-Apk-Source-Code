package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.intrinsics.CancellableKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/LazyDeferredCoroutine;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/DeferredCoroutine;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class LazyDeferredCoroutine<T> extends DeferredCoroutine<T> {
    public final Continuation g;

    public LazyDeferredCoroutine(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, true, false);
        this.g = IntrinsicsKt.a(this, this, function2);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void g0() {
        CancellableKt.b(this.g, this);
    }
}
