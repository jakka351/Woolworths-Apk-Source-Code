package au.com.woolworths.feature.shop.catalogue.models;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003JM\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006("}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/models/CataloguePageItem;", "Landroid/os/Parcelable;", "coordinates", "Landroid/graphics/Rect;", "itemId", "", "itemSKU", "itemName", "itemUrl", "youtubeId", "<init>", "(Landroid/graphics/Rect;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCoordinates", "()Landroid/graphics/Rect;", "getItemId", "()Ljava/lang/String;", "getItemSKU", "getItemName", "getItemUrl", "getYoutubeId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CataloguePageItem implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<CataloguePageItem> CREATOR = new Creator();

    @SerializedName("coords")
    @Nullable
    private final Rect coordinates;

    @SerializedName("itemId")
    @NotNull
    private final String itemId;

    @SerializedName("itemName")
    @Nullable
    private final String itemName;

    @SerializedName("itemSKU")
    @NotNull
    private final String itemSKU;

    @SerializedName("itemURL")
    @Nullable
    private final String itemUrl;

    @SerializedName("youtubeid")
    @Nullable
    private final String youtubeId;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CataloguePageItem> {
        @Override // android.os.Parcelable.Creator
        public final CataloguePageItem createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new CataloguePageItem((Rect) parcel.readParcelable(CataloguePageItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CataloguePageItem[] newArray(int i) {
            return new CataloguePageItem[i];
        }
    }

    public CataloguePageItem(@Nullable Rect rect, @NotNull String itemId, @NotNull String itemSKU, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.h(itemId, "itemId");
        Intrinsics.h(itemSKU, "itemSKU");
        this.coordinates = rect;
        this.itemId = itemId;
        this.itemSKU = itemSKU;
        this.itemName = str;
        this.itemUrl = str2;
        this.youtubeId = str3;
    }

    public static /* synthetic */ CataloguePageItem copy$default(CataloguePageItem cataloguePageItem, Rect rect, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            rect = cataloguePageItem.coordinates;
        }
        if ((i & 2) != 0) {
            str = cataloguePageItem.itemId;
        }
        if ((i & 4) != 0) {
            str2 = cataloguePageItem.itemSKU;
        }
        if ((i & 8) != 0) {
            str3 = cataloguePageItem.itemName;
        }
        if ((i & 16) != 0) {
            str4 = cataloguePageItem.itemUrl;
        }
        if ((i & 32) != 0) {
            str5 = cataloguePageItem.youtubeId;
        }
        String str6 = str4;
        String str7 = str5;
        return cataloguePageItem.copy(rect, str, str2, str3, str6, str7);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Rect getCoordinates() {
        return this.coordinates;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getItemSKU() {
        return this.itemSKU;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getItemUrl() {
        return this.itemUrl;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getYoutubeId() {
        return this.youtubeId;
    }

    @NotNull
    public final CataloguePageItem copy(@Nullable Rect coordinates, @NotNull String itemId, @NotNull String itemSKU, @Nullable String itemName, @Nullable String itemUrl, @Nullable String youtubeId) {
        Intrinsics.h(itemId, "itemId");
        Intrinsics.h(itemSKU, "itemSKU");
        return new CataloguePageItem(coordinates, itemId, itemSKU, itemName, itemUrl, youtubeId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CataloguePageItem)) {
            return false;
        }
        CataloguePageItem cataloguePageItem = (CataloguePageItem) other;
        return Intrinsics.c(this.coordinates, cataloguePageItem.coordinates) && Intrinsics.c(this.itemId, cataloguePageItem.itemId) && Intrinsics.c(this.itemSKU, cataloguePageItem.itemSKU) && Intrinsics.c(this.itemName, cataloguePageItem.itemName) && Intrinsics.c(this.itemUrl, cataloguePageItem.itemUrl) && Intrinsics.c(this.youtubeId, cataloguePageItem.youtubeId);
    }

    @Nullable
    public final Rect getCoordinates() {
        return this.coordinates;
    }

    @NotNull
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    public final String getItemName() {
        return this.itemName;
    }

    @NotNull
    public final String getItemSKU() {
        return this.itemSKU;
    }

    @Nullable
    public final String getItemUrl() {
        return this.itemUrl;
    }

    @Nullable
    public final String getYoutubeId() {
        return this.youtubeId;
    }

    public int hashCode() {
        Rect rect = this.coordinates;
        int iC = b.c(b.c((rect == null ? 0 : rect.hashCode()) * 31, 31, this.itemId), 31, this.itemSKU);
        String str = this.itemName;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.itemUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.youtubeId;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Rect rect = this.coordinates;
        String str = this.itemId;
        String str2 = this.itemSKU;
        String str3 = this.itemName;
        String str4 = this.itemUrl;
        String str5 = this.youtubeId;
        StringBuilder sb = new StringBuilder("CataloguePageItem(coordinates=");
        sb.append(rect);
        sb.append(", itemId=");
        sb.append(str);
        sb.append(", itemSKU=");
        a.B(sb, str2, ", itemName=", str3, ", itemUrl=");
        return a.l(sb, str4, ", youtubeId=", str5, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeParcelable(this.coordinates, flags);
        dest.writeString(this.itemId);
        dest.writeString(this.itemSKU);
        dest.writeString(this.itemName);
        dest.writeString(this.itemUrl);
        dest.writeString(this.youtubeId);
    }
}
