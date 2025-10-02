package com.woolworths.scanlibrary.di.module;

import au.com.woolworths.pay.sdk.PayClient;
import au.com.woolworths.pay.sdk.models.config.Configuration;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ScanNGoModule_ProvideDigitalPayClientFactory implements Factory<PayClient> {
    public static PayClient a(ScanNGoModule scanNGoModule, ScanAndGoConfig config) {
        scanNGoModule.getClass();
        Intrinsics.h(config, "config");
        return new PayClient(new Configuration(ScanAndGoConfigKt.a(config, config.getN()), ScanAndGoConfigKt.a(config, config.getO()), false, config.getK()));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
