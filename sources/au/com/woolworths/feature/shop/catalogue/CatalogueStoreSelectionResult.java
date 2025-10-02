package au.com.woolworths.feature.shop.catalogue;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.catalogue.models.CatalogueStoreInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/CatalogueStoreSelectionResult;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CatalogueStoreSelectionResult {

    /* renamed from: a, reason: collision with root package name */
    public final int f6780a;
    public final CatalogueStoreInfo b;

    public CatalogueStoreSelectionResult(int i, CatalogueStoreInfo catalogueStoreInfo) {
        this.f6780a = i;
        this.b = catalogueStoreInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogueStoreSelectionResult)) {
            return false;
        }
        CatalogueStoreSelectionResult catalogueStoreSelectionResult = (CatalogueStoreSelectionResult) obj;
        return this.f6780a == catalogueStoreSelectionResult.f6780a && Intrinsics.c(this.b, catalogueStoreSelectionResult.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f6780a) * 31;
        CatalogueStoreInfo catalogueStoreInfo = this.b;
        return iHashCode + (catalogueStoreInfo == null ? 0 : catalogueStoreInfo.hashCode());
    }

    public final String toString() {
        return "CatalogueStoreSelectionResult(code=" + this.f6780a + ", storeInfo=" + this.b + ")";
    }
}
