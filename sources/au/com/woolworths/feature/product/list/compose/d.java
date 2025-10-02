package au.com.woolworths.feature.product.list.compose;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.design.core.ui.foundation.ThemeContext;
import au.com.woolworths.feature.product.list.ProductListViewModel;
import au.com.woolworths.feature.product.list.data.IngredientCardApiData;
import au.com.woolworths.feature.product.list.legacy.VideoAdUnitComposeEpoxyModelKt;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationContractNew;
import au.com.woolworths.feature.rewards.account.authentication.ui.RewardsLoginScreenKt;
import au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundBottomSheetKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared.FooterButtonKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonStyle;
import au.com.woolworths.feature.rewards.offers.data.BoostersHeaderAddOn;
import au.com.woolworths.feature.rewards.offers.data.RewardsErrorDialog;
import au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsFullPageErrorStateLegacy;
import au.com.woolworths.feature.rewards.offers.detail.composable.RewardsOfferDetailsScreenLegacyKt;
import au.com.woolworths.feature.rewards.offers.listpage.ui.OfferListPageContentKt;
import au.com.woolworths.feature.rewards.offers.points.ui.RewardsErrorDialogUiKt;
import au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.BoostersHeaderUiKt;
import au.com.woolworths.feature.shared.feedback.ui.ErrorPageKt;
import au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiScreenKt;
import au.com.woolworths.feature.shared.instore.wifi.ui.content.AppSpecificContent;
import au.com.woolworths.feature.shop.account.ui.details.components.AccountDetailsScreenKt;
import au.com.woolworths.feature.shop.account.viewmodel.details.AccountDetailsContract;
import au.com.woolworths.feature.shop.countryselector.ui.OnboardingCountrySelectorScreenKt;
import au.com.woolworths.feature.shop.editorder.review.CmoReviewContract;
import au.com.woolworths.feature.shop.editorder.review.components.CmoReviewScreenKt;
import au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerEventListener;
import au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerContentFeed;
import au.com.woolworths.feature.shop.healthylifefoodtracker.ui.FoodTrackerContentKt;
import au.com.woolworths.feature.shop.instore.cart.InstoreCartContract;
import au.com.woolworths.feature.shop.instore.cart.ui.InstoreCartScreenKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.permissions.LocationPermissionsAccessRationaleScreenKt;
import au.com.woolworths.feature.shop.marketplace.data.models.InfoHeader;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplacePersonalised;
import au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedScreenKt;
import au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedViewModel;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsContract;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesSubstitutedProduct;
import au.com.woolworths.feature.shop.myorders.details.models.DriverRating;
import au.com.woolworths.feature.shop.myorders.details.models.EditOrderWarning;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.DriverRatingSectionItemKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.YourGroceriesProductItemKt;
import au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionScreenKt;
import au.com.woolworths.feature.shop.recipes.details.data.IngredientsSectionData;
import au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsIngredientTabKt;
import au.com.woolworths.feature.shop.voc.freetext.VocFreeTextContract;
import au.com.woolworths.feature.shop.voc.freetext.VocFreeTextScreenKt;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentInstrumentsResponse;
import au.com.woolworths.feature.shop.wpay.ui.wpay.GooglePayUiState;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContentKt;
import au.com.woolworths.foundation.rewards.common.ui.buttons.MediumIconItemUiKt;
import au.com.woolworths.foundation.rewards.common.ui.info.banner.ContentAlignment;
import au.com.woolworths.foundation.rewards.common.ui.info.banner.RewardsInfoBannerData;
import au.com.woolworths.foundation.rewards.common.ui.info.banner.RewardsInfoBannerUiKt;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferUnknown;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.tile.ProductClickListener;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ d(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.d = i2;
        this.g = obj;
        this.e = obj2;
        this.h = obj3;
        this.i = obj4;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                AlternativeProductsPageKt.b((IngredientCardApiData) this.g, (Function0) this.h, (ProductCardConfig) this.e, (ProductListViewModel) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                VideoAdUnitComposeEpoxyModelKt.a((ProductCard) this.g, (ProductCardConfig) this.e, (ProductClickListener) this.h, (List) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.product.list.legacy.compose.AlternativeProductsPageKt.b((au.com.woolworths.feature.product.list.legacy.data.IngredientCardApiData) this.g, (Function0) this.h, (ProductCardConfig) this.e, (au.com.woolworths.feature.product.list.legacy.ProductListViewModel) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                RewardsLoginScreenKt.d((RewardsAuthenticationContractNew.ViewState) this.g, (Function0) this.h, (Function0) this.e, (Function0) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                UnlockChristmasFundBottomSheetKt.d((String) this.g, (String) this.h, (String) this.e, (ImageVector) this.i, (Composer) obj, RecomposeScopeImplKt.a(7), this.f);
                break;
            case 5:
                ((Integer) obj2).getClass();
                FooterButtonKt.b((String) this.g, (EverydayExtrasButtonStyle) this.e, (Function0) this.h, (Modifier) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                RewardsOfferDetailsScreenLegacyKt.a((PaddingValues) this.g, (NestedScrollConnection) this.h, (RewardsOfferDetailsFullPageErrorStateLegacy) this.e, (Function1) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                RewardsOfferDetailsScreenLegacyKt.c((PaddingValues) this.g, (NestedScrollConnection) this.h, (RewardsOfferUnknown) this.e, (Function1) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                OfferListPageContentKt.b((String) this.g, (ContentCta) this.h, (Function1) this.e, (Modifier) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                RewardsErrorDialogUiKt.a((RewardsErrorDialog) this.g, (Function1) this.e, (Function0) this.h, (Modifier) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                BoostersHeaderUiKt.a((String) this.g, (Modifier) this.h, (Function1) this.e, (BoostersHeaderAddOn) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ErrorPageKt.a((Function0) this.h, (Function0) this.g, (ThemeContext) this.e, (Modifier) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                InstoreWifiScreenKt.b((String) this.g, (Function2) this.h, (AppSpecificContent) this.e, (Modifier) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                InstoreWifiScreenKt.m((Function2) this.g, (String) this.h, (String) this.e, (Modifier) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                AccountDetailsScreenKt.a((AccountDetailsContract.ViewState) this.g, (Function0) this.h, (Function1) this.e, (Function0) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 15:
                ((Integer) obj2).intValue();
                OnboardingCountrySelectorScreenKt.a((Region) this.g, (Function1) this.e, (Function0) this.h, (Function0) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                CmoReviewScreenKt.a((CmoReviewContract.ViewState) this.g, (Flow) this.h, (Function1) this.e, (Function1) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                FoodTrackerContentKt.b((FoodTrackerContentFeed) this.g, (LazyListState) this.h, (FoodTrackerEventListener) this.e, (Modifier) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                InstoreCartScreenKt.i((InstoreCartContract.ViewState) this.g, (Function0) this.h, (Function0) this.e, (Function1) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                LocationPermissionsAccessRationaleScreenKt.a((Function0) this.h, (Function0) this.g, (Function0) this.e, (Modifier) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 20:
                ((Integer) obj2).intValue();
                MarketplacePersonalisedScreenKt.b((InfoHeader) this.g, (MarketplacePersonalised) this.h, (MarketplacePersonalisedViewModel) this.e, (FeatureToggleManager) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                DriverRatingSectionItemKt.c((OrderDetailsContract.DriverRatingState) this.g, (DriverRating) this.h, (Function1) this.e, (Function1) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 22:
                ((Integer) obj2).intValue();
                YourGroceriesProductItemKt.e((YourGroceriesSubstitutedProduct) this.g, (Function1) this.h, (Function2) this.e, (Map) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 23:
                ((Integer) obj2).intValue();
                YourGroceriesProductItemKt.c((String) this.g, (Boolean) this.h, (Map) this.e, (Function2) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                EditOrderConditionScreenKt.c((EditOrderWarning) this.g, (Function0) this.h, (Function0) this.e, (Flow) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                RecipeDetailsIngredientTabKt.a((IngredientsSectionData) this.g, (Function1) this.h, (Function1) this.e, (Modifier) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                VocFreeTextScreenKt.b((VocFreeTextContract.ViewState) this.g, (Function1) this.e, (Function0) this.h, (Function0) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                WPayForOrderContentKt.d((PaymentInstrumentsResponse.Success) this.g, (GooglePayUiState) this.h, (Function1) this.e, (Modifier) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                MediumIconItemUiKt.a((String) this.g, (String) this.h, (String) this.e, (Modifier) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                RewardsInfoBannerUiKt.b((RewardsInfoBannerData) this.g, (PaddingValuesImpl) this.h, (ContentAlignment) this.e, (Modifier) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.d = i2;
        this.g = obj;
        this.h = obj2;
        this.e = obj3;
        this.i = obj4;
        this.f = i;
    }

    public /* synthetic */ d(String str, String str2, String str3, ImageVector imageVector, int i, int i2) {
        this.d = 4;
        this.g = str;
        this.h = str2;
        this.e = str3;
        this.i = imageVector;
        this.f = i2;
    }

    public /* synthetic */ d(Function0 function0, Function0 function02, Object obj, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.h = function0;
        this.g = function02;
        this.e = obj;
        this.i = modifier;
        this.f = i;
    }
}
