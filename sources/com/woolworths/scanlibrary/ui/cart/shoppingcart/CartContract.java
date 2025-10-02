package com.woolworths.scanlibrary.ui.cart.shoppingcart;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.woolworths.scanlibrary.base.mvp.MvpPresenter;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.models.cart.PendingPromotion;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartContract;", "", "View", "Presenter", "CartViewEvent", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface CartContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartContract$CartViewEvent;", "", "SuccessGetCartItemsEvent", "SetLoadingIndicatorEvent", "ShowPendingPromotionViewEvent", "ShowTapOnViewEvent", "ShowPaymentTenderViewEvent", "ShowPaymentTenderForTranferToPosViewEvent", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartContract$CartViewEvent$SetLoadingIndicatorEvent;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartContract$CartViewEvent$ShowPaymentTenderForTranferToPosViewEvent;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartContract$CartViewEvent$ShowPaymentTenderViewEvent;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartContract$CartViewEvent$ShowPendingPromotionViewEvent;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartContract$CartViewEvent$ShowTapOnViewEvent;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartContract$CartViewEvent$SuccessGetCartItemsEvent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class CartViewEvent {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartContract$CartViewEvent$SetLoadingIndicatorEvent;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartContract$CartViewEvent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class SetLoadingIndicatorEvent extends CartViewEvent {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof SetLoadingIndicatorEvent);
            }

            public final int hashCode() {
                return Boolean.hashCode(false);
            }

            public final String toString() {
                return "SetLoadingIndicatorEvent(show=false)";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartContract$CartViewEvent$ShowPaymentTenderForTranferToPosViewEvent;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartContract$CartViewEvent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowPaymentTenderForTranferToPosViewEvent extends CartViewEvent {
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartContract$CartViewEvent$ShowPaymentTenderViewEvent;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartContract$CartViewEvent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowPaymentTenderViewEvent extends CartViewEvent {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowPaymentTenderViewEvent f21214a = new ShowPaymentTenderViewEvent();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartContract$CartViewEvent$ShowPendingPromotionViewEvent;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartContract$CartViewEvent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowPendingPromotionViewEvent extends CartViewEvent {

            /* renamed from: a, reason: collision with root package name */
            public final PendingPromotion f21215a;

            public ShowPendingPromotionViewEvent(PendingPromotion pendingPromotion) {
                Intrinsics.h(pendingPromotion, "pendingPromotion");
                this.f21215a = pendingPromotion;
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartContract$CartViewEvent$ShowTapOnViewEvent;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartContract$CartViewEvent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowTapOnViewEvent extends CartViewEvent {
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartContract$CartViewEvent$SuccessGetCartItemsEvent;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartContract$CartViewEvent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class SuccessGetCartItemsEvent extends CartViewEvent {

            /* renamed from: a, reason: collision with root package name */
            public static final SuccessGetCartItemsEvent f21216a = new SuccessGetCartItemsEvent();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartContract$Presenter;", "Lcom/woolworths/scanlibrary/base/mvp/MvpPresenter;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Presenter extends MvpPresenter {
        int B();

        ArrayList B0();

        List D0();

        boolean I0();

        void N();

        BigDecimal W();

        void a1();

        List c();

        void d0(PendingPromotion pendingPromotion);

        List getPromotions();

        void i(boolean z);

        void i0();

        int n();

        List o();

        BigDecimal u();

        void v();

        MutableLiveData y0();
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartContract$View;", "Lcom/woolworths/scanlibrary/base/mvp/MvpView;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartContract$Presenter;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface View extends MvpView<Presenter> {
        void G1();

        void i4();
    }
}
