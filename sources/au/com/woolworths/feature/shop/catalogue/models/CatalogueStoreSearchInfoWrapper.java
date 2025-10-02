package au.com.woolworths.feature.shop.catalogue.models;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/models/CatalogueStoreSearchInfoWrapper;", "", "catalogueStoreInfo", "Lau/com/woolworths/feature/shop/catalogue/models/CatalogueStoreInfo;", "<init>", "(Lau/com/woolworths/feature/shop/catalogue/models/CatalogueStoreInfo;)V", "getCatalogueStoreInfo", "()Lau/com/woolworths/feature/shop/catalogue/models/CatalogueStoreInfo;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CatalogueStoreSearchInfoWrapper {
    public static final int $stable = 0;

    @SerializedName("items")
    @NotNull
    private final CatalogueStoreInfo catalogueStoreInfo;

    public CatalogueStoreSearchInfoWrapper(@NotNull CatalogueStoreInfo catalogueStoreInfo) {
        Intrinsics.h(catalogueStoreInfo, "catalogueStoreInfo");
        this.catalogueStoreInfo = catalogueStoreInfo;
    }

    public static /* synthetic */ CatalogueStoreSearchInfoWrapper copy$default(CatalogueStoreSearchInfoWrapper catalogueStoreSearchInfoWrapper, CatalogueStoreInfo catalogueStoreInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            catalogueStoreInfo = catalogueStoreSearchInfoWrapper.catalogueStoreInfo;
        }
        return catalogueStoreSearchInfoWrapper.copy(catalogueStoreInfo);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CatalogueStoreInfo getCatalogueStoreInfo() {
        return this.catalogueStoreInfo;
    }

    @NotNull
    public final CatalogueStoreSearchInfoWrapper copy(@NotNull CatalogueStoreInfo catalogueStoreInfo) {
        Intrinsics.h(catalogueStoreInfo, "catalogueStoreInfo");
        return new CatalogueStoreSearchInfoWrapper(catalogueStoreInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CatalogueStoreSearchInfoWrapper) && Intrinsics.c(this.catalogueStoreInfo, ((CatalogueStoreSearchInfoWrapper) other).catalogueStoreInfo);
    }

    @NotNull
    public final CatalogueStoreInfo getCatalogueStoreInfo() {
        return this.catalogueStoreInfo;
    }

    public int hashCode() {
        return this.catalogueStoreInfo.hashCode();
    }

    @NotNull
    public String toString() {
        return "CatalogueStoreSearchInfoWrapper(catalogueStoreInfo=" + this.catalogueStoreInfo + ")";
    }
}
