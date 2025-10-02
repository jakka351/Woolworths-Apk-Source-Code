package au.com.woolworths.feature.shop.instore.navigation.di;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.constraintlayout.core.state.a;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class InstoreNavigationAppModule_ProvidesSharedPreferencesFactory implements Factory<SharedPreferences> {
    public static SharedPreferences a(InstoreNavigationAppModule instoreNavigationAppModule, Application application) {
        instoreNavigationAppModule.getClass();
        return a.b(application.getPackageName(), ".ProductFinderHub", application, 0, "getSharedPreferences(...)");
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
