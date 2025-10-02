package au.com.woolworths.product.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lau/com/woolworths/product/models/InStoreLocationData;", "Landroid/os/Parcelable;", ErrorBundle.DETAIL_ENTRY, "Lau/com/woolworths/product/models/InstoreLocationDetailsData;", "displayInfo", "Lau/com/woolworths/product/models/InstoreDetailsData;", "<init>", "(Lau/com/woolworths/product/models/InstoreLocationDetailsData;Lau/com/woolworths/product/models/InstoreDetailsData;)V", "getDetails", "()Lau/com/woolworths/product/models/InstoreLocationDetailsData;", "getDisplayInfo", "()Lau/com/woolworths/product/models/InstoreDetailsData;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InStoreLocationData implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<InStoreLocationData> CREATOR = new Creator();

    @SerializedName(ErrorBundle.DETAIL_ENTRY)
    @Nullable
    private final InstoreLocationDetailsData details;

    @SerializedName("displayInfo")
    @Nullable
    private final InstoreDetailsData displayInfo;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InStoreLocationData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InStoreLocationData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new InStoreLocationData(parcel.readInt() == 0 ? null : InstoreLocationDetailsData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InstoreDetailsData.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InStoreLocationData[] newArray(int i) {
            return new InStoreLocationData[i];
        }
    }

    public InStoreLocationData(@Nullable InstoreLocationDetailsData instoreLocationDetailsData, @Nullable InstoreDetailsData instoreDetailsData) {
        this.details = instoreLocationDetailsData;
        this.displayInfo = instoreDetailsData;
    }

    public static /* synthetic */ InStoreLocationData copy$default(InStoreLocationData inStoreLocationData, InstoreLocationDetailsData instoreLocationDetailsData, InstoreDetailsData instoreDetailsData, int i, Object obj) {
        if ((i & 1) != 0) {
            instoreLocationDetailsData = inStoreLocationData.details;
        }
        if ((i & 2) != 0) {
            instoreDetailsData = inStoreLocationData.displayInfo;
        }
        return inStoreLocationData.copy(instoreLocationDetailsData, instoreDetailsData);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final InstoreLocationDetailsData getDetails() {
        return this.details;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final InstoreDetailsData getDisplayInfo() {
        return this.displayInfo;
    }

    @NotNull
    public final InStoreLocationData copy(@Nullable InstoreLocationDetailsData details, @Nullable InstoreDetailsData displayInfo) {
        return new InStoreLocationData(details, displayInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InStoreLocationData)) {
            return false;
        }
        InStoreLocationData inStoreLocationData = (InStoreLocationData) other;
        return Intrinsics.c(this.details, inStoreLocationData.details) && Intrinsics.c(this.displayInfo, inStoreLocationData.displayInfo);
    }

    @Nullable
    public final InstoreLocationDetailsData getDetails() {
        return this.details;
    }

    @Nullable
    public final InstoreDetailsData getDisplayInfo() {
        return this.displayInfo;
    }

    public int hashCode() {
        InstoreLocationDetailsData instoreLocationDetailsData = this.details;
        int iHashCode = (instoreLocationDetailsData == null ? 0 : instoreLocationDetailsData.hashCode()) * 31;
        InstoreDetailsData instoreDetailsData = this.displayInfo;
        return iHashCode + (instoreDetailsData != null ? instoreDetailsData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InStoreLocationData(details=" + this.details + ", displayInfo=" + this.displayInfo + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        InstoreLocationDetailsData instoreLocationDetailsData = this.details;
        if (instoreLocationDetailsData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            instoreLocationDetailsData.writeToParcel(dest, flags);
        }
        InstoreDetailsData instoreDetailsData = this.displayInfo;
        if (instoreDetailsData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            instoreDetailsData.writeToParcel(dest, flags);
        }
    }
}
