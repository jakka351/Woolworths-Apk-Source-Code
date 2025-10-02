package au.com.woolworths.feature.shop.recipes.freshmag.content.data;

import YU.a;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/data/MagazineMapItem;", "", "itemName", "", "coordinates", "itemUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getItemName", "()Ljava/lang/String;", "getCoordinates", "getItemUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MagazineMapItem {
    public static final int $stable = 0;

    @SerializedName("coords")
    @Nullable
    private final String coordinates;

    @SerializedName("itemName")
    @Nullable
    private final String itemName;

    @SerializedName("itemURL")
    @Nullable
    private final String itemUrl;

    public MagazineMapItem(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.itemName = str;
        this.coordinates = str2;
        this.itemUrl = str3;
    }

    public static /* synthetic */ MagazineMapItem copy$default(MagazineMapItem magazineMapItem, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = magazineMapItem.itemName;
        }
        if ((i & 2) != 0) {
            str2 = magazineMapItem.coordinates;
        }
        if ((i & 4) != 0) {
            str3 = magazineMapItem.itemUrl;
        }
        return magazineMapItem.copy(str, str2, str3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getCoordinates() {
        return this.coordinates;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getItemUrl() {
        return this.itemUrl;
    }

    @NotNull
    public final MagazineMapItem copy(@Nullable String itemName, @Nullable String coordinates, @Nullable String itemUrl) {
        return new MagazineMapItem(itemName, coordinates, itemUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MagazineMapItem)) {
            return false;
        }
        MagazineMapItem magazineMapItem = (MagazineMapItem) other;
        return Intrinsics.c(this.itemName, magazineMapItem.itemName) && Intrinsics.c(this.coordinates, magazineMapItem.coordinates) && Intrinsics.c(this.itemUrl, magazineMapItem.itemUrl);
    }

    @Nullable
    public final String getCoordinates() {
        return this.coordinates;
    }

    @Nullable
    public final String getItemName() {
        return this.itemName;
    }

    @Nullable
    public final String getItemUrl() {
        return this.itemUrl;
    }

    public int hashCode() {
        String str = this.itemName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.coordinates;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.itemUrl;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.itemName;
        String str2 = this.coordinates;
        return a.o(a.v("MagazineMapItem(itemName=", str, ", coordinates=", str2, ", itemUrl="), this.itemUrl, ")");
    }
}
