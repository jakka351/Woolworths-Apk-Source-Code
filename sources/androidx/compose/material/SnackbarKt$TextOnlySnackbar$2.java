package androidx.compose.material;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.crypto.CryptoServicesPermission;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", CryptoServicesPermission.CONSTRAINTS, "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class SnackbarKt$TextOnlySnackbar$2 implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final SnackbarKt$TextOnlySnackbar$2 f1329a = new SnackbarKt$TextOnlySnackbar$2();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(MeasureScope measureScope, List list, long j) {
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        boolean z = false;
        int iD0 = Integer.MIN_VALUE;
        int iD02 = Integer.MIN_VALUE;
        int iMax = 0;
        for (int i = 0; i < size; i++) {
            Placeable placeableC0 = ((Measurable) list.get(i)).c0(j);
            arrayList.add(placeableC0);
            HorizontalAlignmentLine horizontalAlignmentLine = AlignmentLineKt.f1871a;
            if (placeableC0.d0(horizontalAlignmentLine) != Integer.MIN_VALUE && (iD0 == Integer.MIN_VALUE || placeableC0.d0(horizontalAlignmentLine) < iD0)) {
                iD0 = placeableC0.d0(horizontalAlignmentLine);
            }
            HorizontalAlignmentLine horizontalAlignmentLine2 = AlignmentLineKt.b;
            if (placeableC0.d0(horizontalAlignmentLine2) != Integer.MIN_VALUE && (iD02 == Integer.MIN_VALUE || placeableC0.d0(horizontalAlignmentLine2) > iD02)) {
                iD02 = placeableC0.d0(horizontalAlignmentLine2);
            }
            iMax = Math.max(iMax, placeableC0.e);
        }
        if (iD0 != Integer.MIN_VALUE && iD02 != Integer.MIN_VALUE) {
            z = true;
        }
        final int iMax2 = Math.max(measureScope.r1((iD0 == iD02 || !z) ? SnackbarKt.h : SnackbarKt.i), iMax);
        return measureScope.L0(Constraints.h(j), iMax2, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.SnackbarKt$TextOnlySnackbar$2.2
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
                    Placeable placeable = (Placeable) arrayList2.get(i2);
                    Placeable.PlacementScope.h(placementScope, placeable, 0, (iMax2 - placeable.e) / 2);
                }
                return Unit.f24250a;
            }
        });
    }
}
