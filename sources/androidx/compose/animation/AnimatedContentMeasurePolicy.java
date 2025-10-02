package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/AnimatedContentMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class AnimatedContentMeasurePolicy implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final AnimatedContentTransitionScopeImpl f711a;

    public AnimatedContentMeasurePolicy(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
        this.f711a = animatedContentTransitionScopeImpl;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(MeasureScope measureScope, List list, long j) {
        Placeable placeable;
        Placeable placeable2;
        final int i;
        final int i2;
        int size = list.size();
        final Placeable[] placeableArr = new Placeable[size];
        List list2 = list;
        int size2 = list2.size();
        long j2 = 0;
        int i3 = 0;
        while (true) {
            placeable = null;
            if (i3 >= size2) {
                break;
            }
            Measurable measurable = (Measurable) list.get(i3);
            Object a2 = measurable.getA();
            AnimatedContentTransitionScopeImpl.ChildData childData = a2 instanceof AnimatedContentTransitionScopeImpl.ChildData ? (AnimatedContentTransitionScopeImpl.ChildData) a2 : null;
            if (childData != null && ((Boolean) ((SnapshotMutableStateImpl) childData.d).getD()).booleanValue()) {
                placeableArr[i3] = measurable.c0(j);
                j2 = (r8.e & 4294967295L) | (r8.d << 32);
            }
            i3++;
        }
        int size3 = list2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            Measurable measurable2 = (Measurable) list.get(i4);
            if (placeableArr[i4] == null) {
                placeableArr[i4] = measurable2.c0(j);
            }
        }
        if (measureScope.l1()) {
            i = (int) (j2 >> 32);
        } else {
            if (size == 0) {
                placeable2 = null;
            } else {
                placeable2 = placeableArr[0];
                int i5 = size - 1;
                if (i5 != 0) {
                    int i6 = placeable2 != null ? placeable2.d : 0;
                    IntProgressionIterator it = new IntRange(1, i5, 1).iterator();
                    while (it.f) {
                        Placeable placeable3 = placeableArr[it.nextInt()];
                        int i7 = placeable3 != null ? placeable3.d : 0;
                        if (i6 < i7) {
                            placeable2 = placeable3;
                            i6 = i7;
                        }
                    }
                }
            }
            i = placeable2 != null ? placeable2.d : 0;
        }
        if (measureScope.l1()) {
            i2 = (int) (j2 & 4294967295L);
        } else {
            if (size != 0) {
                placeable = placeableArr[0];
                int i8 = size - 1;
                if (i8 != 0) {
                    int i9 = placeable != null ? placeable.e : 0;
                    IntProgressionIterator it2 = new IntRange(1, i8, 1).iterator();
                    while (it2.f) {
                        Placeable placeable4 = placeableArr[it2.nextInt()];
                        int i10 = placeable4 != null ? placeable4.e : 0;
                        if (i9 < i10) {
                            placeable = placeable4;
                            i9 = i10;
                        }
                    }
                }
            }
            i2 = placeable != null ? placeable.e : 0;
        }
        if (!measureScope.l1()) {
            ((SnapshotMutableStateImpl) this.f711a.d).setValue(new IntSize((i << 32) | (i2 & 4294967295L)));
        }
        return measureScope.L0(i, i2, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                for (Placeable placeable5 : placeableArr) {
                    if (placeable5 != null) {
                        long jA = this.f711a.b.a((placeable5.d << 32) | (placeable5.e & 4294967295L), (i << 32) | (i2 & 4294967295L), LayoutDirection.d);
                        placementScope.e(placeable5, (int) (jA >> 32), (int) (jA & 4294967295L), BitmapDescriptorFactory.HUE_RED);
                    }
                }
                return Unit.f24250a;
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int d(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((IntrinsicMeasurable) list.get(0)).T(i));
            int I = CollectionsKt.I(list);
            int i2 = 1;
            if (1 <= I) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((IntrinsicMeasurable) list.get(i2)).T(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == I) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int e(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((IntrinsicMeasurable) list.get(0)).a0(i));
            int I = CollectionsKt.I(list);
            int i2 = 1;
            if (1 <= I) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((IntrinsicMeasurable) list.get(i2)).a0(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == I) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int f(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((IntrinsicMeasurable) list.get(0)).J(i));
            int I = CollectionsKt.I(list);
            int i2 = 1;
            if (1 <= I) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((IntrinsicMeasurable) list.get(i2)).J(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == I) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int h(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((IntrinsicMeasurable) list.get(0)).b0(i));
            int I = CollectionsKt.I(list);
            int i2 = 1;
            if (1 <= I) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((IntrinsicMeasurable) list.get(i2)).b0(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == I) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
