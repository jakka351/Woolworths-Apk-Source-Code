package au.com.woolworths.feature.shop.inbox.di;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.feature.shop.inbox.tracking.InboxAnalyticsFactory;
import au.com.woolworths.feature.shop.inbox.tracking.InboxAnalyticsFactoryImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class InboxModule_ProvideInboxAnalyticsFactoryFactory implements Factory<InboxAnalyticsFactory> {
    public static InboxAnalyticsFactoryImpl a(FeatureToggleManager featureToggleManager) {
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        return new InboxAnalyticsFactoryImpl(featureToggleManager);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
