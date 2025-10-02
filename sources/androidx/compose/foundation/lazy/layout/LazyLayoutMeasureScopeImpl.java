package androidx.compose.foundation.lazy.layout;

import androidx.camera.core.impl.b;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LazyLayoutMeasureScopeImpl implements LazyLayoutMeasureScope, MeasureScope {
    public final LazyLayoutItemContentFactory d;
    public final SubcomposeMeasureScope e;
    public final LazyLayoutItemProvider f;
    public final MutableIntObjectMap g;

    public LazyLayoutMeasureScopeImpl(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeMeasureScope subcomposeMeasureScope) {
        this.d = lazyLayoutItemContentFactory;
        this.e = subcomposeMeasureScope;
        this.f = (LazyLayoutItemProvider) ((LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1) lazyLayoutItemContentFactory.b).invoke();
        MutableIntObjectMap mutableIntObjectMap = IntObjectMapKt.f679a;
        this.g = new MutableIntObjectMap();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    public final float B(int i) {
        return this.e.B(i);
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public final MeasureResult B1(int i, int i2, Map map, Function1 function1) {
        return this.e.B1(i, i2, map, function1);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    public final float C(float f) {
        return this.e.C(f);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    public final long F(long j) {
        return this.e.F(j);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.FontScaling
    public final long H(float f) {
        return this.e.H(f);
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public final MeasureResult L0(int i, int i2, Map map, Function1 function1) {
        return this.e.L0(i, i2, map, function1);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: Q1 */
    public final float getF() {
        return this.e.getF();
    }

    @Override // androidx.compose.ui.unit.Density
    public final float T1(float f) {
        return this.e.T1(f);
    }

    @Override // androidx.compose.ui.unit.Density
    public final int W1(long j) {
        return this.e.W1(j);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope
    public final List e0(int i, long j) {
        MutableIntObjectMap mutableIntObjectMap = this.g;
        List list = (List) mutableIntObjectMap.b(i);
        if (list != null) {
            return list;
        }
        LazyLayoutItemProvider lazyLayoutItemProvider = this.f;
        Object objF = lazyLayoutItemProvider.f(i);
        List listX0 = this.e.X0(objF, this.d.a(i, objF, lazyLayoutItemProvider.e(i)));
        int size = listX0.size();
        ArrayList arrayList = new ArrayList(size);
        int iF = 0;
        while (iF < size) {
            iF = b.f((Measurable) listX0.get(iF), j, arrayList, iF, 1);
        }
        mutableIntObjectMap.h(i, arrayList);
        return arrayList;
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: getDensity */
    public final float getE() {
        return this.e.getE();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    /* renamed from: getLayoutDirection */
    public final LayoutDirection getD() {
        return this.e.getD();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final boolean l1() {
        return this.e.l1();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    public final long p(long j) {
        return this.e.p(j);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.FontScaling
    public final float r(long j) {
        return this.e.r(j);
    }

    @Override // androidx.compose.ui.unit.Density
    public final int r1(float f) {
        return this.e.r1(f);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    public final long t(int i) {
        return this.e.t(i);
    }

    @Override // androidx.compose.ui.unit.Density
    public final float t1(long j) {
        return this.e.t1(j);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    public final long v(float f) {
        return this.e.v(f);
    }
}
