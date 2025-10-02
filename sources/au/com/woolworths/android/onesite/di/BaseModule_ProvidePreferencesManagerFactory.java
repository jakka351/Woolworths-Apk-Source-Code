package au.com.woolworths.android.onesite.di;

import android.app.Application;
import android.content.Context;
import au.com.woolworths.android.onesite.analytics.FirebaseAnalyticsLogger;
import au.com.woolworths.android.onesite.repository.PreferencesManager;
import au.com.woolworths.android.onesite.repository.PreferencesManagerImpl;
import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class BaseModule_ProvidePreferencesManagerFactory implements Factory<PreferencesManager> {
    public static PreferencesManagerImpl a(Application application, Gson gson, FirebaseAnalyticsLogger firebaseAnalyticsLogger) {
        Intrinsics.h(gson, "gson");
        Intrinsics.h(firebaseAnalyticsLogger, "firebaseAnalyticsLogger");
        PreferencesManagerImpl preferencesManagerImpl = new PreferencesManagerImpl();
        Context applicationContext = application.getApplicationContext();
        preferencesManagerImpl.f4588a = applicationContext.getSharedPreferences(applicationContext.getPackageName() + "_preferences", 0);
        preferencesManagerImpl.b = gson;
        return preferencesManagerImpl;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
