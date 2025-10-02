package androidx.compose.material3;

import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.crypto.CryptoServicesPermission;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", CryptoServicesPermission.CONSTRAINTS, "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class NavigationDrawerKt$ModalNavigationDrawer$2$6$1 implements MeasurePolicy {
    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(MeasureScope measureScope, List list, long j) {
        int i;
        Integer numValueOf;
        long jA = Constraints.a(j, 0, 0, 0, 0, 10);
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iF = 0;
        while (true) {
            i = 1;
            if (iF >= size) {
                break;
            }
            iF = androidx.camera.core.impl.b.f((Measurable) list.get(iF), jA, arrayList, iF, 1);
        }
        Integer num = null;
        if (arrayList.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((Placeable) arrayList.get(0)).d);
            int I = CollectionsKt.I(arrayList);
            if (1 <= I) {
                int i2 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((Placeable) arrayList.get(i2)).d);
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == I) {
                        break;
                    }
                    i2++;
                }
            }
        }
        final int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        if (!arrayList.isEmpty()) {
            Integer numValueOf3 = Integer.valueOf(((Placeable) arrayList.get(0)).e);
            int I2 = CollectionsKt.I(arrayList);
            if (1 <= I2) {
                while (true) {
                    Integer numValueOf4 = Integer.valueOf(((Placeable) arrayList.get(i)).e);
                    if (numValueOf4.compareTo(numValueOf3) > 0) {
                        numValueOf3 = numValueOf4;
                    }
                    if (i == I2) {
                        break;
                    }
                    i++;
                }
            }
            num = numValueOf3;
        }
        final MutableState mutableState = null;
        final MutableFloatState mutableFloatState = null;
        final DrawerState drawerState = null;
        return measureScope.L0(iIntValue, num != null ? num.intValue() : 0, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$6$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                AnchoredDraggableState anchoredDraggableState = drawerState.f1441a;
                float fC = anchoredDraggableState.e().c(DrawerValue.d);
                float f = -iIntValue;
                float f2 = NavigationDrawerKt.f1464a;
                MutableState mutableState2 = mutableState;
                if (!((Boolean) mutableState2.getD()).booleanValue() || fC != f) {
                    if (!((Boolean) mutableState2.getD()).booleanValue()) {
                        mutableState2.setValue(Boolean.TRUE);
                    }
                    final MutableFloatState mutableFloatState2 = mutableFloatState;
                    mutableFloatState2.p(f);
                    AnchoredDraggableState.l(anchoredDraggableState, AnchoredDraggableKt.a(new Function1<DraggableAnchorsConfig<DrawerValue>, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt.ModalNavigationDrawer.2.6.1.1.1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            DraggableAnchorsConfig draggableAnchorsConfig = (DraggableAnchorsConfig) obj2;
                            float f3 = NavigationDrawerKt.f1464a;
                            draggableAnchorsConfig.a(DrawerValue.d, mutableFloatState2.a());
                            draggableAnchorsConfig.a(DrawerValue.e, BitmapDescriptorFactory.HUE_RED);
                            return Unit.f24250a;
                        }
                    }));
                }
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
