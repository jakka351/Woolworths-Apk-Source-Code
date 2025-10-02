package au.com.woolworths.feature.shop.delivery.address;

import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/delivery/address/DeliveryAddressRepository;", "", "delivery-address_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeliveryAddressRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ShopAccountInteractor f7046a;
    public final LegacyShoppingModeRepository b;
    public final DispatcherProvider c;

    public DeliveryAddressRepository(ShopAccountInteractor accountInteractor, LegacyShoppingModeRepository legacyShoppingModeRepository, DispatcherProvider dispatcherProvider) {
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(legacyShoppingModeRepository, "legacyShoppingModeRepository");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        this.f7046a = accountInteractor;
        this.b = legacyShoppingModeRepository;
        this.c = dispatcherProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r9, au.com.woolworths.base.shopapp.models.address.AddressResult.ManualAddressToSave r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof au.com.woolworths.feature.shop.delivery.address.DeliveryAddressRepository$saveNewManualAddress$1
            if (r0 == 0) goto L13
            r0 = r11
            au.com.woolworths.feature.shop.delivery.address.DeliveryAddressRepository$saveNewManualAddress$1 r0 = (au.com.woolworths.feature.shop.delivery.address.DeliveryAddressRepository$saveNewManualAddress$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.delivery.address.DeliveryAddressRepository$saveNewManualAddress$1 r0 = new au.com.woolworths.feature.shop.delivery.address.DeliveryAddressRepository$saveNewManualAddress$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            kotlin.Unit r3 = kotlin.Unit.f24250a
            r4 = 3
            r5 = 2
            r6 = 1
            au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository r7 = r8.b
            if (r2 == 0) goto L43
            if (r2 == r6) goto L3d
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            kotlin.ResultKt.b(r11)
            return r3
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            kotlin.ResultKt.b(r11)
            return r3
        L3d:
            boolean r9 = r0.p
            kotlin.ResultKt.b(r11)
            goto L5a
        L43:
            kotlin.ResultKt.b(r11)
            io.reactivex.internal.operators.single.SingleObserveOn r10 = r7.a(r10)
            io.reactivex.internal.operators.single.SingleCache r11 = new io.reactivex.internal.operators.single.SingleCache
            r11.<init>(r10)
            r0.p = r9
            r0.s = r6
            java.lang.Object r11 = kotlinx.coroutines.rx2.RxAwaitKt.b(r11, r0)
            if (r11 != r1) goto L5a
            goto L92
        L5a:
            au.com.woolworths.base.shopapp.models.address.SaveAddressResult$Address r11 = (au.com.woolworths.base.shopapp.models.address.SaveAddressResult.Address) r11
            if (r9 == 0) goto L81
            io.reactivex.internal.operators.single.SingleObserveOn r9 = r7.i(r11)
            au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.a r10 = new au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.a
            r2 = 5
            r10.<init>(r2, r8, r11)
            au.com.woolworths.feature.shop.delivery.address.a r11 = new au.com.woolworths.feature.shop.delivery.address.a
            r2 = 0
            r11.<init>(r10, r2)
            io.reactivex.internal.operators.single.SingleDoOnError r10 = new io.reactivex.internal.operators.single.SingleDoOnError
            r10.<init>(r9, r11)
            io.reactivex.internal.operators.single.SingleCache r9 = new io.reactivex.internal.operators.single.SingleCache
            r9.<init>(r10)
            r0.s = r5
            java.lang.Object r9 = kotlinx.coroutines.rx2.RxAwaitKt.b(r9, r0)
            if (r9 != r1) goto L93
            goto L92
        L81:
            io.reactivex.internal.operators.single.SingleObserveOn r9 = r7.h(r11)
            io.reactivex.internal.operators.single.SingleCache r10 = new io.reactivex.internal.operators.single.SingleCache
            r10.<init>(r9)
            r0.s = r4
            java.lang.Object r9 = kotlinx.coroutines.rx2.RxAwaitKt.b(r10, r0)
            if (r9 != r1) goto L93
        L92:
            return r1
        L93:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.delivery.address.DeliveryAddressRepository.a(boolean, au.com.woolworths.base.shopapp.models.address.AddressResult$ManualAddressToSave, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof au.com.woolworths.feature.shop.delivery.address.DeliveryAddressRepository$searchSuburbsByPostcode$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.feature.shop.delivery.address.DeliveryAddressRepository$searchSuburbsByPostcode$1 r0 = (au.com.woolworths.feature.shop.delivery.address.DeliveryAddressRepository$searchSuburbsByPostcode$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.delivery.address.DeliveryAddressRepository$searchSuburbsByPostcode$1 r0 = new au.com.woolworths.feature.shop.delivery.address.DeliveryAddressRepository$searchSuburbsByPostcode$1
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
            au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider r7 = r5.c
            r7.getClass()
            kotlinx.coroutines.scheduling.DefaultScheduler r7 = kotlinx.coroutines.Dispatchers.f24691a
            kotlinx.coroutines.scheduling.DefaultIoScheduler r7 = kotlinx.coroutines.scheduling.DefaultIoScheduler.f
            au.com.woolworths.feature.shop.delivery.address.DeliveryAddressRepository$searchSuburbsByPostcode$2 r2 = new au.com.woolworths.feature.shop.delivery.address.DeliveryAddressRepository$searchSuburbsByPostcode$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.r = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.f(r7, r2, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r6 = "withContext(...)"
            kotlin.jvm.internal.Intrinsics.g(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.delivery.address.DeliveryAddressRepository.b(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
