package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class LazyGridMeasuredLineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1018a;
    public final LazyGridSlots b;
    public final int c;
    public final int d;
    public final LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 e;
    public final LazyGridSpanLayoutProvider f;

    public LazyGridMeasuredLineProvider(boolean z, LazyGridSlots lazyGridSlots, int i, int i2, LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1, LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider) {
        this.f1018a = z;
        this.b = lazyGridSlots;
        this.c = i;
        this.d = i2;
        this.e = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1;
        this.f = lazyGridSpanLayoutProvider;
    }

    public final long a(int i, int i2) {
        int i3;
        LazyGridSlots lazyGridSlots = this.b;
        int[] iArr = lazyGridSlots.f1020a;
        if (i2 == 1) {
            i3 = iArr[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr2 = lazyGridSlots.b;
            i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        return this.f1018a ? Constraints.Companion.e(i3) : Constraints.Companion.d(i3);
    }

    public abstract LazyGridMeasuredLine b(int i, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, List list, int i2);

    public final LazyGridMeasuredLine c(int i) {
        LazyGridSpanLayoutProvider.LineConfiguration lineConfigurationB = this.f.b(i);
        int i2 = lineConfigurationB.f1024a;
        List list = lineConfigurationB.b;
        int size = list.size();
        int i3 = (size == 0 || i2 + size == this.c) ? 0 : this.d;
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = new LazyGridMeasuredItem[size];
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = (int) ((GridItemSpan) list.get(i5)).f1007a;
            LazyGridMeasuredItem lazyGridMeasuredItemC = c(i2 + i5, i4, i6, i3, a(i4, i6));
            i4 += i6;
            lazyGridMeasuredItemArr[i5] = lazyGridMeasuredItemC;
        }
        return b(i, lazyGridMeasuredItemArr, list, i3);
    }
}
