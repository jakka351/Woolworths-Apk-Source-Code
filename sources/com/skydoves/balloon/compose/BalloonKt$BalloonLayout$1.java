package com.skydoves.balloon.compose;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
final class BalloonKt$BalloonLayout$1 implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final BalloonKt$BalloonLayout$1 f19019a = new BalloonKt$BalloonLayout$1();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(MeasureScope Layout, List measurables, long j) {
        Intrinsics.h(Layout, "$this$Layout");
        Intrinsics.h(measurables, "measurables");
        long jA = Constraints.a(j, 0, 0, 0, 0, 10);
        List list = measurables;
        final ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Measurable) it.next()).c0(jA));
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        int i = ((Placeable) it2.next()).d;
        while (it2.hasNext()) {
            int i2 = ((Placeable) it2.next()).d;
            if (i < i2) {
                i = i2;
            }
        }
        int iMax = Integer.max(i, Constraints.j(j));
        Iterator it3 = arrayList.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = ((Placeable) it3.next()).e;
        while (it3.hasNext()) {
            int i4 = ((Placeable) it3.next()).e;
            if (i3 < i4) {
                i3 = i4;
            }
        }
        return Layout.L0(iMax, Integer.max(i3, Constraints.i(j)), EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.skydoves.balloon.compose.BalloonKt$BalloonLayout$1$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope layout = (Placeable.PlacementScope) obj;
                Intrinsics.h(layout, "$this$layout");
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    layout.e((Placeable) it4.next(), 0, 0, BitmapDescriptorFactory.HUE_RED);
                }
                return Unit.f24250a;
            }
        });
    }
}
