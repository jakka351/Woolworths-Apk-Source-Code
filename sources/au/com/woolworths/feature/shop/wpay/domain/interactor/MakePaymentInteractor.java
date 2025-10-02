package au.com.woolworths.feature.shop.wpay.domain.interactor;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.wpay.data.source.CheckoutWPayDataRepository;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/interactor/MakePaymentInteractor;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MakePaymentInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final CheckoutWPayDataRepository f8275a;

    public MakePaymentInteractor(CheckoutWPayDataRepository checkoutWPayDataRepository) {
        this.f8275a = checkoutWPayDataRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(au.com.woolworths.feature.shop.wpay.domain.model.payment.InputPayment r9, java.util.List r10, java.util.List r11, java.lang.String r12, java.lang.String r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof au.com.woolworths.feature.shop.wpay.domain.interactor.MakePaymentInteractor$invoke$1
            if (r0 == 0) goto L14
            r0 = r14
            au.com.woolworths.feature.shop.wpay.domain.interactor.MakePaymentInteractor$invoke$1 r0 = (au.com.woolworths.feature.shop.wpay.domain.interactor.MakePaymentInteractor$invoke$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.r = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            au.com.woolworths.feature.shop.wpay.domain.interactor.MakePaymentInteractor$invoke$1 r0 = new au.com.woolworths.feature.shop.wpay.domain.interactor.MakePaymentInteractor$invoke$1
            r0.<init>(r8, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r7.r
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            kotlin.ResultKt.b(r14)     // Catch: java.lang.Exception -> L29
            goto L47
        L29:
            r0 = move-exception
            r9 = r0
            goto L4d
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            kotlin.ResultKt.b(r14)
            au.com.woolworths.feature.shop.wpay.data.source.CheckoutWPayDataRepository r1 = r8.f8275a     // Catch: java.lang.Exception -> L29
            r7.r = r2     // Catch: java.lang.Exception -> L29
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            java.lang.Object r14 = r1.c(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L29
            if (r14 != r0) goto L47
            return r0
        L47:
            au.com.woolworths.feature.shop.wpay.domain.model.PageResult$Success r9 = new au.com.woolworths.feature.shop.wpay.domain.model.PageResult$Success     // Catch: java.lang.Exception -> L29
            r9.<init>(r14)     // Catch: java.lang.Exception -> L29
            return r9
        L4d:
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
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.wpay.domain.interactor.MakePaymentInteractor.a(au.com.woolworths.feature.shop.wpay.domain.model.payment.InputPayment, java.util.List, java.util.List, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
