package au.com.woolworths.shop.lists.di;

import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.logging.LoggingConverterFactory;
import au.com.woolworths.shop.lists.network.ApigeeXApi;
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
/* loaded from: classes4.dex */
public final class ShopListsAppModule_ProvideApigeeXApiFactory implements Factory<ApigeeXApi> {
    public static ApigeeXApi a(ShopListsAppModule shopListsAppModule, AppConfig appConfig, OkHttpClient okHttpClient, Gson gson) throws NumberFormatException {
        shopListsAppModule.getClass();
        Intrinsics.h(appConfig, "appConfig");
        Intrinsics.h(okHttpClient, "okHttpClient");
        Intrinsics.h(gson, "gson");
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.b(appConfig.getN());
        builder.f27005a = okHttpClient;
        builder.c.add(new LoggingConverterFactory(GsonConverterFactory.c(gson)));
        Object objB = builder.c().b(ApigeeXApi.class);
        Intrinsics.g(objB, "create(...)");
        return (ApigeeXApi) objB;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
