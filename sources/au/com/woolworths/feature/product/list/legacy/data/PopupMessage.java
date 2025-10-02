package au.com.woolworths.feature.product.list.legacy.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/data/PopupMessage;", "Lau/com/woolworths/feature/product/list/legacy/data/CustomMessage;", "Landroid/os/Parcelable;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PopupMessage implements CustomMessage, Parcelable {

    @NotNull
    public static final Parcelable.Creator<PopupMessage> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final String f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PopupMessage> {
        @Override // android.os.Parcelable.Creator
        public final PopupMessage createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new PopupMessage(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PopupMessage[] newArray(int i) {
            return new PopupMessage[i];
        }
    }

    public PopupMessage(String str, String str2, String str3) {
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupMessage)) {
            return false;
        }
        PopupMessage popupMessage = (PopupMessage) obj;
        return Intrinsics.c(this.d, popupMessage.d) && Intrinsics.c(this.e, popupMessage.e) && Intrinsics.c(this.f, popupMessage.f);
    }

    public final int hashCode() {
        String str = this.d;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return a.o(a.v("PopupMessage(title=", this.d, ", description=", this.e, ", ctaLabel="), this.f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
    }
}
