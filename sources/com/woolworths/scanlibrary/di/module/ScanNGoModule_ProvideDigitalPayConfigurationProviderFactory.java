package com.woolworths.scanlibrary.di.module;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.pay.sdk.PayClient;
import com.woolworths.scanlibrary.util.payment.DigitalPayProvider;
import com.woolworths.scanlibrary.util.payment.DigitalPayProviderImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ScanNGoModule_ProvideDigitalPayConfigurationProviderFactory implements Factory<DigitalPayProvider> {
    public static DigitalPayProviderImpl a(ScanNGoModule scanNGoModule, PayClient payClient, FeatureToggleManager featureToggleManager) {
        scanNGoModule.getClass();
        Intrinsics.h(payClient, "payClient");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        return new DigitalPayProviderImpl(payClient, featureToggleManager);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
