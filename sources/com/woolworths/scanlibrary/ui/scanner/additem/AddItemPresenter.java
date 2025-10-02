package com.woolworths.scanlibrary.ui.scanner.additem;

import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.base.BaseDisposableObserver;
import com.woolworths.scanlibrary.base.BasePresenter;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.data.cart.Cart;
import com.woolworths.scanlibrary.domain.cart.AddToCartUseCase;
import com.woolworths.scanlibrary.domain.cart.UpdateProductUseCase;
import com.woolworths.scanlibrary.domain.login.UserManager;
import com.woolworths.scanlibrary.models.cart.CartAddItemRequest;
import com.woolworths.scanlibrary.models.cart.Coupon;
import com.woolworths.scanlibrary.models.cart.CouponStatus;
import com.woolworths.scanlibrary.models.cart.UpdateQuantityRequest;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.models.store.Store;
import com.woolworths.scanlibrary.ui.scanner.ApiSupportBarcodeSymbology;
import com.woolworths.scanlibrary.ui.scanner.additem.AddItemContract;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.CallbackCompletableObserver;
import io.reactivex.internal.operators.completable.CompletableTimer;
import io.reactivex.internal.operators.single.SingleObserveOn;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemPresenter;", "Lcom/woolworths/scanlibrary/base/BasePresenter;", "Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemContract$View;", "Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemContract$Presenter;", "AddItemToCartObserver", "UpdateProductWeightObserver", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AddItemPresenter extends BasePresenter<AddItemContract.View> implements AddItemContract.Presenter {
    public final AddToCartUseCase c;
    public final UpdateProductUseCase d;
    public final Cart e;
    public final Store f;
    public final AnalyticsProvider g;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemPresenter$AddItemToCartObserver;", "Lcom/woolworths/scanlibrary/base/BaseDisposableObserver;", "Lcom/woolworths/scanlibrary/domain/cart/AddToCartUseCase$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class AddItemToCartObserver extends BaseDisposableObserver<AddToCartUseCase.ResponseValue> {
        public final AddItemContract.View g;
        public final boolean h;
        public final /* synthetic */ AddItemPresenter i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f21332a;

            static {
                int[] iArr = new int[CouponStatus.values().length];
                try {
                    iArr[CouponStatus.UNUSED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CouponStatus.REDEEMED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CouponStatus.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f21332a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddItemToCartObserver(AddItemPresenter addItemPresenter, AddItemContract.View view, boolean z, AddToCartUseCase.RequestValues requestValues) {
            super(view, 2);
            Intrinsics.h(view, "view");
            this.i = addItemPresenter;
            this.g = view;
            this.h = z;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.c(r9 != null ? r9.getErrorCode() : null, "40422") != false) goto L31;
         */
        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(int r7, int r8, com.woolworths.scanlibrary.models.error.ApigeeErrorResponse r9, kotlin.jvm.functions.Function0 r10) {
            /*
                r6 = this;
                com.woolworths.scanlibrary.ui.scanner.additem.AddItemPresenter r10 = r6.i
                com.woolworths.scanlibrary.analytics.AnalyticsProvider r0 = r10.g
                com.woolworths.scanlibrary.ui.scanner.additem.AddItemContract$View r1 = r6.g
                r2 = 0
                r3 = 404(0x194, float:5.66E-43)
                if (r7 != r3) goto L25
                if (r9 == 0) goto L12
                java.lang.String r4 = r9.getErrorCode()
                goto L13
            L12:
                r4 = r2
            L13:
                java.lang.String r5 = "40402"
                boolean r4 = kotlin.jvm.internal.Intrinsics.c(r4, r5)
                if (r4 == 0) goto L25
                boolean r4 = r6.h
                if (r4 == 0) goto L25
                com.woolworths.scanlibrary.ui.scanner.additem.AddItemContract$ViewState$PRODUCT_MANUAL_ADD_CONFIRM_VIEW r7 = com.woolworths.scanlibrary.ui.scanner.additem.AddItemContract.ViewState.PRODUCT_MANUAL_ADD_CONFIRM_VIEW.f21329a
                r1.L2(r7)
                return
            L25:
                if (r7 != r3) goto L3b
                if (r9 == 0) goto L2e
                java.lang.String r4 = r9.getErrorCode()
                goto L2f
            L2e:
                r4 = r2
            L2f:
                java.lang.String r5 = "40420"
                boolean r4 = kotlin.jvm.internal.Intrinsics.c(r4, r5)
                if (r4 == 0) goto L3b
                r10.h1()
                return
            L3b:
                if (r7 != r3) goto L98
                if (r9 == 0) goto L44
                java.lang.String r10 = r9.getErrorCode()
                goto L45
            L44:
                r10 = r2
            L45:
                java.lang.String r3 = "40421"
                boolean r10 = kotlin.jvm.internal.Intrinsics.c(r10, r3)
                java.lang.String r4 = "40422"
                if (r10 != 0) goto L5b
                if (r9 == 0) goto L55
                java.lang.String r2 = r9.getErrorCode()
            L55:
                boolean r10 = kotlin.jvm.internal.Intrinsics.c(r2, r4)
                if (r10 == 0) goto L98
            L5b:
                java.lang.String r7 = r9.getErrorCode()
                boolean r8 = kotlin.jvm.internal.Intrinsics.c(r7, r3)
                if (r8 == 0) goto L73
                com.woolworths.scanlibrary.analytics.ClickedBlockFreshProduceItems r7 = new com.woolworths.scanlibrary.analytics.ClickedBlockFreshProduceItems
                java.lang.String r8 = "Block Fresh Produce"
                r7.<init>(r8)
                r0.b(r7)
                r7 = 2131232142(0x7f08058e, float:1.8080385E38)
                goto L87
            L73:
                boolean r7 = kotlin.jvm.internal.Intrinsics.c(r7, r4)
                r8 = 2131232139(0x7f08058b, float:1.8080379E38)
                if (r7 == 0) goto L86
                com.woolworths.scanlibrary.analytics.ClickedBlockInterventionItems r7 = new com.woolworths.scanlibrary.analytics.ClickedBlockInterventionItems
                java.lang.String r10 = "Block Intervention Items"
                r7.<init>(r10)
                r0.b(r7)
            L86:
                r7 = r8
            L87:
                com.woolworths.scanlibrary.ui.scanner.additem.AddItemContract$ViewState$ScannedItemBlocked r8 = new com.woolworths.scanlibrary.ui.scanner.additem.AddItemContract$ViewState$ScannedItemBlocked
                java.lang.String r10 = r9.getMessage()
                java.lang.String r9 = r9.getDescription()
                r8.<init>(r7, r10, r9)
                r1.L2(r8)
                return
            L98:
                au.com.woolworths.android.onesite.deeplink.h r10 = new au.com.woolworths.android.onesite.deeplink.h
                r0 = 20
                r10.<init>(r0)
                com.woolworths.scanlibrary.base.mvp.MvpView r0 = r6.e
                r0.n(r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.woolworths.scanlibrary.ui.scanner.additem.AddItemPresenter.AddItemToCartObserver.c(int, int, com.woolworths.scanlibrary.models.error.ApigeeErrorResponse, kotlin.jvm.functions.Function0):void");
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver, io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            AddToCartUseCase.ResponseValue response = (AddToCartUseCase.ResponseValue) obj;
            Intrinsics.h(response, "response");
            AddItemContract.View view = this.g;
            view.N3(false);
            if (response instanceof AddToCartUseCase.ItemResponseValue) {
                AddToCartUseCase.ItemResponseValue itemResponseValue = (AddToCartUseCase.ItemResponseValue) response;
                Item item = itemResponseValue.f21170a;
                if (!itemResponseValue.b) {
                    view.h4(item);
                    return;
                }
                Coupon coupon = itemResponseValue.c;
                Intrinsics.e(coupon);
                view.L2(new AddItemContract.ViewState.CouponItem(coupon, item, true));
                return;
            }
            if (response instanceof AddToCartUseCase.CouponResponseValue) {
                Coupon coupon2 = ((AddToCartUseCase.CouponResponseValue) response).f21169a;
                int i = WhenMappings.f21332a[coupon2.getStatus().ordinal()];
                if (i == 1) {
                    view.L2(new AddItemContract.ViewState.CouponItem(coupon2, null, false));
                } else if (i == 2) {
                    view.L2(new AddItemContract.ViewState.CouponItem(coupon2, null, true));
                } else if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemPresenter$Companion;", "", "", "IDLE_TIME_OUT_IN_SECONDS", "J", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemPresenter$UpdateProductWeightObserver;", "Lcom/woolworths/scanlibrary/base/BaseDisposableObserver;", "Lcom/woolworths/scanlibrary/domain/cart/UpdateProductUseCase$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdateProductWeightObserver extends BaseDisposableObserver<UpdateProductUseCase.ResponseValue> {
        public final AddItemContract.View g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateProductWeightObserver(AddItemContract.View view) {
            super(view, 8);
            Intrinsics.h(view, "view");
            this.g = view;
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver, io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            UpdateProductUseCase.ResponseValue response = (UpdateProductUseCase.ResponseValue) obj;
            Intrinsics.h(response, "response");
            AddItemContract.View view = this.g;
            view.N3(false);
            Item item = response.f21178a;
            if (item != null) {
                view.h4(item);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddItemPresenter(AddItemContract.View view, AddToCartUseCase addToCartUseCase, UpdateProductUseCase updateProductUseCase, Cart shoppingCart, Store currentStore, UserManager userManager, AnalyticsProvider analyticsAggregator) {
        super(view);
        Intrinsics.h(shoppingCart, "shoppingCart");
        Intrinsics.h(currentStore, "currentStore");
        Intrinsics.h(userManager, "userManager");
        Intrinsics.h(analyticsAggregator, "analyticsAggregator");
        this.c = addToCartUseCase;
        this.d = updateProductUseCase;
        this.e = shoppingCart;
        this.f = currentStore;
        this.g = analyticsAggregator;
        view.k1(this);
    }

    @Override // com.woolworths.scanlibrary.ui.scanner.additem.AddItemContract.Presenter
    public final void K0(String barcode, String barcodeType, boolean z) {
        Intrinsics.h(barcode, "barcode");
        Intrinsics.h(barcodeType, "barcodeType");
        boolean zW = StringsKt.W(barcode, "026000000000", false);
        MvpView mvpView = this.f21139a;
        if (zW) {
            ((AddItemContract.View) mvpView).T0(barcode);
            return;
        }
        ApiSupportBarcodeSymbology apiSupportBarcodeSymbology = ApiSupportBarcodeSymbology.e;
        if (barcodeType.equals("SyntheticDataBar")) {
            h1();
            return;
        }
        ((AddItemContract.View) mvpView).L2(AddItemContract.ViewState.LOADING_VIEW.f21327a);
        CartAddItemRequest cartAddItemRequest = new CartAddItemRequest(barcode, barcodeType, 0, false, 12, null);
        int no = this.f.getNo();
        AddToCartUseCase.RequestValues requestValues = new AddToCartUseCase.RequestValues();
        requestValues.f21171a = cartAddItemRequest;
        requestValues.b = no;
        SingleObserveOn singleObserveOnF = this.c.b(requestValues).f(AndroidSchedulers.a());
        Intrinsics.g(mvpView, "mvpView");
        AddItemToCartObserver addItemToCartObserver = new AddItemToCartObserver(this, (AddItemContract.View) mvpView, z, requestValues);
        singleObserveOnF.a(addItemToCartObserver);
        this.b.d(addItemToCartObserver);
    }

    @Override // com.woolworths.scanlibrary.ui.scanner.additem.AddItemContract.Presenter
    public final void T0(String barcode) {
        Intrinsics.h(barcode, "barcode");
        MvpView mvpView = this.f21139a;
        ((AddItemContract.View) mvpView).L2(AddItemContract.ViewState.LOADING_VIEW.f21327a);
        ApiSupportBarcodeSymbology apiSupportBarcodeSymbology = ApiSupportBarcodeSymbology.e;
        CartAddItemRequest cartAddItemRequest = new CartAddItemRequest(barcode, "Manual", 0, false, 12, null);
        int no = this.f.getNo();
        AddToCartUseCase.RequestValues requestValues = new AddToCartUseCase.RequestValues();
        requestValues.f21171a = cartAddItemRequest;
        requestValues.b = no;
        cartAddItemRequest.setForcedAdd(true);
        SingleObserveOn singleObserveOnF = this.c.b(requestValues).f(AndroidSchedulers.a());
        Intrinsics.g(mvpView, "mvpView");
        AddItemToCartObserver addItemToCartObserver = new AddItemToCartObserver(this, (AddItemContract.View) mvpView, false, requestValues);
        singleObserveOnF.a(addItemToCartObserver);
        this.b.d(addItemToCartObserver);
    }

    @Override // com.woolworths.scanlibrary.ui.scanner.additem.AddItemContract.Presenter
    public final void h0(float f, String str) {
        MvpView mvpView = this.f21139a;
        ((AddItemContract.View) mvpView).L2(AddItemContract.ViewState.LOADING_VIEW.f21327a);
        SingleObserveOn singleObserveOnF = this.d.b(new UpdateProductUseCase.RequestValues(new UpdateQuantityRequest(1, Float.valueOf(f)), this.f.getNo(), str)).f(AndroidSchedulers.a());
        Intrinsics.g(mvpView, "mvpView");
        UpdateProductWeightObserver updateProductWeightObserver = new UpdateProductWeightObserver((AddItemContract.View) mvpView);
        singleObserveOnF.a(updateProductWeightObserver);
        this.b.d(updateProductWeightObserver);
    }

    public final void h1() {
        ((AddItemContract.View) this.f21139a).L2(AddItemContract.ViewState.SHELF_LABEL_SCANNED_BLOCKED_VIEW.f21330a);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Scheduler schedulerA = AndroidSchedulers.a();
        ObjectHelper.b(timeUnit, "unit is null");
        CompletableTimer completableTimer = new CompletableTimer(30L, schedulerA);
        CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(new au.com.woolworths.feature.shop.account.viewmodel.delete.a(this, 5));
        completableTimer.a(callbackCompletableObserver);
        this.b.d(callbackCompletableObserver);
    }
}
