package au.com.woolworths.shop.ratingsandreviews.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratingsandreviews/data/LinkButton;", "Landroid/os/Parcelable;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LinkButton implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LinkButton> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final boolean f;
    public final ButtonAction g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkButton> {
        @Override // android.os.Parcelable.Creator
        public final LinkButton createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new LinkButton(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : ButtonAction.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final LinkButton[] newArray(int i) {
            return new LinkButton[i];
        }
    }

    public LinkButton(String str, String label, boolean z, ButtonAction buttonAction) {
        Intrinsics.h(label, "label");
        this.d = str;
        this.e = label;
        this.f = z;
        this.g = buttonAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkButton)) {
            return false;
        }
        LinkButton linkButton = (LinkButton) obj;
        return Intrinsics.c(this.d, linkButton.d) && Intrinsics.c(this.e, linkButton.e) && this.f == linkButton.f && Intrinsics.c(this.g, linkButton.g);
    }

    public final int hashCode() {
        String str = this.d;
        int iE = b.e(b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.e), 31, this.f);
        ButtonAction buttonAction = this.g;
        return iE + (buttonAction != null ? buttonAction.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("LinkButton(buttonId=", this.d, ", label=", this.e, ", enabled=");
        sbV.append(this.f);
        sbV.append(", buttonAction=");
        sbV.append(this.g);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeInt(this.f ? 1 : 0);
        ButtonAction buttonAction = this.g;
        if (buttonAction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonAction.writeToParcel(dest, i);
        }
    }
}
