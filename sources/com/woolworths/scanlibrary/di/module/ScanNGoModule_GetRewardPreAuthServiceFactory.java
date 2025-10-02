package com.woolworths.scanlibrary.di.module;

import com.google.gson.Gson;
import com.woolworths.scanlibrary.data.source.remote.RewardPreAuthService;
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
public final class ScanNGoModule_GetRewardPreAuthServiceFactory implements Factory<RewardPreAuthService> {
    public static RewardPreAuthService a(ScanNGoModule scanNGoModule, String str, OkHttpClient okHttpClient) throws NumberFormatException {
        scanNGoModule.getClass();
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.b(str);
        builder.f27005a = okHttpClient;
        builder.c.add(GsonConverterFactory.c(new Gson()));
        builder.a(new RxJava2CallAdapterFactory(null));
        Object objB = builder.c().b(RewardPreAuthService.class);
        Intrinsics.g(objB, "create(...)");
        return (RewardPreAuthService) objB;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
