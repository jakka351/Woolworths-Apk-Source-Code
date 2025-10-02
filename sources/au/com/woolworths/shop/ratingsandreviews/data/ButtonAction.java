package au.com.woolworths.shop.ratingsandreviews.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.ActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratingsandreviews/data/ButtonAction;", "Landroid/os/Parcelable;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ButtonAction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ButtonAction> CREATOR = new Creator();
    public final ActionType d;
    public final String e;
    public final String f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ButtonAction> {
        @Override // android.os.Parcelable.Creator
        public final ButtonAction createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new ButtonAction(ActionType.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ButtonAction[] newArray(int i) {
            return new ButtonAction[i];
        }
    }

    public ButtonAction(ActionType type, String action, String str) {
        Intrinsics.h(type, "type");
        Intrinsics.h(action, "action");
        this.d = type;
        this.e = action;
        this.f = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonAction)) {
            return false;
        }
        ButtonAction buttonAction = (ButtonAction) obj;
        return this.d == buttonAction.d && Intrinsics.c(this.e, buttonAction.e) && Intrinsics.c(this.f, buttonAction.f);
    }

    public final int hashCode() {
        int iC = b.c(this.d.hashCode() * 31, 31, this.e);
        String str = this.f;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return a.o(d.s("ButtonAction(type=", this.d, ", action=", this.e, ", id="), this.f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d.name());
        dest.writeString(this.e);
        dest.writeString(this.f);
    }
}
