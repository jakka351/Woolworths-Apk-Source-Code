package au.com.woolworths.feature.product.list.legacy;

import android.text.Editable;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import au.com.woolworths.android.onesite.epoxy.CirclePageIndicatorDecoration;
import au.com.woolworths.android.onesite.repository.NoResultsException;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.android.onesite.utils.Strings;
import au.com.woolworths.base.shopapp.models.address.AddressResult;
import au.com.woolworths.feature.rewards.offers.ItemRewardsOffersFilterNoOffersBindingModel_;
import au.com.woolworths.feature.rewards.offers.RewardsOffersEpoxyController;
import au.com.woolworths.feature.shop.catalogue.browse.contents.epoxy.ContentsEpoxyController;
import au.com.woolworths.feature.shop.catalogue.browse.page.category.ProductCardsEpoxyController;
import au.com.woolworths.feature.shop.marketplace.ui.categories.MarketplaceCategoriesEpoxyController;
import au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListEpoxyController;
import au.com.woolworths.product.details.epoxy.HealthierHorizontalModelGroup;
import au.com.woolworths.product.details.epoxy.ProductCardGroup;
import au.com.woolworths.shop.checkout.ItemCheckoutFulfilmentSlotBindingModel_;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindowsgroup.FulfilmentWindowsGroupEpoxyController;
import au.com.woolworths.shop.lists.ItemShoppingListTextBindingModel_;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsListController;
import com.adobe.marketing.mobile.services.HttpConnecting;
import com.adobe.marketing.mobile.services.Log;
import com.adobe.marketing.mobile.services.NetworkCallback;
import com.airbnb.epoxy.Carousel;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyVisibilityTracker;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelUnboundListener;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.ClampedCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.textfield.TextInputLayout;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements EpoxyModel.SpanSizeOverrideCallback, OnModelBoundListener, Function, OnModelUnboundListener, OnApplyWindowInsetsListener, NetworkCallback, ShapeAppearanceModel.CornerSizeUnaryOperator, TextInputLayout.LengthCounter {
    public final /* synthetic */ int d;

    public /* synthetic */ k(int i) {
        this.d = i;
    }

    @Override // com.airbnb.epoxy.EpoxyModel.SpanSizeOverrideCallback
    public int a(int i, int i2, int i3) {
        switch (this.d) {
            case 0:
                return ProductListController.buildDynamicSizeCard$lambda$24(i, i2, i3);
            case 1:
                return ProductListController.buildImageTextBannerCard$lambda$25(i, i2, i3);
            case 2:
                return ProductListController.buildItemModel$lambda$0(i, i2, i3);
            case 3:
                return ProductListController.buildHorizontalList$lambda$20$lambda$19(i, i2, i3);
            case 4:
                return ProductListController.buildEdrOfferBanner$lambda$16$lambda$15(i, i2, i3);
            case 5:
                return ProductListController.buildLoadingState$lambda$22(i, i2, i3);
            case 6:
                return ProductListController.buildPersonalisedProductsBanner$lambda$18$lambda$17(i, i2, i3);
            case 7:
                return ProductListOptionsController.buildModels$lambda$4$lambda$1$lambda$0(i, i2, i3);
            case 8:
                return ProductListOptionsController.buildModels$lambda$4$lambda$3$lambda$2(i, i2, i3);
            case 9:
                return ProductListOptionsController.buildFilterCard$lambda$10$lambda$9(i, i2, i3);
            case 10:
                return ProductListOptionsController.buildMarketplaceSwitch$lambda$16$lambda$11(i, i2, i3);
            case 11:
            default:
                return RecipeListEpoxyController.buildErrorState$lambda$1(i, i2, i3);
            case 12:
                return ContentsEpoxyController.buildModels$lambda$5$lambda$1$lambda$0(i, i2, i3);
            case 13:
                return ContentsEpoxyController.buildModels$lambda$5$lambda$4(i, i2, i3);
            case 14:
                return ProductCardsEpoxyController.buildModels$lambda$3$lambda$1(i, i2, i3);
            case 15:
                return MarketplaceCategoriesEpoxyController.buildUi$lambda$3$lambda$2$lambda$0(i, i2, i3);
            case 16:
                return MarketplaceCategoriesEpoxyController.buildUi$lambda$5$lambda$4(i, i2, i3);
            case 17:
                return RecipeListEpoxyController.buildDynamicAdBanner$lambda$3$lambda$2(i, i2, i3);
        }
    }

    @Override // io.reactivex.functions.Function
    /* renamed from: apply */
    public Object mo0apply(Object obj) {
        switch (this.d) {
            case 19:
                AddressResult addressResult = (AddressResult) obj;
                return (addressResult == null || addressResult.a() == null || addressResult.a().size() == 0 || (addressResult.a().size() == 1 && Strings.b(((AddressResult.Address) addressResult.a().get(0)).c()))) ? Observable.b(new NoResultsException("No addresses found")) : Observable.e(addressResult.a());
            case 20:
                Throwable th = (Throwable) obj;
                Intrinsics.e(th);
                return Result.Companion.a(th);
            default:
                Throwable th2 = (Throwable) obj;
                Intrinsics.e(th2);
                return Result.Companion.a(th2);
        }
    }

    @Override // com.adobe.marketing.mobile.services.NetworkCallback
    public void b(HttpConnecting httpConnecting) {
        if (httpConnecting == null) {
            Log.c();
            return;
        }
        if (httpConnecting.b() == 200) {
            Log.c();
        } else {
            httpConnecting.b();
            Log.c();
        }
        httpConnecting.close();
    }

    @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
    public CornerSize c(CornerSize cornerSize) {
        int i = MaskableFrameLayout.j;
        return cornerSize instanceof AbsoluteCornerSize ? new ClampedCornerSize(((AbsoluteCornerSize) cornerSize).f14630a) : cornerSize;
    }

    @Override // com.google.android.material.textfield.TextInputLayout.LengthCounter
    public int d(Editable editable) {
        int[][] iArr = TextInputLayout.F0;
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    @Override // com.airbnb.epoxy.OnModelUnboundListener
    public void e(EpoxyModel epoxyModel, Object obj) {
        Carousel carousel = (Carousel) obj;
        switch (this.d) {
            case 22:
                EpoxyVisibilityTracker epoxyVisibilityTracker = HealthierHorizontalModelGroup.q;
                Intrinsics.e(carousel);
                epoxyVisibilityTracker.getClass();
                EpoxyVisibilityTracker.Listener listener = epoxyVisibilityTracker.d;
                ArrayList arrayList = carousel.n0;
                if (arrayList != null) {
                    arrayList.remove(listener);
                }
                carousel.removeOnLayoutChangeListener(listener);
                ArrayList arrayList2 = carousel.G;
                if (arrayList2 != null) {
                    arrayList2.remove(listener);
                }
                carousel.setTag(com.woolworths.R.id.epoxy_visibility_tracker, null);
                epoxyVisibilityTracker.f = null;
                CirclePageIndicatorDecoration circlePageIndicatorDecoration = HealthierHorizontalModelGroup.p;
                if (circlePageIndicatorDecoration != null) {
                    carousel.k0(circlePageIndicatorDecoration);
                    break;
                }
                break;
            default:
                EpoxyVisibilityTracker epoxyVisibilityTracker2 = ProductCardGroup.s;
                Intrinsics.e(carousel);
                epoxyVisibilityTracker2.getClass();
                EpoxyVisibilityTracker.Listener listener2 = epoxyVisibilityTracker2.d;
                ArrayList arrayList3 = carousel.n0;
                if (arrayList3 != null) {
                    arrayList3.remove(listener2);
                }
                carousel.removeOnLayoutChangeListener(listener2);
                ArrayList arrayList4 = carousel.G;
                if (arrayList4 != null) {
                    arrayList4.remove(listener2);
                }
                carousel.setTag(com.woolworths.R.id.epoxy_visibility_tracker, null);
                epoxyVisibilityTracker2.f = null;
                CirclePageIndicatorDecoration circlePageIndicatorDecoration2 = ProductCardGroup.r;
                if (circlePageIndicatorDecoration2 != null) {
                    carousel.k0(circlePageIndicatorDecoration2);
                    break;
                }
                break;
        }
    }

    @Override // com.airbnb.epoxy.OnModelBoundListener
    public void g(int i, EpoxyModel epoxyModel, Object obj) {
        switch (this.d) {
            case 11:
                RewardsOffersEpoxyController.buildModels$lambda$4$lambda$3((ItemRewardsOffersFilterNoOffersBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
            case 25:
                FulfilmentWindowsGroupEpoxyController.buildSlots$lambda$9$lambda$8$lambda$7((ItemCheckoutFulfilmentSlotBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
            default:
                ShoppingListDetailsListController.buildNewTextListItemModel$lambda$8$lambda$7((ItemShoppingListTextBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.h(view, "view");
        Insets insetsE = windowInsetsCompat.e(2);
        Intrinsics.g(insetsE, "getInsets(...)");
        view.setPadding(insetsE.f2430a, insetsE.b, insetsE.c, insetsE.d);
        return WindowInsetsCompat.b;
    }
}
