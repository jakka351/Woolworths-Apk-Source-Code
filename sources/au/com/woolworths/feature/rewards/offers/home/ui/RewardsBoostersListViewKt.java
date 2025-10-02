package au.com.woolworths.feature.rewards.offers.home.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.modules.common.Region;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/compose/utils/list/LazyListUniqueIdValidator;", "uniqueIdValidator", "offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsBoostersListViewKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Region.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Region.Companion companion = Region.h;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final void a(Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-973807103);
        if ((((composerImplV.I(null) ? 4 : 2) | i | (composerImplV.I(null) ? 32 : 16)) & 147) != 146 || !composerImplV.c()) {
            throw null;
        }
        composerImplV.j();
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.compose.utils.layout.a(i, 13, modifier);
        }
    }

    public static final void b(Modifier modifier, Composer composer, int i) {
        Intrinsics.h(null, "viewState");
        Intrinsics.h(null, "onBannerClick");
        Intrinsics.h(null, "onOfferSectionCtaClick");
        Intrinsics.h(null, "onOfferClick");
        Intrinsics.h(null, "activateOffer");
        Intrinsics.h(null, "onOfferCtaButtonClick");
        Intrinsics.h(null, "onItemSeen");
        Intrinsics.h(null, "trackSpinSurpriseBannerImpression");
        Intrinsics.h(null, "trackStandardBannerImpression");
        Intrinsics.h(null, "onProductOffersSwipeStarted");
        Intrinsics.h(null, "onProductOffersSwipeEnded");
        Intrinsics.h(null, "onHeaderCtaClicked");
        Intrinsics.h(null, "offerFeedInlineBannerListener");
        Intrinsics.h(null, "rewardsCtaCardListener");
        ComposerImpl composerImplV = composer.v(-1794396084);
        int i2 = (composerImplV.I(null) ? 4 : 2) | i | (composerImplV.I(null) ? 32 : 16) | (composerImplV.I(null) ? 256 : 128) | (composerImplV.I(null) ? 2048 : 1024) | (composerImplV.I(null) ? 16384 : 8192) | (composerImplV.I(null) ? 131072 : 65536) | (composerImplV.I(null) ? 1048576 : 524288) | (composerImplV.I(null) ? 8388608 : 4194304) | (composerImplV.I(null) ? 67108864 : 33554432) | (composerImplV.I(null) ? 536870912 : 268435456);
        int i3 = (composerImplV.I(null) ? (char) 4 : (char) 2) | (composerImplV.I(null) ? ' ' : (char) 16) | (composerImplV.n(null) ? (char) 256 : (char) 128) | (composerImplV.n(null) ? (char) 2048 : (char) 1024) | (composerImplV.n(modifier) ? (char) 16384 : (char) 8192);
        if ((i2 & 306783379) != 306783378 || (i3 & 9363) != 9362 || !composerImplV.c()) {
            throw null;
        }
        composerImplV.j();
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.compose.utils.layout.a(i, 14, modifier);
        }
    }
}
