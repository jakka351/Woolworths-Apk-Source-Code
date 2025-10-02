package androidx.compose.material3;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
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
final class TabRowKt$ScrollableTabRowImpl$1$2$1 implements MultiContentMeasurePolicy {

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$2$1$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            throw null;
        }
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final MeasureResult c(MeasureScope measureScope, List list, long j) {
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        measureScope.r1(BitmapDescriptorFactory.HUE_RED);
        int size = list2.size();
        int iR1 = measureScope.r1(TabRowKt.f1512a);
        Integer numValueOf = 0;
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((Measurable) list2.get(i)).J(Integer.MAX_VALUE)));
        }
        int iIntValue = numValueOf.intValue();
        long jA = Constraints.a(j, iR1, 0, iIntValue, iIntValue, 2);
        Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.d = BitmapDescriptorFactory.HUE_RED;
        ArrayList arrayList2 = new ArrayList(list2.size());
        int size3 = list2.size();
        for (int iF = 0; iF < size3; iF = androidx.camera.core.impl.b.f((Measurable) list2.get(iF), jA, arrayList2, iF, 1)) {
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            float f = ((Dp) ComparisonsKt.d(new Dp(TabRowKt.f1512a), new Dp(measureScope.B(((Placeable) arrayList2.get(i2)).d)))).d;
            measureScope.r1(f);
            float f2 = ((Dp) ComparisonsKt.d(new Dp(f - (TabKt.c * 2)), new Dp(24))).d;
            float f3 = floatRef.d;
            TabPosition tabPosition = new TabPosition(f3, f, f2);
            floatRef.d = f3 + f;
            arrayList3.add(tabPosition);
        }
        throw null;
    }
}
