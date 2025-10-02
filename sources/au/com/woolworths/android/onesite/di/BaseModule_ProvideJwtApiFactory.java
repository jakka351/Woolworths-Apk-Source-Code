package au.com.woolworths.android.onesite.di;

import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.jwt.JwtApi;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
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
/* loaded from: classes3.dex */
public final class BaseModule_ProvideJwtApiFactory implements Factory<JwtApi> {
    public static JwtApi a(OkHttpClient okHttpClient, AppConfig appConfig, SchedulersProvider schedulersProvider, Gson gson) throws NumberFormatException {
        Intrinsics.h(okHttpClient, "okHttpClient");
        Intrinsics.h(appConfig, "appConfig");
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        Intrinsics.h(gson, "gson");
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.b(appConfig.d());
        builder.f27005a = okHttpClient;
        builder.c.add(GsonConverterFactory.c(gson));
        builder.a(RxJava2CallAdapterFactory.d(schedulersProvider.d()));
        Object objB = builder.c().b(JwtApi.class);
        Intrinsics.g(objB, "create(...)");
        return (JwtApi) objB;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
