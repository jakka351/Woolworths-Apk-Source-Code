package com.woolworths.scanlibrary.ui.cart.shoppingcart;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.analytics.CartScreenTracking;
import com.woolworths.scanlibrary.analytics.ClickCheckOutTracking;
import com.woolworths.scanlibrary.analytics.Screens;
import com.woolworths.scanlibrary.base.BaseDisposableObserver;
import com.woolworths.scanlibrary.base.BasePresenter;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.data.cart.Cart;
import com.woolworths.scanlibrary.domain.cart.CartSessionManager;
import com.woolworths.scanlibrary.domain.cart.CheckoutCartUseCase;
import com.woolworths.scanlibrary.domain.cart.ClearCartUseCase;
import com.woolworths.scanlibrary.domain.cart.GetCartUseCase;
import com.woolworths.scanlibrary.domain.cart.PendingPromotionUseCase;
import com.woolworths.scanlibrary.models.cart.CartResponse;
import com.woolworths.scanlibrary.models.cart.PendingPromotion;
import com.woolworths.scanlibrary.models.cart.PendingPromotionKt;
import com.woolworths.scanlibrary.models.error.ApigeeErrorResponse;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.models.store.Store;
import com.woolworths.scanlibrary.ui.cart.analytics.CartActions;
import com.woolworths.scanlibrary.ui.cart.shoppingcart.CartContract;
import com.woolworths.scanlibrary.ui.cart.shoppingcart.itemgroups.CartCategories;
import com.woolworths.scanlibrary.util.event.Event;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.operators.single.SingleObserveOn;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartPresenter;", "Lcom/woolworths/scanlibrary/base/BasePresenter;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartContract$View;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartContract$Presenter;", "CheckOutObserver", "GetCartItemsObserver", "ClearCartObserver", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class CartPresenter extends BasePresenter<CartContract.View> implements CartContract.Presenter {
    public final GetCartUseCase c;
    public final CheckoutCartUseCase d;
    public final PendingPromotionUseCase e;
    public final Store f;
    public final Cart g;
    public final FeatureToggleManager h;
    public final AnalyticsProvider i;
    public final AnalyticsManager j;
    public final MutableLiveData k;
    public final CompositeDisposable l;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartPresenter$CheckOutObserver;", "Lcom/woolworths/scanlibrary/base/BaseDisposableObserver;", "Lcom/woolworths/scanlibrary/domain/cart/CheckoutCartUseCase$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CheckOutObserver extends BaseDisposableObserver<CheckoutCartUseCase.ResponseValue> {
        public final CartContract.View g;
        public final MutableLiveData h;
        public final Cart i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CheckOutObserver(CartContract.View view, MutableLiveData liveEvent, Cart shoppingCart) {
            super(view, 14);
            Intrinsics.h(view, "view");
            Intrinsics.h(liveEvent, "liveEvent");
            Intrinsics.h(shoppingCart, "shoppingCart");
            this.g = view;
            this.h = liveEvent;
            this.i = shoppingCart;
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver, io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            CheckoutCartUseCase.ResponseValue response = (CheckoutCartUseCase.ResponseValue) obj;
            Intrinsics.h(response, "response");
            CartResponse cartResponse = response.f21173a;
            List<PendingPromotion> pendingPromotions = cartResponse.getPendingPromotions();
            MutableLiveData mutableLiveData = this.h;
            if (pendingPromotions != null && !cartResponse.getPendingPromotions().isEmpty()) {
                mutableLiveData.j(new Event(new CartContract.CartViewEvent.ShowPendingPromotionViewEvent(cartResponse.getPendingPromotions().get(0))));
                return;
            }
            String checkoutTitle = cartResponse.getCheckoutTitle();
            if (checkoutTitle == null) {
                checkoutTitle = "";
            }
            String checkoutMessage = cartResponse.getCheckoutMessage();
            this.i.v(checkoutTitle, checkoutMessage != null ? checkoutMessage : "");
            mutableLiveData.j(new Event(CartContract.CartViewEvent.ShowPaymentTenderViewEvent.f21214a));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartPresenter$ClearCartObserver;", "Lcom/woolworths/scanlibrary/base/BaseDisposableObserver;", "Lcom/woolworths/scanlibrary/domain/cart/ClearCartUseCase$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClearCartObserver extends BaseDisposableObserver<ClearCartUseCase.ResponseValue> {
        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver, io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            ClearCartUseCase.ResponseValue response = (ClearCartUseCase.ResponseValue) obj;
            Intrinsics.h(response, "response");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartPresenter$GetCartItemsObserver;", "Lcom/woolworths/scanlibrary/base/BaseDisposableObserver;", "Lcom/woolworths/scanlibrary/domain/cart/GetCartUseCase$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GetCartItemsObserver extends BaseDisposableObserver<GetCartUseCase.ResponseValue> {
        public final CartContract.View g;
        public final MutableLiveData h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetCartItemsObserver(CartContract.View view, MutableLiveData liveEvent) {
            super(view, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
            Intrinsics.h(view, "view");
            Intrinsics.h(liveEvent, "liveEvent");
            this.g = view;
            this.h = liveEvent;
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver
        public final void c(int i, int i2, ApigeeErrorResponse apigeeErrorResponse, Function0 function0) {
            this.e.n(i, i2, apigeeErrorResponse, new h(20));
            this.h.j(new Event(CartContract.CartViewEvent.SuccessGetCartItemsEvent.f21216a));
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver, io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            GetCartUseCase.ResponseValue response = (GetCartUseCase.ResponseValue) obj;
            Intrinsics.h(response, "response");
            this.h.j(new Event(CartContract.CartViewEvent.SuccessGetCartItemsEvent.f21216a));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartPresenter(CartContract.View view, GetCartUseCase getCartUseCase, ClearCartUseCase clearCartUseCase, CheckoutCartUseCase checkoutCartUseCase, PendingPromotionUseCase pendingPromotionUseCase, Store currentStore, Cart shoppingCart, CartSessionManager cartSessionManager, FeatureToggleManager featureToggleManager, AnalyticsProvider analyticsAggregator, AnalyticsManager analyticsManager) {
        super(view);
        Intrinsics.h(currentStore, "currentStore");
        Intrinsics.h(shoppingCart, "shoppingCart");
        Intrinsics.h(cartSessionManager, "cartSessionManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(analyticsAggregator, "analyticsAggregator");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.c = getCartUseCase;
        this.d = checkoutCartUseCase;
        this.e = pendingPromotionUseCase;
        this.f = currentStore;
        this.g = shoppingCart;
        this.h = featureToggleManager;
        this.i = analyticsAggregator;
        this.j = analyticsManager;
        this.k = new MutableLiveData();
        this.l = new CompositeDisposable();
        view.k1(this);
        analyticsAggregator.a(new CartScreenTracking("Cart Screen"));
    }

    @Override // com.woolworths.scanlibrary.ui.cart.shoppingcart.CartContract.Presenter
    public final int B() {
        return this.g.z(false);
    }

    @Override // com.woolworths.scanlibrary.ui.cart.shoppingcart.CartContract.Presenter
    public final ArrayList B0() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Cart cart = this.g;
        for (Item item : cart.B()) {
            if (item.getItemIs().getAssistancerequired()) {
                arrayList2.add(new CartCategories.ProductRecallItem(item));
            } else if (item.getItemIs().getWeightrequired() && !item.getItemIs().getWeighed()) {
                arrayList2.add(new CartCategories.WeightRequiredItem(item));
            } else if (item.getItemIs().getUnknownitem()) {
                arrayList2.add(new CartCategories.UnKnownItem(item));
            } else if (item.getItemIs().getIntervention()) {
                arrayList2.add(new CartCategories.InterventionRequiredItem(item, 5));
            } else {
                arrayList2.add(new CartCategories.SimpleItem(item, 0));
            }
        }
        ArrayList promotions = cart.getPromotions();
        if (promotions != null && !promotions.isEmpty()) {
            arrayList2.add(new CartCategories.PromotionHeader(8));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof CartCategories.ProductRecallItem) {
                arrayList3.add(next);
            }
        }
        if (!arrayList3.isEmpty()) {
            arrayList = CollectionsKt.d0(new CartCategories.CategoryDivider(4), CollectionsKt.c0(arrayList3, CollectionsKt.d0(new CartCategories.ProductRecallHeader(10), arrayList)));
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (next2 instanceof CartCategories.WeightRequiredItem) {
                arrayList4.add(next2);
            }
        }
        if (!arrayList4.isEmpty()) {
            arrayList = CollectionsKt.d0(new CartCategories.CategoryDivider(4), CollectionsKt.c0(arrayList4, CollectionsKt.d0(new CartCategories.WeightedRequiredHeader(3), arrayList)));
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Object next3 = it3.next();
            if (next3 instanceof CartCategories.UnKnownItem) {
                arrayList5.add(next3);
            }
        }
        if (!arrayList5.isEmpty()) {
            arrayList = CollectionsKt.d0(new CartCategories.CategoryDivider(4), CollectionsKt.d0(arrayList5.get(0), CollectionsKt.d0(new CartCategories.UnKnownItemHeader(7), arrayList)));
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            Object next4 = it4.next();
            if (next4 instanceof CartCategories.SimpleItem) {
                arrayList6.add(next4);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            Object next5 = it5.next();
            if (next5 instanceof CartCategories.PromotionHeader) {
                arrayList7.add(next5);
            }
        }
        if (arrayList6.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayListD0 = CollectionsKt.d0(new CartCategories.SimpleItemHeader(1), arrayList);
        if (!arrayList7.isEmpty()) {
            arrayListD0 = CollectionsKt.c0(arrayList7, arrayListD0);
        }
        return CollectionsKt.d0(new CartCategories.CategoryDivider(4), CollectionsKt.c0(arrayList6, arrayListD0));
    }

    @Override // com.woolworths.scanlibrary.ui.cart.shoppingcart.CartContract.Presenter
    public final List D0() {
        return this.g.L();
    }

    @Override // com.woolworths.scanlibrary.ui.cart.shoppingcart.CartContract.Presenter
    public final boolean I0() {
        return this.g.B().isEmpty();
    }

    @Override // com.woolworths.scanlibrary.ui.cart.shoppingcart.CartContract.Presenter
    public final void N() {
        Cart cart = this.g;
        boolean zIsEmpty = cart.c().isEmpty();
        MvpView mvpView = this.f21139a;
        if (!zIsEmpty) {
            ((CartContract.View) mvpView).i4();
            return;
        }
        ((CartContract.View) mvpView).G1();
        SingleObserveOn singleObserveOnF = this.d.b(new CheckoutCartUseCase.RequestValues(this.f.getNo(), new ArrayList())).f(AndroidSchedulers.a());
        Intrinsics.g(mvpView, "mvpView");
        CheckOutObserver checkOutObserver = new CheckOutObserver((CartContract.View) mvpView, this.k, cart);
        singleObserveOnF.a(checkOutObserver);
        this.l.d(checkOutObserver);
        this.i.b(new ClickCheckOutTracking("Checkout"));
    }

    @Override // com.woolworths.scanlibrary.ui.cart.shoppingcart.CartContract.Presenter
    public final BigDecimal W() {
        return this.g.getE();
    }

    @Override // com.woolworths.scanlibrary.base.mvp.MvpPresenter
    public final void W0() {
        this.j.a(Screens.g);
    }

    @Override // com.woolworths.scanlibrary.ui.cart.shoppingcart.CartContract.Presenter
    public final void a1() {
        this.k.j(new Event(CartContract.CartViewEvent.SuccessGetCartItemsEvent.f21216a));
    }

    @Override // com.woolworths.scanlibrary.ui.cart.shoppingcart.CartContract.Presenter
    public final List c() {
        return this.g.c();
    }

    @Override // com.woolworths.scanlibrary.ui.cart.shoppingcart.CartContract.Presenter
    public final void d0(PendingPromotion pendingPromotion) {
        Intrinsics.h(pendingPromotion, "pendingPromotion");
        MvpView mvpView = this.f21139a;
        ((CartContract.View) mvpView).G1();
        SingleObserveOn singleObserveOnF = this.e.b(new CheckoutCartUseCase.RequestValues(this.f.getNo(), CollectionsKt.k(PendingPromotionKt.getPromotionRequest(pendingPromotion)))).f(AndroidSchedulers.a());
        Intrinsics.g(mvpView, "mvpView");
        CheckOutObserver checkOutObserver = new CheckOutObserver((CartContract.View) mvpView, this.k, this.g);
        singleObserveOnF.a(checkOutObserver);
        this.l.d(checkOutObserver);
    }

    @Override // com.woolworths.scanlibrary.ui.cart.shoppingcart.CartContract.Presenter
    public final List getPromotions() {
        ArrayList promotions = this.g.getPromotions();
        return promotions == null ? EmptyList.d : promotions;
    }

    @Override // com.woolworths.scanlibrary.ui.cart.shoppingcart.CartContract.Presenter
    public final void i(boolean z) {
        ((CartContract.View) this.f21139a).W3(z);
    }

    @Override // com.woolworths.scanlibrary.ui.cart.shoppingcart.CartContract.Presenter
    public final void i0() {
        MvpView mvpView = this.f21139a;
        ((CartContract.View) mvpView).N3(true);
        int no = this.f.getNo();
        GetCartUseCase.RequestValues requestValues = new GetCartUseCase.RequestValues();
        requestValues.f21175a = no;
        SingleObserveOn singleObserveOnF = this.c.b(requestValues).f(AndroidSchedulers.a());
        Intrinsics.g(mvpView, "mvpView");
        GetCartItemsObserver getCartItemsObserver = new GetCartItemsObserver((CartContract.View) mvpView, this.k);
        singleObserveOnF.a(getCartItemsObserver);
        this.l.d(getCartItemsObserver);
    }

    @Override // com.woolworths.scanlibrary.ui.cart.shoppingcart.CartContract.Presenter
    public final int n() {
        return this.f.getNo();
    }

    @Override // com.woolworths.scanlibrary.ui.cart.shoppingcart.CartContract.Presenter
    public final List o() {
        return this.g.o();
    }

    @Override // com.woolworths.scanlibrary.ui.cart.shoppingcart.CartContract.Presenter
    public final BigDecimal u() {
        return this.g.getL();
    }

    @Override // com.woolworths.scanlibrary.ui.cart.shoppingcart.CartContract.Presenter
    public final void v() {
        this.j.c(CartActions.e);
    }

    @Override // com.woolworths.scanlibrary.ui.cart.shoppingcart.CartContract.Presenter
    /* renamed from: y0, reason: from getter */
    public final MutableLiveData getK() {
        return this.k;
    }
}
