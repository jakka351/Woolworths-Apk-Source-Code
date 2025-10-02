package au.com.woolworths.feature.shop.recipes.freshmag.di;

import au.com.woolworths.feature.shop.recipes.freshmag.content.data.SaleFinderInterceptor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class FreshMagModule_Companion_ProvideCatalogueOkHttpClientFactory implements Factory<OkHttpClient> {
    public static OkHttpClient a(SaleFinderInterceptor saleFinderInterceptor) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.c(30L, timeUnit);
        builder.e(60L, timeUnit);
        builder.d(60L, timeUnit);
        builder.a(saleFinderInterceptor);
        return new OkHttpClient(builder);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
