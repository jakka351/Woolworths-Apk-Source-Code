package androidx.compose.animation;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/AnimatedEnterExitMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class AnimatedEnterExitMeasurePolicy implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final AnimatedVisibilityScopeImpl f714a;
    public boolean b;

    public AnimatedEnterExitMeasurePolicy(AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl) {
        this.f714a = animatedVisibilityScopeImpl;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(MeasureScope measureScope, List list, long j) {
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            Placeable placeableC0 = ((Measurable) list.get(i)).c0(j);
            iMax = Math.max(iMax, placeableC0.d);
            iMax2 = Math.max(iMax2, placeableC0.e);
            arrayList.add(placeableC0);
        }
        boolean zL1 = measureScope.l1();
        AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl = this.f714a;
        if (zL1) {
            this.b = true;
            ((SnapshotMutableStateImpl) animatedVisibilityScopeImpl.f715a).setValue(new IntSize((4294967295L & iMax2) | (iMax << 32)));
        } else if (!this.b) {
            ((SnapshotMutableStateImpl) animatedVisibilityScopeImpl.f715a).setValue(new IntSize((4294967295L & iMax2) | (iMax << 32)));
        }
        return measureScope.L0(iMax, iMax2, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                ArrayList arrayList2 = arrayList;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    placementScope.e((Placeable) arrayList2.get(i2), 0, 0, BitmapDescriptorFactory.HUE_RED);
                }
                return Unit.f24250a;
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int d(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iT = ((IntrinsicMeasurable) list.get(0)).T(i);
        int I = CollectionsKt.I(list);
        int i2 = 1;
        if (1 <= I) {
            while (true) {
                int iT2 = ((IntrinsicMeasurable) list.get(i2)).T(i);
                if (iT2 > iT) {
                    iT = iT2;
                }
                if (i2 == I) {
                    break;
                }
                i2++;
            }
        }
        return iT;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int e(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iA0 = ((IntrinsicMeasurable) list.get(0)).a0(i);
        int I = CollectionsKt.I(list);
        int i2 = 1;
        if (1 <= I) {
            while (true) {
                int iA02 = ((IntrinsicMeasurable) list.get(i2)).a0(i);
                if (iA02 > iA0) {
                    iA0 = iA02;
                }
                if (i2 == I) {
                    break;
                }
                i2++;
            }
        }
        return iA0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int f(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iJ = ((IntrinsicMeasurable) list.get(0)).J(i);
        int I = CollectionsKt.I(list);
        int i2 = 1;
        if (1 <= I) {
            while (true) {
                int iJ2 = ((IntrinsicMeasurable) list.get(i2)).J(i);
                if (iJ2 > iJ) {
                    iJ = iJ2;
                }
                if (i2 == I) {
                    break;
                }
                i2++;
            }
        }
        return iJ;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int h(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iB0 = ((IntrinsicMeasurable) list.get(0)).b0(i);
        int I = CollectionsKt.I(list);
        int i2 = 1;
        if (1 <= I) {
            while (true) {
                int iB02 = ((IntrinsicMeasurable) list.get(i2)).b0(i);
                if (iB02 > iB0) {
                    iB0 = iB02;
                }
                if (i2 == I) {
                    break;
                }
                i2++;
            }
        }
        return iB0;
    }
}
