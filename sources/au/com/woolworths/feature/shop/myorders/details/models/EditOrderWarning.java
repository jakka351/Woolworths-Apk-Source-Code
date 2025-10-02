package au.com.woolworths.feature.shop.myorders.details.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/EditOrderWarning;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EditOrderWarning implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EditOrderWarning> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final List f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EditOrderWarning> {
        @Override // android.os.Parcelable.Creator
        public final EditOrderWarning createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = a.e(EditOrderWarningItem.CREATOR, parcel, arrayList, iE, 1);
            }
            return new EditOrderWarning(string, string2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final EditOrderWarning[] newArray(int i) {
            return new EditOrderWarning[i];
        }
    }

    public EditOrderWarning(String imageUrl, String title, String acceptLabel, String acceptButtonLabel, String cancelButtonLabel, String str, List list) {
        Intrinsics.h(imageUrl, "imageUrl");
        Intrinsics.h(title, "title");
        Intrinsics.h(acceptLabel, "acceptLabel");
        Intrinsics.h(acceptButtonLabel, "acceptButtonLabel");
        Intrinsics.h(cancelButtonLabel, "cancelButtonLabel");
        this.d = imageUrl;
        this.e = title;
        this.f = list;
        this.g = acceptLabel;
        this.h = acceptButtonLabel;
        this.i = cancelButtonLabel;
        this.j = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditOrderWarning)) {
            return false;
        }
        EditOrderWarning editOrderWarning = (EditOrderWarning) obj;
        return Intrinsics.c(this.d, editOrderWarning.d) && Intrinsics.c(this.e, editOrderWarning.e) && Intrinsics.c(this.f, editOrderWarning.f) && Intrinsics.c(this.g, editOrderWarning.g) && Intrinsics.c(this.h, editOrderWarning.h) && Intrinsics.c(this.i, editOrderWarning.i) && Intrinsics.c(this.j, editOrderWarning.j);
    }

    public final int hashCode() {
        int iC = b.c(b.c(b.c(b.d(b.c(this.d.hashCode() * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str = this.j;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("EditOrderWarning(imageUrl=", this.d, ", title=", this.e, ", warningItems=");
        sbV.append(this.f);
        sbV.append(", acceptLabel=");
        sbV.append(this.g);
        sbV.append(", acceptButtonLabel=");
        androidx.constraintlayout.core.state.a.B(sbV, this.h, ", cancelButtonLabel=", this.i, ", disclaimer=");
        return YU.a.o(sbV, this.j, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        Iterator itU = au.com.woolworths.android.onesite.a.u(this.f, dest);
        while (itU.hasNext()) {
            ((EditOrderWarningItem) itU.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.g);
        dest.writeString(this.h);
        dest.writeString(this.i);
        dest.writeString(this.j);
    }
}
