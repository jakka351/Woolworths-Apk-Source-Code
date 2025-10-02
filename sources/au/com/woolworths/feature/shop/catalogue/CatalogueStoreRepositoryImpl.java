package au.com.woolworths.feature.shop.catalogue;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.catalogue.models.CatalogueStoreInfo;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/CatalogueStoreRepositoryImpl;", "Lau/com/woolworths/feature/shop/catalogue/CatalogueStoreRepository;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CatalogueStoreRepositoryImpl implements CatalogueStoreRepository {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f6779a;
    public final Gson b;

    public CatalogueStoreRepositoryImpl(SharedPreferences sharedPreferences, Gson gson) {
        this.f6779a = sharedPreferences;
        this.b = gson;
    }

    public final CatalogueStoreInfo a() {
        return (CatalogueStoreInfo) this.b.d(CatalogueStoreInfo.class, this.f6779a.getString("selected_store", null));
    }
}
