package au.com.woolworths.shop.cart.domain.interactor;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.base.shopapp.TrolleyInteractor;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantitiesUpdatedResponse;
import au.com.woolworths.product.offers.ProductBoostInteractor;
import au.com.woolworths.product.productbottomsheet.UpdateProductInCartExtras;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.cart.data.CartRepositoryImpl;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/domain/interactor/CartUpdateInteractor;", "", "Companion", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Singleton
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CartUpdateInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final DispatcherProvider f10427a;
    public final TrolleyInteractor b;
    public final ProductBoostInteractor c;
    public final CartRepositoryImpl d;
    public final ShopAccountInteractor e;
    public long f;
    public final MutableStateFlow g;
    public final MutableStateFlow h;
    public final MutableStateFlow i;
    public final MutableStateFlow j;
    public final MutableStateFlow k;
    public final Flow l;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/cart/domain/interactor/CartUpdateInteractor$Companion;", "", "", "CART_PRODUCTS_CACHE_TIMEOUT_MS", "I", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public CartUpdateInteractor(DispatcherProvider dispatcher, TrolleyInteractor trolleyInteractor, ProductBoostInteractor boostInteractor, CartRepositoryImpl cartRepositoryImpl, ShopAccountInteractor accountInteractor) {
        Intrinsics.h(dispatcher, "dispatcher");
        Intrinsics.h(trolleyInteractor, "trolleyInteractor");
        Intrinsics.h(boostInteractor, "boostInteractor");
        Intrinsics.h(accountInteractor, "accountInteractor");
        this.f10427a = dispatcher;
        this.b = trolleyInteractor;
        this.c = boostInteractor;
        this.d = cartRepositoryImpl;
        this.e = accountInteractor;
        EmptyList emptyList = EmptyList.d;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new CartProductQuantitiesUpdatedResponse(0, 0, emptyList, null, 24));
        this.g = mutableStateFlowA;
        this.h = mutableStateFlowA;
        MutableStateFlow mutableStateFlowA2 = StateFlowKt.a(new CartProductQuantitiesUpdatedResponse(0, 0, emptyList, null, 24));
        this.i = mutableStateFlowA2;
        this.j = mutableStateFlowA2;
        MutableStateFlow mutableStateFlowA3 = StateFlowKt.a(0);
        this.k = mutableStateFlowA3;
        this.l = mutableStateFlowA3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor r12, java.util.ArrayList r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            boolean r0 = r14 instanceof au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$addToCartGraphql$1
            if (r0 == 0) goto L13
            r0 = r14
            au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$addToCartGraphql$1 r0 = (au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$addToCartGraphql$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$addToCartGraphql$1 r0 = new au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$addToCartGraphql$1
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantitiesUpdatedResponse r12 = r0.p
            kotlin.ResultKt.b(r14)
            return r12
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            kotlin.ResultKt.b(r14)
            goto L80
        L38:
            kotlin.ResultKt.b(r14)
            au.com.woolworths.shop.cart.data.CartRepositoryImpl r14 = r12.d
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt.s(r13, r5)
            r2.<init>(r5)
            java.util.Iterator r13 = r13.iterator()
        L4c:
            boolean r5 = r13.hasNext()
            if (r5 == 0) goto L71
            java.lang.Object r5 = r13.next()
            au.com.woolworths.shop.cart.domain.model.UpdatedProductQuantity r5 = (au.com.woolworths.shop.cart.domain.model.UpdatedProductQuantity) r5
            au.com.woolworths.shop.cart.domain.model.CartProductQuantityUpdate r6 = new au.com.woolworths.shop.cart.domain.model.CartProductQuantityUpdate
            java.lang.String r9 = r5.getF10451a()
            double r7 = r5.getB()
            java.lang.String r10 = r5.getC()
            java.lang.String r11 = r5.getD()
            r6.<init>(r7, r9, r10, r11)
            r2.add(r6)
            goto L4c
        L71:
            au.com.woolworths.shop.cart.domain.model.UpdateCartProductQuantityInput r13 = new au.com.woolworths.shop.cart.domain.model.UpdateCartProductQuantityInput
            r13.<init>(r2)
            r0.s = r4
            r2 = 0
            java.lang.Object r14 = r14.f(r13, r2, r0)
            if (r14 != r1) goto L80
            goto L8c
        L80:
            au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantitiesUpdatedResponse r14 = (au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantitiesUpdatedResponse) r14
            r0.p = r14
            r0.s = r3
            java.lang.Object r12 = r12.h(r14, r0)
            if (r12 != r1) goto L8d
        L8c:
            return r1
        L8d:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor.a(au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor, java.util.ArrayList, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor r18, java.util.ArrayList r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            r0 = r18
            r1 = r20
            au.com.woolworths.base.shopapp.TrolleyInteractor r2 = r0.b
            boolean r3 = r1 instanceof au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$addToCartWithCustomResponseGraphql$1
            if (r3 == 0) goto L19
            r3 = r1
            au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$addToCartWithCustomResponseGraphql$1 r3 = (au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$addToCartWithCustomResponseGraphql$1) r3
            int r4 = r3.t
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.t = r4
            goto L1e
        L19:
            au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$addToCartWithCustomResponseGraphql$1 r3 = new au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$addToCartWithCustomResponseGraphql$1
            r3.<init>(r0, r1)
        L1e:
            java.lang.Object r1 = r3.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r5 = r3.t
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L43
            if (r5 == r7) goto L3d
            if (r5 != r6) goto L35
            au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantitiesUpdatedResponse r4 = r3.q
            au.com.woolworths.android.onesite.rxutils.Result r3 = r3.p
            kotlin.ResultKt.b(r1)
            goto Lb0
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3d:
            au.com.woolworths.android.onesite.rxutils.Result r5 = r3.p
            kotlin.ResultKt.b(r1)
            goto L9d
        L43:
            kotlin.ResultKt.b(r1)
            kotlinx.coroutines.flow.StateFlow r1 = r2.v()
            java.lang.Object r1 = r1.getValue()
            au.com.woolworths.android.onesite.rxutils.Result r1 = (au.com.woolworths.android.onesite.rxutils.Result) r1
            au.com.woolworths.shop.cart.data.CartRepositoryImpl r5 = r0.d
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            r10 = r19
            int r9 = kotlin.collections.CollectionsKt.s(r10, r9)
            r8.<init>(r9)
            java.util.Iterator r9 = r10.iterator()
        L63:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L88
            java.lang.Object r10 = r9.next()
            au.com.woolworths.shop.cart.domain.model.UpdatedProductQuantity r10 = (au.com.woolworths.shop.cart.domain.model.UpdatedProductQuantity) r10
            au.com.woolworths.shop.cart.domain.model.CartProductQuantityUpdate r11 = new au.com.woolworths.shop.cart.domain.model.CartProductQuantityUpdate
            java.lang.String r14 = r10.getF10451a()
            double r12 = r10.getB()
            java.lang.String r15 = r10.getC()
            java.lang.String r16 = r10.getD()
            r11.<init>(r12, r14, r15, r16)
            r8.add(r11)
            goto L63
        L88:
            au.com.woolworths.shop.cart.domain.model.UpdateCartProductQuantityInput r9 = new au.com.woolworths.shop.cart.domain.model.UpdateCartProductQuantityInput
            r9.<init>(r8)
            r3.p = r1
            r3.t = r7
            java.lang.Object r5 = r5.f(r9, r7, r3)
            if (r5 != r4) goto L98
            goto Lad
        L98:
            r17 = r5
            r5 = r1
            r1 = r17
        L9d:
            au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantitiesUpdatedResponse r1 = (au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantitiesUpdatedResponse) r1
            kotlinx.coroutines.flow.MutableStateFlow r7 = r0.i
            r3.p = r5
            r3.q = r1
            r3.t = r6
            java.lang.Object r3 = r7.emit(r1, r3)
            if (r3 != r4) goto Lae
        Lad:
            return r4
        Lae:
            r4 = r1
            r3 = r5
        Lb0:
            kotlinx.coroutines.flow.MutableStateFlow r0 = r0.k
            int r1 = r4.b
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r1)
            r0.setValue(r5)
            java.lang.Object r0 = r3.f4591a
            au.com.woolworths.android.onesite.models.TrolleyResult r0 = (au.com.woolworths.android.onesite.models.TrolleyResult) r0
            au.com.woolworths.android.onesite.models.TrolleyResult r0 = au.com.woolworths.android.onesite.models.LegacyTrolleyResultUtilsKt.toLegacyResult(r4, r0)
            r2.n(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor.b(au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor, java.util.ArrayList, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object c(UpdateProductInCartExtras[] updateProductInCartExtrasArr, ContinuationImpl continuationImpl) {
        this.f10427a.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new CartUpdateInteractor$addOrUpdateTrolleyItems$2(this, null, updateProductInCartExtrasArr), continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(au.com.woolworths.product.productbottomsheet.UpdateProductInCartExtras[] r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$addOrUpdateTrolleyItemsNoBoost$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$addOrUpdateTrolleyItemsNoBoost$1 r0 = (au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$addOrUpdateTrolleyItemsNoBoost$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$addOrUpdateTrolleyItemsNoBoost$1 r0 = new au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$addOrUpdateTrolleyItemsNoBoost$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r7)
            goto L4a
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            kotlin.ResultKt.b(r7)
            au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider r7 = r5.f10427a
            r7.getClass()
            kotlinx.coroutines.scheduling.DefaultScheduler r7 = kotlinx.coroutines.Dispatchers.f24691a
            kotlinx.coroutines.scheduling.DefaultIoScheduler r7 = kotlinx.coroutines.scheduling.DefaultIoScheduler.f
            au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$addOrUpdateTrolleyItemsNoBoost$2 r2 = new au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$addOrUpdateTrolleyItemsNoBoost$2
            r4 = 0
            r2.<init>(r5, r4, r6)
            r0.r = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.f(r7, r2, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.d
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor.d(au.com.woolworths.product.productbottomsheet.UpdateProductInCartExtras[], kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object e(UpdateProductInCartExtras[] updateProductInCartExtrasArr, Continuation continuation) {
        this.f10427a.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new CartUpdateInteractor$addOrUpdateTrolleyItemsWithCustomResponse$2(this, null, updateProductInCartExtrasArr), continuation);
    }

    public final Object f(Continuation continuation) {
        this.f10427a.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new CartUpdateInteractor$clearAllTrolleyItems$2(this, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(boolean r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$fetchCartProductsCount$1
            if (r0 == 0) goto L13
            r0 = r11
            au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$fetchCartProductsCount$1 r0 = (au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$fetchCartProductsCount$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$fetchCartProductsCount$1 r0 = new au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$fetchCartProductsCount$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            kotlinx.coroutines.flow.MutableStateFlow r3 = r9.k
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            kotlin.ResultKt.b(r11)     // Catch: java.lang.Throwable -> L29
            goto L5a
        L29:
            r10 = move-exception
            goto L6f
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            kotlin.ResultKt.b(r11)
            au.com.woolworths.shop.auth.ShopAccountInteractor r11 = r9.e
            boolean r11 = r11.S()
            if (r11 == 0) goto L4d
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r9.f
            long r5 = r5 - r7
            r7 = 900000(0xdbba0, double:4.44659E-318)
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 < 0) goto L4d
            goto L4f
        L4d:
            if (r10 == 0) goto L82
        L4f:
            au.com.woolworths.shop.cart.data.CartRepositoryImpl r10 = r9.d     // Catch: java.lang.Throwable -> L29
            r0.r = r4     // Catch: java.lang.Throwable -> L29
            java.lang.Object r11 = r10.d(r0)     // Catch: java.lang.Throwable -> L29
            if (r11 != r1) goto L5a
            return r1
        L5a:
            au.com.woolworths.shop.cart.domain.model.CartInfo r11 = (au.com.woolworths.shop.cart.domain.model.CartInfo) r11     // Catch: java.lang.Throwable -> L29
            int r10 = r11.getF10432a()     // Catch: java.lang.Throwable -> L29
            java.lang.Integer r11 = new java.lang.Integer     // Catch: java.lang.Throwable -> L29
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L29
            r3.setValue(r11)     // Catch: java.lang.Throwable -> L29
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L29
            r9.f = r10     // Catch: java.lang.Throwable -> L29
            goto L82
        L6f:
            timber.log.Timber$Forest r11 = timber.log.Timber.f27013a
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "GetCartInfo failed, Ignoring cart update"
            r11.a(r1, r10, r0)
            java.lang.Object r10 = r3.getValue()
            java.lang.Number r10 = (java.lang.Number) r10
            r10.intValue()
        L82:
            kotlin.Unit r10 = kotlin.Unit.f24250a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor.g(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantitiesUpdatedResponse r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$updateAddToCartResponse$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$updateAddToCartResponse$1 r0 = (au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$updateAddToCartResponse$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$updateAddToCartResponse$1 r0 = new au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$updateAddToCartResponse$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            au.com.woolworths.base.shopapp.TrolleyInteractor r3 = r6.b
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            au.com.woolworths.android.onesite.rxutils.Result r7 = r0.q
            au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantitiesUpdatedResponse r0 = r0.p
            kotlin.ResultKt.b(r8)
            goto L6f
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            au.com.woolworths.android.onesite.rxutils.Result r7 = r0.q
            au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantitiesUpdatedResponse r2 = r0.p
            kotlin.ResultKt.b(r8)
            r8 = r7
            r7 = r2
            goto L5e
        L42:
            kotlin.ResultKt.b(r8)
            kotlinx.coroutines.flow.StateFlow r8 = r3.v()
            java.lang.Object r8 = r8.getValue()
            au.com.woolworths.android.onesite.rxutils.Result r8 = (au.com.woolworths.android.onesite.rxutils.Result) r8
            r0.p = r7
            r0.q = r8
            r0.t = r5
            kotlinx.coroutines.flow.MutableStateFlow r2 = r6.g
            java.lang.Object r2 = r2.emit(r7, r0)
            if (r2 != r1) goto L5e
            goto L6c
        L5e:
            r0.p = r7
            r0.q = r8
            r0.t = r4
            kotlinx.coroutines.flow.MutableStateFlow r2 = r6.i
            java.lang.Object r0 = r2.emit(r7, r0)
            if (r0 != r1) goto L6d
        L6c:
            return r1
        L6d:
            r0 = r7
            r7 = r8
        L6f:
            int r8 = r0.b
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r8)
            kotlinx.coroutines.flow.MutableStateFlow r8 = r6.k
            r8.setValue(r1)
            java.lang.Object r7 = r7.f4591a
            au.com.woolworths.android.onesite.models.TrolleyResult r7 = (au.com.woolworths.android.onesite.models.TrolleyResult) r7
            au.com.woolworths.android.onesite.models.TrolleyResult r7 = au.com.woolworths.android.onesite.models.LegacyTrolleyResultUtilsKt.toLegacyResult(r0, r7)
            r3.n(r7)
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor.h(au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantitiesUpdatedResponse, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
