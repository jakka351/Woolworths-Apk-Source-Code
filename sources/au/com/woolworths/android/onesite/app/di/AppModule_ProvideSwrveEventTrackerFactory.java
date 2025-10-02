package au.com.woolworths.android.onesite.app.di;

import au.com.woolworths.foundation.swrve.tracking.api.SwrveEventTracker;
import au.com.woolworths.foundation.swrve.tracking.impl.SwrveEventTrackerImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AppModule_ProvideSwrveEventTrackerFactory implements Factory<SwrveEventTracker> {
    public static SwrveEventTrackerImpl a(AppModule appModule) {
        appModule.getClass();
        return new SwrveEventTrackerImpl();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a(null);
        throw null;
    }
}
