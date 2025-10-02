package au.com.woolworths.shop.auth.di;

import android.content.SharedPreferences;
import au.com.woolworths.shop.auth.AccountRepository;
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
public final class ShopAuthAppModule_ProvideAccountRepositoryFactory implements Factory<AccountRepository> {
    public static AccountRepository a(ShopAuthAppModule shopAuthAppModule, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, Gson gson) {
        shopAuthAppModule.getClass();
        Intrinsics.h(gson, "gson");
        return new AccountRepository(sharedPreferences, sharedPreferences2, gson);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
