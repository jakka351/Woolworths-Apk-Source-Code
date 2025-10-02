package au.com.woolworths.android.onesite.di;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.io.File;
import okhttp3.Cache;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class BaseNetworkModule_ProvideCacheFactory implements Factory<Cache> {
    public static Cache a(BaseNetworkModule baseNetworkModule, Application application) {
        baseNetworkModule.getClass();
        return new Cache(new File(application.getCacheDir(), "apiResponses"));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
