package com.woolworths.scanlibrary.di.module;

import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import com.google.gson.Gson;
import com.woolworths.scanlibrary.data.source.remote.BffDataSource;
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
/* loaded from: classes7.dex */
public final class BffScanNGoModule_ProvideScanAndGoBffApiFactory implements Factory<BffDataSource> {
    public static BffDataSource a(BffScanNGoModule bffScanNGoModule, OkHttpClient okHttpClient, AppConfig appConfig, SchedulersProvider schedulersProvider, Gson gson) {
        bffScanNGoModule.getClass();
        Intrinsics.h(okHttpClient, "okHttpClient");
        Intrinsics.h(appConfig, "appConfig");
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.b(appConfig.getL());
        builder.f27005a = okHttpClient;
        builder.c.add(GsonConverterFactory.c(gson));
        builder.a(RxJava2CallAdapterFactory.d(schedulersProvider.d()));
        Object objB = builder.c().b(BffDataSource.class);
        Intrinsics.g(objB, "create(...)");
        return (BffDataSource) objB;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
