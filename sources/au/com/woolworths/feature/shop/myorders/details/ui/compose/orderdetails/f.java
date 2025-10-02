package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import au.com.woolworths.analytics.supers.instorecheckavailability.InstoreCheckAvailabilityAnalytics;
import au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult;
import au.com.woolworths.base.shopapp.modules.search.SearchKeywordType;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesFilterGroupItem;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesProductItem;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesSubstitutedProduct;
import au.com.woolworths.feature.shop.myorders.details.models.Chip;
import au.com.woolworths.feature.shop.myorders.details.models.CurrentPickupOrderOverview;
import au.com.woolworths.feature.shop.myorders.details.models.DriverRatingThankYou;
import au.com.woolworths.feature.shop.myorders.details.models.OrderDetailsProductCardData;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract;
import au.com.woolworths.feature.shop.product.availability.domain.StoreProductAvailabilityData;
import au.com.woolworths.feature.shop.recipes.details.data.UserInteractionData;
import au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentViewModel;
import au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeListener;
import au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListEpoxyController;
import au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListViewModel;
import au.com.woolworths.feature.shop.recipes.recipes.list.RecipesListContract;
import au.com.woolworths.feature.shop.recipes.search.RecipeSearchViewModel;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsContract;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsScreenKt;
import au.com.woolworths.feature.shop.voc.data.SurveyData;
import au.com.woolworths.feature.shop.voc.data.VocSurveyData;
import au.com.woolworths.feature.shop.voc.score.VocContract;
import au.com.woolworths.foundation.feature.analytics.AnalyticsTracker;
import au.com.woolworths.foundation.rewards.common.ui.banners.data.MandyBanner;
import au.com.woolworths.foundation.rewards.common.ui.iconlist.RewardsIconListModel;
import au.com.woolworths.foundation.shop.nhp.model.personalisedproducts.PersonalisedProductsBannerData;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchState;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdBottomSheet;
import au.com.woolworths.geolocation.location.LocationInteractor;
import au.com.woolworths.geolocation.location.LocationInteractor$getLocationUpdates$1$locationCallback$1;
import au.com.woolworths.graphql.subscriptions.sse.channel.DefaultMainChannel;
import au.com.woolworths.rewards.base.data.EmptyStateButtonData;
import au.com.woolworths.rewards.base.info.FeatureInfoFooter;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionsUtilKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.sse.EventSource;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        VocSurveyData vocSurveyData;
        int i = this.d;
        String str = null;
        Unit unit = Unit.f24250a;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                ((Function1) obj2).invoke(((CurrentPickupOrderOverview) obj).c);
                return unit;
            case 1:
                ((Function1) obj2).invoke(((DriverRatingThankYou) obj).f.h.getAction());
                return unit;
            case 2:
                ((Function1) obj2).invoke(((Chip) obj).f7746a);
                return unit;
            case 3:
                ((Function1) obj2).invoke(String.valueOf(((OrderDetailsProductCardData) obj).d));
                return unit;
            case 4:
                ((Function1) obj2).invoke((YourGroceriesFilterGroupItem.YourGroceriesFilterItem) obj);
                return unit;
            case 5:
                ((Function1) obj2).invoke((YourGroceriesContract.YourGroceriesItem) obj);
                return unit;
            case 6:
                ((Function1) obj2).invoke((YourGroceriesProductItem) obj);
                return unit;
            case 7:
                ((Function1) obj2).invoke((YourGroceriesSubstitutedProduct) obj);
                return unit;
            case 8:
                ((Function1) obj2).invoke(((StoreProductAvailabilityData) obj).f7995a);
                return unit;
            case 9:
                ((Function0) obj2).invoke();
                ((AnalyticsTracker) obj).a(InstoreCheckAvailabilityAnalytics.CheckStockScreen.Action.d);
                return unit;
            case 10:
                ((FreshMagHomeListener) obj2).N1((RecipeCardSummaryData) obj);
                return unit;
            case 11:
                Function1 function1 = (Function1) obj2;
                String str2 = ((UserInteractionData) obj).b;
                if (str2 == null) {
                    throw new IllegalArgumentException("Recipe URL not provided by API response!");
                }
                function1.invoke(str2);
                return unit;
            case 12:
                ((FreshMagContentViewModel) obj2).q6((String) obj);
                return unit;
            case 13:
                RecipeListViewModel recipeListViewModel = ((RecipeListEpoxyController) obj2).viewModel;
                recipeListViewModel.getClass();
                recipeListViewModel.l.f(new RecipesListContract.Actions.LaunchRecipeDetails(((RecipeCardSummaryData) obj).getId()));
                return unit;
            case 14:
                ((RecipeSearchViewModel) obj2).q6(((TextFieldValue) ((MutableState) obj).getD()).f2127a.e, SearchKeywordType.g);
                return unit;
            case 15:
                ((RecipeSearchViewModel) obj2).q6((String) obj, SearchKeywordType.f);
                return unit;
            case 16:
                int i2 = StoreDetailsScreenKt.f8201a;
                ((StoreDetailsContract.ViewState) obj2).h.invoke(new StoreDetailsContract.ViewAction.ShopInStoreSelected((StoreLocatorResult.Store) obj));
                return unit;
            case 17:
                Function3 function3 = (Function3) obj2;
                VocContract.ViewState viewState = (VocContract.ViewState) obj;
                SurveyData surveyData = viewState.h;
                if (surveyData != null && (vocSurveyData = surveyData.f) != null) {
                    str = vocSurveyData.f8223a;
                }
                Intrinsics.e(str);
                VocSurveyData vocSurveyData2 = viewState.h.f;
                String str3 = vocSurveyData2.e;
                if (str3 == null) {
                    str3 = "";
                }
                function3.invoke(str, str3, vocSurveyData2.d.getLabel());
                return unit;
            case 18:
                ((Function1) obj2).invoke(((MandyBanner) obj).e);
                return unit;
            case 19:
                Function1 function12 = (Function1) obj2;
                EmptyStateButtonData emptyStateButtonData = (EmptyStateButtonData) obj;
                if (function12 != null) {
                    function12.invoke(emptyStateButtonData);
                }
                return unit;
            case 20:
                ((Function1) obj2).invoke(((RewardsIconListModel.Item.Action) obj).f8587a);
                return unit;
            case 21:
                ((Function1) obj2).invoke((RewardsIconListModel.ItemAction) obj);
                return unit;
            case 22:
                ((Function1) obj2).invoke(((FeatureInfoFooter) obj).getPrimaryCta());
                return unit;
            case 23:
                ((Function1) obj2).invoke((PersonalisedProductsBannerData) obj);
                return unit;
            case 24:
                ((Function2) obj2).invoke(Boolean.TRUE, Boolean.valueOf(PermissionsUtilKt.d(((PermissionState) obj).getStatus())));
                return unit;
            case 25:
                ((Function0) obj2).invoke();
                ((PermissionState) obj).a();
                return unit;
            case 26:
                ((Function1) obj2).invoke((VoiceSearchState) obj);
                return unit;
            case 27:
                ((Function1) obj2).invoke((VideoAdBottomSheet) obj);
                return unit;
            case 28:
                ((LocationInteractor) obj2).c.removeLocationUpdates((LocationInteractor$getLocationUpdates$1$locationCallback$1) obj);
                return unit;
            default:
                ((EventSource) obj2).cancel();
                ((DefaultMainChannel) obj).c = null;
                return unit;
        }
    }
}
