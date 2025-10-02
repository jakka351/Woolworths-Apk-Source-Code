package au.com.woolworths.feature.shop.myorders.details.models;

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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/EditOrderWarningItem;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EditOrderWarningItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EditOrderWarningItem> CREATOR = new Creator();
    public final String d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EditOrderWarningItem> {
        @Override // android.os.Parcelable.Creator
        public final EditOrderWarningItem createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new EditOrderWarningItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EditOrderWarningItem[] newArray(int i) {
            return new EditOrderWarningItem[i];
        }
    }

    public EditOrderWarningItem(String text) {
        Intrinsics.h(text, "text");
        this.d = text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EditOrderWarningItem) && Intrinsics.c(this.d, ((EditOrderWarningItem) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return a.h("EditOrderWarningItem(text=", this.d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
    }
}
