package com.woolworths.scanlibrary.util.payment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.pay.sdk.PayClient;
import com.woolworths.scanlibrary.configuration.ScanAndGoFeature;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/util/payment/DigitalPayProviderImpl;", "Lcom/woolworths/scanlibrary/util/payment/DigitalPayProvider;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DigitalPayProviderImpl implements DigitalPayProvider {

    /* renamed from: a, reason: collision with root package name */
    public final PayClient f21371a;
    public final FeatureToggleManager b;

    public DigitalPayProviderImpl(PayClient payClient, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(payClient, "payClient");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f21371a = payClient;
        this.b = featureToggleManager;
    }

    @Override // com.woolworths.scanlibrary.util.payment.DigitalPayProvider
    public final void a(String newAccessToken) {
        Intrinsics.h(newAccessToken, "newAccessToken");
        if (this.b.c(ScanAndGoFeature.e)) {
            return;
        }
        PayClient payClient = this.f21371a;
        if (!payClient.f) {
            payClient.e.f9177a = newAccessToken;
            payClient.f9189a.b();
            payClient.f = true;
        }
        payClient.e.f9177a = newAccessToken;
    }

    @Override // com.woolworths.scanlibrary.util.payment.DigitalPayProvider
    public final void b(String accessToken) {
        Intrinsics.h(accessToken, "accessToken");
        if (this.b.c(ScanAndGoFeature.e)) {
            return;
        }
        PayClient payClient = this.f21371a;
        payClient.e.f9177a = accessToken;
        payClient.f9189a.b();
        payClient.f = true;
    }
}
