package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.Alignment;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1", "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1 extends LazyListMeasuredItemProvider {
    public final /* synthetic */ boolean d;
    public final /* synthetic */ LazyLayoutMeasureScope e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Alignment.Horizontal h;
    public final /* synthetic */ Alignment.Vertical i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;
    public final /* synthetic */ LazyListState n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1(long j, boolean z, LazyListItemProvider lazyListItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, int i2, Alignment.Horizontal horizontal, Alignment.Vertical vertical, boolean z2, int i3, int i4, long j2, LazyListState lazyListState) {
        super(j, z, lazyListItemProvider, lazyLayoutMeasureScope);
        this.d = z;
        this.e = lazyLayoutMeasureScope;
        this.f = i;
        this.g = i2;
        this.h = horizontal;
        this.i = vertical;
        this.j = z2;
        this.k = i3;
        this.l = i4;
        this.m = j2;
        this.n = lazyListState;
    }

    @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
    public final LazyListMeasuredItem b(int i, Object obj, Object obj2, List list, long j) {
        return new LazyListMeasuredItem(i, list, this.d, this.h, this.i, this.e.getD(), this.j, this.k, this.l, i == this.f + (-1) ? 0 : this.g, this.m, obj, obj2, this.n.m, j);
    }
}
