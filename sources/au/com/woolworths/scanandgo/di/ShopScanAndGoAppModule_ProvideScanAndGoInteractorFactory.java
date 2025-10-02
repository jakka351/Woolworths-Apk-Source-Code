package au.com.woolworths.scanandgo.di;

import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.scanandgo.ScanAndGoInteractor;
import au.com.woolworths.scanandgo.ScanAndGoRepository;
import au.com.woolworths.scanandgo.storage.ScanAndGoLocalStorage;
import com.woolworths.scanlibrary.data.authentication.AuthenticatedUser;
import com.woolworths.scanlibrary.data.authentication.DefaultLocalTokenProvider;
import com.woolworths.scanlibrary.util.payment.DigitalPayProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class ShopScanAndGoAppModule_ProvideScanAndGoInteractorFactory implements Factory<ScanAndGoInteractor> {
    public static ScanAndGoInteractor a(ShopScanAndGoAppModule shopScanAndGoAppModule, ScanAndGoRepository scanAndGoRepository, AuthenticatedUser authenticatedUser, DefaultLocalTokenProvider defaultLocalTokenProvider, ScanAndGoLocalStorage scanAndGoLocalStorage, DigitalPayProvider digitalPayProvider, RewardsAccountInteractor rewardsAccountInteractor) {
        shopScanAndGoAppModule.getClass();
        Intrinsics.h(digitalPayProvider, "digitalPayProvider");
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        return new ScanAndGoInteractor(scanAndGoRepository, authenticatedUser, defaultLocalTokenProvider, scanAndGoLocalStorage, digitalPayProvider, rewardsAccountInteractor);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
