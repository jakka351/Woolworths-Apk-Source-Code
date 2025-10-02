package au.com.woolworths.android.onesite.di.modules;

import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.logging.LoggingConverterFactory;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.base.shopapp.modules.collectionmode.ShoppingModeApi;
import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class NetworkModule_ProvideCollectionApiFactory implements Factory<ShoppingModeApi> {
    public static ShoppingModeApi a(NetworkModule networkModule, AppConfig appConfig, OkHttpClient okHttpClient, SchedulersProvider schedulersProvider, Gson gson) throws NumberFormatException {
        networkModule.getClass();
        Intrinsics.h(appConfig, "appConfig");
        Intrinsics.h(okHttpClient, "okHttpClient");
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        Intrinsics.h(gson, "gson");
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.b(appConfig.getL());
        builder.f27005a = okHttpClient;
        builder.c.add(new LoggingConverterFactory(GsonConverterFactory.c(gson)));
        builder.a(RxJava2CallAdapterFactory.d(schedulersProvider.d()));
        Object objB = builder.c().b(ShoppingModeApi.class);
        Intrinsics.g(objB, "create(...)");
        return (ShoppingModeApi) objB;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
