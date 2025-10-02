package au.com.woolworths.android.onesite.di;

import android.app.Application;
import au.com.woolworths.android.onesite.utils.ConnectionManager;
import au.com.woolworths.android.onesite.utils.ConnectionManagerImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class BaseNetworkModule_ProvideConnectionManagerFactory implements Factory<ConnectionManager> {
    public static ConnectionManagerImpl a(BaseNetworkModule baseNetworkModule, Application application) {
        baseNetworkModule.getClass();
        return new ConnectionManagerImpl(application);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
