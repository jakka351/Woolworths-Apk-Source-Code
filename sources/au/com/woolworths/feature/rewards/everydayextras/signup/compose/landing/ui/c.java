package au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui;

import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult;
import au.com.woolworths.base.rewards.account.data.PreferenceToggleData;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingsItem;
import au.com.woolworths.base.shopapp.modules.text.TextWithLinkApiData;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared.FooterButtonKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasTab;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasTermsAndConditions;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonStyle;
import au.com.woolworths.feature.rewards.offers.RewardsCtaCardViewItem;
import au.com.woolworths.feature.rewards.offers.ui.DownloadableAssetUiCardKt;
import au.com.woolworths.feature.rewards.offers.ui.RewardsCtaCardKt;
import au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsScreenKt;
import au.com.woolworths.feature.rewards.redemptionsettings.RedemptionItemClickListener;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecureDollarsContract;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.LockToggleKt;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.SecureDollarsScreenKt;
import au.com.woolworths.feature.rewards.redemptionsettings.ui.RedemptionBottomSheetContentKt;
import au.com.woolworths.feature.shared.force.upgrade.UpdateFullScreenType;
import au.com.woolworths.feature.shared.force.upgrade.ui.UpdateFullScreenKt;
import au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionHeroCardKt;
import au.com.woolworths.feature.shop.contentpage.data.infotile.InfoTileData;
import au.com.woolworths.feature.shop.contentpage.ui.BasicCoreRowListUIKt;
import au.com.woolworths.feature.shop.contentpage.ui.infotile.InfoTileKt;
import au.com.woolworths.feature.shop.healthylifefoodtracker.ui.TextWithLinkKt;
import au.com.woolworths.feature.shop.homepage.data.ChatEntryCardV2;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageFragment;
import au.com.woolworths.feature.shop.instore.cart.InstoreCartContract;
import au.com.woolworths.feature.shop.instore.cart.ui.InstoreCartScreenKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapScreenKt;
import au.com.woolworths.feature.shop.instore.navigation.productfinder.LocationServicesUnavailableUiKt;
import au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderContract;
import au.com.woolworths.feature.shop.login.LoginFullPageErrorState;
import au.com.woolworths.feature.shop.login.ui.LoginScreenKt;
import au.com.woolworths.feature.shop.myorders.details.help.HelpAndSupportScreenKt;
import au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpDataList;
import au.com.woolworths.feature.shop.myorders.details.models.StepsToolTip;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.ProgressStepperInfoUpliftScreenKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.OrderHorizontalListItemKt;
import au.com.woolworths.feature.shop.product.availability.ProductAvailabilityUiState;
import au.com.woolworths.feature.shop.product.availability.ui.ProductAvailabilityScreenKt;
import au.com.woolworths.feature.shop.recipes.details.RecipeDetailsFullPageErrorState;
import au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsFullPageMessageKt;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentContract;
import au.com.woolworths.feature.shop.recipes.freshmag.content.ui.FreshMagContentScreenKt;
import au.com.woolworths.feature.shop.recipes.freshmag.home.data.FreshMagSummaryData;
import au.com.woolworths.feature.shop.recipes.freshmag.home.ui.FreshMagHomeScreenKt;
import au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesScreenKt;
import au.com.woolworths.feature.shop.storelocator.details.StoreDetailsContract;
import au.com.woolworths.feature.shop.storelocator.details.StoreDetailsScreenKt;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsContract;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsHeader;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.aem.components.model.basicCoreRow.BasicCoreRowListData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import me.onebone.toolbar.CollapsingToolbarScaffoldState;
import me.onebone.toolbar.CollapsingToolbarScope;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ c(int i, int i2, Object obj, Object obj2, Function1 function1) {
        this.d = i2;
        this.f = obj;
        this.h = function1;
        this.g = obj2;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                FaqsContentKt.a((EverydayExtrasTab.EverydayExtrasFaqsTab) this.f, (EverydayExtrasTermsAndConditions) this.g, (Function1) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                FooterButtonKt.a((String) this.f, (EverydayExtrasButtonStyle) this.g, (Function0) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                DownloadableAssetUiCardKt.a((DownloadableAsset) this.f, (Function0) this.g, (Modifier) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                RewardsCtaCardKt.a((RewardsCtaCardViewItem) this.f, (Function0) this.g, (Modifier) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                OfferDetailsScreenKt.f((OfferDetailsHeader) this.f, (Modifier) this.g, (Function2) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                LockToggleKt.a((PreferenceToggleData) this.f, (Function1) this.h, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                SecureDollarsScreenKt.a((SecureDollarsContract.ViewState) this.f, (String) this.g, (Modifier) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                RedemptionBottomSheetContentKt.c((List) this.f, (RewardsRedemptionSettingsItem) this.g, (RedemptionItemClickListener) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                UpdateFullScreenKt.a((UpdateFullScreenType) this.f, (Function1) this.h, (Function2) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                PromotionHeroCardKt.a((ProductCard) this.f, (Function1) this.h, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                BasicCoreRowListUIKt.a((BasicCoreRowListData) this.f, (Modifier) this.g, (Function1) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                InfoTileKt.b((InfoTileData) this.f, (PaddingValuesImpl) this.g, (Function1) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                TextWithLinkKt.a((TextWithLinkApiData) this.f, (Modifier) this.g, (Function1) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                ((HomePageFragment) this.f).I1((ChatEntryCardV2) this.g, (Function1) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 14:
                ((Integer) obj2).intValue();
                InstoreCartScreenKt.d((InstoreCartContract.ViewState.Error) this.f, (Function0) this.g, (Function0) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                InstoreCartScreenKt.b((InstoreCartContract.ViewState.InstoreCartContent) this.f, (Function0) this.g, (Function1) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(1);
                InstoreCartScreenKt.l((CollapsingToolbarScope) this.f, (CollapsingToolbarScaffoldState) this.g, (String) this.h, this.e, (Composer) obj, iA);
                break;
            case 17:
                ((Integer) obj2).getClass();
                InstoreMapScreenKt.k((InstoreMapContract.ViewState.Content) this.f, (Function1) this.h, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                LocationServicesUnavailableUiKt.a((ProductFinderContract.LocationServicesUnavailableState) this.f, (Function0) this.g, (Modifier) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                LoginScreenKt.a((LoginFullPageErrorState) this.f, (Function0) this.g, (Function2) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                HelpAndSupportScreenKt.e((OrderHelpDataList) this.f, (Function0) this.g, (Function1) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                ProgressStepperInfoUpliftScreenKt.a((StepsToolTip) this.f, (Function0) this.g, (Modifier) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                OrderHorizontalListItemKt.c((HorizontalListData) this.f, (Function0) this.g, (Function1) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                ProductAvailabilityScreenKt.e((ProductAvailabilityUiState) this.f, (Function0) this.g, (Function1) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                RecipeDetailsFullPageMessageKt.a((RecipeDetailsFullPageErrorState) this.f, (Function0) this.g, (Function0) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                FreshMagContentScreenKt.a((FreshMagContentContract.FreshMagContent) this.f, (Function1) this.h, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                FreshMagHomeScreenKt.c((FreshMagSummaryData) this.f, (Function1) this.h, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 27:
                ((Integer) obj2).intValue();
                SavedRecipesScreenKt.a((FullPageErrorCause) this.f, (Function0) this.g, (Function0) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                StoreDetailsScreenKt.g((StoreDetailsContract.ViewState) this.f, (Store) this.g, (Modifier) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsScreenKt.g((StoreDetailsContract.ViewState) this.f, (StoreLocatorResult.Store) this.g, (Modifier) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.d = i2;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.e = i;
    }

    public /* synthetic */ c(CollapsingToolbarScope collapsingToolbarScope, CollapsingToolbarScaffoldState collapsingToolbarScaffoldState, String str, int i, int i2) {
        this.d = 16;
        this.f = collapsingToolbarScope;
        this.g = collapsingToolbarScaffoldState;
        this.h = str;
        this.e = i;
    }
}
