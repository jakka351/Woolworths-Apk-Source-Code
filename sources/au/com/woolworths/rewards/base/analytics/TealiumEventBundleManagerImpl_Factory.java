package au.com.woolworths.rewards.base.analytics;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.collections.EmptyList;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class TealiumEventBundleManagerImpl_Factory implements Factory<TealiumEventBundleManagerImpl> {

    public static final class InstanceHolder {
    }

    @Override // javax.inject.Provider
    public final Object get() {
        TealiumEventBundleManagerImpl tealiumEventBundleManagerImpl = new TealiumEventBundleManagerImpl();
        tealiumEventBundleManagerImpl.f9358a = EmptyList.d;
        return tealiumEventBundleManagerImpl;
    }
}
