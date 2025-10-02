package au.com.woolworths.feature.shop.catalogue.models;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/models/CatalogueStoreInfo;", "Landroid/os/Parcelable;", "displayName", "", "storeId", "postCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "getStoreId", "getPostCode", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CatalogueStoreInfo implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<CatalogueStoreInfo> CREATOR = new Creator();

    @SerializedName("displayName")
    @NotNull
    private final String displayName;

    @SerializedName("postcode")
    @NotNull
    private final String postCode;

    @SerializedName("storeId")
    @NotNull
    private final String storeId;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CatalogueStoreInfo> {
        @Override // android.os.Parcelable.Creator
        public final CatalogueStoreInfo createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new CatalogueStoreInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogueStoreInfo[] newArray(int i) {
            return new CatalogueStoreInfo[i];
        }
    }

    public CatalogueStoreInfo(@NotNull String displayName, @NotNull String storeId, @NotNull String postCode) {
        Intrinsics.h(displayName, "displayName");
        Intrinsics.h(storeId, "storeId");
        Intrinsics.h(postCode, "postCode");
        this.displayName = displayName;
        this.storeId = storeId;
        this.postCode = postCode;
    }

    public static /* synthetic */ CatalogueStoreInfo copy$default(CatalogueStoreInfo catalogueStoreInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = catalogueStoreInfo.displayName;
        }
        if ((i & 2) != 0) {
            str2 = catalogueStoreInfo.storeId;
        }
        if ((i & 4) != 0) {
            str3 = catalogueStoreInfo.postCode;
        }
        return catalogueStoreInfo.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getStoreId() {
        return this.storeId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPostCode() {
        return this.postCode;
    }

    @NotNull
    public final CatalogueStoreInfo copy(@NotNull String displayName, @NotNull String storeId, @NotNull String postCode) {
        Intrinsics.h(displayName, "displayName");
        Intrinsics.h(storeId, "storeId");
        Intrinsics.h(postCode, "postCode");
        return new CatalogueStoreInfo(displayName, storeId, postCode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CatalogueStoreInfo)) {
            return false;
        }
        CatalogueStoreInfo catalogueStoreInfo = (CatalogueStoreInfo) other;
        return Intrinsics.c(this.displayName, catalogueStoreInfo.displayName) && Intrinsics.c(this.storeId, catalogueStoreInfo.storeId) && Intrinsics.c(this.postCode, catalogueStoreInfo.postCode);
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final String getPostCode() {
        return this.postCode;
    }

    @NotNull
    public final String getStoreId() {
        return this.storeId;
    }

    public int hashCode() {
        return this.postCode.hashCode() + b.c(this.displayName.hashCode() * 31, 31, this.storeId);
    }

    @NotNull
    public String toString() {
        String str = this.displayName;
        String str2 = this.storeId;
        return a.o(a.v("CatalogueStoreInfo(displayName=", str, ", storeId=", str2, ", postCode="), this.postCode, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.displayName);
        dest.writeString(this.storeId);
        dest.writeString(this.postCode);
    }
}
