package com.woolworths.scanlibrary.di.module;

import com.woolworths.scanlibrary.data.authentication.AuthenticatedUser;
import com.woolworths.scanlibrary.data.authentication.DefaultLocalTokenProvider;
import com.woolworths.scanlibrary.data.launch.BffScanAndGoRepository;
import com.woolworths.scanlibrary.data.source.local.persistent.ScanAndGoLaunchPersistent;
import com.woolworths.scanlibrary.domain.launch.FetchScanAndGoInteractor;
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
public final class BffScanNGoModule_ProvideScanAndGoInteractorFactory implements Factory<FetchScanAndGoInteractor> {
    public static FetchScanAndGoInteractor a(BffScanNGoModule bffScanNGoModule, BffScanAndGoRepository bffScanAndGoRepository, AuthenticatedUser authenticatedUser, DefaultLocalTokenProvider defaultLocalTokenProvider, ScanAndGoLaunchPersistent scanAndGoLaunchPersistent, DigitalPayProvider digitalPayProvider) {
        bffScanNGoModule.getClass();
        Intrinsics.h(digitalPayProvider, "digitalPayProvider");
        return new FetchScanAndGoInteractor(bffScanAndGoRepository, authenticatedUser, defaultLocalTokenProvider, scanAndGoLaunchPersistent, digitalPayProvider);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
