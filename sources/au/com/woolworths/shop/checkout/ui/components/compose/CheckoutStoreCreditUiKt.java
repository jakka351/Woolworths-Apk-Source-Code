package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAndDiscount;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutStoreCreditUiKt {
    public static final void a(CheckoutRewardsAndDiscount.StoreCredit storeCredit, boolean z, Function0 onClickCreditTile, Composer composer, int i) {
        boolean z2;
        Intrinsics.h(storeCredit, "storeCredit");
        Intrinsics.h(onClickCreditTile, "onClickCreditTile");
        ComposerImpl composerImplV = composer.v(-1042122895);
        int i2 = (composerImplV.I(storeCredit) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= composerImplV.p(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onClickCreditTile) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(-752715270);
            ImageVector imageVector = storeCredit.d ? CoreTheme.e(composerImplV).i.k : null;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean z3 = (i2 & 896) == 256;
            Object objG = composerImplV.G();
            if (z3 || objG == Composer.Companion.f1624a) {
                objG = new a(onClickCreditTile, 3);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierD = ClickableKt.d(Modifier.Companion.d, false, null, null, (Function0) objG, 7);
            boolean z4 = z2;
            CheckoutSummaryRowTileKt.a(storeCredit.b, storeCredit.c, z4, modifierD, CoreTheme.e(composerImplV).f.q, null, null, imageVector, new Color(CoreTheme.b(composerImplV).e.c.f4854a), CoreTheme.e(composerImplV).e.n, composerImplV, (i2 << 3) & 896, 96);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.filter.b(storeCredit, z, onClickCreditTile, i, 16);
        }
    }
}
