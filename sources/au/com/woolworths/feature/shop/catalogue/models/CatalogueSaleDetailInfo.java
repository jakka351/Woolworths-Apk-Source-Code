package au.com.woolworths.feature.shop.catalogue.models;

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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/models/CatalogueSaleDetailInfo;", "", "saleName", "", "cataloguePageItems", "", "Lau/com/woolworths/feature/shop/catalogue/models/CataloguePageWrapper;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getSaleName", "()Ljava/lang/String;", "getCataloguePageItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CatalogueSaleDetailInfo {
    public static final int $stable = 8;

    @SerializedName("items")
    @NotNull
    private final List<CataloguePageWrapper> cataloguePageItems;

    @SerializedName("saleName")
    @NotNull
    private final String saleName;

    public CatalogueSaleDetailInfo(@NotNull String saleName, @NotNull List<CataloguePageWrapper> cataloguePageItems) {
        Intrinsics.h(saleName, "saleName");
        Intrinsics.h(cataloguePageItems, "cataloguePageItems");
        this.saleName = saleName;
        this.cataloguePageItems = cataloguePageItems;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CatalogueSaleDetailInfo copy$default(CatalogueSaleDetailInfo catalogueSaleDetailInfo, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = catalogueSaleDetailInfo.saleName;
        }
        if ((i & 2) != 0) {
            list = catalogueSaleDetailInfo.cataloguePageItems;
        }
        return catalogueSaleDetailInfo.copy(str, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSaleName() {
        return this.saleName;
    }

    @NotNull
    public final List<CataloguePageWrapper> component2() {
        return this.cataloguePageItems;
    }

    @NotNull
    public final CatalogueSaleDetailInfo copy(@NotNull String saleName, @NotNull List<CataloguePageWrapper> cataloguePageItems) {
        Intrinsics.h(saleName, "saleName");
        Intrinsics.h(cataloguePageItems, "cataloguePageItems");
        return new CatalogueSaleDetailInfo(saleName, cataloguePageItems);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CatalogueSaleDetailInfo)) {
            return false;
        }
        CatalogueSaleDetailInfo catalogueSaleDetailInfo = (CatalogueSaleDetailInfo) other;
        return Intrinsics.c(this.saleName, catalogueSaleDetailInfo.saleName) && Intrinsics.c(this.cataloguePageItems, catalogueSaleDetailInfo.cataloguePageItems);
    }

    @NotNull
    public final List<CataloguePageWrapper> getCataloguePageItems() {
        return this.cataloguePageItems;
    }

    @NotNull
    public final String getSaleName() {
        return this.saleName;
    }

    public int hashCode() {
        return this.cataloguePageItems.hashCode() + (this.saleName.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a.i("CatalogueSaleDetailInfo(saleName=", this.saleName, ", cataloguePageItems=", ")", this.cataloguePageItems);
    }
}
