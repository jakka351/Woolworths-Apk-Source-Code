package au.com.woolworths.feature.product.list.v2.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListSkeletonUiKt {
    public static final void a(ProductsDisplayMode displayMode, Composer composer, int i) {
        Intrinsics.h(displayMode, "displayMode");
        ComposerImpl composerImplV = composer.v(1323671297);
        if ((((composerImplV.r(displayMode.ordinal()) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else if (displayMode == ProductsDisplayMode.d) {
            composerImplV.o(1396996847);
            c(null, composerImplV, 0);
            composerImplV.V(false);
        } else {
            composerImplV.o(1397052399);
            b(null, composerImplV, 0);
            composerImplV.V(false);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.chip.e(i, 11, displayMode);
        }
    }

    public static final void b(Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(1727365343);
        if (((i | 6) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierJ = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 20, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
            GridCells.Fixed fixed = new GridCells.Fixed(2);
            composerImplV.o(5004770);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new d(0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            LazyGridDslKt.b(fixed, modifierJ, null, null, false, null, null, null, false, null, (Function1) objG, composerImplV, 0, 0, 1020);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.compose.utils.layout.a(i, 9, modifier2);
        }
    }

    public static final void c(Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-4507001);
        if (((i | 6) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierJ = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 20, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
            modifier2 = companion;
            composerImplV.o(5004770);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new d(1);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            LazyDslKt.b(modifierJ, null, null, false, null, null, null, false, null, (Function1) objG, composerImplV, 0, 510);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.compose.utils.layout.a(i, 10, modifier2);
        }
    }
}
