package au.com.woolworths.shop.auth.di;

import au.com.woolworths.shop.auth.AuthInteractor;
import au.com.woolworths.shop.auth.AuthRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class ShopAuthAppModule_ProvideAuthInteractorFactory implements Factory<AuthInteractor> {
    public static AuthInteractor a(ShopAuthAppModule shopAuthAppModule, AuthRepository authRepository) {
        shopAuthAppModule.getClass();
        Intrinsics.h(authRepository, "authRepository");
        return new AuthInteractor(authRepository);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
