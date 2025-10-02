package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.MeasureResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/pager/PagerMeasureResult;", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PagerMeasureResult implements PagerLayoutInfo, MeasureResult {

    /* renamed from: a, reason: collision with root package name */
    public final List f1088a;
    public final int b;
    public final int c;
    public final int d;
    public final Orientation e;
    public final int f;
    public final int g;
    public final int h;
    public final MeasuredPage i;
    public final MeasuredPage j;
    public final float k;
    public final int l;
    public final boolean m;
    public final SnapPosition n;
    public final MeasureResult o;
    public final boolean p;
    public final List q;
    public final List r;
    public final CoroutineScope s;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PagerMeasureResult(int i, int i2, int i3, Orientation orientation, int i4, int i5, int i6, SnapPosition snapPosition, MeasureResult measureResult, CoroutineScope coroutineScope) {
        EmptyList emptyList = EmptyList.d;
        this(emptyList, i, i2, i3, orientation, i4, i5, i6, null, null, BitmapDescriptorFactory.HUE_RED, 0, false, snapPosition, measureResult, false, emptyList, emptyList, coroutineScope);
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    /* renamed from: D, reason: from getter */
    public final int getB() {
        return this.b;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    /* renamed from: E, reason: from getter */
    public final SnapPosition getN() {
        return this.n;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public final boolean F() {
        return false;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    /* renamed from: G, reason: from getter */
    public final List getF1088a() {
        return this.f1088a;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    /* renamed from: H, reason: from getter */
    public final int getC() {
        return this.c;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public final long a() {
        MeasureResult measureResult = this.o;
        return (measureResult.getF1885a() << 32) | (measureResult.getB() & 4294967295L);
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    /* renamed from: b, reason: from getter */
    public final int getD() {
        return this.d;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public final int c() {
        return -this.f;
    }

    public final PagerMeasureResult d(int i) {
        int i2;
        int i3 = this.b + this.c;
        if (this.p) {
            return null;
        }
        List list = this.f1088a;
        if (list.isEmpty() || this.i == null || (i2 = this.l - i) < 0 || i2 >= i3) {
            return null;
        }
        float f = this.k - (i3 != 0 ? i / i3 : BitmapDescriptorFactory.HUE_RED);
        if (this.j == null || f >= 0.5f || f <= -0.5f) {
            return null;
        }
        MeasuredPage measuredPage = (MeasuredPage) CollectionsKt.D(list);
        MeasuredPage measuredPage2 = (MeasuredPage) CollectionsKt.O(list);
        int i4 = this.g;
        int i5 = this.f;
        if (i < 0) {
            if (Math.min((measuredPage.l + i3) - i5, (measuredPage2.l + i3) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - measuredPage.l, i4 - measuredPage2.l) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((MeasuredPage) list.get(i6)).a(i);
        }
        List list2 = this.q;
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((MeasuredPage) list2.get(i7)).a(i);
        }
        List list3 = this.r;
        int size3 = list3.size();
        for (int i8 = 0; i8 < size3; i8++) {
            ((MeasuredPage) list3.get(i8)).a(i);
        }
        return new PagerMeasureResult(this.f1088a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, f, i2, this.m || i > 0, this.n, this.o, this.p, this.q, this.r, this.s);
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* renamed from: getHeight */
    public final int getB() {
        return this.o.getB();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    /* renamed from: getOrientation, reason: from getter */
    public final Orientation getE() {
        return this.e;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* renamed from: getWidth */
    public final int getF1885a() {
        return this.o.getF1885a();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* renamed from: o */
    public final Map getC() {
        return this.o.getC();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final Function1 p() {
        return this.o.p();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final void q() {
        this.o.q();
    }

    public PagerMeasureResult(List list, int i, int i2, int i3, Orientation orientation, int i4, int i5, int i6, MeasuredPage measuredPage, MeasuredPage measuredPage2, float f, int i7, boolean z, SnapPosition snapPosition, MeasureResult measureResult, boolean z2, List list2, List list3, CoroutineScope coroutineScope) {
        this.f1088a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = orientation;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = measuredPage;
        this.j = measuredPage2;
        this.k = f;
        this.l = i7;
        this.m = z;
        this.n = snapPosition;
        this.o = measureResult;
        this.p = z2;
        this.q = list2;
        this.r = list3;
        this.s = coroutineScope;
    }
}
