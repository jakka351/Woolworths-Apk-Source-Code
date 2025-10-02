package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.res.VectorResources_androidKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAction;
import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAndDiscount;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutRewardsUiKt {
    public static final void a(CheckoutRewardsAndDiscount.CheckoutRewards rewards, boolean z, Function0 onClickRewardsTile, Composer composer, int i) {
        Intrinsics.h(rewards, "rewards");
        CheckoutRewardsAction checkoutRewardsAction = rewards.e;
        Intrinsics.h(onClickRewardsTile, "onClickRewardsTile");
        ComposerImpl composerImplV = composer.v(860134105);
        int i2 = (composerImplV.I(rewards) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onClickRewardsTile) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1955160708);
            boolean z2 = checkoutRewardsAction instanceof CheckoutRewardsAction.CheckoutRewardsLink;
            ImageVector imageVector = null;
            Color color = z2 ? new Color(CoreTheme.a(composerImplV).b.f4775a.c) : null;
            composerImplV.V(false);
            composerImplV.o(1955166335);
            ImageVector imageVector2 = rewards.d ? CoreTheme.e(composerImplV).i.k : null;
            composerImplV.V(false);
            if (checkoutRewardsAction instanceof CheckoutRewardsAction.CheckoutRewardsInfo) {
                composerImplV.o(1955172989);
                imageVector = CoreTheme.e(composerImplV).i.c;
                composerImplV.V(false);
            } else if (z2 || (checkoutRewardsAction instanceof CheckoutRewardsAction.CheckoutRewardsRedeem)) {
                composerImplV.o(1955177349);
                imageVector = CoreTheme.e(composerImplV).e.n;
                composerImplV.V(false);
            } else {
                if (checkoutRewardsAction != null) {
                    throw au.com.woolworths.android.onesite.a.w(1955169750, composerImplV, false);
                }
                composerImplV.o(480984196);
                composerImplV.V(false);
            }
            ImageVector imageVector3 = imageVector;
            boolean z3 = checkoutRewardsAction != null;
            composerImplV.o(5004770);
            boolean z4 = (i2 & 896) == 256;
            Object objG = composerImplV.G();
            if (z4 || objG == Composer.Companion.f1624a) {
                objG = new a(onClickRewardsTile, 2);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            CheckoutSummaryRowTileKt.a(rewards.b, rewards.c, z, ClickableKt.d(Modifier.Companion.d, z3, null, null, (Function0) objG, 6), VectorResources_androidKt.b(R.drawable.ic_rewards_fill, 6, composerImplV), null, color, imageVector2, new Color(CoreTheme.b(composerImplV).e.c.f4854a), imageVector3, composerImplV, (i2 << 3) & 896, 32);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.filter.b(rewards, z, onClickRewardsTile, i, 15);
        }
    }
}
