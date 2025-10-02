package au.com.woolworths.shop.product.details.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductNameKt {
    public static final void a(int i, Composer composer, Modifier modifier, String productName) {
        int i2;
        Intrinsics.h(productName, "productName");
        ComposerImpl composerImplV = composer.v(-462196944);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(productName) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierJ = PaddingKt.j(modifier, BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, 4, 5);
            composerImplV.o(5004770);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.shared.ui.compose.a(productName, 21);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            TextKt.a(productName, CoreTheme.f(composerImplV).e.f5133a.b, SemanticsModifierKt.b(modifierJ, false, (Function1) objG), 0L, null, 0, 2, false, 3, null, composerImplV, i3 | 102236160, 696);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.quantitystepper.a(productName, modifier, i, 8, (byte) 0);
        }
    }
}
