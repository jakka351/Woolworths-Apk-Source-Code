package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/pager/MeasuredPage;", "Landroidx/compose/foundation/pager/PageInfo;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class MeasuredPage implements PageInfo {

    /* renamed from: a, reason: collision with root package name */
    public final int f1082a;
    public final List b;
    public final long c;
    public final Object d;
    public final Alignment.Horizontal e;
    public final Alignment.Vertical f;
    public final LayoutDirection g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int[] k;
    public int l;
    public int m;

    public MeasuredPage(int i, int i2, List list, long j, Object obj, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z) {
        this.f1082a = i;
        this.b = list;
        this.c = j;
        this.d = obj;
        this.e = horizontal;
        this.f = vertical;
        this.g = layoutDirection;
        this.h = z;
        this.i = orientation == Orientation.d;
        int size = list.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Placeable placeable = (Placeable) list.get(i3);
            iMax = Math.max(iMax, !this.i ? placeable.e : placeable.d);
        }
        this.j = iMax;
        this.k = new int[this.b.size() * 2];
        this.m = Integer.MIN_VALUE;
    }

    public final void a(int i) {
        this.l += i;
        int[] iArr = this.k;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.i;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    public final void b(int i, int i2, int i3) {
        int i4;
        this.l = i;
        boolean z = this.i;
        this.m = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            Placeable placeable = (Placeable) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.k;
            if (z) {
                Alignment.Horizontal horizontal = this.e;
                if (horizontal == null) {
                    InlineClassHelperKt.b("null horizontalAlignment");
                    throw new KotlinNothingValueException();
                }
                iArr[i6] = horizontal.a(placeable.d, i2, this.g);
                iArr[i6 + 1] = i;
                i4 = placeable.e;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                Alignment.Vertical vertical = this.f;
                if (vertical == null) {
                    InlineClassHelperKt.b("null verticalAlignment");
                    throw new KotlinNothingValueException();
                }
                iArr[i7] = vertical.a(placeable.e, i3);
                i4 = placeable.d;
            }
            i += i4;
        }
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    /* renamed from: getIndex, reason: from getter */
    public final int getF1082a() {
        return this.f1082a;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    /* renamed from: getOffset, reason: from getter */
    public final int getL() {
        return this.l;
    }
}
