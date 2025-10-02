package au.com.woolworths.feature.shop.catalogue.di;

import android.graphics.Rect;
import au.com.woolworths.feature.shop.catalogue.details.CatalogueRectTypeAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class CatalogueAppModule_ProvideCatalogueGson$catalogue_releaseFactory implements Factory<Gson> {
    public static Gson a(CatalogueAppModule catalogueAppModule) {
        catalogueAppModule.getClass();
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.g = "yyyy-MM-dd HH:mm:ss";
        gsonBuilder.b(new CatalogueRectTypeAdapter(), Rect.class);
        return gsonBuilder.a();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a(null);
        throw null;
    }
}
