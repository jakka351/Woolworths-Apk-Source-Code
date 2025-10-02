package au.com.woolworths.foundation.rewards.offers.ui;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class RewardsOfferTileKt$BottomCenterAligned$1$1 implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final RewardsOfferTileKt$BottomCenterAligned$1$1 f8627a = new RewardsOfferTileKt$BottomCenterAligned$1$1();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(MeasureScope Layout, List measurables, long j) {
        Intrinsics.h(Layout, "$this$Layout");
        Intrinsics.h(measurables, "measurables");
        List list = measurables;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Measurable) it.next()).c0(j));
        }
        Placeable placeable = (Placeable) CollectionsKt.F(arrayList);
        Placeable placeable2 = (Placeable) CollectionsKt.F(CollectionsKt.x(arrayList, 1));
        int i = placeable != null ? placeable.e : 0;
        return Layout.L0(Constraints.h(j), ConstraintsKt.f(((placeable2 != null ? placeable2.e : 0) / 2) + i, j), EmptyMap.d, new c(i, 0, placeable, placeable2));
    }
}
