package au.com.woolworths.feature.shop.catalogue.di;

import au.com.woolworths.feature.shop.catalogue.CatalogueApiInterface;
import au.com.woolworths.feature.shop.catalogue.CatalogueConfigInteractorImpl;
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
/* loaded from: classes3.dex */
public final class CatalogueModule_ProvideCatalogueApiInterfaceFactory implements Factory<CatalogueApiInterface> {
    public static CatalogueApiInterface a(CatalogueModule catalogueModule, OkHttpClient okHttpClient, CatalogueConfigInteractorImpl catalogueConfigInteractorImpl, Gson gson) throws NumberFormatException {
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.b("https://webservice.salefinder.com.au/index.php/api/");
        builder.f27005a = okHttpClient;
        builder.c.add(GsonConverterFactory.c(gson));
        Object objB = builder.c().b(CatalogueApiInterface.class);
        Intrinsics.g(objB, "create(...)");
        return (CatalogueApiInterface) objB;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
