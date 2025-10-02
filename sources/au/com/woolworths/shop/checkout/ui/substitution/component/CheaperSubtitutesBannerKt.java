package au.com.woolworths.shop.checkout.ui.substitution.component;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerKt;
import au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerType;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheaperSubtitutesBannerKt {
    public static final void a(BroadcastBannerData bannerData, boolean z, Function1 onDismissClick, Composer composer, int i) {
        int i2;
        Intrinsics.h(bannerData, "bannerData");
        Intrinsics.h(onDismissClick, "onDismissClick");
        ComposerImpl composerImplV = composer.v(139534300);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(bannerData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onDismissClick) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else if (!z) {
            BroadcastBannerKt.a(BroadcastBannerType.f, bannerData.getTitle(), bannerData.getImageUrl(), null, null, null, Intrinsics.c(bannerData.getDismissible(), Boolean.TRUE) ? new au.com.woolworths.feature.shop.banners.broadcastbanner.a(onDismissClick, bannerData, 5) : null, bannerData.getSubtitle(), null, composerImplV, 6, 312);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.filter.b(bannerData, z, onDismissClick, i, 17);
        }
    }
}
