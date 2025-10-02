package com.woolworths.scanlibrary.di.module;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ScanNGoModule_GetSngDisableInAppPaymentToggleInterceptorFactory implements Factory<Interceptor> {
    public static b a(ScanNGoModule scanNGoModule, FeatureToggleManager featureToggleManager) {
        scanNGoModule.getClass();
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        return new b(featureToggleManager, 1);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
