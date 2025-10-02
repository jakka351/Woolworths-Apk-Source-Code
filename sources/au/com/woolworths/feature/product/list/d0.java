package au.com.woolworths.feature.product.list;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.paging.compose.LazyPagingItems;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetState;
import au.com.woolworths.feature.product.list.ProductListOptionsContract;
import au.com.woolworths.feature.product.list.compose.filter.child.ProductListChildFilterScreenKt;
import au.com.woolworths.feature.product.list.legacy.ProductListOptionsContract;
import au.com.woolworths.feature.product.list.legacy.compose.productsearch.SearchRowSectionKt;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsContentKt;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.ChoosePlanScreenKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.InnerContentNormalKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasLandingFeed;
import au.com.woolworths.feature.shop.catalogue.browse.model.BrowsePage;
import au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionPageKt;
import au.com.woolworths.feature.shop.countryselector.CountrySelectorContract;
import au.com.woolworths.feature.shop.countryselector.ui.MoreCountrySelectorScreenKt;
import au.com.woolworths.feature.shop.homepage.data.InStoreDetailsCardData;
import au.com.woolworths.feature.shop.homepage.data.MyShoppingListsData;
import au.com.woolworths.feature.shop.homepage.presentation.lists.MyListsKt;
import au.com.woolworths.feature.shop.homepage.presentation.modeselector.ModeSelectorSubHeaderKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.positionlock.PositionLockProgressIndicatorKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.CurrentDeliveryOrderOverviewItemKt;
import au.com.woolworths.feature.shop.recipes.details.data.RecipeDetailData;
import au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsTabsKt;
import au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorContract;
import au.com.woolworths.feature.shop.shippingcalculator.ui.ShippingCalculatorScreenKt;
import au.com.woolworths.feature.shop.wpay.ui.addgiftcard.AddGiftCardModalKt;
import au.com.woolworths.feature.shop.wpay.ui.addgiftcard.AddGiftCardViewModel;
import au.com.woolworths.feature.shop.wpay.ui.common.component.WebViewScreenKt;
import au.com.woolworths.feature.shop.wpay.ui.wpay.ModalBottomSheetData;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceViewModel;
import au.com.woolworths.foundation.shop.olive.voice.ui.dialog.DialogType;
import au.com.woolworths.foundation.shop.olive.voice.ui.search.OliveVoiceSearchScreenKt;
import au.com.woolworths.foundation.ui.image.gallery.GalleryImagesCarouselKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.sdui.legacy.downloadableasset.DownloadableAssetUiKt;
import au.com.woolworths.shop.aem.components.model.downloadableAsset.DownloadableAssetData;
import au.com.woolworths.shop.aem.components.ui.downloadableAsset.DownloadableAssetKt;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentExtraInfo;
import au.com.woolworths.shop.checkout.ui.compose.FulfilmentFeesBottomSheetKt;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.RatingReviewHandler;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.ReviewsContract;
import au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.ReviewsDetailsScreenKt;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsAndReviewsPreviewData;
import au.com.woolworths.shop.ratingsandreviews.ui.RatingsAndReviewsPreviewUIKt;
import au.com.woolworths.shop.ratingsandreviews.ui.ReviewPreviewScreenUIKt;
import au.com.woolworths.shop.rewards.priming.data.PrimingScreenData;
import au.com.woolworths.shop.rewards.priming.ui.PrimingContentUiKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ d0(int i, RecipeDetailData recipeDetailData, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, int i2) {
        this.d = 13;
        this.e = i;
        this.f = recipeDetailData;
        this.g = function1;
        this.h = function12;
        this.i = function13;
        this.j = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                VideoAdUnitComposeViewKt.a((ProductCard) this.f, (ProductCardConfig) this.g, (ProductClickListener) this.h, (List) this.i, (Modifier) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ProductListChildFilterScreenKt.a((ProductListOptionsContract.ViewState) this.f, (Function1) this.g, (Function2) this.h, (Function1) this.i, (Function0) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.product.list.legacy.compose.filter.child.ProductListChildFilterScreenKt.a((ProductListOptionsContract.ViewState) this.f, (Function1) this.g, (Function2) this.h, (Function1) this.i, (Function0) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                SearchRowSectionKt.d((Function0) this.f, (Function0) this.g, (Function0) this.h, (Function1) this.i, (Modifier) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                RewardsPreferenceDetailsContentKt.d((RewardsPreferenceDetailsContract.ViewState) this.f, (Function2) this.g, (Function1) this.h, (Function0) this.i, (Function0) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ChoosePlanScreenKt.b((EverydayExtraChoosePlanContract.ViewState) this.f, (Function1) this.g, (Function1) this.h, (Function0) this.i, (Function1) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                InnerContentNormalKt.a((EverydayExtrasLandingFeed) this.f, (RewardsServiceMessage) this.g, (Function1) this.h, (Function1) this.i, (Modifier) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                PromotionPageKt.d((BrowsePage.Promotion) this.f, (Function1) this.g, (Function0) this.h, (FocusRequester) this.i, (Modifier) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                MoreCountrySelectorScreenKt.b((CountrySelectorContract.ViewStateBySource.MoreCountrySelectorViewState) this.f, (Function1) this.g, (Function0) this.h, (Function0) this.i, (Function0) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                MyListsKt.a((MyShoppingListsData) this.f, (Function1) this.g, (Function1) this.h, (Function0) this.i, (Modifier) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                ModeSelectorSubHeaderKt.d((InStoreDetailsCardData) this.f, (Function0) this.g, (Function0) this.h, (String) this.i, (Function0) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                PositionLockProgressIndicatorKt.a((String) this.f, (Float) this.g, (Function1) this.h, (Modifier) this.j, (Function0) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 12:
                ((Integer) obj2).intValue();
                CurrentDeliveryOrderOverviewItemKt.b((ButtonApiData) this.f, (ButtonApiData) this.g, (Function1) this.h, (Function0) this.i, (Function0) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(196993);
                RecipeDetailsTabsKt.a(this.e, (RecipeDetailData) this.f, (Function1) this.g, (Function1) this.h, (Function1) this.i, (Modifier) this.j, (Composer) obj, iA);
                break;
            case 14:
                ((Integer) obj2).getClass();
                ShippingCalculatorScreenKt.b((ShippingCalculatorContract.ViewState) this.f, (Function0) this.g, (Function1) this.h, (Function2) this.i, (Modifier) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                AddGiftCardModalKt.a((ModalBottomSheetData.AddGiftCard) this.f, (Function1) this.g, (Modifier) this.j, (AddGiftCardViewModel) this.h, (SheetState) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                WebViewScreenKt.a((Function1) this.f, (Function0) this.g, (Function2) this.h, (Function2) this.i, (Modifier) this.j, true, true, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 17:
                ((Integer) obj2).intValue();
                OliveVoiceSearchScreenKt.a((DialogType) this.f, (Function1) this.g, (Function1) this.h, (OliveVoiceViewModel) this.i, (Function0) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                GalleryImagesCarouselKt.b((List) this.i, (PagerState) this.f, (ColorPainter) this.g, (Modifier) this.j, (Function1) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                DownloadableAssetUiKt.c((DownloadableAsset) this.f, (ContentScale) this.g, (String) this.h, (Painter) this.i, (Modifier) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                DownloadableAssetKt.c((DownloadableAssetData) this.f, (ContentScale) this.g, (String) this.h, (Painter) this.i, (Modifier) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                FulfilmentFeesBottomSheetKt.b((FulfilmentExtraInfo) this.f, (Function0) this.g, (Function1) this.h, (Function1) this.i, (Modifier) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 22:
                ((Integer) obj2).intValue();
                ReviewsDetailsScreenKt.e((PaddingValues) this.f, (LazyPagingItems) this.g, (LazyListState) this.h, (RatingReviewHandler) this.i, (ReviewsContract.ViewState) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                ReviewsDetailsScreenKt.c((LazyPagingItems) this.f, (RatingReviewHandler) this.g, (ReviewsContract.ViewState) this.h, (Modifier) this.j, (LazyListState) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                RatingsAndReviewsPreviewUIKt.b((RatingsAndReviewsPreviewData) this.f, (Function2) this.g, (Function2) this.h, (Function2) this.i, (Modifier) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                ReviewPreviewScreenUIKt.b((String) this.f, (String) this.g, (Function0) this.h, (Function0) this.i, (Modifier) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                PrimingContentUiKt.a((PrimingScreenData) this.f, (Function0) this.g, (Function0) this.h, (Modifier) this.j, (LazyListState) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ d0(ModalBottomSheetData.AddGiftCard addGiftCard, Function1 function1, Modifier modifier, AddGiftCardViewModel addGiftCardViewModel, SheetState sheetState, int i) {
        this.d = 15;
        this.f = addGiftCard;
        this.g = function1;
        this.j = modifier;
        this.h = addGiftCardViewModel;
        this.i = sheetState;
        this.e = i;
    }

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, Modifier modifier, Object obj4, int i, int i2) {
        this.d = i2;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.j = modifier;
        this.i = obj4;
        this.e = i;
    }

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.d = i2;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
        this.j = obj5;
        this.e = i;
    }

    public /* synthetic */ d0(List list, PagerState pagerState, ColorPainter colorPainter, Modifier modifier, Function1 function1, int i) {
        this.d = 18;
        this.i = list;
        this.f = pagerState;
        this.g = colorPainter;
        this.j = modifier;
        this.h = function1;
        this.e = i;
    }
}
