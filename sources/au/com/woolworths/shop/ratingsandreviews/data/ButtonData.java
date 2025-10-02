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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratingsandreviews/data/ButtonData;", "Landroid/os/Parcelable;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ButtonData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ButtonData> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final boolean f;
    public final CtaLinkAction g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ButtonData> {
        @Override // android.os.Parcelable.Creator
        public final ButtonData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new ButtonData(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : CtaLinkAction.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ButtonData[] newArray(int i) {
            return new ButtonData[i];
        }
    }

    public ButtonData(String str, String label, boolean z, CtaLinkAction ctaLinkAction) {
        Intrinsics.h(label, "label");
        this.d = str;
        this.e = label;
        this.f = z;
        this.g = ctaLinkAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonData)) {
            return false;
        }
        ButtonData buttonData = (ButtonData) obj;
        return Intrinsics.c(this.d, buttonData.d) && Intrinsics.c(this.e, buttonData.e) && this.f == buttonData.f && Intrinsics.c(this.g, buttonData.g);
    }

    public final int hashCode() {
        String str = this.d;
        int iE = b.e(b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.e), 31, this.f);
        CtaLinkAction ctaLinkAction = this.g;
        return iE + (ctaLinkAction != null ? ctaLinkAction.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("ButtonData(buttonId=", this.d, ", label=", this.e, ", enabled=");
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
        CtaLinkAction ctaLinkAction = this.g;
        if (ctaLinkAction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            ctaLinkAction.writeToParcel(dest, i);
        }
    }
}
