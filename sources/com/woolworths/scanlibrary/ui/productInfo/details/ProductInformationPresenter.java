package com.woolworths.scanlibrary.ui.productInfo.details;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.analytics.PiScreenTracking;
import com.woolworths.scanlibrary.base.BaseDisposableObserver;
import com.woolworths.scanlibrary.base.BasePresenter;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.data.authentication.AuthenticatedUser;
import com.woolworths.scanlibrary.data.cart.Cart;
import com.woolworths.scanlibrary.data.cart.SessionInfo;
import com.woolworths.scanlibrary.domain.cart.RemoveItemUseCase;
import com.woolworths.scanlibrary.domain.cart.UpdateProductUseCase;
import com.woolworths.scanlibrary.models.cart.UpdateQuantityRequest;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.ui.productInfo.details.ProductInfoContract;
import com.woolworths.scanlibrary.util.event.Event;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.operators.single.SingleObserveOn;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productInfo/details/ProductInformationPresenter;", "Lcom/woolworths/scanlibrary/base/BasePresenter;", "Lcom/woolworths/scanlibrary/ui/productInfo/details/ProductInfoContract$View;", "Lcom/woolworths/scanlibrary/ui/productInfo/details/ProductInfoContract$Presenter;", "UpdateQuantityObserver", "RemoveItemObserver", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductInformationPresenter extends BasePresenter<ProductInfoContract.View> implements ProductInfoContract.Presenter {
    public final SessionInfo c;
    public final UpdateProductUseCase d;
    public final RemoveItemUseCase e;
    public final Cart f;
    public final FeatureToggleManager g;
    public final AnalyticsProvider h;
    public final MutableLiveData i;
    public final CompositeDisposable j;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productInfo/details/ProductInformationPresenter$RemoveItemObserver;", "Lcom/woolworths/scanlibrary/base/BaseDisposableObserver;", "Lcom/woolworths/scanlibrary/domain/cart/RemoveItemUseCase$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RemoveItemObserver extends BaseDisposableObserver<RemoveItemUseCase.ResponseValue> {
        public final ProductInfoContract.View g;
        public final MutableLiveData h;
        public final String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoveItemObserver(ProductInfoContract.View view, MutableLiveData liveEvent, String lineItemNo) {
            super(view, 5);
            Intrinsics.h(view, "view");
            Intrinsics.h(liveEvent, "liveEvent");
            Intrinsics.h(lineItemNo, "lineItemNo");
            this.g = view;
            this.h = liveEvent;
            this.i = lineItemNo;
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver, io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            RemoveItemUseCase.ResponseValue response = (RemoveItemUseCase.ResponseValue) obj;
            Intrinsics.h(response, "response");
            this.h.j(new Event(new ProductInfoContract.ProductInfoViewEvent.RemoveItemSuccessEvent(this.i)));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productInfo/details/ProductInformationPresenter$UpdateQuantityObserver;", "Lcom/woolworths/scanlibrary/base/BaseDisposableObserver;", "Lcom/woolworths/scanlibrary/domain/cart/UpdateProductUseCase$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdateQuantityObserver extends BaseDisposableObserver<UpdateProductUseCase.ResponseValue> {
        public final ProductInfoContract.View g;
        public final MutableLiveData h;
        public final String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateQuantityObserver(ProductInfoContract.View view, MutableLiveData liveEvent, String lineItemNo) {
            super(view, 3);
            Intrinsics.h(view, "view");
            Intrinsics.h(liveEvent, "liveEvent");
            Intrinsics.h(lineItemNo, "lineItemNo");
            this.g = view;
            this.h = liveEvent;
            this.i = lineItemNo;
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver, io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            UpdateProductUseCase.ResponseValue response = (UpdateProductUseCase.ResponseValue) obj;
            Intrinsics.h(response, "response");
            Item item = response.f21178a;
            MutableLiveData mutableLiveData = this.h;
            if (item == null) {
                mutableLiveData.j(new Event(new ProductInfoContract.ProductInfoViewEvent.RemoveItemSuccessEvent(this.i)));
            } else {
                mutableLiveData.j(new Event(new ProductInfoContract.ProductInfoViewEvent.UpdateQuantitySuccessEvent(item)));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductInformationPresenter(ProductInfoContract.View view, SessionInfo sessionInfo, UpdateProductUseCase updateProductUseCase, RemoveItemUseCase removeItemUseCase, Cart shoppingCart, AuthenticatedUser authenticatedUser, FeatureToggleManager featureToggleManager, AnalyticsProvider analyticsAggregator) {
        super(view);
        Intrinsics.h(sessionInfo, "sessionInfo");
        Intrinsics.h(shoppingCart, "shoppingCart");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(analyticsAggregator, "analyticsAggregator");
        this.c = sessionInfo;
        this.d = updateProductUseCase;
        this.e = removeItemUseCase;
        this.f = shoppingCart;
        this.g = featureToggleManager;
        this.h = analyticsAggregator;
        this.i = new MutableLiveData();
        this.j = new CompositeDisposable();
        analyticsAggregator.a(new PiScreenTracking("Product Information Screen"));
    }

    @Override // com.woolworths.scanlibrary.ui.productInfo.details.ProductInfoContract.Presenter
    public final void d(Item cartItem) {
        Intrinsics.h(cartItem, "cartItem");
        MvpView mvpView = this.f21139a;
        ((ProductInfoContract.View) mvpView).N3(true);
        SingleObserveOn singleObserveOnF = this.e.b(new RemoveItemUseCase.RequestValues(this.c.b(), cartItem.getLinenumber())).f(AndroidSchedulers.a());
        Intrinsics.g(mvpView, "mvpView");
        RemoveItemObserver removeItemObserver = new RemoveItemObserver((ProductInfoContract.View) mvpView, this.i, cartItem.getLinenumber());
        singleObserveOnF.a(removeItemObserver);
        this.j.d(removeItemObserver);
    }

    @Override // com.woolworths.scanlibrary.ui.productInfo.details.ProductInfoContract.Presenter
    public final void e() {
        SessionInfo sessionInfo = this.c;
        sessionInfo.e.setValue(sessionInfo, SessionInfo.k[4], Boolean.TRUE);
    }

    @Override // com.woolworths.scanlibrary.ui.productInfo.details.ProductInfoContract.Presenter
    public final void g(Item item) {
        MvpView mvpView = this.f21139a;
        ((ProductInfoContract.View) mvpView).N3(true);
        SingleObserveOn singleObserveOnF = this.d.b(new UpdateProductUseCase.RequestValues(new UpdateQuantityRequest(item.getQuantity(), null, 2, null), this.c.b(), item.getLinenumber())).f(AndroidSchedulers.a());
        Intrinsics.g(mvpView, "mvpView");
        UpdateQuantityObserver updateQuantityObserver = new UpdateQuantityObserver((ProductInfoContract.View) mvpView, this.i, item.getLinenumber());
        singleObserveOnF.a(updateQuantityObserver);
        this.j.d(updateQuantityObserver);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    @Override // com.woolworths.scanlibrary.ui.productInfo.details.ProductInfoContract.Presenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.woolworths.scanlibrary.ui.productInfo.details.views.ProductInformationView h(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "lineNo"
            kotlin.jvm.internal.Intrinsics.h(r8, r0)
            com.woolworths.scanlibrary.data.cart.Cart r0 = r7.f
            com.woolworths.scanlibrary.models.product.Item r8 = r0.P(r8)
            if (r8 == 0) goto Le
            goto L12
        Le:
            com.woolworths.scanlibrary.models.product.Item r8 = r0.A()
        L12:
            java.lang.String r1 = r0.H()
            r2 = 0
            if (r1 == 0) goto L2f
            com.woolworths.scanlibrary.data.cart.SessionInfo r3 = r7.c
            au.com.woolworths.android.onesite.extensions.SharedPreferenceExtKt$boolean$$inlined$delegate$1 r4 = r3.e
            kotlin.reflect.KProperty[] r5 = com.woolworths.scanlibrary.data.cart.SessionInfo.k
            r6 = 4
            r5 = r5[r6]
            java.lang.Object r3 = r4.getValue(r3, r5)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L2f
            goto L30
        L2f:
            r1 = r2
        L30:
            com.woolworths.scanlibrary.base.mvp.MvpView r3 = r7.f21139a
            if (r1 == 0) goto L3a
            r4 = r3
            com.woolworths.scanlibrary.ui.productInfo.details.ProductInfoContract$View r4 = (com.woolworths.scanlibrary.ui.productInfo.details.ProductInfoContract.View) r4
            r4.d(r1)
        L3a:
            if (r8 == 0) goto Lb6
            com.woolworths.scanlibrary.ui.productInfo.details.ProductInfoContract$View r3 = (com.woolworths.scanlibrary.ui.productInfo.details.ProductInfoContract.View) r3
            r3.c(r8)
            java.util.ArrayList r0 = r0.getPromotions()
            com.woolworths.scanlibrary.models.product.Is r1 = r8.getItemIs()
            boolean r1 = r1.getAssistancerequired()
            if (r1 == 0) goto L55
            com.woolworths.scanlibrary.ui.productInfo.details.views.AssistanceRequiredItemProductView r1 = new com.woolworths.scanlibrary.ui.productInfo.details.views.AssistanceRequiredItemProductView
            r1.<init>(r8, r0)
            return r1
        L55:
            com.woolworths.scanlibrary.models.product.Is r1 = r8.getItemIs()
            boolean r1 = r1.getWeightrequired()
            if (r1 == 0) goto L75
            com.woolworths.scanlibrary.models.product.Is r1 = r8.getItemIs()
            boolean r1 = r1.getWeighed()
            if (r1 == 0) goto L6f
            com.woolworths.scanlibrary.ui.productInfo.details.views.WeightedItemProductView r1 = new com.woolworths.scanlibrary.ui.productInfo.details.views.WeightedItemProductView
            r1.<init>(r8, r0)
            return r1
        L6f:
            com.woolworths.scanlibrary.ui.productInfo.details.views.WeightRequiredItemProductView r1 = new com.woolworths.scanlibrary.ui.productInfo.details.views.WeightRequiredItemProductView
            r1.<init>(r8, r0)
            return r1
        L75:
            com.woolworths.scanlibrary.models.product.Is r1 = r8.getItemIs()
            boolean r1 = r1.getIntervention()
            if (r1 == 0) goto L85
            com.woolworths.scanlibrary.ui.productInfo.details.views.InterventionItemProductView r1 = new com.woolworths.scanlibrary.ui.productInfo.details.views.InterventionItemProductView
            r1.<init>(r8, r0)
            return r1
        L85:
            com.woolworths.scanlibrary.models.product.Is r1 = r8.getItemIs()
            boolean r1 = r1.getTun()
            if (r1 != 0) goto Lb0
            com.woolworths.scanlibrary.models.product.Is r1 = r8.getItemIs()
            boolean r1 = r1.getPriceembedded()
            if (r1 == 0) goto L9a
            goto Lb0
        L9a:
            com.woolworths.scanlibrary.models.product.Is r1 = r8.getItemIs()
            boolean r1 = r1.getReducedtoclear()
            if (r1 == 0) goto Laa
            com.woolworths.scanlibrary.ui.productInfo.details.views.ReducedClearItemProductView r1 = new com.woolworths.scanlibrary.ui.productInfo.details.views.ReducedClearItemProductView
            r1.<init>(r8, r0)
            return r1
        Laa:
            com.woolworths.scanlibrary.ui.productInfo.details.views.SimpleItemProductView r1 = new com.woolworths.scanlibrary.ui.productInfo.details.views.SimpleItemProductView
            r1.<init>(r8, r0)
            return r1
        Lb0:
            com.woolworths.scanlibrary.ui.productInfo.details.views.PriceEmbeddedItemProductView r1 = new com.woolworths.scanlibrary.ui.productInfo.details.views.PriceEmbeddedItemProductView
            r1.<init>(r8, r0)
            return r1
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.woolworths.scanlibrary.ui.productInfo.details.ProductInformationPresenter.h(java.lang.String):com.woolworths.scanlibrary.ui.productInfo.details.views.ProductInformationView");
    }

    @Override // com.woolworths.scanlibrary.ui.productInfo.details.ProductInfoContract.Presenter
    /* renamed from: n0, reason: from getter */
    public final MutableLiveData getI() {
        return this.i;
    }
}
