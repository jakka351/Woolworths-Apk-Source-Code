package au.com.woolworths.shop.lists.di;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class ShopListsAppModule_ProvideApigeeXGsonFactory implements Factory<Gson> {
    public static Gson a(ShopListsAppModule shopListsAppModule) {
        shopListsAppModule.getClass();
        return new GsonBuilder().a();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a(null);
        throw null;
    }
}
