package au.com.woolworths.base.shopapp.modules.spacer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/spacer/SpacerApiData;", "Landroid/os/Parcelable;", "Lau/com/woolworths/base/shopapp/modules/spacer/SpacerSizeApiData;", "size", "<init>", "(Lau/com/woolworths/base/shopapp/modules/spacer/SpacerSizeApiData;)V", "Lau/com/woolworths/base/shopapp/modules/spacer/SpacerSizeApiData;", "a", "()Lau/com/woolworths/base/shopapp/modules/spacer/SpacerSizeApiData;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SpacerApiData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SpacerApiData> CREATOR = new Creator();

    @SerializedName("size")
    @NotNull
    private final SpacerSizeApiData size;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SpacerApiData> {
        @Override // android.os.Parcelable.Creator
        public final SpacerApiData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new SpacerApiData(SpacerSizeApiData.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final SpacerApiData[] newArray(int i) {
            return new SpacerApiData[i];
        }
    }

    public SpacerApiData(@NotNull SpacerSizeApiData size) {
        Intrinsics.h(size, "size");
        this.size = size;
    }

    /* renamed from: a, reason: from getter */
    public final SpacerSizeApiData getSize() {
        return this.size;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SpacerApiData) && this.size == ((SpacerApiData) obj).size;
    }

    public final int hashCode() {
        return this.size.hashCode();
    }

    public final String toString() {
        return "SpacerApiData(size=" + this.size + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.size.name());
    }
}
