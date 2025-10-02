package au.com.woolworths.design.core.ui.component.stable.iconbutton;

import android.widget.FrameLayout;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.fragment.app.FragmentManager;
import androidx.paging.compose.LazyPagingItems;
import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonSpec;
import au.com.woolworths.dynamic.page.ui.DynamicPageContract;
import au.com.woolworths.dynamic.page.ui.content.LandingPageScreenUiKt;
import au.com.woolworths.feature.product.list.ProductListFragment;
import au.com.woolworths.feature.product.list.compose.productfinder.ProductListScreenKt;
import au.com.woolworths.feature.product.list.legacy.ProductListFragment;
import au.com.woolworths.feature.product.list.v2.ProductListUiState;
import au.com.woolworths.feature.product.list.v2.ui.ProductListPageUiKt;
import au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayViewModel;
import au.com.woolworths.feature.rewards.card.overlay.ui.RewardsCardOverlayScreenKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.BenefitsComparisonTableKt;
import au.com.woolworths.feature.rewards.offers.detail.OfferDetailsViewModel;
import au.com.woolworths.feature.rewards.offers.listpage.OfferListPageType;
import au.com.woolworths.feature.rewards.offers.listpage.OfferListPageViewModel;
import au.com.woolworths.feature.rewards.offers.listpage.ui.OfferListPageErrorKt;
import au.com.woolworths.feature.rewards.offers.listpage.ui.OffersListPageScreenKt;
import au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsProgressTrackerRowUiKt;
import au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsScreenKt;
import au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsTrackerComboRowUiKt;
import au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsTrackerRowUiKt;
import au.com.woolworths.feature.rewards.offers.ui.details.ProgressRing;
import au.com.woolworths.feature.rewards.offers.ui.details.TrailingStyle;
import au.com.woolworths.feature.shared.force.upgrade.UpdateFullScreenType;
import au.com.woolworths.feature.shared.force.upgrade.ui.UpdateFullScreenKt;
import au.com.woolworths.feature.shared.instore.wifi.ui.JoinInStoreWifiScreenKt;
import au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiActionHandler;
import au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiViewModel;
import au.com.woolworths.feature.shop.account.ui.delete.DeleteAccountScreenKt;
import au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountViewModel;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingContract;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.PromotionListingScreenKt;
import au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerEventListener;
import au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerPage;
import au.com.woolworths.feature.shop.healthylifefoodtracker.ui.FoodTrackerContentKt;
import au.com.woolworths.feature.shop.marketplace.ui.facet.FacetScreenKt;
import au.com.woolworths.feature.shop.marketplace.ui.facet.MarketplaceFacetContract;
import au.com.woolworths.feature.shop.marketplace.ui.facet.MarketplaceFacetListener;
import au.com.woolworths.feature.shop.recipes.freshmag.ui.FreshMagTopNavBarKt;
import au.com.woolworths.feature.shop.recipes.search.RecipeSearchViewModel;
import au.com.woolworths.feature.shop.recipes.search.ui.RecipeSearchScreenKt;
import au.com.woolworths.feature.shop.voc.score.VocSurveyCardKt;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderScreenKt;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderViewModel;
import au.com.woolworths.foundation.feature.app.AppIdentifier;
import au.com.woolworths.foundation.rewards.common.ui.banners.RewardsNotificationBannerKt;
import au.com.woolworths.foundation.rewards.common.ui.banners.data.RewardsNotificationBannerData;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsTrackerProgressRow;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsTrackerRow;
import au.com.woolworths.foundation.shop.olive.voice.ui.permission.PermissionDescContentKt;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import au.com.woolworths.foundation.ui.image.gallery.GalleryAsyncImageKt;
import au.com.woolworths.foundation.ui.toolbar.flexibletopbar.FlexibleTopBarColors;
import au.com.woolworths.foundation.ui.toolbar.flexibletopbar.FlexibleTopBarKt;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.rewards.base.data.IconAsset;
import au.com.woolworths.shop.buyagain.ui.BuyAgainFullPageError;
import au.com.woolworths.shop.buyagain.ui.composable.BuyAgainErrorScreenKt;
import au.com.woolworths.shop.cart.ui.cart.CartErrorScreenKt;
import au.com.woolworths.shop.cart.ui.cart.CartFullErrorMessage;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentExtraInfo;
import au.com.woolworths.shop.checkout.ui.compose.FulfilmentFeesBottomSheetKt;
import com.google.accompanist.permissions.PermissionState;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ a(Modifier modifier, FlexibleTopBarColors flexibleTopBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.d = 26;
        this.f = modifier;
        this.g = flexibleTopBarColors;
        this.e = topAppBarScrollBehavior;
        this.h = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                DestructiveIconButtonKt.a((ImageVector) this.g, (Function0) this.e, (Modifier) this.f, (IconButtonSpec.Size) this.h, (Composer) obj, RecomposeScopeImplKt.a(25009));
                break;
            case 1:
                ((Integer) obj2).getClass();
                LandingPageScreenUiKt.d((DynamicPageContract.ViewState) this.g, (Function2) this.h, (Function0) this.e, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ProductListScreenKt.a((ProductListFragment.Extras) this.g, (FragmentManager) this.e, (FrameLayout) this.h, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(27649));
                break;
            case 3:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.product.list.legacy.compose.productfinder.ProductListScreenKt.a((ProductListFragment.Extras) this.g, (FragmentManager) this.e, (FrameLayout) this.h, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(27649));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ProductListPageUiKt.a((LazyPagingItems) this.g, (Function1) this.e, (ProductListUiState) this.f, (ProductClickListener) this.h, (Composer) obj, RecomposeScopeImplKt.a(9));
                break;
            case 5:
                ((Integer) obj2).getClass();
                RewardsCardOverlayScreenKt.d((RewardsCardOverlayViewModel) this.g, (Function0) this.e, (Function1) this.f, (Function1) this.h, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                BenefitsComparisonTableKt.d((ComposableLambdaImpl) this.g, (ComposableLambdaImpl) this.e, (ComposableLambdaImpl) this.h, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(439));
                break;
            case 7:
                ((Integer) obj2).getClass();
                OfferListPageErrorKt.a((FullPageMessage.Error) this.g, (OfferListPageType) this.h, (Function0) this.e, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(3073));
                break;
            case 8:
                ((Integer) obj2).getClass();
                OffersListPageScreenKt.a((OfferListPageViewModel) this.g, (Function1) this.f, (Function0) this.e, (Function1) this.h, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                OfferDetailsProgressTrackerRowUiKt.a((String) this.g, (String) this.e, (ProgressRing) this.h, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(3073));
                break;
            case 10:
                ((Integer) obj2).getClass();
                OfferDetailsScreenKt.g((OfferDetailsViewModel) this.g, (Function0) this.e, (Function1) this.h, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                OfferDetailsTrackerComboRowUiKt.a((OfferDetailsTrackerRow) this.g, (OfferDetailsTrackerProgressRow) this.e, (String) this.h, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                OfferDetailsTrackerRowUiKt.b((IconAsset) this.g, (String) this.e, (TrailingStyle) this.h, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(3073));
                break;
            case 13:
                ((Integer) obj2).getClass();
                UpdateFullScreenKt.b((UpdateFullScreenType) this.g, (Function1) this.e, (Function1) this.f, (Function2) this.h, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                JoinInStoreWifiScreenKt.f((AppIdentifier) this.g, (JoinWifiViewModel) this.e, (JoinWifiActionHandler) this.h, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                DeleteAccountScreenKt.b((Function0) this.e, (Function0) this.g, (Function0) this.f, (DeleteAccountViewModel) this.h, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                PromotionListingScreenKt.e((PromotionListingContract.ViewState) this.g, (Function0) this.e, (Function0) this.f, (Function1) this.h, (Composer) obj, RecomposeScopeImplKt.a(385));
                break;
            case 17:
                ((Integer) obj2).getClass();
                FoodTrackerContentKt.a((FoodTrackerPage) this.g, (LazyListState) this.e, (FoodTrackerEventListener) this.h, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(3073));
                break;
            case 18:
                ((Integer) obj2).getClass();
                FacetScreenKt.b((MarketplaceFacetContract.ViewState) this.g, (MarketplaceFacetListener) this.f, (Function0) this.e, (Function1) this.h, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                FreshMagTopNavBarKt.a((Integer) this.g, (Function0) this.e, (Function0) this.h, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                RecipeSearchScreenKt.c((String) this.g, (String) this.f, (RecipeSearchViewModel) this.h, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                VocSurveyCardKt.i((ButtonStyleApiData) this.g, (String) this.h, (Function0) this.e, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(3073));
                break;
            case 22:
                ((Integer) obj2).getClass();
                WPayForOrderScreenKt.b((WPayForOrderViewModel) this.g, (Function0) this.e, (Function1) this.h, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                RewardsNotificationBannerKt.a((RewardsNotificationBannerData) this.g, (Function0) this.e, (Function0) this.h, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                PermissionDescContentKt.c((PaddingValues) this.g, (PermissionState) this.f, (Function0) this.e, (Function0) this.h, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                GalleryAsyncImageKt.a((String) this.g, (String) this.e, (ColorPainter) this.h, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                FlexibleTopBarKt.a((Modifier) this.f, (FlexibleTopBarColors) this.g, (TopAppBarScrollBehavior) this.e, (ComposableLambdaImpl) this.h, (Composer) obj, RecomposeScopeImplKt.a(3073));
                break;
            case 27:
                ((Integer) obj2).getClass();
                BuyAgainErrorScreenKt.a((BuyAgainFullPageError) this.g, (Function0) this.e, (Function0) this.f, (Function0) this.h, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                CartErrorScreenKt.a((CartFullErrorMessage) this.g, (Modifier) this.f, (Function0) this.e, (Function0) this.h, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            default:
                ((Integer) obj2).getClass();
                FulfilmentFeesBottomSheetKt.a((FulfilmentExtraInfo) this.g, (Function1) this.e, (Function1) this.h, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.g = obj;
        this.e = obj2;
        this.h = obj3;
        this.f = modifier;
    }

    public /* synthetic */ a(Object obj, Object obj2, Function0 function0, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.g = obj;
        this.h = obj2;
        this.e = function0;
        this.f = modifier;
    }

    public /* synthetic */ a(Object obj, Object obj2, Function0 function0, Function function, int i, int i2) {
        this.d = i2;
        this.g = obj;
        this.f = obj2;
        this.e = function0;
        this.h = function;
    }

    public /* synthetic */ a(Object obj, Function function, Object obj2, Object obj3, int i, int i2) {
        this.d = i2;
        this.g = obj;
        this.e = function;
        this.f = obj2;
        this.h = obj3;
    }

    public /* synthetic */ a(String str, String str2, RecipeSearchViewModel recipeSearchViewModel, Function0 function0, int i) {
        this.d = 20;
        this.g = str;
        this.f = str2;
        this.h = recipeSearchViewModel;
        this.e = function0;
    }

    public /* synthetic */ a(Function0 function0, Function0 function02, Function0 function03, DeleteAccountViewModel deleteAccountViewModel, int i) {
        this.d = 15;
        this.e = function0;
        this.g = function02;
        this.f = function03;
        this.h = deleteAccountViewModel;
    }
}
