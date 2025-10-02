package au.com.woolworths.android.onesite.di;

import au.com.woolworths.android.onesite.jwt.JwtApi;
import au.com.woolworths.android.onesite.jwt.JwtRepository;
import au.com.woolworths.android.onesite.jwt.JwtRepositoryImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ReleaseModule_ProvideJwtRepositoryFactory implements Factory<JwtRepository> {
    public static JwtRepositoryImpl a(ReleaseModule releaseModule, JwtApi jwtApi) {
        releaseModule.getClass();
        Intrinsics.h(jwtApi, "jwtApi");
        return new JwtRepositoryImpl(jwtApi);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
