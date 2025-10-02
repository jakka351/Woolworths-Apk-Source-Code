package au.com.woolworths.feature.shop.catalogue.di;

import au.com.woolworths.android.onesite.utils.ConnectionManager;
import au.com.woolworths.feature.shop.catalogue.CatalogueConfigInteractorImpl;
import au.com.woolworths.feature.shop.catalogue.CatalogueInterceptor;
import com.google.common.collect.ImmutableSet;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class CatalogueModule_ProvideCatalogueOkHttpClientFactory implements Factory<OkHttpClient> {
    public static OkHttpClient a(CatalogueModule catalogueModule, CatalogueConfigInteractorImpl catalogueConfigInteractorImpl, ConnectionManager connectionManager, ImmutableSet supplementaryInterceptors) {
        Intrinsics.h(connectionManager, "connectionManager");
        Intrinsics.h(supplementaryInterceptors, "supplementaryInterceptors");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.c(30L, timeUnit);
        builder.e(60L, timeUnit);
        builder.d(60L, timeUnit);
        builder.a(new CatalogueInterceptor(catalogueConfigInteractorImpl, connectionManager));
        return new OkHttpClient(builder);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
