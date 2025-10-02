package androidx.compose.ui.window;

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
final class AndroidDialog_androidKt$DialogLayout$1 implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidDialog_androidKt$DialogLayout$1 f2214a = new AndroidDialog_androidKt$DialogLayout$1();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(MeasureScope measureScope, List list, long j) {
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iJ = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Placeable placeableC0 = ((Measurable) list.get(i2)).c0(j);
            iJ = Math.max(iJ, placeableC0.d);
            i = Math.max(i, placeableC0.e);
            arrayList.add(placeableC0);
        }
        if (list.isEmpty()) {
            iJ = Constraints.j(j);
            i = Constraints.i(j);
        }
        return measureScope.L0(iJ, i, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                ArrayList arrayList2 = arrayList;
                int size2 = arrayList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Placeable.PlacementScope.h(placementScope, (Placeable) arrayList2.get(i3), 0, 0);
                }
                return Unit.f24250a;
            }
        });
    }
}
