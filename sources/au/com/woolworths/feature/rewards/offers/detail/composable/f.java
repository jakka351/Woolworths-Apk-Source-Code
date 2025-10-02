package au.com.woolworths.feature.rewards.offers.detail.composable;

import android.R;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.State;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.rewards.offers.detail.OfferDetailsContract;
import au.com.woolworths.feature.rewards.offers.detail.OfferDetailsViewModel;
import au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsContractLegacy;
import au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsViewModel;
import au.com.woolworths.feature.rewards.offers.listpage.OfferListPageActivity;
import au.com.woolworths.feature.rewards.offers.points.RewardsPointsContract;
import au.com.woolworths.feature.rewards.offers.points.RewardsPointsViewModel;
import au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsBottomSheetActivity;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecureDollarsContract;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesActivity;
import au.com.woolworths.feature.shared.feedback.ui.Feedback2FormActivity;
import au.com.woolworths.feature.shared.force.upgrade.ConfigActionActivity;
import au.com.woolworths.feature.shop.catalogue.browse.model.BrowsePage;
import au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionPageEpoxyModel;
import au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsActivity;
import au.com.woolworths.feature.shop.catalogue.intro.CatalogueIntroActivity;
import au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingActivity;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingActivity;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsActivity;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListViewModel;
import au.com.woolworths.feature.shop.catalogue.productlist.model.CatalogueItemTracking;
import au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyActivity;
import au.com.woolworths.feature.shop.homepage.presentation.MarketplaceCardClickListener;
import au.com.woolworths.feature.shop.homepage.presentation.fulfilmentstatusbanner.BannerClickListener;
import au.com.woolworths.feature.shop.homepage.presentation.fulfilmentstatusbanner.FulfilmentStatusBannerView;
import au.com.woolworths.feature.shop.homepage.presentation.marketplace.MarketplaceCardView;
import au.com.woolworths.feature.shop.instore.cart.InstoreCartActivity;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.ProductFinderOnboardingContract;
import au.com.woolworths.feature.shop.marketplace.ui.categories.CategoryTileView;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceFragment;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplacePagerAdapter;
import au.com.woolworths.feature.shop.marketplace.ui.personalised.HowItWorksCardView;
import au.com.woolworths.feature.shop.modeselector.ModeSelectorActivity;
import au.com.woolworths.feature.shop.myorders.details.baynumber.BayNumberSelectorBottomSheet;
import au.com.woolworths.feature.shop.myorders.details.baynumber.BayNumberSelectorViewModel;
import au.com.woolworths.feature.shop.myorders.details.help.HelpAndSupportActivity;
import au.com.woolworths.feature.shop.myorders.details.help.HelpAndSupportContract;
import au.com.woolworths.feature.shop.myorders.details.help.HelpAndSupportViewModel;
import au.com.woolworths.feature.shop.myorders.details.help.OrderDetailsHelpContract;
import au.com.woolworths.feature.shop.myorders.details.help.OrderDetailsHelpViewModel;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj = this.e;
        switch (i) {
            case 0:
                MutableStateFlow mutableStateFlow = ((RewardsOfferDetailsViewModel) obj).o;
                mutableStateFlow.setValue(RewardsOfferDetailsContractLegacy.ViewState.a((RewardsOfferDetailsContractLegacy.ViewState) mutableStateFlow.getValue(), false, false, null, null, false, 15));
                return unit;
            case 1:
                ((OfferListPageActivity) obj).finish();
                return unit;
            case 2:
                ((AppCompatActivity) obj).onBackPressed();
                return unit;
            case 3:
                MutableStateFlow mutableStateFlow2 = ((RewardsPointsViewModel) obj).w;
                mutableStateFlow2.setValue(RewardsPointsContract.ViewState.a((RewardsPointsContract.ViewState) mutableStateFlow2.getValue(), false, null, null, false, null, null, 3583));
                return unit;
            case 4:
                MutableStateFlow mutableStateFlow3 = ((OfferDetailsViewModel) obj).n;
                OfferDetailsContract.ViewState.Content contentB = ((OfferDetailsContract.ViewState) mutableStateFlow3.getValue()).b();
                if (contentB != null) {
                    mutableStateFlow3.setValue(OfferDetailsContract.ViewState.Content.c(contentB, false, null, false, 14));
                }
                return unit;
            case 5:
                int i2 = RewardsRedemptionSettingsBottomSheetActivity.B;
                ((RewardsRedemptionSettingsBottomSheetActivity) obj).O4().q6();
                return unit;
            case 6:
                int i3 = SecurityPreferencesActivity.y;
                ((SecurityPreferencesActivity) obj).finish();
                return unit;
            case 7:
                ((SecureDollarsContract.ViewState) obj).g.invoke(SecureDollarsContract.ViewModelAction.Retry.f6445a);
                return unit;
            case 8:
                ((Feedback2FormActivity) obj).finish();
                return unit;
            case 9:
                int i4 = ConfigActionActivity.A;
                Intent intent = ((ConfigActionActivity) obj).getIntent();
                Intrinsics.g(intent, "getIntent(...)");
                if (Build.VERSION.SDK_INT >= 33) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        parcelable = (Parcelable) extras.getParcelable("EXTRA_CONFIG_ACTION_DETAILS", Activities.AppConfigAction.ConfigExtras.class);
                    }
                } else {
                    Bundle extras2 = intent.getExtras();
                    Parcelable parcelable = extras2 != null ? extras2.getParcelable("EXTRA_CONFIG_ACTION_DETAILS") : null;
                    parcelable = (Activities.AppConfigAction.ConfigExtras) (parcelable instanceof Activities.AppConfigAction.ConfigExtras ? parcelable : null);
                }
                if (parcelable != null) {
                    return (Activities.AppConfigAction.ConfigExtras) parcelable;
                }
                throw new IllegalArgumentException("Extras are required for ConfigActionActivity.");
            case 10:
                PromotionPageEpoxyModel promotionPageEpoxyModel = (PromotionPageEpoxyModel) obj;
                Function1<BrowsePage.Promotion, Unit> onPromotionPageButtonClick = promotionPageEpoxyModel.getOnPromotionPageButtonClick();
                if (onPromotionPageButtonClick != null) {
                    onPromotionPageButtonClick.invoke(promotionPageEpoxyModel.getPage());
                }
                return unit;
            case 11:
                int i5 = CatalogueDetailsActivity.B;
                return (CatalogueDetailsActivity.Extra) ((CatalogueDetailsActivity) obj).getIntent().getParcelableExtra("extra_catalogue_details");
            case 12:
                int i6 = CatalogueIntroActivity.D;
                return (CatalogueIntroActivity.Companion.Extras) ((CatalogueIntroActivity) obj).getIntent().getParcelableExtra("extra_catalogue_intro");
            case 13:
                int i7 = CategoryListingActivity.A;
                Parcelable parcelableExtra = ((CategoryListingActivity) obj).getIntent().getParcelableExtra("extra_category_listing");
                if (parcelableExtra != null) {
                    return (CategoryListingActivity.Extra) parcelableExtra;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 14:
                int i8 = PromotionListingActivity.z;
                Parcelable parcelableExtra2 = ((PromotionListingActivity) obj).getIntent().getParcelableExtra("extra_promotion_listing");
                if (parcelableExtra2 != null) {
                    return (PromotionListingActivity.Extra) parcelableExtra2;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 15:
                int i9 = PromotionDetailsActivity.A;
                Parcelable parcelableExtra3 = ((PromotionDetailsActivity) obj).getIntent().getParcelableExtra("extra_promotion_details");
                if (parcelableExtra3 != null) {
                    return (Activities.CataloguePromotionDetails.Extra) parcelableExtra3;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 16:
                CatalogueProductListViewModel catalogueProductListViewModel = (CatalogueProductListViewModel) obj;
                String str = catalogueProductListViewModel.n;
                if (str == null) {
                    Intrinsics.p("itemId");
                    throw null;
                }
                String str2 = catalogueProductListViewModel.o;
                if (str2 != null) {
                    return new CatalogueItemTracking(str, str2);
                }
                Intrinsics.p("itemName");
                throw null;
            case 17:
                int i10 = AddDeliveryAddressManuallyActivity.A;
                return new ArrayAdapter((AddDeliveryAddressManuallyActivity) obj, R.layout.simple_list_item_1);
            case 18:
                BannerClickListener clickListener = ((FulfilmentStatusBannerView) obj).getClickListener();
                if (clickListener != null) {
                    clickListener.a();
                }
                return unit;
            case 19:
                MarketplaceCardClickListener onClickListener = ((MarketplaceCardView) obj).getOnClickListener();
                if (onClickListener != null) {
                    onClickListener.z5();
                }
                return unit;
            case 20:
                ((InstoreCartActivity) obj).finish();
                return unit;
            case 21:
                return Integer.valueOf(((ProductFinderOnboardingContract.ViewState) ((State) obj).getD()).f7420a.size());
            case 22:
                Function0<Unit> onClickListener2 = ((CategoryTileView) obj).getOnClickListener();
                if (onClickListener2 != null) {
                    onClickListener2.invoke();
                }
                return unit;
            case 23:
                MarketplacePagerAdapter marketplacePagerAdapter = new MarketplacePagerAdapter((MarketplaceFragment) obj);
                marketplacePagerAdapter.p = EmptyList.d;
                return marketplacePagerAdapter;
            case 24:
                Function0<Unit> onClickListener3 = ((HowItWorksCardView) obj).getOnClickListener();
                if (onClickListener3 != null) {
                    onClickListener3.invoke();
                }
                return unit;
            case 25:
                ((ModeSelectorActivity) obj).finish();
                return unit;
            case 26:
                BayNumberSelectorBottomSheet bayNumberSelectorBottomSheet = (BayNumberSelectorBottomSheet) obj;
                Object parentFragment = bayNumberSelectorBottomSheet.getParentFragment();
                if (parentFragment == null) {
                    parentFragment = bayNumberSelectorBottomSheet.getActivity();
                }
                Intrinsics.f(parentFragment, "null cannot be cast to non-null type au.com.woolworths.feature.shop.myorders.details.baynumber.BayNumberSelectorBottomSheet.BottomSheetHost");
                return (BayNumberSelectorBottomSheet.BottomSheetHost) parentFragment;
            case 27:
                MutableStateFlow mutableStateFlow4 = ((BayNumberSelectorViewModel) obj).h;
                if (mutableStateFlow4 != null) {
                    return FlowKt.b(mutableStateFlow4);
                }
                Intrinsics.p("mutableViewState");
                throw null;
            case 28:
                int i11 = HelpAndSupportActivity.y;
                ((HelpAndSupportViewModel) ((HelpAndSupportActivity) obj).x.getD()).g.f(HelpAndSupportContract.Actions.Back.f7711a);
                return unit;
            default:
                ((OrderDetailsHelpViewModel) obj).i.f(OrderDetailsHelpContract.Actions.Back.f7721a);
                return unit;
        }
    }
}
