package au.com.woolworths.android.onesite.app.di;

import com.google.firebase.FirebaseApp;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AppModule_ProvideFirebaseAppFactory implements Factory<FirebaseApp> {
    public static FirebaseApp a(AppModule appModule) {
        appModule.getClass();
        return FirebaseApp.d();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a(null);
        throw null;
    }
}
