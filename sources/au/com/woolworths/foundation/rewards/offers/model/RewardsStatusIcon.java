package au.com.woolworths.foundation.rewards.offers.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/RewardsStatusIcon;", "Landroid/os/Parcelable;", "Lau/com/woolworths/foundation/rewards/offers/model/RewardsCalendarIcon;", BarcodePickDeserializer.FIELD_ICON, "<init>", "(Lau/com/woolworths/foundation/rewards/offers/model/RewardsCalendarIcon;)V", "Lau/com/woolworths/foundation/rewards/offers/model/RewardsCalendarIcon;", "a", "()Lau/com/woolworths/foundation/rewards/offers/model/RewardsCalendarIcon;", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RewardsStatusIcon implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RewardsStatusIcon> CREATOR = new Creator();

    @SerializedName(BarcodePickDeserializer.FIELD_ICON)
    @NotNull
    private final RewardsCalendarIcon icon;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RewardsStatusIcon> {
        @Override // android.os.Parcelable.Creator
        public final RewardsStatusIcon createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new RewardsStatusIcon(RewardsCalendarIcon.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final RewardsStatusIcon[] newArray(int i) {
            return new RewardsStatusIcon[i];
        }
    }

    public RewardsStatusIcon(@NotNull RewardsCalendarIcon icon) {
        Intrinsics.h(icon, "icon");
        this.icon = icon;
    }

    /* renamed from: a, reason: from getter */
    public final RewardsCalendarIcon getIcon() {
        return this.icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RewardsStatusIcon) && this.icon == ((RewardsStatusIcon) obj).icon;
    }

    public final int hashCode() {
        return this.icon.hashCode();
    }

    public final String toString() {
        return "RewardsStatusIcon(icon=" + this.icon + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        this.icon.writeToParcel(dest, i);
    }
}
