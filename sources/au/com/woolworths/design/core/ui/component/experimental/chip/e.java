package au.com.woolworths.design.core.ui.component.experimental.chip;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Parcelable;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.rewards.account.data.PreferenceToggleData;
import au.com.woolworths.base.shopapp.databinding.SimpleCoachMarkContentBinding;
import au.com.woolworths.design.wx.component.bottomsheet.ModalBottomSheetLayoutKt;
import au.com.woolworths.design.wx.preview.PreviewBackgroundColor;
import au.com.woolworths.design.wx.preview.ThemeForPreviewKt;
import au.com.woolworths.feature.product.list.ProductListOptionsViewModel;
import au.com.woolworths.feature.product.list.ProductListViewModel;
import au.com.woolworths.feature.product.list.compose.FullScreenMessageView;
import au.com.woolworths.feature.product.list.compose.filter.ProductListOptionsScreenKt;
import au.com.woolworths.feature.product.list.v2.ProductListActivity;
import au.com.woolworths.feature.product.list.v2.ui.ProductListSkeletonUiKt;
import au.com.woolworths.feature.product.list.v2.ui.ProductsDisplayMode;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsActivity;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsBottomSheetFragment;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.BenefitsComparisonTableKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryFragment;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtraComparisonSectionItem;
import au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsInfoItemUiKt;
import au.com.woolworths.feature.shop.bundles.data.BundleDetails;
import au.com.woolworths.feature.shop.bundles.data.BundlePricingData;
import au.com.woolworths.feature.shop.bundles.ui.BundlesHeaderUiKt;
import au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseAction;
import au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseActivity;
import au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseContract;
import au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseViewModel;
import au.com.woolworths.feature.shop.catalogue.browse.model.BrowsePage;
import au.com.woolworths.feature.shop.catalogue.browse.model.BrowsePageKt;
import au.com.woolworths.feature.shop.catalogue.browse.page.PageEpoxyController;
import au.com.woolworths.feature.shop.catalogue.common.AnalyticsAction;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.model.PromotionHeader;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.model.TermsAndConditions;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui.PromotionDetailsScreenKt;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.PromotionGroupKt;
import au.com.woolworths.feature.shop.editorder.review.components.CmoReviewContentScreenKt;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageFragment;
import au.com.woolworths.feature.shop.homepage.presentation.chatentrycard.ChatEntryCardV2Kt;
import au.com.woolworths.feature.shop.homepage.presentation.deliverynowbanner.DeliveryNowBannerView;
import au.com.woolworths.feature.shop.homepage.presentation.fulfilmentstatusbanner.FulfilmentStatusBannerView;
import au.com.woolworths.feature.shop.homepage.presentation.g;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsCardRow;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.sdui.shop.broadcastbanner.model.BasicCoreBroadcastBannerModel;
import com.skydoves.balloon.Balloon;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e(int i, int i2, Object obj) {
        this.d = i2;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Activities.Search.Extras generic;
        int i = this.d;
        int i2 = 0;
        Unit unit = Unit.f24250a;
        ?? r11 = this.e;
        switch (i) {
            case 0:
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).floatValue();
                ((MutableFloatState) r11).p(fFloatValue);
                return unit;
            case 1:
                ((Integer) obj2).getClass();
                ModalBottomSheetLayoutKt.b((ModalBottomSheetValue) r11, (Composer) obj, RecomposeScopeImplKt.a(7));
                return unit;
            case 2:
                PreviewBackgroundColor previewBackgroundColor = PreviewBackgroundColor.d;
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(1);
                ThemeForPreviewKt.c(iA, (Composer) obj, (Function2) r11);
                return unit;
            case 3:
                String containerTitle = (String) obj;
                String priceFamilyId = (String) obj2;
                Intrinsics.h(containerTitle, "containerTitle");
                Intrinsics.h(priceFamilyId, "priceFamilyId");
                ((ProductListViewModel) r11).Q2(containerTitle, priceFamilyId);
                return unit;
            case 4:
                ((Integer) obj2).getClass();
                int i3 = FullScreenMessageView.n;
                ((FullScreenMessageView) r11).a((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 5:
                ((Integer) obj2).getClass();
                ProductListOptionsScreenKt.b((ProductListOptionsViewModel) r11, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 6:
                String containerTitle2 = (String) obj;
                String priceFamilyId2 = (String) obj2;
                Intrinsics.h(containerTitle2, "containerTitle");
                Intrinsics.h(priceFamilyId2, "priceFamilyId");
                ((au.com.woolworths.feature.product.list.legacy.ProductListViewModel) r11).Q2(containerTitle2, priceFamilyId2);
                return unit;
            case 7:
                ((Integer) obj2).getClass();
                int i4 = au.com.woolworths.feature.product.list.legacy.compose.FullScreenMessageView.n;
                ((au.com.woolworths.feature.product.list.legacy.compose.FullScreenMessageView) r11).a((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 8:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.product.list.legacy.compose.filter.ProductListOptionsScreenKt.b((au.com.woolworths.feature.product.list.legacy.ProductListOptionsViewModel) r11, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 9:
                ProductListActivity productListActivity = (ProductListActivity) r11;
                String str = (String) obj;
                ProductCard productCard = (ProductCard) obj2;
                int i5 = ProductListActivity.z;
                Parcelable parcelableExtra = productListActivity.getIntent().getParcelableExtra("EXTRA_PRODUCT_LIST_INFO");
                if (parcelableExtra == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                switch (((Activities.ProductList.Extras) parcelableExtra).e.getE().ordinal()) {
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 6:
                    case 7:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 20:
                        generic = new Activities.Search.Extras.Generic(str);
                        break;
                    case 1:
                        generic = new Activities.Search.Extras.BuyAgain(str);
                        break;
                    case 5:
                        if (productCard == null) {
                            throw new IllegalStateException("productId expected in the alternative search flow");
                        }
                        generic = new Activities.Search.Extras.ProductAlternative(productCard, str);
                        break;
                    case 8:
                        generic = new Activities.Search.Extras.ProductFinder(str);
                        break;
                    case 19:
                        generic = new Activities.Search.Extras.VoiceProductFinder(str);
                        break;
                    case 21:
                        generic = new Activities.Search.Extras.VoiceWithMapsProductFinder(str);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                productListActivity.startActivity(Activities.Search.f4526a.b(generic));
                return unit;
            case 10:
                String watchlistId = (String) obj2;
                Intrinsics.h((ProductCard) obj, "productCard");
                Intrinsics.h(watchlistId, "watchlistId");
                ((Context) r11).startActivity(Activities.ShoppingListDetails.f4535a.b(watchlistId, false));
                return unit;
            case 11:
                ((Integer) obj2).getClass();
                ProductListSkeletonUiKt.a((ProductsDisplayMode) r11, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 12:
                PreferenceToggleData data = (PreferenceToggleData) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                Intrinsics.h(data, "data");
                int i6 = RewardsPreferenceDetailsActivity.y;
                ((RewardsPreferenceDetailsActivity) r11).O4().x5(data, zBooleanValue);
                return unit;
            case 13:
                PreferenceToggleData data2 = (PreferenceToggleData) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                Intrinsics.h(data2, "data");
                ((RewardsPreferenceDetailsBottomSheetFragment) r11).Q1().x5(data2, zBooleanValue2);
                return unit;
            case 14:
                ((Integer) obj2).getClass();
                BenefitsComparisonTableKt.a((EverydayExtraComparisonSectionItem.BenefitsCompare.CompareTableColumnHeadings) r11, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 15:
                int iIntValue = ((Integer) obj).intValue();
                new AlertDialog.Builder(((EverydayExtraSummaryFragment) r11).requireContext()).setTitle(iIntValue).setMessage(((Integer) obj2).intValue()).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).show();
                return unit;
            case 16:
                ((Integer) obj2).getClass();
                OfferDetailsInfoItemUiKt.a((OfferDetailsCardRow.OfferDetailsInfoItem) r11, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 17:
                ((Integer) obj2).getClass();
                BundlesHeaderUiKt.a((BundleDetails) r11, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 18:
                ((Integer) obj2).getClass();
                BundlesHeaderUiKt.b((BundlePricingData.BundleStandardPricingData) r11, (Composer) obj, RecomposeScopeImplKt.a(9));
                return unit;
            case 19:
                ProductCard productCard2 = (ProductCard) obj;
                BrowsePage.Category categoryPage = (BrowsePage.Category) obj2;
                int i7 = CatalogueBrowseActivity.H;
                Intrinsics.h(productCard2, "productCard");
                Intrinsics.h(categoryPage, "categoryPage");
                CatalogueBrowseViewModel catalogueBrowseViewModelO4 = ((CatalogueBrowseActivity) r11).O4();
                catalogueBrowseViewModelO4.j.k(new CatalogueBrowseContract.Action.LaunchProductDetails(productCard2.getProductId()));
                AnalyticsManager analyticsManager = catalogueBrowseViewModelO4.f;
                AnalyticsAction analyticsActionC = CatalogueBrowseAction.f6784a.c(productCard2.getName());
                TrackingMetadata trackingMetadataH = ProductAnalyticsExtKt.h(productCard2, null, null, 7);
                trackingMetadataH.a(BrowsePageKt.a(categoryPage));
                analyticsManager.j(analyticsActionC, trackingMetadataH);
                return unit;
            case 20:
                return PageEpoxyController.buildItemModel$lambda$2((PageEpoxyController) r11, (BrowsePage.Category) obj, (Integer) obj2);
            case 21:
                ((Integer) obj2).getClass();
                PromotionDetailsScreenKt.a((InsetBanner) r11, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 22:
                ((Integer) obj2).getClass();
                PromotionDetailsScreenKt.b((TermsAndConditions) r11, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 23:
                ((Integer) obj2).getClass();
                PromotionDetailsScreenKt.d((PromotionHeader) r11, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 24:
                ((Integer) obj2).getClass();
                PromotionGroupKt.b(r11, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 25:
                ((Integer) obj2).getClass();
                CmoReviewContentScreenKt.a((BasicCoreBroadcastBannerModel) r11, (Composer) obj, RecomposeScopeImplKt.a(9));
                return unit;
            case 26:
                HomePageFragment homePageFragment = (HomePageFragment) r11;
                SimpleCoachMarkContentBinding showSimpleCoachMark = (SimpleCoachMarkContentBinding) obj;
                Balloon balloon = (Balloon) obj2;
                Intrinsics.h(showSimpleCoachMark, "$this$showSimpleCoachMark");
                Intrinsics.h(balloon, "balloon");
                balloon.m(new g(homePageFragment, i2));
                showSimpleCoachMark.y.setOnClickListener(new androidx.navigation.ui.a(8, balloon, homePageFragment));
                return unit;
            case 27:
                ((Integer) obj2).getClass();
                ChatEntryCardV2Kt.b((ArrayList) r11, (Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 28:
                ((Integer) obj2).getClass();
                int i8 = DeliveryNowBannerView.o;
                ((DeliveryNowBannerView) r11).a((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            default:
                ((Integer) obj2).getClass();
                int i9 = FulfilmentStatusBannerView.n;
                ((FulfilmentStatusBannerView) r11).a((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
        }
    }

    public /* synthetic */ e(int i, Function2 function2) {
        this.d = 2;
        PreviewBackgroundColor previewBackgroundColor = PreviewBackgroundColor.d;
        this.e = function2;
    }

    public /* synthetic */ e(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }
}
