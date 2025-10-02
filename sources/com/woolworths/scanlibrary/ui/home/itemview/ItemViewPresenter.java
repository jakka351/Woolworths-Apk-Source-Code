package com.woolworths.scanlibrary.ui.home.itemview;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.extensions.SharedPreferenceExtKt$boolean$$inlined$delegate$1;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.woolworths.scanlibrary.base.BaseDisposableObserver;
import com.woolworths.scanlibrary.base.BasePresenter;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.configuration.UserConfigurations;
import com.woolworths.scanlibrary.data.cart.Cart;
import com.woolworths.scanlibrary.data.cart.SessionInfo;
import com.woolworths.scanlibrary.domain.cart.RemoveItemUseCase;
import com.woolworths.scanlibrary.domain.cart.UpdateProductUseCase;
import com.woolworths.scanlibrary.models.cart.UpdateQuantityRequest;
import com.woolworths.scanlibrary.models.error.ApigeeErrorResponse;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.models.store.Store;
import com.woolworths.scanlibrary.ui.home.itemview.ItemContract;
import com.woolworths.scanlibrary.ui.home.itemview.views.AssistanceRequiredPSView;
import com.woolworths.scanlibrary.ui.home.itemview.views.InterventionItemPSView;
import com.woolworths.scanlibrary.ui.home.itemview.views.ItemView;
import com.woolworths.scanlibrary.ui.home.itemview.views.PriceEmbeddedPSView;
import com.woolworths.scanlibrary.ui.home.itemview.views.ReducedPSView;
import com.woolworths.scanlibrary.ui.home.itemview.views.SimpleItemPSView;
import com.woolworths.scanlibrary.ui.home.itemview.views.UnknownItemPSView;
import com.woolworths.scanlibrary.ui.home.itemview.views.WeightRequiredPSView;
import com.woolworths.scanlibrary.ui.home.itemview.views.WeightedItemPSView;
import com.woolworths.scanlibrary.util.event.Event;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.operators.single.SingleObserveOn;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/itemview/ItemViewPresenter;", "Lcom/woolworths/scanlibrary/base/BasePresenter;", "Lcom/woolworths/scanlibrary/ui/home/itemview/ItemContract$View;", "Lcom/woolworths/scanlibrary/ui/home/itemview/ItemContract$Presenter;", "UpdateQuantityObserver", "RemoveItemObserver", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ItemViewPresenter extends BasePresenter<ItemContract.View> implements ItemContract.Presenter {
    public static final BigDecimal l;
    public final UpdateProductUseCase c;
    public final RemoveItemUseCase d;
    public final SessionInfo e;
    public final Cart f;
    public final Store g;
    public final FeatureToggleManager h;
    public final UserConfigurations i;
    public final MutableLiveData j;
    public final CompositeDisposable k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/itemview/ItemViewPresenter$Companion;", "", "Ljava/math/BigDecimal;", "MAX_CART_TOTAL", "Ljava/math/BigDecimal;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/itemview/ItemViewPresenter$RemoveItemObserver;", "Lcom/woolworths/scanlibrary/base/BaseDisposableObserver;", "Lcom/woolworths/scanlibrary/domain/cart/RemoveItemUseCase$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RemoveItemObserver extends BaseDisposableObserver<RemoveItemUseCase.ResponseValue> {
        public final MutableLiveData g;
        public final String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoveItemObserver(ItemContract.View view, MutableLiveData liveEvent, String lineItemNo) {
            super(view, 5);
            Intrinsics.h(view, "view");
            Intrinsics.h(liveEvent, "liveEvent");
            Intrinsics.h(lineItemNo, "lineItemNo");
            this.g = liveEvent;
            this.h = lineItemNo;
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver
        public final void c(int i, int i2, ApigeeErrorResponse apigeeErrorResponse, Function0 function0) {
            if (i == 404) {
                if (Intrinsics.c(apigeeErrorResponse != null ? apigeeErrorResponse.getErrorCode() : null, "40404")) {
                    this.g.j(new Event(new ItemContract.ItemViewEvent.RemoveItemEvent(this.h)));
                }
            }
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver, io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            RemoveItemUseCase.ResponseValue response = (RemoveItemUseCase.ResponseValue) obj;
            Intrinsics.h(response, "response");
            this.g.j(new Event(new ItemContract.ItemViewEvent.RemoveItemSuccessEvent(this.h)));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/itemview/ItemViewPresenter$UpdateQuantityObserver;", "Lcom/woolworths/scanlibrary/base/BaseDisposableObserver;", "Lcom/woolworths/scanlibrary/domain/cart/UpdateProductUseCase$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdateQuantityObserver extends BaseDisposableObserver<UpdateProductUseCase.ResponseValue> {
        public final MutableLiveData g;
        public final String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateQuantityObserver(ItemContract.View view, MutableLiveData liveEvent, String lineItemNo) {
            super(view, 3);
            Intrinsics.h(view, "view");
            Intrinsics.h(liveEvent, "liveEvent");
            Intrinsics.h(lineItemNo, "lineItemNo");
            this.g = liveEvent;
            this.h = lineItemNo;
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver
        public final void c(int i, int i2, ApigeeErrorResponse apigeeErrorResponse, Function0 function0) {
            if (i == 404) {
                if (Intrinsics.c(apigeeErrorResponse != null ? apigeeErrorResponse.getErrorCode() : null, "40404")) {
                    this.g.j(new Event(new ItemContract.ItemViewEvent.RemoveItemEvent(this.h)));
                    return;
                }
            }
            this.e.n(i, i2, apigeeErrorResponse, new h(20));
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver, io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            UpdateProductUseCase.ResponseValue response = (UpdateProductUseCase.ResponseValue) obj;
            Intrinsics.h(response, "response");
            Item item = response.f21178a;
            MutableLiveData mutableLiveData = this.g;
            if (item == null) {
                mutableLiveData.j(new Event(new ItemContract.ItemViewEvent.RemoveItemSuccessEvent(this.h)));
            } else {
                mutableLiveData.j(new Event(new ItemContract.ItemViewEvent.UpdateQuantitySuccessEvent(item)));
            }
        }
    }

    static {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(900);
        Intrinsics.g(bigDecimalValueOf, "valueOf(...)");
        l = bigDecimalValueOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemViewPresenter(ItemContract.View view, UpdateProductUseCase updateProductUseCase, RemoveItemUseCase removeItemUseCase, SessionInfo sessionInfo, Cart cart, Store currentStore, FeatureToggleManager featureToggleManager, UserConfigurations userConfigurations) {
        super(view);
        Intrinsics.h(sessionInfo, "sessionInfo");
        Intrinsics.h(cart, "cart");
        Intrinsics.h(currentStore, "currentStore");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(userConfigurations, "userConfigurations");
        this.c = updateProductUseCase;
        this.d = removeItemUseCase;
        this.e = sessionInfo;
        this.f = cart;
        this.g = currentStore;
        this.h = featureToggleManager;
        this.i = userConfigurations;
        this.j = new MutableLiveData();
        this.k = new CompositeDisposable();
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.ItemContract.Presenter
    /* renamed from: T, reason: from getter */
    public final MutableLiveData getJ() {
        return this.j;
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.ItemContract.Presenter
    public final void Z() {
        UserConfigurations userConfigurations = this.i;
        userConfigurations.h.setValue(userConfigurations, UserConfigurations.k[8], Boolean.TRUE);
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.ItemContract.Presenter
    public final void d(Item cartItem) {
        Intrinsics.h(cartItem, "cartItem");
        MvpView mvpView = this.f21139a;
        ((ItemContract.View) mvpView).N3(true);
        SingleObserveOn singleObserveOnF = this.d.b(new RemoveItemUseCase.RequestValues(this.g.getNo(), cartItem.getLinenumber())).f(AndroidSchedulers.a());
        Intrinsics.g(mvpView, "mvpView");
        RemoveItemObserver removeItemObserver = new RemoveItemObserver((ItemContract.View) mvpView, this.j, cartItem.getLinenumber());
        singleObserveOnF.a(removeItemObserver);
        this.k.d(removeItemObserver);
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.ItemContract.Presenter
    public final void e() {
        SessionInfo sessionInfo = this.e;
        sessionInfo.e.setValue(sessionInfo, SessionInfo.k[4], Boolean.TRUE);
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.ItemContract.Presenter
    public final void g(Item item) {
        MvpView mvpView = this.f21139a;
        ((ItemContract.View) mvpView).N3(true);
        SingleObserveOn singleObserveOnF = this.c.b(new UpdateProductUseCase.RequestValues(new UpdateQuantityRequest(item.getQuantity(), null, 2, null), this.g.getNo(), item.getLinenumber())).f(AndroidSchedulers.a());
        Intrinsics.g(mvpView, "mvpView");
        UpdateQuantityObserver updateQuantityObserver = new UpdateQuantityObserver((ItemContract.View) mvpView, this.j, item.getLinenumber());
        singleObserveOnF.a(updateQuantityObserver);
        this.k.d(updateQuantityObserver);
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.ItemContract.Presenter
    public final ItemView h(String lineNo) {
        Intrinsics.h(lineNo, "lineNo");
        Cart cart = this.f;
        Item itemP = cart.P(lineNo);
        if (itemP == null) {
            itemP = cart.A();
        }
        ArrayList promotions = cart.getPromotions();
        String strH = cart.H();
        SessionInfo sessionInfo = this.e;
        if (strH == null || ((Boolean) sessionInfo.e.getValue(sessionInfo, SessionInfo.k[4])).booleanValue()) {
            strH = null;
        }
        MvpView mvpView = this.f21139a;
        if (strH != null) {
            ((ItemContract.View) mvpView).d(strH);
        }
        if (cart.getE().compareTo(l) > 0 && !((Boolean) sessionInfo.f.getValue(sessionInfo, SessionInfo.k[5])).booleanValue()) {
            ((ItemContract.View) mvpView).H();
        }
        if (itemP == null) {
            return null;
        }
        ((ItemContract.View) mvpView).c(itemP);
        return itemP.getItemIs().getAssistancerequired() ? new AssistanceRequiredPSView(itemP, promotions, h1()) : itemP.getItemIs().getWeightrequired() ? itemP.getItemIs().getWeighed() ? new WeightedItemPSView(itemP, promotions, h1()) : new WeightRequiredPSView(itemP, promotions) : itemP.getItemIs().getUnknownitem() ? new UnknownItemPSView(itemP, null) : itemP.getItemIs().getIntervention() ? new InterventionItemPSView(itemP, promotions) : (itemP.getItemIs().getTun() || itemP.getItemIs().getPriceembedded()) ? new PriceEmbeddedPSView(itemP, promotions, h1()) : itemP.getItemIs().getReducedtoclear() ? new ReducedPSView(itemP, promotions, h1()) : new SimpleItemPSView(itemP, promotions, h1());
    }

    public final boolean h1() {
        return !this.f.c().isEmpty();
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.ItemContract.Presenter
    public final List j() {
        return this.f.c();
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.ItemContract.Presenter
    public final void o0() {
        UserConfigurations userConfigurations = this.i;
        userConfigurations.i.setValue(userConfigurations, UserConfigurations.k[9], Boolean.TRUE);
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.ItemContract.Presenter
    public final void q0() {
        SessionInfo sessionInfo = this.e;
        sessionInfo.f.setValue(sessionInfo, SessionInfo.k[5], Boolean.TRUE);
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.ItemContract.Presenter
    public final int u0() {
        return this.f.z(false);
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.ItemContract.Presenter
    public final boolean y() {
        UserConfigurations userConfigurations = this.i;
        SharedPreferenceExtKt$boolean$$inlined$delegate$1 sharedPreferenceExtKt$boolean$$inlined$delegate$1 = userConfigurations.i;
        KProperty[] kPropertyArr = UserConfigurations.k;
        return (((Boolean) sharedPreferenceExtKt$boolean$$inlined$delegate$1.getValue(userConfigurations, kPropertyArr[9])).booleanValue() || ((Boolean) userConfigurations.h.getValue(userConfigurations, kPropertyArr[8])).booleanValue()) ? false : true;
    }
}
