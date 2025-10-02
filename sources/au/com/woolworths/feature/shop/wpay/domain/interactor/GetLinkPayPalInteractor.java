package au.com.woolworths.feature.shop.wpay.domain.interactor;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.network.SharedHeaders;
import au.com.woolworths.android.onesite.webview.ReleaseSquadHeaderInteractor;
import au.com.woolworths.feature.shop.wpay.data.source.PayPalDataRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/interactor/GetLinkPayPalInteractor;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetLinkPayPalInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final PayPalDataRepository f8272a;
    public final SharedHeaders b;

    public GetLinkPayPalInteractor(PayPalDataRepository payPalDataRepository, SharedHeaders shopSharedHeaders, ReleaseSquadHeaderInteractor releaseSquadHeaderInteractor) {
        Intrinsics.h(shopSharedHeaders, "shopSharedHeaders");
        this.f8272a = payPalDataRepository;
        this.b = shopSharedHeaders;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof au.com.woolworths.feature.shop.wpay.domain.interactor.GetLinkPayPalInteractor$invoke$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.feature.shop.wpay.domain.interactor.GetLinkPayPalInteractor$invoke$1 r0 = (au.com.woolworths.feature.shop.wpay.domain.interactor.GetLinkPayPalInteractor$invoke$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.wpay.domain.interactor.GetLinkPayPalInteractor$invoke$1 r0 = new au.com.woolworths.feature.shop.wpay.domain.interactor.GetLinkPayPalInteractor$invoke$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r5)     // Catch: java.lang.Exception -> L27
            goto L3f
        L27:
            r5 = move-exception
            goto L60
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.b(r5)
            au.com.woolworths.feature.shop.wpay.data.source.PayPalDataRepository r5 = r4.f8272a     // Catch: java.lang.Exception -> L27
            r0.r = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = r5.b(r0)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L3f
            return r1
        L3f:
            au.com.woolworths.feature.shop.wpay.domain.model.payment.LinkPayPalResponse r5 = (au.com.woolworths.feature.shop.wpay.domain.model.payment.LinkPayPalResponse) r5     // Catch: java.lang.Exception -> L27
            au.com.woolworths.android.onesite.network.SharedHeaders r0 = r4.b     // Catch: java.lang.Exception -> L27
            java.util.LinkedHashMap r0 = r0.b()     // Catch: java.lang.Exception -> L27
            java.util.Map r1 = kotlin.collections.MapsKt.d()     // Catch: java.lang.Exception -> L27
            java.util.LinkedHashMap r0 = kotlin.collections.MapsKt.m(r0, r1)     // Catch: java.lang.Exception -> L27
            java.lang.String r1 = r5.f8299a     // Catch: java.lang.Exception -> L27
            java.lang.String r2 = r5.b     // Catch: java.lang.Exception -> L27
            java.lang.String r5 = r5.c     // Catch: java.lang.Exception -> L27
            au.com.woolworths.feature.shop.wpay.domain.model.payment.LinkPayPalResponse r3 = new au.com.woolworths.feature.shop.wpay.domain.model.payment.LinkPayPalResponse     // Catch: java.lang.Exception -> L27
            r3.<init>(r1, r2, r0, r5)     // Catch: java.lang.Exception -> L27
            au.com.woolworths.feature.shop.wpay.domain.model.PageResult$Success r5 = new au.com.woolworths.feature.shop.wpay.domain.model.PageResult$Success     // Catch: java.lang.Exception -> L27
            r5.<init>(r3)     // Catch: java.lang.Exception -> L27
            return r5
        L60:
            au.com.woolworths.foundation.bark.Bark$Companion r0 = au.com.woolworths.foundation.bark.Bark.f8483a
            au.com.woolworths.foundation.bark.common.ReportOwner$Squad r0 = au.com.woolworths.foundation.bark.common.ReportOwner.Squad.h
            au.com.woolworths.foundation.bark.common.ReportOwner r1 = new au.com.woolworths.foundation.bark.common.ReportOwner
            r1.<init>(r0)
            r0 = 0
            r2 = 28
            au.com.woolworths.foundation.bark.Bark.Barker.h(r1, r5, r0, r2)
            au.com.woolworths.feature.shop.wpay.domain.model.PageResult$Fail r0 = new au.com.woolworths.feature.shop.wpay.domain.model.PageResult$Fail
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.wpay.domain.interactor.GetLinkPayPalInteractor.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
