package androidx.compose.foundation.layout;

import androidx.camera.core.impl.b;
import androidx.collection.MutableScatterMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/BoxMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final /* data */ class BoxMeasurePolicy implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final Alignment f943a;
    public final boolean b;

    public BoxMeasurePolicy(Alignment alignment, boolean z) {
        this.f943a = alignment;
        this.b = z;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(final MeasureScope measureScope, final List list, long j) {
        int iJ;
        int i;
        Placeable placeableC0;
        if (list.isEmpty()) {
            return measureScope.L0(Constraints.j(j), Constraints.i(j), EmptyMap.d, BoxMeasurePolicy$measure$1.h);
        }
        long j2 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final Measurable measurable = (Measurable) list.get(0);
            MutableScatterMap mutableScatterMap = BoxKt.f941a;
            Object a2 = measurable.getA();
            BoxChildDataNode boxChildDataNode = a2 instanceof BoxChildDataNode ? (BoxChildDataNode) a2 : null;
            if (boxChildDataNode != null ? boxChildDataNode.s : false) {
                iJ = Constraints.j(j);
                i = Constraints.i(j);
                placeableC0 = measurable.c0(Constraints.Companion.c(Constraints.j(j), Constraints.i(j)));
            } else {
                placeableC0 = measurable.c0(j2);
                iJ = Math.max(Constraints.j(j), placeableC0.d);
                i = Math.max(Constraints.i(j), placeableC0.e);
            }
            final int i2 = i;
            final int i3 = iJ;
            final Placeable placeable = placeableC0;
            return measureScope.L0(i3, i2, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$measure$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    BoxKt.b((Placeable.PlacementScope) obj, placeable, measurable, measureScope.getD(), i3, i2, this.f943a);
                    return Unit.f24250a;
                }
            });
        }
        final Placeable[] placeableArr = new Placeable[list.size()];
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.d = Constraints.j(j);
        final Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.d = Constraints.i(j);
        List list2 = list;
        int size = list2.size();
        boolean z = false;
        for (int i4 = 0; i4 < size; i4++) {
            Measurable measurable2 = (Measurable) list.get(i4);
            MutableScatterMap mutableScatterMap2 = BoxKt.f941a;
            Object a3 = measurable2.getA();
            BoxChildDataNode boxChildDataNode2 = a3 instanceof BoxChildDataNode ? (BoxChildDataNode) a3 : null;
            if (boxChildDataNode2 != null ? boxChildDataNode2.s : false) {
                z = true;
            } else {
                Placeable placeableC02 = measurable2.c0(j2);
                placeableArr[i4] = placeableC02;
                intRef.d = Math.max(intRef.d, placeableC02.d);
                intRef2.d = Math.max(intRef2.d, placeableC02.e);
            }
        }
        if (z) {
            int i5 = intRef.d;
            int i6 = i5 != Integer.MAX_VALUE ? i5 : 0;
            int i7 = intRef2.d;
            long jA = ConstraintsKt.a(i6, i5, i7 != Integer.MAX_VALUE ? i7 : 0, i7);
            int size2 = list2.size();
            for (int i8 = 0; i8 < size2; i8++) {
                Measurable measurable3 = (Measurable) list.get(i8);
                MutableScatterMap mutableScatterMap3 = BoxKt.f941a;
                Object a4 = measurable3.getA();
                BoxChildDataNode boxChildDataNode3 = a4 instanceof BoxChildDataNode ? (BoxChildDataNode) a4 : null;
                if (boxChildDataNode3 != null ? boxChildDataNode3.s : false) {
                    placeableArr[i8] = measurable3.c0(jA);
                }
            }
        }
        return measureScope.L0(intRef.d, intRef2.d, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$measure$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                Placeable[] placeableArr2 = placeableArr;
                int length = placeableArr2.length;
                int i9 = 0;
                int i10 = 0;
                while (i10 < length) {
                    int i11 = i9;
                    Placeable placeable2 = placeableArr2[i10];
                    Intrinsics.f(placeable2, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    BoxKt.b(placementScope, placeable2, (Measurable) list.get(i11), measureScope.getD(), intRef.d, intRef2.d, this.f943a);
                    i10++;
                    i9 = i11 + 1;
                }
                return Unit.f24250a;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxMeasurePolicy)) {
            return false;
        }
        BoxMeasurePolicy boxMeasurePolicy = (BoxMeasurePolicy) obj;
        return Intrinsics.c(this.f943a, boxMeasurePolicy.f943a) && this.b == boxMeasurePolicy.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f943a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb.append(this.f943a);
        sb.append(", propagateMinConstraints=");
        return b.s(sb, this.b, ')');
    }
}
