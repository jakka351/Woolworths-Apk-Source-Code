package com.woolworths.scanlibrary.di.module;

import au.com.woolworths.scanandgo.HandleOnSngRewardsTokenExpired;
import com.woolworths.scanlibrary.configuration.ScanAndGoFeatureConfig;
import com.woolworths.scanlibrary.data.authentication.DefaultLocalTokenProvider;
import com.woolworths.scanlibrary.data.authentication.token.DefaultTokenProvider;
import com.woolworths.scanlibrary.data.authentication.token.TokenProvider;
import com.woolworths.scanlibrary.data.source.remote.TokenRefreshService;
import com.woolworths.scanlibrary.util.payment.DigitalPayProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ScanNGoModule_GetTokenProviderFactory implements Factory<TokenProvider> {
    public static DefaultTokenProvider a(ScanNGoModule scanNGoModule, TokenRefreshService tokenRefreshService, DigitalPayProvider digitalPayProvider, DefaultLocalTokenProvider defaultLocalTokenProvider, HandleOnSngRewardsTokenExpired handleOnSngRewardsTokenExpired, ScanAndGoFeatureConfig sngFeatureConfig) {
        scanNGoModule.getClass();
        Intrinsics.h(digitalPayProvider, "digitalPayProvider");
        Intrinsics.h(sngFeatureConfig, "sngFeatureConfig");
        return new DefaultTokenProvider(tokenRefreshService, digitalPayProvider, defaultLocalTokenProvider, handleOnSngRewardsTokenExpired, sngFeatureConfig);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
