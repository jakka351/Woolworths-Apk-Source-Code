package com.woolworths.scanlibrary.di.module;

import au.com.woolworths.pay.sdk.PayClient;
import com.woolworths.scanlibrary.data.authentication.token.DefaultTokenProvider;
import com.woolworths.scanlibrary.domain.payment.GetMerchantProfileUC;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import io.reactivex.Scheduler;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ScanNGoModule_GetMerchantProfilesFactory implements Factory<GetMerchantProfileUC> {
    public static GetMerchantProfileUC a(ScanNGoModule scanNGoModule, PayClient payClient, Scheduler scheduler, DefaultTokenProvider defaultTokenProvider) {
        scanNGoModule.getClass();
        Intrinsics.h(payClient, "payClient");
        return new GetMerchantProfileUC(payClient, scheduler, defaultTokenProvider);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
