package au.com.woolworths.android.onesite.di;

import au.com.woolworths.android.onesite.analytics.UserAttributionManager;
import au.com.woolworths.android.onesite.analytics.UserAttributionManagerImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class BaseModule_ProvideUserAttributionManagerFactory implements Factory<UserAttributionManager> {

    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new UserAttributionManagerImpl();
    }
}
