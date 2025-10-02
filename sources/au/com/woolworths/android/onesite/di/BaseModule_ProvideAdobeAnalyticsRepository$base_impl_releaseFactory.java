package au.com.woolworths.android.onesite.di;

import android.content.SharedPreferences;
import au.com.woolworths.android.onesite.analytics.adobe.AdobeAnalyticsRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class BaseModule_ProvideAdobeAnalyticsRepository$base_impl_releaseFactory implements Factory<AdobeAnalyticsRepository> {
    public static AdobeAnalyticsRepository a(SharedPreferences sharedPreferences) {
        return new AdobeAnalyticsRepository(sharedPreferences);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
