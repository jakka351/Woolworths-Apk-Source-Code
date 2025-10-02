package au.com.woolworths.shop.auth.di;

import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.shop.auth.network.TokenApi;
import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class ShopAuthAppModule_ProvideAuthTokenApiFactory implements Factory<TokenApi> {
    public static TokenApi a(ShopAuthAppModule shopAuthAppModule, OkHttpClient okHttpClient, AppConfig appConfig, Gson gson) throws NumberFormatException {
        shopAuthAppModule.getClass();
        Intrinsics.h(okHttpClient, "okHttpClient");
        Intrinsics.h(appConfig, "appConfig");
        Intrinsics.h(gson, "gson");
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.b(appConfig.getL());
        builder.f27005a = okHttpClient;
        builder.c.add(GsonConverterFactory.c(gson));
        Object objB = builder.c().b(TokenApi.class);
        Intrinsics.g(objB, "create(...)");
        return (TokenApi) objB;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
