package au.com.woolworths.feature.shop.wpay.domain.interactor;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.devicefingerprint.DeviceFingerprintInteractor;
import au.com.woolworths.feature.shop.wpay.WPayFeature;
import au.com.woolworths.feature.shop.wpay.data.source.FraudPreventionDataRepository;
import au.com.woolworths.feature.shop.wpay.data.source.PaymentIdentityDataRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/interactor/ProvideFingerprintInteractor;", "", "Companion", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProvideFingerprintInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final DeviceFingerprintInteractor f8276a;
    public final FraudPreventionDataRepository b;
    public final PaymentIdentityDataRepository c;
    public final boolean d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/interactor/ProvideFingerprintInteractor$Companion;", "", "", "WPAY_MERCHANT_ID", "Ljava/lang/String;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ProvideFingerprintInteractor(DeviceFingerprintInteractor deviceFingerprintInteractor, FraudPreventionDataRepository fraudPreventionDataRepository, PaymentIdentityDataRepository paymentIdentityDataRepository, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(deviceFingerprintInteractor, "deviceFingerprintInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f8276a = deviceFingerprintInteractor;
        this.b = fraudPreventionDataRepository;
        this.c = paymentIdentityDataRepository;
        boolean zC = featureToggleManager.c(WPayFeature.e);
        this.d = zC;
        if (zC) {
            deviceFingerprintInteractor.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof au.com.woolworths.feature.shop.wpay.domain.interactor.ProvideFingerprintInteractor$getDeviceFingerprintId$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.feature.shop.wpay.domain.interactor.ProvideFingerprintInteractor$getDeviceFingerprintId$1 r0 = (au.com.woolworths.feature.shop.wpay.domain.interactor.ProvideFingerprintInteractor$getDeviceFingerprintId$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.wpay.domain.interactor.ProvideFingerprintInteractor$getDeviceFingerprintId$1 r0 = new au.com.woolworths.feature.shop.wpay.domain.interactor.ProvideFingerprintInteractor$getDeviceFingerprintId$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            java.lang.String r0 = r0.p
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Exception -> L2a
            goto L60
        L2a:
            r8 = move-exception
            goto L7e
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            kotlin.ResultKt.b(r8)
            au.com.woolworths.feature.shop.wpay.data.source.FraudPreventionDataRepository r8 = r7.b     // Catch: java.lang.Exception -> L2a
            lib.android.paypal.com.magnessdk.MagnesSDK r2 = r8.b     // Catch: java.lang.Exception -> L2a
            android.content.Context r8 = r8.f8266a     // Catch: java.lang.Exception -> L2a
            lib.android.paypal.com.magnessdk.MagnesResult r8 = r2.a(r8, r3)     // Catch: java.lang.Exception -> L2a lib.android.paypal.com.magnessdk.InvalidInputException -> L42
            goto L43
        L42:
            r8 = r3
        L43:
            java.lang.String r8 = r8.f24887a     // Catch: java.lang.Exception -> L2a
            java.lang.String r2 = "getPaypalClientMetaDataId(...)"
            kotlin.jvm.internal.Intrinsics.g(r8, r2)     // Catch: java.lang.Exception -> L2a
            boolean r2 = r7.d     // Catch: java.lang.Exception -> L2a
            if (r2 == 0) goto L7d
            au.com.woolworths.devicefingerprint.DeviceFingerprintInteractor r2 = r7.f8276a     // Catch: java.lang.Exception -> L2a
            java.lang.String r5 = "woolworths_online_2"
            r0.p = r8     // Catch: java.lang.Exception -> L2a
            r0.s = r4     // Catch: java.lang.Exception -> L2a
            java.lang.Object r0 = r2.b(r5, r8, r0)     // Catch: java.lang.Exception -> L2a
            if (r0 != r1) goto L5d
            return r1
        L5d:
            r6 = r0
            r0 = r8
            r8 = r6
        L60:
            au.com.woolworths.devicefingerprint.DeviceFingerprintInteractor$ProfileResult r8 = (au.com.woolworths.devicefingerprint.DeviceFingerprintInteractor.ProfileResult) r8     // Catch: java.lang.Exception -> L2a
            boolean r1 = r8 instanceof au.com.woolworths.devicefingerprint.DeviceFingerprintInteractor.ProfileResult.Failure     // Catch: java.lang.Exception -> L2a
            if (r1 == 0) goto L7c
            au.com.woolworths.foundation.bark.Bark$Companion r1 = au.com.woolworths.foundation.bark.Bark.f8483a     // Catch: java.lang.Exception -> L2a
            au.com.woolworths.foundation.bark.common.ReportOwner$Squad r1 = au.com.woolworths.foundation.bark.common.ReportOwner.Squad.h     // Catch: java.lang.Exception -> L2a
            au.com.woolworths.foundation.bark.common.ReportOwner r2 = new au.com.woolworths.foundation.bark.common.ReportOwner     // Catch: java.lang.Exception -> L2a
            r2.<init>(r1)     // Catch: java.lang.Exception -> L2a
            au.com.woolworths.devicefingerprint.DeviceFingerprintInteractor$ProfileResult$Failure r8 = (au.com.woolworths.devicefingerprint.DeviceFingerprintInteractor.ProfileResult.Failure) r8     // Catch: java.lang.Exception -> L2a
            java.lang.String r8 = r8.f5169a     // Catch: java.lang.Exception -> L2a
            if (r8 != 0) goto L77
            java.lang.String r8 = "TMX Profiling Failed"
        L77:
            r1 = 12
            au.com.woolworths.foundation.bark.Bark.Barker.i(r2, r8, r3, r1)     // Catch: java.lang.Exception -> L2a
        L7c:
            return r0
        L7d:
            return r8
        L7e:
            au.com.woolworths.foundation.bark.Bark$Companion r0 = au.com.woolworths.foundation.bark.Bark.f8483a
            au.com.woolworths.foundation.bark.common.ReportOwner$Squad r0 = au.com.woolworths.foundation.bark.common.ReportOwner.Squad.h
            au.com.woolworths.foundation.bark.common.ReportOwner r1 = new au.com.woolworths.foundation.bark.common.ReportOwner
            r1.<init>(r0)
            r0 = 28
            au.com.woolworths.foundation.bark.Bark.Barker.h(r1, r8, r3, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.wpay.domain.interactor.ProvideFingerprintInteractor.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            au.com.woolworths.feature.shop.wpay.data.source.PaymentIdentityDataRepository r0 = r6.c
            java.util.LinkedHashMap r0 = r0.f8269a
            boolean r1 = r8 instanceof au.com.woolworths.feature.shop.wpay.domain.interactor.ProvideFingerprintInteractor$invoke$1
            if (r1 == 0) goto L17
            r1 = r8
            au.com.woolworths.feature.shop.wpay.domain.interactor.ProvideFingerprintInteractor$invoke$1 r1 = (au.com.woolworths.feature.shop.wpay.domain.interactor.ProvideFingerprintInteractor$invoke$1) r1
            int r2 = r1.s
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.s = r2
            goto L1c
        L17:
            au.com.woolworths.feature.shop.wpay.domain.interactor.ProvideFingerprintInteractor$invoke$1 r1 = new au.com.woolworths.feature.shop.wpay.domain.interactor.ProvideFingerprintInteractor$invoke$1
            r1.<init>(r6, r8)
        L1c:
            java.lang.Object r8 = r1.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r1.s
            java.lang.String r4 = "idempotencyKey"
            r5 = 1
            if (r3 == 0) goto L37
            if (r3 != r5) goto L2f
            java.lang.String r7 = r1.p
            kotlin.ResultKt.b(r8)
            goto L53
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.ResultKt.b(r8)
            kotlin.jvm.internal.Intrinsics.h(r7, r4)
            java.lang.Object r8 = r0.get(r7)
            au.com.woolworths.feature.shop.wpay.data.model.Fingerprint r8 = (au.com.woolworths.feature.shop.wpay.data.model.Fingerprint) r8
            if (r8 == 0) goto L48
            java.lang.String r7 = r8.f8263a
            return r7
        L48:
            r1.p = r7
            r1.s = r5
            java.lang.Object r8 = r6.a(r1)
            if (r8 != r2) goto L53
            return r2
        L53:
            java.lang.String r8 = (java.lang.String) r8
            kotlin.jvm.internal.Intrinsics.h(r7, r4)
            au.com.woolworths.feature.shop.wpay.data.model.Fingerprint r1 = new au.com.woolworths.feature.shop.wpay.data.model.Fingerprint
            r1.<init>(r8)
            r0.put(r7, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.wpay.domain.interactor.ProvideFingerprintInteractor.b(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
