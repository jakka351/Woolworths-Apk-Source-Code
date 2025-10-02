package androidx.compose.material;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.crypto.CryptoServicesPermission;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", CryptoServicesPermission.CONSTRAINTS, "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class BadgeKt$BadgedBox$2 implements MeasurePolicy {
    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(final MeasureScope measureScope, List list, long j) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Measurable measurable = (Measurable) list.get(i);
            if (Intrinsics.c(LayoutIdKt.a(measurable), "badge")) {
                final Placeable placeableC0 = measurable.c0(Constraints.a(j, 0, 0, 0, 0, 11));
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Measurable measurable2 = (Measurable) list.get(i2);
                    if (Intrinsics.c(LayoutIdKt.a(measurable2), "anchor")) {
                        final Placeable placeableC02 = measurable2.c0(j);
                        HorizontalAlignmentLine horizontalAlignmentLine = AlignmentLineKt.f1871a;
                        int iD0 = placeableC02.d0(horizontalAlignmentLine);
                        HorizontalAlignmentLine horizontalAlignmentLine2 = AlignmentLineKt.b;
                        return measureScope.L0(placeableC02.d, placeableC02.e, MapsKt.j(new Pair(horizontalAlignmentLine, Integer.valueOf(iD0)), new Pair(horizontalAlignmentLine2, Integer.valueOf(placeableC02.d0(horizontalAlignmentLine2)))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BadgeKt$BadgedBox$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                                Placeable placeable = placeableC0;
                                int i3 = placeable.d;
                                float f = BadgeKt.f1242a;
                                MeasureScope measureScope2 = measureScope;
                                float f2 = i3 > measureScope2.r1(f) * 2 ? BadgeKt.e : BadgeKt.f;
                                Placeable placeable2 = placeableC02;
                                Placeable.PlacementScope.h(placementScope, placeable2, 0, 0);
                                Placeable.PlacementScope.h(placementScope, placeable, measureScope2.r1(f2) + placeable2.d, (-placeable.e) / 2);
                                return Unit.f24250a;
                            }
                        });
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
