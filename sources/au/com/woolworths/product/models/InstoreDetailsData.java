package au.com.woolworths.product.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lau/com/woolworths/product/models/InstoreDetailsData;", "Landroid/os/Parcelable;", "locationText", "", "locationType", "Lau/com/woolworths/product/models/InStoreLocationType;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/product/models/InStoreLocationType;)V", "getLocationText", "()Ljava/lang/String;", "getLocationType", "()Lau/com/woolworths/product/models/InStoreLocationType;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InstoreDetailsData implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<InstoreDetailsData> CREATOR = new Creator();

    @SerializedName("locationText")
    @Nullable
    private final String locationText;

    @SerializedName("locationType")
    @Nullable
    private final InStoreLocationType locationType;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InstoreDetailsData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InstoreDetailsData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new InstoreDetailsData(parcel.readString(), parcel.readInt() == 0 ? null : InStoreLocationType.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InstoreDetailsData[] newArray(int i) {
            return new InstoreDetailsData[i];
        }
    }

    public InstoreDetailsData(@Nullable String str, @Nullable InStoreLocationType inStoreLocationType) {
        this.locationText = str;
        this.locationType = inStoreLocationType;
    }

    public static /* synthetic */ InstoreDetailsData copy$default(InstoreDetailsData instoreDetailsData, String str, InStoreLocationType inStoreLocationType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = instoreDetailsData.locationText;
        }
        if ((i & 2) != 0) {
            inStoreLocationType = instoreDetailsData.locationType;
        }
        return instoreDetailsData.copy(str, inStoreLocationType);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getLocationText() {
        return this.locationText;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final InStoreLocationType getLocationType() {
        return this.locationType;
    }

    @NotNull
    public final InstoreDetailsData copy(@Nullable String locationText, @Nullable InStoreLocationType locationType) {
        return new InstoreDetailsData(locationText, locationType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstoreDetailsData)) {
            return false;
        }
        InstoreDetailsData instoreDetailsData = (InstoreDetailsData) other;
        return Intrinsics.c(this.locationText, instoreDetailsData.locationText) && this.locationType == instoreDetailsData.locationType;
    }

    @Nullable
    public final String getLocationText() {
        return this.locationText;
    }

    @Nullable
    public final InStoreLocationType getLocationType() {
        return this.locationType;
    }

    public int hashCode() {
        String str = this.locationText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        InStoreLocationType inStoreLocationType = this.locationType;
        return iHashCode + (inStoreLocationType != null ? inStoreLocationType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InstoreDetailsData(locationText=" + this.locationText + ", locationType=" + this.locationType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.locationText);
        InStoreLocationType inStoreLocationType = this.locationType;
        if (inStoreLocationType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inStoreLocationType.writeToParcel(dest, flags);
        }
    }
}
