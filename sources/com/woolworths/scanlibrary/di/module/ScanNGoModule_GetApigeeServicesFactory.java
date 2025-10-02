package com.woolworths.scanlibrary.di.module;

import com.google.gson.Gson;
import com.woolworths.scanlibrary.data.source.remote.ApigeeDataSource;
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
public final class ScanNGoModule_GetApigeeServicesFactory implements Factory<ApigeeDataSource> {
    public static ApigeeDataSource a(ScanNGoModule scanNGoModule, OkHttpClient okHttpClient, Gson gson, String str) throws NumberFormatException {
        scanNGoModule.getClass();
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.b(str);
        builder.f27005a = okHttpClient;
        builder.c.add(GsonConverterFactory.c(gson));
        builder.a(new RxJava2CallAdapterFactory(null));
        Object objB = builder.c().b(ApigeeDataSource.class);
        Intrinsics.g(objB, "create(...)");
        return (ApigeeDataSource) objB;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
