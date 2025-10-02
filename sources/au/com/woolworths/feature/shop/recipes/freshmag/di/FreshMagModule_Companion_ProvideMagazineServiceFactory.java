package au.com.woolworths.feature.shop.recipes.freshmag.di;

import au.com.woolworths.feature.shop.recipes.freshmag.content.data.MagazineService;
import au.com.woolworths.feature.shop.recipes.freshmag.content.data.SaleFinderConfigInteractor;
import com.google.gson.GsonBuilder;
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
public final class FreshMagModule_Companion_ProvideMagazineServiceFactory implements Factory<MagazineService> {
    public static MagazineService a(OkHttpClient okHttpClient, SaleFinderConfigInteractor saleFinderConfigInteractor) throws NumberFormatException {
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.b("https://webservice.salefinder.com.au/index.php/api/");
        builder.f27005a = okHttpClient;
        builder.c.add(GsonConverterFactory.c(new GsonBuilder().a()));
        Object objB = builder.c().b(MagazineService.class);
        Intrinsics.g(objB, "create(...)");
        return (MagazineService) objB;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
