package dagger.hilt.android.internal.modules;

import android.app.Application;
import dagger.hilt.android.internal.Contexts;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class ApplicationContextModule_ProvideApplicationFactory implements Factory<Application> {
    public static Application a(ApplicationContextModule applicationContextModule) {
        return Contexts.a(applicationContextModule.f23776a);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
