package au.com.woolworths.shop.cart.ui.cart;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.cart.CartAnalytics;
import au.com.woolworths.analytics.supers.couponbanner.EmCouponBannerAnalytics;
import au.com.woolworths.analytics.supers.local.CartAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.foundation.shop.cart.data.model.Cart;
import au.com.woolworths.foundation.shop.cart.data.model.CartAlert;
import au.com.woolworths.shop.cart.ui.cart.AutoNavigationState;
import au.com.woolworths.shop.cart.ui.cart.CartContract;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ CartViewModel e;

    public /* synthetic */ g(CartViewModel cartViewModel, int i) {
        this.d = i;
        this.e = cartViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CartAlert cartAlert;
        int i = this.d;
        CartContract.Actions.ShowProductReview showProductReview = CartContract.Actions.ShowProductReview.f10481a;
        CartContract.Actions.AddDeliveryAddress addDeliveryAddress = CartContract.Actions.AddDeliveryAddress.f10460a;
        Unit unit = Unit.f24250a;
        CartViewModel cartViewModel = this.e;
        switch (i) {
            case 0:
                if (!cartViewModel.s) {
                    cartViewModel.g.g((Event) new CartAnalytics.Cart().f.v.getD());
                    cartViewModel.s = true;
                }
                return unit;
            case 1:
                float f = CartScreenKt.f10493a;
                EmCouponBannerAnalytics.Banner banner = CartViewModel.u;
                cartViewModel.t6(true, new au.com.woolworths.rewards.base.d(10));
                return unit;
            case 2:
                cartViewModel.s6();
                return unit;
            case 3:
                cartViewModel.g.g(CartAnalytics.Cart.Action.o);
                cartViewModel.l.k(CartContract.Actions.GoToProducts.f10465a);
                return unit;
            case 4:
                AnalyticsManager analyticsManager = cartViewModel.g;
                StateFlow stateFlow = cartViewModel.o;
                if (((CartContract.ViewState) stateFlow.getValue()).d instanceof CartConnectionError) {
                    analyticsManager.g(CartAnalytics.Cart.Action.q);
                } else if (((CartContract.ViewState) stateFlow.getValue()).d instanceof CartServerError) {
                    analyticsManager.g(CartAnalytics.Cart.Action.s);
                }
                cartViewModel.t6(false, new au.com.woolworths.rewards.base.d(10));
                return unit;
            case 5:
                cartViewModel.s6();
                return unit;
            case 6:
                BufferedChannel bufferedChannel = cartViewModel.l;
                BufferedChannel bufferedChannel2 = cartViewModel.l;
                StateFlow stateFlow2 = cartViewModel.o;
                cartViewModel.g.g(CartAnalytics.Cart.Action.g);
                if (cartViewModel.f.d()) {
                    Cart cart = ((CartContract.ViewState) stateFlow2.getValue()).c;
                    if (cart != null ? cart.g.equals(Boolean.TRUE) : false) {
                        bufferedChannel.k(CartContract.Actions.ShowFulfilmentWindow.f10478a);
                    } else {
                        Cart cart2 = ((CartContract.ViewState) stateFlow2.getValue()).c;
                        if (cart2 != null ? cart2.f.equals(Boolean.TRUE) : false) {
                            bufferedChannel2.k(showProductReview);
                        } else {
                            Cart cart3 = ((CartContract.ViewState) stateFlow2.getValue()).c;
                            if ((cart3 != null ? cart3.k : null) != null) {
                                Cart cart4 = ((CartContract.ViewState) stateFlow2.getValue()).c;
                                if (cart4 != null && (cartAlert = cart4.k) != null) {
                                    bufferedChannel.k(new CartContract.Actions.ShowCartAlert(cartAlert));
                                }
                            } else {
                                Cart cart5 = ((CartContract.ViewState) stateFlow2.getValue()).c;
                                if (cart5 != null ? cart5.h.equals(Boolean.TRUE) : false) {
                                    bufferedChannel.k(CartContract.Actions.HaveYouForgotten.f10466a);
                                } else {
                                    Cart cart6 = ((CartContract.ViewState) stateFlow2.getValue()).c;
                                    if (cart6 != null ? cart6.i.equals(Boolean.TRUE) : false) {
                                        bufferedChannel2.k(addDeliveryAddress);
                                    } else {
                                        bufferedChannel.k(CartContract.Actions.Checkout.f10461a);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    bufferedChannel.k(CartContract.Actions.Login.f10468a);
                }
                return unit;
            case 7:
                BufferedChannel bufferedChannel3 = cartViewModel.l;
                StateFlow stateFlow3 = cartViewModel.o;
                AutoNavigationState autoNavigationState = cartViewModel.t;
                if (autoNavigationState instanceof AutoNavigationState.LoggedIn) {
                    Cart cart7 = ((CartContract.ViewState) stateFlow3.getValue()).c;
                    if (cart7 != null ? cart7.i.equals(Boolean.TRUE) : false) {
                        bufferedChannel3.k(addDeliveryAddress);
                    }
                } else if (autoNavigationState instanceof AutoNavigationState.WindowSelected) {
                    Cart cart8 = ((CartContract.ViewState) stateFlow3.getValue()).c;
                    if (cart8 != null ? cart8.f.equals(Boolean.TRUE) : false) {
                        bufferedChannel3.k(showProductReview);
                    }
                } else if (!(autoNavigationState instanceof AutoNavigationState.None)) {
                    throw new NoWhenBranchMatchedException();
                }
                cartViewModel.t = AutoNavigationState.None.f10458a;
                return unit;
            default:
                cartViewModel.q.clear();
                return unit;
        }
    }
}
