package com.woolworths.scanlibrary.di.module;

import com.woolworths.scanlibrary.data.ScanNGoRepository;
import com.woolworths.scanlibrary.domain.stores.GetAvailableStoresUC;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import io.reactivex.Scheduler;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ScanNGoModule_ProvidesGetAvailableStoresUCFactory implements Factory<GetAvailableStoresUC> {
    public static GetAvailableStoresUC a(ScanNGoModule scanNGoModule, ScanNGoRepository scanNGoRepository, Scheduler scheduler) {
        scanNGoModule.getClass();
        return new GetAvailableStoresUC(scanNGoRepository, scheduler);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
