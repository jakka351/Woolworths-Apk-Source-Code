package au.com.woolworths.foundation.rewards.banner.dismiss.di;

import au.com.woolworths.foundation.rewards.banner.dismiss.BannerRemoteDismissInteractor;
import au.com.woolworths.foundation.rewards.banner.dismiss.BannerRemoteDismissInteractorImpl;
import au.com.woolworths.foundation.rewards.banner.dismiss.BannerRemoteDismissRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class RemoteDismissibleBannerModule_ProvideBannerRemoteDismissInteractorFactory implements Factory<BannerRemoteDismissInteractor> {
    public static BannerRemoteDismissInteractorImpl a(RemoteDismissibleBannerModule remoteDismissibleBannerModule, BannerRemoteDismissRepository bannerRemoteDismissRepository) {
        remoteDismissibleBannerModule.getClass();
        return new BannerRemoteDismissInteractorImpl(bannerRemoteDismissRepository);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
