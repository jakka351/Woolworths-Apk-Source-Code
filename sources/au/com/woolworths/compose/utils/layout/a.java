package au.com.woolworths.compose.utils.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.product.list.compose.productsearch.SearchRowSectionKt;
import au.com.woolworths.feature.product.list.compose.productsearch.SearchTilesSectionKt;
import au.com.woolworths.feature.product.list.v2.ui.ProductListSkeletonUiKt;
import au.com.woolworths.feature.rewards.account.settings.v2.ui.FullPageLoadingUiKt;
import au.com.woolworths.feature.rewards.account.settings.v2.ui.LoadingPlaceholderItemUiKt;
import au.com.woolworths.feature.rewards.offers.home.ui.RewardsBoostersListViewKt;
import au.com.woolworths.feature.rewards.offers.ui.OfferFeedInlineBannerKt;
import au.com.woolworths.feature.shop.bundles.ui.BundlesScreenKt;
import au.com.woolworths.feature.shop.healthylifefoodtracker.ui.FullPageLoadingKt;
import au.com.woolworths.feature.shop.instore.navigation.featurehighlight.MapFeatureHighlightKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.positionlock.PositionLockSuccessIndicatorKt;
import au.com.woolworths.feature.shop.onboarding.sdui.ui.OnboardingSduiScreenKt;
import au.com.woolworths.feature.shop.product.availability.ui.ProductAvailabilityScreenKt;
import au.com.woolworths.foundation.rewards.common.ui.TigerBannerKt;
import au.com.woolworths.foundation.shop.nhp.ui.edr.EdrOfferBannerKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.lottie.AudioPermissionRationaleLottieKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.lottie.OliveErrorLottieKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.lottie.OlivePlaceholderLottieKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.lottie.OliveWaveformLottieKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.search.OliveStateKt;
import au.com.woolworths.foundation.ui.shimmers.ProductsSkeletonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Modifier e;

    public /* synthetic */ a(int i, int i2, Modifier modifier) {
        this.d = i2;
        this.e = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                FillerKt.a(this.e, composer, RecomposeScopeImplKt.a(7));
                break;
            case 1:
                SearchRowSectionKt.a(this.e, composer, RecomposeScopeImplKt.a(7));
                break;
            case 2:
                SearchTilesSectionKt.d(this.e, composer, RecomposeScopeImplKt.a(7));
                break;
            case 3:
                SearchTilesSectionKt.c(this.e, composer, RecomposeScopeImplKt.a(7));
                break;
            case 4:
                SearchTilesSectionKt.b(this.e, composer, RecomposeScopeImplKt.a(7));
                break;
            case 5:
                au.com.woolworths.feature.product.list.legacy.compose.productsearch.SearchRowSectionKt.a(this.e, composer, RecomposeScopeImplKt.a(7));
                break;
            case 6:
                au.com.woolworths.feature.product.list.legacy.compose.productsearch.SearchTilesSectionKt.d(this.e, composer, RecomposeScopeImplKt.a(7));
                break;
            case 7:
                au.com.woolworths.feature.product.list.legacy.compose.productsearch.SearchTilesSectionKt.b(this.e, composer, RecomposeScopeImplKt.a(7));
                break;
            case 8:
                au.com.woolworths.feature.product.list.legacy.compose.productsearch.SearchTilesSectionKt.c(this.e, composer, RecomposeScopeImplKt.a(7));
                break;
            case 9:
                ProductListSkeletonUiKt.b(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
            case 10:
                ProductListSkeletonUiKt.c(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
            case 11:
                FullPageLoadingUiKt.a(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
            case 12:
                LoadingPlaceholderItemUiKt.a(this.e, composer, RecomposeScopeImplKt.a(7));
                break;
            case 13:
                RewardsBoostersListViewKt.a(this.e, composer, RecomposeScopeImplKt.a(385));
                break;
            case 14:
                RewardsBoostersListViewKt.b(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
            case 15:
                OfferFeedInlineBannerKt.b(this.e, composer, RecomposeScopeImplKt.a(7));
                break;
            case 16:
                BundlesScreenKt.b(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
            case 17:
                FullPageLoadingKt.a(this.e, composer, RecomposeScopeImplKt.a(7));
                break;
            case 18:
                MapFeatureHighlightKt.c(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
            case 19:
                PositionLockSuccessIndicatorKt.a(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
            case 20:
                OnboardingSduiScreenKt.c(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
            case 21:
                ProductAvailabilityScreenKt.c(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
            case 22:
                TigerBannerKt.a(this.e, composer, RecomposeScopeImplKt.a(7));
                break;
            case 23:
                EdrOfferBannerKt.h(this.e, composer, RecomposeScopeImplKt.a(7));
                break;
            case 24:
                AudioPermissionRationaleLottieKt.a(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
            case 25:
                OliveErrorLottieKt.a(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
            case 26:
                OlivePlaceholderLottieKt.a(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
            case 27:
                OliveWaveformLottieKt.a(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
            case 28:
                OliveStateKt.f(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
            default:
                ProductsSkeletonKt.a(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }
}
