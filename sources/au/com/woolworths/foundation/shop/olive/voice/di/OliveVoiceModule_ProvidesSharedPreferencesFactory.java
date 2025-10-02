package au.com.woolworths.foundation.shop.olive.voice.di;

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
/* loaded from: classes4.dex */
public final class OliveVoiceModule_ProvidesSharedPreferencesFactory implements Factory<SharedPreferences> {
    public static SharedPreferences a(OliveVoiceModule oliveVoiceModule, Application application) {
        return a.b(application.getPackageName(), ".OliveVoiceProductFinder", application, 0, "getSharedPreferences(...)");
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
