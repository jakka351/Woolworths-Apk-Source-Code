package au.com.woolworths.design.core.ui.component.stable.snackbar;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import au.com.woolworths.base.shopapp.modules.iconwithtext.IconListItemApiData;
import au.com.woolworths.base.shopapp.modules.listsectionheader.ListSectionHeaderApiData;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.core.ui.foundation.ThemeContext;
import au.com.woolworths.dynamic.page.data.DynamicPageErrorState;
import au.com.woolworths.dynamic.page.ui.content.LandingPageScreenUiKt;
import au.com.woolworths.feature.product.list.ProductListFragment;
import au.com.woolworths.feature.product.list.compose.errorscreen.ProductListErrorScreenKt;
import au.com.woolworths.feature.product.list.compose.filter.FilterItemKt;
import au.com.woolworths.feature.product.list.data.ProductListZeroResults;
import au.com.woolworths.feature.product.list.legacy.ui.ProductListOptionsItem;
import au.com.woolworths.feature.product.list.ui.ProductListOptionsItem;
import au.com.woolworths.feature.rewards.account.data.AccountSettingsAppVersionData;
import au.com.woolworths.feature.rewards.account.settings.v2.ui.AppVersionItemUiKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.ChoosePlanContentKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.OnboardingScreenKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanFooter;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtrasOnBoarding;
import au.com.woolworths.feature.rewards.offers.domain.model.OfferDetailsPageResponse;
import au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsScreenKt;
import au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsTrackerRowUiKt;
import au.com.woolworths.feature.rewards.offers.ui.details.TrailingStyle;
import au.com.woolworths.feature.rewards.redemptionsettings.data.RewardsRedemptionAction;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecureDollarsContract;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.SecureDollarsScreenKt;
import au.com.woolworths.feature.rewards.redemptionsettings.ui.RedemptionActionKt;
import au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiContract;
import au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiScreenKt;
import au.com.woolworths.feature.shared.receipt.details.compose.ReceiptTotalSavedUiKt;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptSavings;
import au.com.woolworths.feature.shop.account.model.details.AccountDetailsData;
import au.com.woolworths.feature.shop.account.ui.delete.DeleteAccountScreenKt;
import au.com.woolworths.feature.shop.account.ui.details.components.AccountDetailsContentKt;
import au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopHorizontalListKt;
import au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopTabHeaderKt;
import au.com.woolworths.feature.shop.brandedshop.ui.g;
import au.com.woolworths.feature.shop.catalogue.browse.model.BrowsePage;
import au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionPageKt;
import au.com.woolworths.feature.shop.catalogue.listing.category.model.ListingHeader;
import au.com.woolworths.feature.shop.catalogue.listing.category.ui.CategoryListingScreenKt;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.PromotionListingScreenKt;
import au.com.woolworths.feature.shop.contentpage.data.HorizontalListData;
import au.com.woolworths.feature.shop.contentpage.data.infotile.InfoTileIconSlot;
import au.com.woolworths.feature.shop.contentpage.ui.infotile.InfoTileIconKt;
import au.com.woolworths.feature.shop.editorder.review.components.CmoReviewContentScreenKt;
import au.com.woolworths.feature.shop.editorder.review.data.ChangeMyOrderDetailsSectionItems;
import au.com.woolworths.feature.shop.editorder.review.data.FooterCtaSection;
import au.com.woolworths.feature.shop.healthylifefoodtracker.ui.IconListItemKt;
import au.com.woolworths.feature.shop.healthylifefoodtracker.ui.ListSectionHeaderKt;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import au.com.woolworths.shop.aem.components.model.merchcard.MerchCardData;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import me.onebone.toolbar.CollapsingToolbarScope;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ b(SnackbarData snackbarData, Modifier modifier, int i) {
        this.d = 0;
        ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$SnackbarHostKt.f4765a;
        this.f = snackbarData;
        this.g = modifier;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        int i2 = this.e;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$SnackbarHostKt.f4765a;
                ((Integer) obj2).getClass();
                SnackbarHostKt.a((SnackbarData) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                CoreThemeKt.a((ThemeContext) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                LandingPageScreenUiKt.b((DynamicPageErrorState) obj4, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                float f = ProductListFragment.u;
                ((ProductListFragment) obj4).n2(i2, (MerchCardData) obj3, (Composer) obj, RecomposeScopeImplKt.a(65));
                break;
            case 4:
                ((Integer) obj2).getClass();
                float f2 = ProductListFragment.u;
                ((ProductListFragment) obj4).b2(i2, (HorizontalListData) obj3, (Composer) obj, RecomposeScopeImplKt.a(65));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ProductListErrorScreenKt.a((ProductListZeroResults.ProductListFullScreenError) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                FilterItemKt.a((ProductListOptionsItem.FilterOptionItem) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.product.list.legacy.compose.filter.FilterItemKt.a((ProductListOptionsItem.FilterOptionItem) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                AppVersionItemUiKt.a((AccountSettingsAppVersionData) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(1), i2);
                break;
            case 9:
                ((Integer) obj2).intValue();
                ChoosePlanContentKt.b((EverydayExtrasChoosePlanFooter) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                OnboardingScreenKt.b((EverydayExtrasOnBoarding) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                OfferDetailsScreenKt.c((OfferDetailsPageResponse.RewardsErrorEmptyState) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                OfferDetailsTrackerRowUiKt.c((TrailingStyle) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(1), i2);
                break;
            case 13:
                ((Integer) obj2).getClass();
                SecureDollarsScreenKt.b((SecureDollarsContract.ViewState) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                RedemptionActionKt.b((RewardsRedemptionAction) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(1), i2);
                break;
            case 15:
                ((Integer) obj2).intValue();
                InstoreWifiScreenKt.e((InstoreWifiContract.ErrorType) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                ReceiptTotalSavedUiKt.a((EReceiptSavings) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(1), i2);
                break;
            case 17:
                ((Integer) obj2).getClass();
                DeleteAccountScreenKt.a((FullPageMessage.Error) obj4, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                AccountDetailsContentKt.a((AccountDetailsData) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                BrandedShopHorizontalListKt.b((au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListData) obj4, (au.com.woolworths.design.wx.component.searchbar.a) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                BrandedShopTabHeaderKt.a((ArrayList) obj4, i2, (g) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                PromotionPageKt.b((BrowsePage.Promotion) obj4, (FocusRequester) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).intValue();
                PromotionPageKt.a((BrowsePage.Promotion) obj4, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).intValue();
                CategoryListingScreenKt.f((CollapsingToolbarScope) obj4, (ListingHeader) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).intValue();
                PromotionListingScreenKt.f((CollapsingToolbarScope) obj4, (au.com.woolworths.feature.shop.catalogue.listing.promotion.model.ListingHeader) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                InfoTileIconKt.b((InfoTileIconSlot) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(1), i2);
                break;
            case 26:
                ((Integer) obj2).getClass();
                CmoReviewContentScreenKt.c((ChangeMyOrderDetailsSectionItems.Cart) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                CmoReviewContentScreenKt.g((FooterCtaSection) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                IconListItemKt.a((IconListItemApiData) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ListSectionHeaderKt.a((ListSectionHeaderApiData) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
        }
        return unit;
    }

    public /* synthetic */ b(Object obj, int i, int i2, Object obj2) {
        this.d = i2;
        this.f = obj;
        this.g = obj2;
        this.e = i;
    }

    public /* synthetic */ b(Object obj, int i, Object obj2, int i2, int i3) {
        this.d = i3;
        this.f = obj;
        this.e = i;
        this.g = obj2;
    }

    public /* synthetic */ b(Object obj, Modifier modifier, int i, int i2, int i3) {
        this.d = i3;
        this.f = obj;
        this.g = modifier;
        this.e = i2;
    }
}
