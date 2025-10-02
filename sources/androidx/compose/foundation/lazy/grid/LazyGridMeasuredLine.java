package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LazyGridMeasuredLine {

    /* renamed from: a, reason: collision with root package name */
    public final int f1017a;
    public final LazyGridMeasuredItem[] b;
    public final LazyGridSlots c;
    public final List d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;

    public LazyGridMeasuredLine(int i, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, LazyGridSlots lazyGridSlots, List list, boolean z, int i2) {
        this.f1017a = i;
        this.b = lazyGridMeasuredItemArr;
        this.c = lazyGridSlots;
        this.d = list;
        this.e = z;
        this.f = i2;
        int iMax = 0;
        for (LazyGridMeasuredItem lazyGridMeasuredItem : lazyGridMeasuredItemArr) {
            iMax = Math.max(iMax, lazyGridMeasuredItem.p);
        }
        this.g = iMax;
        int i3 = iMax + this.f;
        this.h = i3 >= 0 ? i3 : 0;
    }

    public final LazyGridMeasuredItem[] a(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = this.b;
        int length = lazyGridMeasuredItemArr.length;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < length) {
            LazyGridMeasuredItem lazyGridMeasuredItem = lazyGridMeasuredItemArr[i8];
            int i11 = i9 + 1;
            int i12 = (int) ((GridItemSpan) this.d.get(i9)).f1007a;
            int i13 = this.c.b[i10];
            int i14 = this.f1017a;
            boolean z = this.e;
            int i15 = z ? i14 : i10;
            if (z) {
                i4 = i10;
                i7 = i;
                i5 = i2;
                i6 = i3;
            } else {
                i4 = i14;
                i5 = i2;
                i6 = i3;
                i7 = i;
            }
            lazyGridMeasuredItem.q(i7, i13, i5, i6, i15, i4);
            i10 += i12;
            i8++;
            i9 = i11;
        }
        return lazyGridMeasuredItemArr;
    }
}
