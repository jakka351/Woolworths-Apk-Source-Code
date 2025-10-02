package au.com.woolworths.android.onesite.di;

import android.content.SharedPreferences;
import au.com.woolworths.android.onesite.featuretoggles.FirebaseRepository;
import au.com.woolworths.android.onesite.featuretoggles.FirebaseRepositoryImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class BaseModule_ProvideFirebaseAppRepository$base_impl_releaseFactory implements Factory<FirebaseRepository> {
    public static FirebaseRepositoryImpl a(SharedPreferences sharedPreferences) {
        return new FirebaseRepositoryImpl(sharedPreferences);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
