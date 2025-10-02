package com.woolworths.scanlibrary.ui.payment.instrumentlist.di;

import au.com.woolworths.pay.sdk.PayClient;
import com.woolworths.scanlibrary.data.authentication.token.DefaultTokenProvider;
import com.woolworths.scanlibrary.domain.payment.GetInstrumentsUC;
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
public final class InstrumentListFragmentModule_GetInstrumentUseCaseFactory implements Factory<GetInstrumentsUC> {
    public static GetInstrumentsUC a(InstrumentListFragmentModule instrumentListFragmentModule, PayClient payClient, GetMerchantProfileUC getMerchantProfileUC, Scheduler scheduler, DefaultTokenProvider defaultTokenProvider) {
        Intrinsics.h(payClient, "payClient");
        return new GetInstrumentsUC(payClient, getMerchantProfileUC, scheduler, defaultTokenProvider);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
