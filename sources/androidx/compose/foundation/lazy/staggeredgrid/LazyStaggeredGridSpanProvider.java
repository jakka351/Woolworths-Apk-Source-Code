package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LazyStaggeredGridSpanProvider {

    /* renamed from: a, reason: collision with root package name */
    public final MutableIntervalList f1079a;

    public LazyStaggeredGridSpanProvider(MutableIntervalList mutableIntervalList) {
        this.f1079a = mutableIntervalList;
    }

    public final void a(int i) {
        if (i >= 0) {
            MutableIntervalList mutableIntervalList = this.f1079a;
            if (i < mutableIntervalList.b) {
            }
        }
    }
}
