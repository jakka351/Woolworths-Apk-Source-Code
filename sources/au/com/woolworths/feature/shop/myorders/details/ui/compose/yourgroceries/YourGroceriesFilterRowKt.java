package au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.core.ui.component.experimental.chip.ToggleChipKt;
import au.com.woolworths.design.core.ui.component.experimental.chip.spec.ChipSelectionType;
import au.com.woolworths.design.core.ui.component.experimental.chip.spec.ChipVariant;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesFilterGroupItem;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class YourGroceriesFilterRowKt {
    public static final void a(YourGroceriesFilterGroupItem filterGroupItem, Function1 onFilterSelect, Composer composer, int i) {
        Intrinsics.h(filterGroupItem, "filterGroupItem");
        Intrinsics.h(onFilterSelect, "onFilterSelect");
        ComposerImpl composerImplV = composer.v(-185149487);
        int i2 = 4;
        int i3 = (composerImplV.I(filterGroupItem) ? 4 : 2) | i;
        int i4 = 32;
        if ((i & 48) == 0) {
            i3 |= composerImplV.I(onFilterSelect) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            boolean z = false;
            Modifier modifierH = PaddingKt.h(ScrollKt.b(SizeKt.e(Modifier.Companion.d, 1.0f), ScrollKt.a(composerImplV), false), 16, BitmapDescriptorFactory.HUE_RED, 2);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g(8), Alignment.Companion.j, composerImplV, 6);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierH);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(-91150722);
            Iterator it = filterGroupItem.f7703a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                YourGroceriesFilterGroupItem.YourGroceriesFilterItem yourGroceriesFilterItem = (YourGroceriesFilterGroupItem.YourGroceriesFilterItem) it.next();
                boolean z2 = yourGroceriesFilterItem.c;
                ChipSelectionType chipSelectionType = ChipSelectionType.d;
                ChipVariant chipVariant = ChipVariant.d;
                String str = yourGroceriesFilterItem.b;
                Integer num = yourGroceriesFilterItem.d;
                String string = num != null ? num.toString() : null;
                composerImplV.o(-1633490746);
                boolean zN = ((i3 & 112) != i4 ? z : true) | composerImplV.n(yourGroceriesFilterItem);
                Object objG = composerImplV.G();
                if (zN || objG == Composer.Companion.f1624a) {
                    objG = new au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.f(i2, onFilterSelect, yourGroceriesFilterItem);
                    composerImplV.A(objG);
                }
                composerImplV.V(z);
                ToggleChipKt.a(z2, str, string, chipSelectionType, chipVariant, (Function0) objG, null, null, null, null, composerImplV, 224256, 0, 1920);
                z = z;
                i4 = i4;
                i2 = i2;
                i3 = i3;
            }
            composerImplV.V(z);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.healthylifefoodtracker.ui.h(filterGroupItem, i, 13, onFilterSelect);
        }
    }
}
