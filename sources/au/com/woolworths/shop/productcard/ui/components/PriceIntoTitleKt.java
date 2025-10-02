package au.com.woolworths.shop.productcard.ui.components;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productcard-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PriceIntoTitleKt {
    public static final void a(int i, Composer composer, Modifier modifier, String leadPriceHeaderText) {
        int i2;
        Modifier modifier2;
        Intrinsics.h(leadPriceHeaderText, "leadPriceHeaderText");
        ComposerImpl composerImplV = composer.v(-1560472956);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(leadPriceHeaderText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            TextKt.a(leadPriceHeaderText, CoreTheme.f(composerImplV).b.f5125a.f5126a, PaddingKt.j(companion, 4, 2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12), CoreTheme.b(composerImplV).e.d.d, null, 0, 0, false, 0, null, composerImplV, i3 & 14, 1008);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.quantitystepper.a(leadPriceHeaderText, modifier2, i, 9, (byte) 0);
        }
    }
}
