package au.com.woolworths.feature.shop.catalogue.home;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.feature.shop.catalogue.CatalogueStoreInteractor;
import au.com.woolworths.feature.shop.catalogue.models.CatalogueStoreInfo;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/home/CatalogueHomeInteractor;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CatalogueHomeInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final CatalogueHomeRepository f6845a;
    public final CollectionModeInteractor b;
    public final CatalogueStoreInteractor c;

    public CatalogueHomeInteractor(CatalogueHomeRepository catalogueHomeRepository, CollectionModeInteractor collectionModeInteractor, CatalogueStoreInteractor catalogueStoreInteractor) {
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        this.f6845a = catalogueHomeRepository;
        this.b = collectionModeInteractor;
        this.c = catalogueStoreInteractor;
    }

    public final Object a(Continuation continuation) {
        CollectionModeInteractor collectionModeInteractor = this.b;
        String strA = collectionModeInteractor.a();
        CollectionMode collectionModeW = collectionModeInteractor.w();
        CatalogueStoreInfo catalogueStoreInfoA = this.c.f6778a.a();
        if (catalogueStoreInfoA == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        return this.f6845a.a(strA, collectionModeW, catalogueStoreInfoA, (ContinuationImpl) continuation);
    }
}
