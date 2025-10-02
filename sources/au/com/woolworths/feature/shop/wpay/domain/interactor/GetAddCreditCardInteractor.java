package au.com.woolworths.feature.shop.wpay.domain.interactor;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.network.SharedHeaders;
import au.com.woolworths.android.onesite.webview.ReleaseSquadHeaderInteractor;
import au.com.woolworths.feature.shop.wpay.data.source.CreditCardDataRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/interactor/GetAddCreditCardInteractor;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetAddCreditCardInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final CreditCardDataRepository f8270a;
    public final SharedHeaders b;

    public GetAddCreditCardInteractor(CreditCardDataRepository creditCardDataRepository, SharedHeaders shopSharedHeaders, ReleaseSquadHeaderInteractor releaseSquadHeaderInteractor) {
        Intrinsics.h(shopSharedHeaders, "shopSharedHeaders");
        this.f8270a = creditCardDataRepository;
        this.b = shopSharedHeaders;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentFlowTypeData r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof au.com.woolworths.feature.shop.wpay.domain.interactor.GetAddCreditCardInteractor$invoke$1
            if (r0 == 0) goto L13
            r0 = r9
            au.com.woolworths.feature.shop.wpay.domain.interactor.GetAddCreditCardInteractor$invoke$1 r0 = (au.com.woolworths.feature.shop.wpay.domain.interactor.GetAddCreditCardInteractor$invoke$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.wpay.domain.interactor.GetAddCreditCardInteractor$invoke$1 r0 = new au.com.woolworths.feature.shop.wpay.domain.interactor.GetAddCreditCardInteractor$invoke$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Exception -> L27
            goto L40
        L27:
            r0 = move-exception
            r8 = r0
            goto L6d
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            kotlin.ResultKt.b(r9)
            au.com.woolworths.feature.shop.wpay.data.source.CreditCardDataRepository r9 = r7.f8270a     // Catch: java.lang.Exception -> L27
            r0.r = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r9 = r9.c(r8, r0)     // Catch: java.lang.Exception -> L27
            if (r9 != r1) goto L40
            return r1
        L40:
            au.com.woolworths.feature.shop.wpay.domain.model.payment.AddCreditCardResponse r9 = (au.com.woolworths.feature.shop.wpay.domain.model.payment.AddCreditCardResponse) r9     // Catch: java.lang.Exception -> L27
            au.com.woolworths.android.onesite.network.SharedHeaders r8 = r7.b     // Catch: java.lang.Exception -> L27
            java.util.LinkedHashMap r8 = r8.b()     // Catch: java.lang.Exception -> L27
            java.util.Map r0 = kotlin.collections.MapsKt.d()     // Catch: java.lang.Exception -> L27
            java.util.LinkedHashMap r3 = kotlin.collections.MapsKt.m(r8, r0)     // Catch: java.lang.Exception -> L27
            java.lang.String r2 = r9.f8287a     // Catch: java.lang.Exception -> L27
            boolean r4 = r9.c     // Catch: java.lang.Exception -> L27
            java.lang.String r5 = r9.d     // Catch: java.lang.Exception -> L27
            au.com.woolworths.analytics.model.AnalyticsData r6 = r9.e     // Catch: java.lang.Exception -> L27
            java.lang.String r8 = "url"
            kotlin.jvm.internal.Intrinsics.h(r2, r8)     // Catch: java.lang.Exception -> L27
            java.lang.String r8 = "clickAnalytics"
            kotlin.jvm.internal.Intrinsics.h(r6, r8)     // Catch: java.lang.Exception -> L27
            au.com.woolworths.feature.shop.wpay.domain.model.payment.AddCreditCardResponse r1 = new au.com.woolworths.feature.shop.wpay.domain.model.payment.AddCreditCardResponse     // Catch: java.lang.Exception -> L27
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L27
            au.com.woolworths.feature.shop.wpay.domain.model.PageResult$Success r8 = new au.com.woolworths.feature.shop.wpay.domain.model.PageResult$Success     // Catch: java.lang.Exception -> L27
            r8.<init>(r1)     // Catch: java.lang.Exception -> L27
            return r8
        L6d:
            au.com.woolworths.foundation.bark.Bark$Companion r9 = au.com.woolworths.foundation.bark.Bark.f8483a
            au.com.woolworths.foundation.bark.common.ReportOwner$Squad r9 = au.com.woolworths.foundation.bark.common.ReportOwner.Squad.h
            au.com.woolworths.foundation.bark.common.ReportOwner r0 = new au.com.woolworths.foundation.bark.common.ReportOwner
            r0.<init>(r9)
            r9 = 0
            r1 = 28
            au.com.woolworths.foundation.bark.Bark.Barker.h(r0, r8, r9, r1)
            au.com.woolworths.feature.shop.wpay.domain.model.PageResult$Fail r9 = new au.com.woolworths.feature.shop.wpay.domain.model.PageResult$Fail
            r9.<init>(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.wpay.domain.interactor.GetAddCreditCardInteractor.a(au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentFlowTypeData, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
