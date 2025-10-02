package au.com.woolworths.feature.product.list.legacy.compose.filter;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
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
import au.com.woolworths.feature.product.list.legacy.ui.ProductListOptionsItem;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FilterItemKt {
    public static final void a(ProductListOptionsItem.FilterOptionItem filterOptionItem, Function1 onFilterItemClicked, Composer composer, int i) {
        Intrinsics.h(onFilterItemClicked, "onFilterItemClicked");
        ComposerImpl composerImplV = composer.v(-1571669826);
        int i2 = (composerImplV.n(filterOptionItem) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onFilterItemClicked) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
            composerImplV.o(-1633490746);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new androidx.navigation.compose.a(16, onFilterItemClicked, filterOptionItem);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierH = PaddingKt.h(ClickableKt.d(modifierE, false, null, null, (Function0) objG, 7), BitmapDescriptorFactory.HUE_RED, 8, 1);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i3 = composerImplV.P;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            FilterTextWithCountKt.a(filterOptionItem.b, filterOptionItem.c, 0L, composerImplV, 6);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.b(filterOptionItem, i, 7, onFilterItemClicked);
        }
    }
}
