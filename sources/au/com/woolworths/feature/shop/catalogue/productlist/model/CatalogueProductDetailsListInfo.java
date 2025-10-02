package au.com.woolworths.feature.shop.catalogue.productlist.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/model/CatalogueProductDetailsListInfo;", "", "catalogueProductListDetails", "", "Lau/com/woolworths/feature/shop/catalogue/productlist/model/CatalogueProductDetailsListInfoWrapper;", "<init>", "(Ljava/util/List;)V", "getCatalogueProductListDetails", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CatalogueProductDetailsListInfo {
    public static final int $stable = 8;

    @SerializedName("items")
    @NotNull
    private final List<CatalogueProductDetailsListInfoWrapper> catalogueProductListDetails;

    public CatalogueProductDetailsListInfo(@NotNull List<CatalogueProductDetailsListInfoWrapper> catalogueProductListDetails) {
        Intrinsics.h(catalogueProductListDetails, "catalogueProductListDetails");
        this.catalogueProductListDetails = catalogueProductListDetails;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CatalogueProductDetailsListInfo copy$default(CatalogueProductDetailsListInfo catalogueProductDetailsListInfo, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = catalogueProductDetailsListInfo.catalogueProductListDetails;
        }
        return catalogueProductDetailsListInfo.copy(list);
    }

    @NotNull
    public final List<CatalogueProductDetailsListInfoWrapper> component1() {
        return this.catalogueProductListDetails;
    }

    @NotNull
    public final CatalogueProductDetailsListInfo copy(@NotNull List<CatalogueProductDetailsListInfoWrapper> catalogueProductListDetails) {
        Intrinsics.h(catalogueProductListDetails, "catalogueProductListDetails");
        return new CatalogueProductDetailsListInfo(catalogueProductListDetails);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CatalogueProductDetailsListInfo) && Intrinsics.c(this.catalogueProductListDetails, ((CatalogueProductDetailsListInfo) other).catalogueProductListDetails);
    }

    @NotNull
    public final List<CatalogueProductDetailsListInfoWrapper> getCatalogueProductListDetails() {
        return this.catalogueProductListDetails;
    }

    public int hashCode() {
        return this.catalogueProductListDetails.hashCode();
    }

    @NotNull
    public String toString() {
        return a.l("CatalogueProductDetailsListInfo(catalogueProductListDetails=", ")", this.catalogueProductListDetails);
    }
}
