package au.com.woolworths.shop.deliveryunlimited.signup.domain.interactor;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.network.SharedHeaders;
import au.com.woolworths.android.onesite.webview.ReleaseSquadHeaderInteractor;
import au.com.woolworths.shop.deliveryunlimited.signup.data.source.PaymentDataRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/domain/interactor/DeliveryUnlimitedPaymentInteractor;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeliveryUnlimitedPaymentInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final PaymentDataRepository f10873a;
    public final SharedHeaders b;

    public DeliveryUnlimitedPaymentInteractor(PaymentDataRepository paymentDataRepository, SharedHeaders shopSharedHeaders, ReleaseSquadHeaderInteractor releaseSquadHeaderInteractor) {
        Intrinsics.h(shopSharedHeaders, "shopSharedHeaders");
        this.f10873a = paymentDataRepository;
        this.b = shopSharedHeaders;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r5, java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof au.com.woolworths.shop.deliveryunlimited.signup.domain.interactor.DeliveryUnlimitedPaymentInteractor$fetchDeliveryUnlimitedPayment$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.shop.deliveryunlimited.signup.domain.interactor.DeliveryUnlimitedPaymentInteractor$fetchDeliveryUnlimitedPayment$1 r0 = (au.com.woolworths.shop.deliveryunlimited.signup.domain.interactor.DeliveryUnlimitedPaymentInteractor$fetchDeliveryUnlimitedPayment$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.deliveryunlimited.signup.domain.interactor.DeliveryUnlimitedPaymentInteractor$fetchDeliveryUnlimitedPayment$1 r0 = new au.com.woolworths.shop.deliveryunlimited.signup.domain.interactor.DeliveryUnlimitedPaymentInteractor$fetchDeliveryUnlimitedPayment$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Exception -> L27
            goto L3f
        L27:
            r5 = move-exception
            goto L59
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r7)
            au.com.woolworths.shop.deliveryunlimited.signup.data.source.PaymentDataRepository r7 = r4.f10873a     // Catch: java.lang.Exception -> L27
            r0.r = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r7 = r7.a(r5, r6, r0)     // Catch: java.lang.Exception -> L27
            if (r7 != r1) goto L3f
            return r1
        L3f:
            au.com.woolworths.shop.deliveryunlimited.signup.domain.model.DeliveryUnlimitedPaymentResponse r7 = (au.com.woolworths.shop.deliveryunlimited.signup.domain.model.DeliveryUnlimitedPaymentResponse) r7     // Catch: java.lang.Exception -> L27
            au.com.woolworths.android.onesite.network.SharedHeaders r5 = r4.b     // Catch: java.lang.Exception -> L27
            java.util.LinkedHashMap r5 = r5.b()     // Catch: java.lang.Exception -> L27
            java.util.Map r6 = kotlin.collections.MapsKt.d()     // Catch: java.lang.Exception -> L27
            java.util.LinkedHashMap r5 = kotlin.collections.MapsKt.m(r5, r6)     // Catch: java.lang.Exception -> L27
            au.com.woolworths.shop.deliveryunlimited.signup.domain.model.DeliveryUnlimitedPaymentResponse r5 = au.com.woolworths.shop.deliveryunlimited.signup.domain.model.DeliveryUnlimitedPaymentResponse.a(r7, r5)     // Catch: java.lang.Exception -> L27
            au.com.woolworths.feature.shop.wpay.domain.model.PageResult$Success r6 = new au.com.woolworths.feature.shop.wpay.domain.model.PageResult$Success     // Catch: java.lang.Exception -> L27
            r6.<init>(r5)     // Catch: java.lang.Exception -> L27
            return r6
        L59:
            au.com.woolworths.feature.shop.wpay.domain.model.PageResult$Fail r6 = new au.com.woolworths.feature.shop.wpay.domain.model.PageResult$Fail
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.deliveryunlimited.signup.domain.interactor.DeliveryUnlimitedPaymentInteractor.a(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r5, java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof au.com.woolworths.shop.deliveryunlimited.signup.domain.interactor.DeliveryUnlimitedPaymentInteractor$submitPayment$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.shop.deliveryunlimited.signup.domain.interactor.DeliveryUnlimitedPaymentInteractor$submitPayment$1 r0 = (au.com.woolworths.shop.deliveryunlimited.signup.domain.interactor.DeliveryUnlimitedPaymentInteractor$submitPayment$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.deliveryunlimited.signup.domain.interactor.DeliveryUnlimitedPaymentInteractor$submitPayment$1 r0 = new au.com.woolworths.shop.deliveryunlimited.signup.domain.interactor.DeliveryUnlimitedPaymentInteractor$submitPayment$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Exception -> L27
            goto L3f
        L27:
            r5 = move-exception
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r7)
            au.com.woolworths.shop.deliveryunlimited.signup.data.source.PaymentDataRepository r7 = r4.f10873a     // Catch: java.lang.Exception -> L27
            r0.r = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r7 = r7.b(r5, r6, r0)     // Catch: java.lang.Exception -> L27
            if (r7 != r1) goto L3f
            return r1
        L3f:
            au.com.woolworths.feature.shop.wpay.domain.model.PageResult$Success r5 = new au.com.woolworths.feature.shop.wpay.domain.model.PageResult$Success     // Catch: java.lang.Exception -> L27
            r5.<init>(r7)     // Catch: java.lang.Exception -> L27
            return r5
        L45:
            au.com.woolworths.feature.shop.wpay.domain.model.PageResult$Fail r6 = new au.com.woolworths.feature.shop.wpay.domain.model.PageResult$Fail
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.deliveryunlimited.signup.domain.interactor.DeliveryUnlimitedPaymentInteractor.b(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
