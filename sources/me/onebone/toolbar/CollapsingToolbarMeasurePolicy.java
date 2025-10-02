package me.onebone.toolbar;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lme/onebone/toolbar/CollapsingToolbarMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
final class CollapsingToolbarMeasurePolicy implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsingToolbarState f24911a;

    public CollapsingToolbarMeasurePolicy(CollapsingToolbarState collapsingToolbarState) {
        Intrinsics.h(collapsingToolbarState, "collapsingToolbarState");
        this.f24911a = collapsingToolbarState;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(final MeasureScope measure, List measurables, long j) {
        Integer numValueOf;
        Integer numValueOf2;
        Intrinsics.h(measure, "$this$measure");
        Intrinsics.h(measurables, "measurables");
        List list = measurables;
        final ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long j2 = j;
            arrayList.add(((Measurable) it.next()).c0(Constraints.a(j2, 0, 0, 0, Integer.MAX_VALUE, 2)));
            j = j2;
        }
        long j3 = j;
        final ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Measurable) it2.next()).getA());
        }
        Iterator it3 = arrayList.iterator();
        Integer numValueOf3 = null;
        if (it3.hasNext()) {
            numValueOf = Integer.valueOf(((Placeable) it3.next()).e);
            while (it3.hasNext()) {
                Integer numValueOf4 = Integer.valueOf(((Placeable) it3.next()).e);
                if (numValueOf.compareTo(numValueOf4) > 0) {
                    numValueOf = numValueOf4;
                }
            }
        } else {
            numValueOf = null;
        }
        final int iC = numValueOf != null ? RangesKt.c(numValueOf.intValue(), Constraints.i(j3), Constraints.g(j3)) : 0;
        Iterator it4 = arrayList.iterator();
        if (it4.hasNext()) {
            numValueOf2 = Integer.valueOf(((Placeable) it4.next()).e);
            while (it4.hasNext()) {
                Integer numValueOf5 = Integer.valueOf(((Placeable) it4.next()).e);
                if (numValueOf2.compareTo(numValueOf5) < 0) {
                    numValueOf2 = numValueOf5;
                }
            }
        } else {
            numValueOf2 = null;
        }
        final int iC2 = numValueOf2 != null ? RangesKt.c(numValueOf2.intValue(), Constraints.i(j3), Constraints.g(j3)) : 0;
        Iterator it5 = arrayList.iterator();
        if (it5.hasNext()) {
            numValueOf3 = Integer.valueOf(((Placeable) it5.next()).d);
            while (it5.hasNext()) {
                Integer numValueOf6 = Integer.valueOf(((Placeable) it5.next()).d);
                if (numValueOf3.compareTo(numValueOf6) < 0) {
                    numValueOf3 = numValueOf6;
                }
            }
        }
        final int iC3 = numValueOf3 != null ? RangesKt.c(numValueOf3.intValue(), Constraints.j(j3), Constraints.h(j3)) : 0;
        CollapsingToolbarState collapsingToolbarState = this.f24911a;
        MutableState mutableState = collapsingToolbarState.c;
        MutableState mutableState2 = collapsingToolbarState.f24916a;
        ((SnapshotMutableStateImpl) mutableState).setValue(Integer.valueOf(iC));
        if (collapsingToolbarState.g() < iC) {
            ((SnapshotMutableStateImpl) mutableState2).setValue(Integer.valueOf(iC));
        }
        ((SnapshotMutableStateImpl) collapsingToolbarState.b).setValue(Integer.valueOf(iC2));
        if (iC2 < collapsingToolbarState.g()) {
            ((SnapshotMutableStateImpl) mutableState2).setValue(Integer.valueOf(iC2));
        }
        final int iG = collapsingToolbarState.g();
        return measure.L0(iC3, iG, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: me.onebone.toolbar.CollapsingToolbarMeasurePolicy$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ProgressListener progressListener;
                Placeable.PlacementScope layout = (Placeable.PlacementScope) obj;
                Intrinsics.h(layout, "$this$layout");
                float fJ = this.h.f24911a.j();
                int i = 0;
                for (Object obj2 : arrayList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    Placeable placeable = (Placeable) obj2;
                    Object obj3 = arrayList2.get(i);
                    if ((obj3 instanceof CollapsingToolbarData) && (progressListener = ((CollapsingToolbarData) obj3).f24910a) != null) {
                        progressListener.a();
                    }
                    if (obj3 instanceof CollapsingToolbarRoadData) {
                        CollapsingToolbarRoadData collapsingToolbarRoadData = (CollapsingToolbarRoadData) obj3;
                        BiasAlignment biasAlignment = collapsingToolbarRoadData.b;
                        BiasAlignment biasAlignment2 = collapsingToolbarRoadData.c;
                        long jA = IntSizeKt.a(placeable.d, placeable.e);
                        int i3 = iC3;
                        int i4 = iG;
                        long jA2 = IntSizeKt.a(i3, i4);
                        MeasureScope measureScope = measure;
                        long jA3 = biasAlignment.a(jA, jA2, measureScope.getD());
                        long jA4 = biasAlignment2.a(IntSizeKt.a(placeable.d, placeable.e), IntSizeKt.a(i3, i4), measureScope.getD());
                        int i5 = (int) (jA3 >> 32);
                        int i6 = (int) (jA3 & 4294967295L);
                        long jA5 = IntOffsetKt.a(((int) (jA4 >> 32)) - i5, ((int) (jA4 & 4294967295L)) - i6);
                        long jRound = (Math.round(((int) (jA5 >> 32)) * fJ) << 32) | (Math.round(((int) (jA5 & 4294967295L)) * fJ) & 4294967295L);
                        long jA6 = IntOffsetKt.a(i5 + ((int) (jRound >> 32)), i6 + ((int) (jRound & 4294967295L)));
                        layout.e(placeable, (int) (jA6 >> 32), (int) (jA6 & 4294967295L), BitmapDescriptorFactory.HUE_RED);
                    } else if (obj3 instanceof CollapsingToolbarParallaxData) {
                        Placeable.PlacementScope.h(layout, placeable, 0, -MathKt.b((1 - fJ) * (iC2 - iC) * ((CollapsingToolbarParallaxData) obj3).b));
                    } else {
                        Placeable.PlacementScope.h(layout, placeable, 0, 0);
                    }
                    i = i2;
                }
                return Unit.f24250a;
            }
        });
    }
}
