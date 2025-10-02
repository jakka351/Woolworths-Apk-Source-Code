package au.com.woolworths.feature.shop.wpay.domain.interactor;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.network.SharedHeaders;
import au.com.woolworths.android.onesite.webview.ReleaseSquadHeaderInteractor;
import au.com.woolworths.feature.shop.wpay.data.source.CheckoutWPayDataRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/interactor/GetPaymentInstrumentsInteractor;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetPaymentInstrumentsInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final CheckoutWPayDataRepository f8273a;
    public final SharedHeaders b;

    public GetPaymentInstrumentsInteractor(CheckoutWPayDataRepository checkoutWPayDataRepository, SharedHeaders shopSharedHeaders, ReleaseSquadHeaderInteractor releaseSquadHeaderInteractor) {
        Intrinsics.h(shopSharedHeaders, "shopSharedHeaders");
        this.f8273a = checkoutWPayDataRepository;
        this.b = shopSharedHeaders;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List r9, java.lang.String r10, java.util.ArrayList r11, java.util.ArrayList r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof au.com.woolworths.feature.shop.wpay.domain.interactor.GetPaymentInstrumentsInteractor$invoke$1
            if (r0 == 0) goto L14
            r0 = r13
            au.com.woolworths.feature.shop.wpay.domain.interactor.GetPaymentInstrumentsInteractor$invoke$1 r0 = (au.com.woolworths.feature.shop.wpay.domain.interactor.GetPaymentInstrumentsInteractor$invoke$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.r = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            au.com.woolworths.feature.shop.wpay.domain.interactor.GetPaymentInstrumentsInteractor$invoke$1 r0 = new au.com.woolworths.feature.shop.wpay.domain.interactor.GetPaymentInstrumentsInteractor$invoke$1
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.r
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            kotlin.ResultKt.b(r13)     // Catch: java.lang.Exception -> L29
            goto L46
        L29:
            r0 = move-exception
            r9 = r0
            goto L74
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            kotlin.ResultKt.b(r13)
            au.com.woolworths.feature.shop.wpay.data.source.CheckoutWPayDataRepository r1 = r8.f8273a     // Catch: java.lang.Exception -> L29
            r6.r = r2     // Catch: java.lang.Exception -> L29
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            java.lang.Object r13 = r1.d(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L29
            if (r13 != r0) goto L46
            return r0
        L46:
            au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentInstrumentsResponse r13 = (au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentInstrumentsResponse) r13     // Catch: java.lang.Exception -> L29
            boolean r9 = r13 instanceof au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentInstrumentsResponse.Success     // Catch: java.lang.Exception -> L29
            if (r9 == 0) goto L6e
            au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentInstrumentsResponse$Success r13 = (au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentInstrumentsResponse.Success) r13     // Catch: java.lang.Exception -> L29
            au.com.woolworths.android.onesite.network.SharedHeaders r9 = r8.b     // Catch: java.lang.Exception -> L29
            java.util.LinkedHashMap r9 = r9.b()     // Catch: java.lang.Exception -> L29
            java.util.Map r10 = kotlin.collections.MapsKt.d()     // Catch: java.lang.Exception -> L29
            java.util.LinkedHashMap r7 = kotlin.collections.MapsKt.m(r9, r10)     // Catch: java.lang.Exception -> L29
            au.com.woolworths.feature.shop.wpay.domain.model.payment.GiftCardSection r1 = r13.f8303a     // Catch: java.lang.Exception -> L29
            au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodSection r2 = r13.b     // Catch: java.lang.Exception -> L29
            au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentInstrumentTotalDetails r3 = r13.c     // Catch: java.lang.Exception -> L29
            java.util.List r4 = r13.d     // Catch: java.lang.Exception -> L29
            java.lang.String r5 = r13.e     // Catch: java.lang.Exception -> L29
            java.lang.String r6 = r13.f     // Catch: java.lang.Exception -> L29
            au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentInstrumentsResponse$Success r0 = new au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentInstrumentsResponse$Success     // Catch: java.lang.Exception -> L29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L29
            r13 = r0
        L6e:
            au.com.woolworths.feature.shop.wpay.domain.model.PageResult$Success r9 = new au.com.woolworths.feature.shop.wpay.domain.model.PageResult$Success     // Catch: java.lang.Exception -> L29
            r9.<init>(r13)     // Catch: java.lang.Exception -> L29
            return r9
        L74:
            au.com.woolworths.foundation.bark.Bark$Companion r10 = au.com.woolworths.foundation.bark.Bark.f8483a
            au.com.woolworths.foundation.bark.common.ReportOwner$Squad r10 = au.com.woolworths.foundation.bark.common.ReportOwner.Squad.h
            au.com.woolworths.foundation.bark.common.ReportOwner r11 = new au.com.woolworths.foundation.bark.common.ReportOwner
            r11.<init>(r10)
            r10 = 0
            r12 = 28
            au.com.woolworths.foundation.bark.Bark.Barker.h(r11, r9, r10, r12)
            au.com.woolworths.feature.shop.wpay.domain.model.PageResult$Fail r10 = new au.com.woolworths.feature.shop.wpay.domain.model.PageResult$Fail
            r10.<init>(r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.wpay.domain.interactor.GetPaymentInstrumentsInteractor.a(java.util.List, java.lang.String, java.util.ArrayList, java.util.ArrayList, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
