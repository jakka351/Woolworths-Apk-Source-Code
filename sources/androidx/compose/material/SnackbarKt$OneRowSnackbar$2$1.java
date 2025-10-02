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
import com.salesforce.marketingcloud.UrlHandler;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.crypto.CryptoServicesPermission;
import org.bouncycastle.i18n.TextBundle;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", CryptoServicesPermission.CONSTRAINTS, "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class SnackbarKt$OneRowSnackbar$2$1 implements MeasurePolicy {
    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(MeasureScope measureScope, List list, long j) {
        int iR1;
        int iMax;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Measurable measurable = (Measurable) list.get(i2);
            if (Intrinsics.c(LayoutIdKt.a(measurable), UrlHandler.ACTION)) {
                long j2 = j;
                final Placeable placeableC0 = measurable.c0(j2);
                int iH = (Constraints.h(j2) - placeableC0.d) - measureScope.r1(SnackbarKt.f);
                int iJ = Constraints.j(j2);
                int i3 = iH < iJ ? iJ : iH;
                int size2 = list.size();
                int i4 = 0;
                while (i4 < size2) {
                    Measurable measurable2 = (Measurable) list.get(i4);
                    if (Intrinsics.c(LayoutIdKt.a(measurable2), TextBundle.TEXT_ENTRY)) {
                        final Placeable placeableC02 = measurable2.c0(Constraints.a(j2, 0, i3, 0, 0, 9));
                        HorizontalAlignmentLine horizontalAlignmentLine = AlignmentLineKt.f1871a;
                        int iD0 = placeableC02.d0(horizontalAlignmentLine);
                        int iD02 = placeableC02.d0(AlignmentLineKt.b);
                        boolean z = true;
                        boolean z2 = (iD0 == Integer.MIN_VALUE || iD02 == Integer.MIN_VALUE) ? false : true;
                        if (iD0 != iD02 && z2) {
                            z = false;
                        }
                        final int iH2 = Constraints.h(j) - placeableC0.d;
                        if (z) {
                            iMax = Math.max(measureScope.r1(SnackbarKt.h), placeableC0.e);
                            iR1 = (iMax - placeableC02.e) / 2;
                            int iD03 = placeableC0.d0(horizontalAlignmentLine);
                            if (iD03 != Integer.MIN_VALUE) {
                                i = (iD0 + iR1) - iD03;
                            }
                        } else {
                            iR1 = measureScope.r1(SnackbarKt.f1328a) - iD0;
                            iMax = Math.max(measureScope.r1(SnackbarKt.i), placeableC02.e + iR1);
                            i = (iMax - placeableC0.e) / 2;
                        }
                        final int i5 = i;
                        final int i6 = iR1;
                        return measureScope.L0(Constraints.h(j), iMax, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.SnackbarKt$OneRowSnackbar$2$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                                Placeable.PlacementScope.h(placementScope, placeableC02, 0, i6);
                                Placeable.PlacementScope.h(placementScope, placeableC0, iH2, i5);
                                return Unit.f24250a;
                            }
                        });
                    }
                    i4++;
                    j2 = j;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
