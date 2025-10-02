package au.com.woolworths.feature.shared.receipt.details.compose;

import android.net.Uri;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.feature.shop.banners.broadcastbanner.BroadcastBannerKt;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.model.PromotionGroup;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.PromotionGroupKt;
import au.com.woolworths.feature.shop.editorder.review.CmoReviewContract;
import au.com.woolworths.feature.shop.editorder.review.components.CmoReviewContentScreenKt;
import au.com.woolworths.feature.shop.editorder.review.data.ChangeMyOrderDetailsSection;
import au.com.woolworths.feature.shop.inbox.InboxActivity;
import au.com.woolworths.feature.shop.inbox.InboxUiEvent;
import au.com.woolworths.feature.shop.inbox.domain.LastUnreadChatbotMessageItem;
import au.com.woolworths.feature.shop.inbox.ui.InboxScreenKt;
import au.com.woolworths.feature.shop.inbox.ui.TermsAndConditionsScreenKt;
import au.com.woolworths.feature.shop.instore.cart.ui.InstoreCartScreenKt;
import au.com.woolworths.feature.shop.instore.navigation.map.data.ImageMapData;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.ErrorScreenKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapCallbacks;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapErrorState;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapScreenKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.calibration.CalibrationProgressVideoPlayerKt;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.data.ProductFinderOnboardingItem;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.ui.ProductFinderOnboardingPageKt;
import au.com.woolworths.feature.shop.myorders.details.location.RequestLocationPermissionPrimingDialogContentKt;
import au.com.woolworths.feature.shop.myorders.details.models.ProgressStepper;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.CurrentDeliveryOrderOverviewItemKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.CurrentPickupOrderOverviewItemKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.YourGroceriesErrorScreenKt;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract;
import au.com.woolworths.feature.shop.product.availability.ProductAvailabilityUiState;
import au.com.woolworths.feature.shop.product.availability.ProductAvailabilityViewModel;
import au.com.woolworths.feature.shop.product.availability.ui.ProductAvailabilityScreenKt;
import au.com.woolworths.feature.shop.recipes.details.data.RecipeFeatureData;
import au.com.woolworths.feature.shop.recipes.details.data.RecipeFeatureDifficultyData;
import au.com.woolworths.feature.shop.recipes.details.data.RecipeNutritionTileData;
import au.com.woolworths.feature.shop.recipes.details.data.RecipeNutritionTileFeatureItem;
import au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsBylineKt;
import au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsFeaturesKt;
import au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsNutritionTileKt;
import au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeViewModel;
import au.com.woolworths.feature.shop.recipes.freshmag.home.ui.FreshMagHomeScreenKt;
import au.com.woolworths.feature.shop.recipes.freshmag.ui.FreshMagErrorKt;
import au.com.woolworths.feature.shop.storelocator.details.StoreDetailsContract;
import au.com.woolworths.feature.shop.storelocator.details.StoreDetailsScreenKt;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsContract;
import au.com.woolworths.foundation.rewards.model.receipt.ReceiptDetailsLineItem;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.foundation.shop.model.recipes.RecipeBylineData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ovh.plrapps.mapcompose.ui.state.MapState;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(MutableState mutableState, InboxActivity inboxActivity) {
        this.d = 5;
        this.e = mutableState;
        this.f = inboxActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ReceiptDetailsLineItemUiKt.a((ReceiptDetailsLineItem) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                BroadcastBannerKt.b((BroadcastBannerData) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                PromotionGroupKt.a((PromotionGroup) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                CmoReviewContentScreenKt.h((ChangeMyOrderDetailsSection) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                CmoReviewContentScreenKt.e((CmoReviewContract.ViewState.Content) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 5:
                String content = (String) obj;
                String campaignCode = (String) obj2;
                Intrinsics.h(content, "content");
                Intrinsics.h(campaignCode, "campaignCode");
                ((MutableState) obj4).setValue(content);
                int i2 = InboxActivity.z;
                ((InboxActivity) obj3).N4().p.invoke(new InboxUiEvent.TrackTncsScreenView(campaignCode));
                break;
            case 6:
                ((Integer) obj2).getClass();
                InboxScreenKt.d((LastUnreadChatbotMessageItem) obj4, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                InboxScreenKt.b((LastUnreadChatbotMessageItem) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                TermsAndConditionsScreenKt.a((Function0) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, RecomposeScopeImplKt.a(55));
                break;
            case 9:
                Composer composer = (Composer) obj;
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(49);
                InstoreCartScreenKt.e(iA, composer, (ComposableLambdaImpl) obj3, (Function2) obj4);
                break;
            case 10:
                InstoreMapErrorState instoreMapErrorState = InstoreMapErrorState.d;
                ((Integer) obj2).getClass();
                ErrorScreenKt.a((Function1) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                InstoreMapScreenKt.f((MapState) obj4, (ImageMapData) obj3, (Composer) obj, RecomposeScopeImplKt.a(9));
                break;
            case 12:
                ((Integer) obj2).getClass();
                InstoreMapScreenKt.h((InstoreMapCallbacks) obj4, (InstoreMapContract.ViewState) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                CalibrationProgressVideoPlayerKt.a((Uri) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(49));
                break;
            case 14:
                ((Integer) obj2).getClass();
                ProductFinderOnboardingPageKt.a((ProductFinderOnboardingItem) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(49));
                break;
            case 15:
                ((Integer) obj2).getClass();
                RequestLocationPermissionPrimingDialogContentKt.b((String) obj4, (List) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                CurrentDeliveryOrderOverviewItemKt.a((ButtonApiData) obj4, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                CurrentPickupOrderOverviewItemKt.g((ProgressStepper) obj4, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                YourGroceriesErrorScreenKt.a((YourGroceriesContract.ErrorState) obj4, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                ProductAvailabilityScreenKt.d((ProductAvailabilityViewModel) obj4, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                ProductAvailabilityScreenKt.a((ProductAvailabilityUiState.Content) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                RecipeDetailsBylineKt.a((RecipeBylineData) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(49));
                break;
            case 22:
                ((Integer) obj2).getClass();
                RecipeDetailsFeaturesKt.a((RecipeFeatureData) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                RecipeDetailsFeaturesKt.c((RecipeFeatureDifficultyData) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                RecipeDetailsNutritionTileKt.b((RecipeNutritionTileData) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(49));
                break;
            case 25:
                ((Integer) obj2).getClass();
                RecipeDetailsNutritionTileKt.a((RecipeNutritionTileFeatureItem) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                FreshMagHomeScreenKt.b((Function0) obj4, (FreshMagHomeViewModel) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                FreshMagErrorKt.a((FullPageErrorCause) obj4, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                StoreDetailsScreenKt.e((StoreDetailsContract.ViewState) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(49));
                break;
            default:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsScreenKt.e((StoreDetailsContract.ViewState) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(49));
                break;
        }
        return unit;
    }

    public /* synthetic */ a(Object obj, int i, int i2, Object obj2) {
        this.d = i2;
        this.e = obj;
        this.f = obj2;
    }

    public /* synthetic */ a(Function1 function1, Function1 function12, int i) {
        this.d = 10;
        InstoreMapErrorState instoreMapErrorState = InstoreMapErrorState.d;
        this.e = function1;
        this.f = function12;
    }
}
