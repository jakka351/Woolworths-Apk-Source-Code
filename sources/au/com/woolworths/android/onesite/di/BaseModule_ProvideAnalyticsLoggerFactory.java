package au.com.woolworths.android.onesite.di;

import au.com.woolworths.android.onesite.analytics.FirebaseAnalyticsLogger;
import com.google.firebase.analytics.AnalyticsKt;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class BaseModule_ProvideAnalyticsLoggerFactory implements Factory<FirebaseAnalyticsLogger> {
    public static FirebaseAnalyticsLogger a(FirebaseCrashlytics firebaseCrashlytics) {
        return new FirebaseAnalyticsLogger(AnalyticsKt.a(), firebaseCrashlytics);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
