package androidx.compose.material3;

import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.crypto.CryptoServicesPermission;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", CryptoServicesPermission.CONSTRAINTS, "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1 implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1 f1522a = new TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(MeasureScope measureScope, List list, long j) {
        int size = list.size();
        int iF = 0;
        for (int i = 0; i < size; i++) {
            Measurable measurable = (Measurable) list.get(i);
            if (Intrinsics.c(LayoutIdKt.a(measurable), "Spacer")) {
                final Placeable placeableC0 = measurable.c0(Constraints.a(j, 0, 0, 0, measureScope.r1(TimePickerTokens.e), 3));
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Object obj = list.get(i2);
                    if (!Intrinsics.c(LayoutIdKt.a((Measurable) obj), "Spacer")) {
                        arrayList.add(obj);
                    }
                }
                final ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size3 = arrayList.size();
                while (iF < size3) {
                    iF = androidx.camera.core.impl.b.f((Measurable) arrayList.get(iF), Constraints.a(j, 0, 0, 0, Constraints.g(j) / 2, 3), arrayList2, iF, 1);
                }
                return measureScope.L0(Constraints.h(j), Constraints.g(j), EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj2;
                        ArrayList arrayList3 = arrayList2;
                        placementScope.e((Placeable) arrayList3.get(0), 0, 0, BitmapDescriptorFactory.HUE_RED);
                        placementScope.e((Placeable) arrayList3.get(1), 0, ((Placeable) arrayList3.get(0)).e, BitmapDescriptorFactory.HUE_RED);
                        int i3 = ((Placeable) arrayList3.get(0)).e;
                        Placeable placeable = placeableC0;
                        placementScope.e(placeable, 0, i3 - (placeable.e / 2), BitmapDescriptorFactory.HUE_RED);
                        return Unit.f24250a;
                    }
                });
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
