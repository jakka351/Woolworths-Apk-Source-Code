package androidx.compose.material3;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.crypto.CryptoServicesPermission;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "<name for destructuring parameter 0>", "", "Landroidx/compose/ui/layout/Measurable;", CryptoServicesPermission.CONSTRAINTS, "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class TabRowKt$TabRowImpl$1$2$1 implements MultiContentMeasurePolicy {

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.material3.TabRowKt$TabRowImpl$1$2$1$2, reason: invalid class name */
    final class AnonymousClass2 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
        public final /* synthetic */ ArrayList h;
        public final /* synthetic */ ArrayList i;
        public final /* synthetic */ ArrayList j;
        public final /* synthetic */ Ref.IntRef k;
        public final /* synthetic */ int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Ref.IntRef intRef, int i) {
            super(1);
            this.h = arrayList;
            this.i = arrayList2;
            this.j = arrayList3;
            this.k = intRef;
            this.l = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            int i;
            Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Placeable.PlacementScope.h(placementScope, (Placeable) arrayList.get(i2), this.k.d * i2, 0);
            }
            ArrayList arrayList2 = this.i;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (true) {
                i = this.l;
                if (i3 >= size2) {
                    break;
                }
                Placeable placeable = (Placeable) arrayList2.get(i3);
                Placeable.PlacementScope.h(placementScope, placeable, 0, i - placeable.e);
                i3++;
            }
            ArrayList arrayList3 = this.j;
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                Placeable placeable2 = (Placeable) arrayList3.get(i4);
                Placeable.PlacementScope.h(placementScope, placeable2, 0, i - placeable2.e);
            }
            return Unit.f24250a;
        }
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final MeasureResult c(MeasureScope measureScope, List list, long j) {
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        int iH = Constraints.h(j);
        int size = list2.size();
        Ref.IntRef intRef = new Ref.IntRef();
        if (size > 0) {
            intRef.d = iH / size;
        }
        Integer numValueOf = 0;
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            numValueOf = Integer.valueOf(Math.max(((Measurable) list2.get(i)).J(intRef.d), numValueOf.intValue()));
        }
        int iIntValue = numValueOf.intValue();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(new TabPosition(measureScope.B(intRef.d) * i2, measureScope.B(intRef.d), ((Dp) ComparisonsKt.d(new Dp(measureScope.B(Math.min(((Measurable) list2.get(i2)).b0(iIntValue), intRef.d)) - (TabKt.c * 2)), new Dp(24))).d));
        }
        throw null;
    }
}
