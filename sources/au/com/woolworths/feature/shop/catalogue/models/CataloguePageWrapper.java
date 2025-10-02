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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/models/CataloguePageWrapper;", "", "item", "Lau/com/woolworths/feature/shop/catalogue/models/CataloguePage;", "<init>", "(Lau/com/woolworths/feature/shop/catalogue/models/CataloguePage;)V", "getItem", "()Lau/com/woolworths/feature/shop/catalogue/models/CataloguePage;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CataloguePageWrapper {
    public static final int $stable = 8;

    @SerializedName("items")
    @NotNull
    private final CataloguePage item;

    public CataloguePageWrapper(@NotNull CataloguePage item) {
        Intrinsics.h(item, "item");
        this.item = item;
    }

    public static /* synthetic */ CataloguePageWrapper copy$default(CataloguePageWrapper cataloguePageWrapper, CataloguePage cataloguePage, int i, Object obj) {
        if ((i & 1) != 0) {
            cataloguePage = cataloguePageWrapper.item;
        }
        return cataloguePageWrapper.copy(cataloguePage);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CataloguePage getItem() {
        return this.item;
    }

    @NotNull
    public final CataloguePageWrapper copy(@NotNull CataloguePage item) {
        Intrinsics.h(item, "item");
        return new CataloguePageWrapper(item);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CataloguePageWrapper) && Intrinsics.c(this.item, ((CataloguePageWrapper) other).item);
    }

    @NotNull
    public final CataloguePage getItem() {
        return this.item;
    }

    public int hashCode() {
        return this.item.hashCode();
    }

    @NotNull
    public String toString() {
        return "CataloguePageWrapper(item=" + this.item + ")";
    }
}
