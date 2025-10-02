package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class LazyGridMeasuredItemProvider implements LazyLayoutMeasuredItemProvider<LazyGridMeasuredItem> {

    /* renamed from: a, reason: collision with root package name */
    public final LazyGridItemProvider f1016a;
    public final LazyLayoutMeasureScope b;
    public final int c;

    public LazyGridMeasuredItemProvider(LazyGridItemProvider lazyGridItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i) {
        this.f1016a = lazyGridItemProvider;
        this.b = lazyLayoutMeasureScope;
        this.c = i;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider
    public final LazyLayoutMeasuredItem a(int i, int i2, int i3, long j) {
        return c(i, i2, i3, this.c, j);
    }

    public abstract LazyGridMeasuredItem b(int i, Object obj, Object obj2, int i2, int i3, List list, long j, int i4, int i5);

    public final LazyGridMeasuredItem c(int i, int i2, int i3, int i4, long j) {
        int i5;
        LazyGridItemProvider lazyGridItemProvider = this.f1016a;
        Object objF = lazyGridItemProvider.f(i);
        Object objE = lazyGridItemProvider.e(i);
        List listE0 = this.b.e0(i, j);
        if (Constraints.f(j)) {
            i5 = Constraints.j(j);
        } else {
            if (!Constraints.e(j)) {
                InlineClassHelperKt.a("does not have fixed height");
            }
            i5 = Constraints.i(j);
        }
        return b(i, objF, objE, i5, i4, listE0, j, i2, i3);
    }
}
