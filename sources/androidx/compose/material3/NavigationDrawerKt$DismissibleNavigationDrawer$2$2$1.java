package androidx.compose.material3;

import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import org.bouncycastle.crypto.CryptoServicesPermission;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", CryptoServicesPermission.CONSTRAINTS, "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1 implements MeasurePolicy {
    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(MeasureScope measureScope, List list, long j) {
        final Placeable placeableC0 = ((Measurable) list.get(0)).c0(j);
        final Placeable placeableC02 = ((Measurable) list.get(1)).c0(j);
        final DrawerState drawerState = null;
        final MutableState mutableState = null;
        return measureScope.L0(placeableC02.d, placeableC02.e, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                AnchoredDraggableState anchoredDraggableState = drawerState.f1441a;
                float fC = anchoredDraggableState.e().c(DrawerValue.d);
                Placeable placeable = placeableC0;
                final float f = -placeable.d;
                float f2 = NavigationDrawerKt.f1464a;
                MutableState mutableState2 = mutableState;
                if (!((Boolean) mutableState2.getD()).booleanValue() || fC != f) {
                    if (!((Boolean) mutableState2.getD()).booleanValue()) {
                        mutableState2.setValue(Boolean.TRUE);
                    }
                    AnchoredDraggableState.l(anchoredDraggableState, AnchoredDraggableKt.a(new Function1<DraggableAnchorsConfig<DrawerValue>, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt.DismissibleNavigationDrawer.2.2.1.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            DraggableAnchorsConfig draggableAnchorsConfig = (DraggableAnchorsConfig) obj2;
                            draggableAnchorsConfig.a(DrawerValue.d, f);
                            draggableAnchorsConfig.a(DrawerValue.e, BitmapDescriptorFactory.HUE_RED);
                            return Unit.f24250a;
                        }
                    }));
                }
                Placeable.PlacementScope.h(placementScope, placeableC02, MathKt.b(anchoredDraggableState.g()) + placeable.d, 0);
                Placeable.PlacementScope.h(placementScope, placeable, MathKt.b(anchoredDraggableState.g()), 0);
                return Unit.f24250a;
            }
        });
    }
}
