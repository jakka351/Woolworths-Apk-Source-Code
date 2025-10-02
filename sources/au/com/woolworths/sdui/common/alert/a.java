package au.com.woolworths.sdui.common.alert;

import androidx.navigation.NavHostController;
import au.com.woolworths.analytics.supers.couponbanner.EmCouponBannerAnalytics;
import au.com.woolworths.analytics.supers.local.CartAnalytics;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.foundation.shop.cart.data.model.BuyMoreSaveMorePromotionInfo;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductCard;
import au.com.woolworths.foundation.shop.cart.data.model.CartShippingMessageBanner;
import au.com.woolworths.foundation.shop.cart.data.model.CartShippingPromotionBanner;
import au.com.woolworths.product.offers.ProductBoostContract;
import au.com.woolworths.product.offers.ProductBoostResultViewModel;
import au.com.woolworths.sdui.common.alert.model.BasicInsetAlertModel;
import au.com.woolworths.sdui.rewards.model.ActionData;
import au.com.woolworths.sdui.rewards.model.broadcastbanner.BasicCoreBroadcastBannerModel;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.shared.ui.compose.shop.chatentrycard.ChatEntryCardV3;
import au.com.woolworths.shop.aem.components.model.CatalogueCard;
import au.com.woolworths.shop.aem.components.model.PillData;
import au.com.woolworths.shop.aem.components.model.QuickLinkCard;
import au.com.woolworths.shop.aem.components.model.contentcard.ContentCardData;
import au.com.woolworths.shop.aem.components.model.contentcard.NavRoundelCardData;
import au.com.woolworths.shop.aem.components.model.herobanner.HeroBanner;
import au.com.woolworths.shop.aem.components.model.merchcardfullimage.MerchCardFullImageData;
import au.com.woolworths.shop.aem.components.model.offercard.OfferCardData;
import au.com.woolworths.shop.aem.components.model.productcategorytile.ProductCategoryTileData;
import au.com.woolworths.shop.aem.components.model.searchnavcard.SearchNavCardData;
import au.com.woolworths.shop.aem.components.ui.CatalogueCardKt;
import au.com.woolworths.shop.buyagain.ui.BuyAgainActivity;
import au.com.woolworths.shop.cart.ShopCartFeature;
import au.com.woolworths.shop.cart.domain.model.ProductReviewAlternativeResponseData;
import au.com.woolworths.shop.cart.ui.cart.CartContract;
import au.com.woolworths.shop.cart.ui.cart.CartViewModel;
import au.com.woolworths.shop.cart.ui.productalternative.ProductsReviewAlternativeCallbacks;
import au.com.woolworths.shop.cart.ui.productreview.ProductReviewCardExtKt;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAndDiscount;
import au.com.woolworths.shop.checkout.domain.model.CollectionMethodOption;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsOption;
import au.com.woolworths.shop.checkout.domain.model.PackagingMethodOption;
import au.com.woolworths.shop.checkout.domain.model.ProgressId;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentContract;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentViewModel;
import au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsListener;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        int i = this.d;
        CartContract.Actions.ShowUndoDelete showUndoDelete = CartContract.Actions.ShowUndoDelete.f10487a;
        Unit unit = Unit.f24250a;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                ((Function1) obj2).invoke(((BasicInsetAlertModel) obj).getAction());
                break;
            case 1:
                ActionData actionData = ((BasicCoreBroadcastBannerModel) obj).c;
                Intrinsics.e(actionData);
                ((Function1) obj2).invoke(actionData);
                break;
            case 2:
                ((Function1) obj2).invoke(((au.com.woolworths.sdui.shop.alert.model.BasicInsetAlertModel) obj).getAction());
                break;
            case 3:
                ((Function1) obj2).invoke(((au.com.woolworths.sdui.shop.broadcastbanner.model.BasicCoreBroadcastBannerModel) obj).d);
                break;
            case 4:
                ((Function1) obj2).invoke((DynamicSizeCardData) obj);
                break;
            case 5:
                ((Function1) obj2).invoke(((ChatEntryCardV3) obj).d);
                break;
            case 6:
                float f = CatalogueCardKt.f10209a;
                ((Function1) obj2).invoke((CatalogueCard) obj);
                break;
            case 7:
                ((Function1) obj2).invoke((OfferCardData) obj);
                break;
            case 8:
                ((Function1) obj2).invoke((PillData) obj);
                break;
            case 9:
                ((Function1) obj2).invoke((QuickLinkCard) obj);
                break;
            case 10:
                ((Function1) obj2).invoke((ProductCategoryTileData) obj);
                break;
            case 11:
                ((Function1) obj2).invoke((ContentCardData) obj);
                break;
            case 12:
                ((Function1) obj2).invoke((NavRoundelCardData) obj);
                break;
            case 13:
                ((Function1) obj2).invoke((HeroBanner) obj);
                break;
            case 14:
                Function1 function1 = (Function1) obj2;
                au.com.woolworths.sdui.model.action.ActionData actionData2 = ((MerchCardFullImageData) obj).b;
                if (actionData2 != null) {
                    function1.invoke(actionData2);
                    break;
                }
                break;
            case 15:
                Function1 function12 = (Function1) obj2;
                SearchNavCardData searchNavCardData = (SearchNavCardData) obj;
                if (function12 != null) {
                    function12.invoke(searchNavCardData);
                    break;
                }
                break;
            case 16:
                int i2 = BuyAgainActivity.D;
                ProductBoostContract.Action.ShowRetrySnackbar showRetrySnackbar = (ProductBoostContract.Action.ShowRetrySnackbar) ((ProductBoostContract.Action) obj);
                ((ProductBoostResultViewModel) ((BuyAgainActivity) obj2).B.getD()).p6(showRetrySnackbar.d, null, showRetrySnackbar.b, showRetrySnackbar.c);
                break;
            case 17:
                ((CartViewModel) obj2).z3(((CartShippingPromotionBanner) ((CartShippingMessageBanner) obj)).f8691a);
                break;
            case 18:
                Function0 function0 = (Function0) obj;
                if (!((NavHostController) obj2).f()) {
                    function0.invoke();
                    break;
                }
                break;
            case 19:
                ((Function1) obj2).invoke((BuyMoreSaveMorePromotionInfo) obj);
                break;
            case 20:
                CartViewModel cartViewModel = (CartViewModel) obj2;
                CartProductCard cartProductCard = (CartProductCard) obj;
                MutableStateFlow mutableStateFlow = cartViewModel.n;
                LinkedHashMap linkedHashMapR6 = cartViewModel.r6();
                linkedHashMapR6.remove(cartProductCard);
                CartViewModel.x6(cartViewModel, mutableStateFlow, false, null, null, linkedHashMapR6, 7);
                ArrayList arrayList = cartViewModel.q;
                arrayList.clear();
                arrayList.add(cartProductCard);
                cartViewModel.g.g(CartAnalytics.Cart.Action.l);
                cartViewModel.l.k(showUndoDelete);
                break;
            case 21:
                Function0 function02 = (Function0) obj;
                MutableStateFlow mutableStateFlow2 = ((CartViewModel) obj2).n;
                do {
                    value = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.d(value, CartContract.ViewState.a((CartContract.ViewState) value, false, false, null, null, null, 29)));
                function02.invoke();
                break;
            case 22:
                CartViewModel cartViewModel2 = (CartViewModel) obj2;
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                EmCouponBannerAnalytics.Banner banner = CartViewModel.u;
                if (cartViewModel2.h.c(ShopCartFeature.f)) {
                    ArrayList arrayList2 = cartViewModel2.q;
                    arrayList2.clear();
                    LinkedHashMap linkedHashMapR62 = cartViewModel2.r6();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry : linkedHashMapR62.entrySet()) {
                        if (((Number) entry.getValue()).doubleValue() == 0.0d) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    arrayList2.addAll(linkedHashMap2.keySet());
                    if (!arrayList2.isEmpty()) {
                        cartViewModel2.g.g(CartAnalytics.Cart.Action.l);
                        cartViewModel2.l.k(showUndoDelete);
                    }
                }
                CartViewModel.x6(cartViewModel2, cartViewModel2.n, false, null, null, MapsKt.k(cartViewModel2.r6(), linkedHashMap.keySet()), 7);
                break;
            case 23:
                ((ProductsReviewAlternativeCallbacks) obj2).q(ProductReviewCardExtKt.a(((ProductReviewAlternativeResponseData) obj).f10441a));
                break;
            case 24:
                ((Function1) obj2).invoke((CheckoutRewardsAndDiscount) obj);
                break;
            case 25:
                ((Function1) obj2).invoke((CollectionMethodOption) obj);
                break;
            case 26:
                ((Function1) obj2).invoke((FulfilmentWindowsOption) obj);
                break;
            case 27:
                ((Function1) obj2).invoke((PackagingMethodOption) obj);
                break;
            case 28:
                CheckoutContentViewModel checkoutContentViewModel = (CheckoutContentViewModel) obj2;
                Checkout checkout = (Checkout) obj;
                ProgressId progressId = ProgressId.d;
                Checkout checkout2 = ((CheckoutContentContract.ViewState) checkoutContentViewModel.m.getValue()).d;
                checkoutContentViewModel.v6(progressId, checkout2 != null ? checkout2.g : null, checkout.i, checkout.j);
                break;
            default:
                CheckoutDetailsListener checkoutDetailsListener = (CheckoutDetailsListener) obj2;
                InsetBannerActionApiData action = ((InsetBannerApiData) obj).getAction();
                checkoutDetailsListener.e1(action != null ? action.getUrl() : null);
                break;
        }
        return unit;
    }

    public /* synthetic */ a(MerchCardFullImageData merchCardFullImageData, Function1 function1) {
        this.d = 14;
        this.f = merchCardFullImageData;
        this.e = function1;
    }
}
