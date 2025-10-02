package au.com.woolworths.feature.shop.catalogue.productlist.model;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u0004\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/model/CatalogueProductDetailsAdditionalItems;", "", "itemId", "", "skuCodeInternal", "itemName", "itemImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getItemId", "()Ljava/lang/String;", "getItemName", "getItemImage", "skuCode", "getSkuCode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CatalogueProductDetailsAdditionalItems {
    public static final int $stable = 0;

    @SerializedName("itemId")
    @NotNull
    private final String itemId;

    @SerializedName("retailerItemImage")
    @NotNull
    private final String itemImage;

    @SerializedName("itemName")
    @NotNull
    private final String itemName;

    @SerializedName("SKU")
    @NotNull
    private final String skuCodeInternal;

    public CatalogueProductDetailsAdditionalItems(@NotNull String itemId, @NotNull String skuCodeInternal, @NotNull String itemName, @NotNull String itemImage) {
        Intrinsics.h(itemId, "itemId");
        Intrinsics.h(skuCodeInternal, "skuCodeInternal");
        Intrinsics.h(itemName, "itemName");
        Intrinsics.h(itemImage, "itemImage");
        this.itemId = itemId;
        this.skuCodeInternal = skuCodeInternal;
        this.itemName = itemName;
        this.itemImage = itemImage;
    }

    /* renamed from: component2, reason: from getter */
    private final String getSkuCodeInternal() {
        return this.skuCodeInternal;
    }

    public static /* synthetic */ CatalogueProductDetailsAdditionalItems copy$default(CatalogueProductDetailsAdditionalItems catalogueProductDetailsAdditionalItems, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = catalogueProductDetailsAdditionalItems.itemId;
        }
        if ((i & 2) != 0) {
            str2 = catalogueProductDetailsAdditionalItems.skuCodeInternal;
        }
        if ((i & 4) != 0) {
            str3 = catalogueProductDetailsAdditionalItems.itemName;
        }
        if ((i & 8) != 0) {
            str4 = catalogueProductDetailsAdditionalItems.itemImage;
        }
        return catalogueProductDetailsAdditionalItems.copy(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getItemImage() {
        return this.itemImage;
    }

    @NotNull
    public final CatalogueProductDetailsAdditionalItems copy(@NotNull String itemId, @NotNull String skuCodeInternal, @NotNull String itemName, @NotNull String itemImage) {
        Intrinsics.h(itemId, "itemId");
        Intrinsics.h(skuCodeInternal, "skuCodeInternal");
        Intrinsics.h(itemName, "itemName");
        Intrinsics.h(itemImage, "itemImage");
        return new CatalogueProductDetailsAdditionalItems(itemId, skuCodeInternal, itemName, itemImage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CatalogueProductDetailsAdditionalItems)) {
            return false;
        }
        CatalogueProductDetailsAdditionalItems catalogueProductDetailsAdditionalItems = (CatalogueProductDetailsAdditionalItems) other;
        return Intrinsics.c(this.itemId, catalogueProductDetailsAdditionalItems.itemId) && Intrinsics.c(this.skuCodeInternal, catalogueProductDetailsAdditionalItems.skuCodeInternal) && Intrinsics.c(this.itemName, catalogueProductDetailsAdditionalItems.itemName) && Intrinsics.c(this.itemImage, catalogueProductDetailsAdditionalItems.itemImage);
    }

    @NotNull
    public final String getItemId() {
        return this.itemId;
    }

    @NotNull
    public final String getItemImage() {
        return this.itemImage;
    }

    @NotNull
    public final String getItemName() {
        return this.itemName;
    }

    @NotNull
    public final String getSkuCode() {
        return StringsKt.k0(this.skuCodeInternal).toString();
    }

    public int hashCode() {
        return this.itemImage.hashCode() + b.c(b.c(this.itemId.hashCode() * 31, 31, this.skuCodeInternal), 31, this.itemName);
    }

    @NotNull
    public String toString() {
        String str = this.itemId;
        String str2 = this.skuCodeInternal;
        return a.l(YU.a.v("CatalogueProductDetailsAdditionalItems(itemId=", str, ", skuCodeInternal=", str2, ", itemName="), this.itemName, ", itemImage=", this.itemImage, ")");
    }
}
