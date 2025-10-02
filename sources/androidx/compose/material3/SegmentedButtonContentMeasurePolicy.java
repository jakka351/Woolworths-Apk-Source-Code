package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/SegmentedButtonContentMeasurePolicy;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SegmentedButtonContentMeasurePolicy implements MultiContentMeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f1487a;
    public Animatable b;
    public Integer c;

    public SegmentedButtonContentMeasurePolicy(CoroutineScope coroutineScope) {
        this.f1487a = coroutineScope;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final MeasureResult c(final MeasureScope measureScope, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        int i = 1;
        List list3 = (List) arrayList.get(1);
        final ArrayList arrayList2 = new ArrayList(list2.size());
        int size = list2.size();
        int iF = 0;
        while (iF < size) {
            iF = androidx.camera.core.impl.b.f((Measurable) list2.get(iF), j, arrayList2, iF, 1);
        }
        if (arrayList2.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList2.get(0);
            int i2 = ((Placeable) obj).d;
            int I = CollectionsKt.I(arrayList2);
            if (1 <= I) {
                int i3 = 1;
                while (true) {
                    Object obj4 = arrayList2.get(i3);
                    int i4 = ((Placeable) obj4).d;
                    if (i2 < i4) {
                        obj = obj4;
                        i2 = i4;
                    }
                    if (i3 == I) {
                        break;
                    }
                    i3++;
                }
            }
        }
        Placeable placeable = (Placeable) obj;
        int i5 = placeable != null ? placeable.d : 0;
        final ArrayList arrayList3 = new ArrayList(list3.size());
        int size2 = list3.size();
        int iF2 = 0;
        while (iF2 < size2) {
            ArrayList arrayList4 = arrayList3;
            iF2 = androidx.camera.core.impl.b.f((Measurable) list3.get(iF2), j, arrayList4, iF2, 1);
            arrayList3 = arrayList4;
        }
        if (arrayList3.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList3.get(0);
            int i6 = ((Placeable) obj2).d;
            int I2 = CollectionsKt.I(arrayList3);
            if (1 <= I2) {
                int i7 = 1;
                while (true) {
                    Object obj5 = arrayList3.get(i7);
                    int i8 = ((Placeable) obj5).d;
                    if (i6 < i8) {
                        obj2 = obj5;
                        i6 = i8;
                    }
                    if (i7 == I2) {
                        break;
                    }
                    i7++;
                }
            }
        }
        Placeable placeable2 = (Placeable) obj2;
        Integer numValueOf = placeable2 != null ? Integer.valueOf(placeable2.d) : null;
        if (arrayList3.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = arrayList3.get(0);
            int i9 = ((Placeable) obj3).e;
            int I3 = CollectionsKt.I(arrayList3);
            if (1 <= I3) {
                while (true) {
                    Object obj6 = arrayList3.get(i);
                    int i10 = ((Placeable) obj6).e;
                    if (i9 < i10) {
                        obj3 = obj6;
                        i9 = i10;
                    }
                    if (i == I3) {
                        break;
                    }
                    i++;
                }
            }
        }
        Placeable placeable3 = (Placeable) obj3;
        final int i11 = placeable3 != null ? placeable3.e : 0;
        float f = SegmentedButtonDefaults.c;
        int iMax = Math.max(measureScope.r1(f), i5);
        float f2 = SegmentedButtonKt.f1489a;
        int iR1 = measureScope.r1(f2) + iMax + (numValueOf != null ? numValueOf.intValue() : 0);
        final int i12 = i5 == 0 ? (-(measureScope.r1(f2) + measureScope.r1(f))) / 2 : 0;
        Integer num = this.c;
        if (num == null) {
            this.c = Integer.valueOf(i12);
        } else {
            Animatable animatable = this.b;
            if (animatable == null) {
                animatable = new Animatable(num, VectorConvertersKt.b, (Object) null, 12);
                this.b = animatable;
            }
            if (((Number) ((SnapshotMutableStateImpl) animatable.e).getD()).intValue() != i12) {
                BuildersKt.c(this.f1487a, null, null, new SegmentedButtonContentMeasurePolicy$measure$1(animatable, i12, null), 3);
            }
        }
        return measureScope.L0(iR1, i11, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.SegmentedButtonContentMeasurePolicy$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj7) {
                int i13;
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj7;
                ArrayList arrayList5 = arrayList2;
                int size3 = arrayList5.size();
                int i14 = 0;
                while (true) {
                    i13 = i11;
                    if (i14 >= size3) {
                        break;
                    }
                    Placeable placeable4 = (Placeable) arrayList5.get(i14);
                    placementScope.e(placeable4, 0, (i13 - placeable4.e) / 2, BitmapDescriptorFactory.HUE_RED);
                    i14++;
                }
                float f3 = SegmentedButtonDefaults.c;
                MeasureScope measureScope2 = measureScope;
                int iR12 = measureScope2.r1(SegmentedButtonKt.f1489a) + measureScope2.r1(f3);
                Animatable animatable2 = this.b;
                int iIntValue = iR12 + (animatable2 != null ? ((Number) animatable2.f()).intValue() : i12);
                ArrayList arrayList6 = arrayList3;
                int size4 = arrayList6.size();
                for (int i15 = 0; i15 < size4; i15++) {
                    Placeable placeable5 = (Placeable) arrayList6.get(i15);
                    placementScope.e(placeable5, iIntValue, (i13 - placeable5.e) / 2, BitmapDescriptorFactory.HUE_RED);
                }
                return Unit.f24250a;
            }
        });
    }
}
