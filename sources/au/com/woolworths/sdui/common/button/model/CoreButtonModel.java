package au.com.woolworths.sdui.common.button.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.model.action.ActionData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/common/button/model/CoreButtonModel;", "Landroid/os/Parcelable;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CoreButtonModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CoreButtonModel> CREATOR = new Creator();
    public final CoreButtonStyle d;
    public final String e;
    public final IconAsset.CoreIcon f;
    public final IconAsset.CoreIcon g;
    public final ActionData h;
    public final boolean i;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CoreButtonModel> {
        @Override // android.os.Parcelable.Creator
        public final CoreButtonModel createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new CoreButtonModel(CoreButtonStyle.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : IconAsset.CoreIcon.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? IconAsset.CoreIcon.CREATOR.createFromParcel(parcel) : null, (ActionData) parcel.readParcelable(CoreButtonModel.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CoreButtonModel[] newArray(int i) {
            return new CoreButtonModel[i];
        }
    }

    public CoreButtonModel(CoreButtonStyle style, String label, IconAsset.CoreIcon coreIcon, IconAsset.CoreIcon coreIcon2, ActionData action, boolean z) {
        Intrinsics.h(style, "style");
        Intrinsics.h(label, "label");
        Intrinsics.h(action, "action");
        this.d = style;
        this.e = label;
        this.f = coreIcon;
        this.g = coreIcon2;
        this.h = action;
        this.i = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreButtonModel)) {
            return false;
        }
        CoreButtonModel coreButtonModel = (CoreButtonModel) obj;
        return this.d == coreButtonModel.d && Intrinsics.c(this.e, coreButtonModel.e) && Intrinsics.c(this.f, coreButtonModel.f) && Intrinsics.c(this.g, coreButtonModel.g) && Intrinsics.c(this.h, coreButtonModel.h) && this.i == coreButtonModel.i;
    }

    public final int hashCode() {
        int iC = b.c(this.d.hashCode() * 31, 31, this.e);
        IconAsset.CoreIcon coreIcon = this.f;
        int iHashCode = (iC + (coreIcon == null ? 0 : coreIcon.d.hashCode())) * 31;
        IconAsset.CoreIcon coreIcon2 = this.g;
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + ((iHashCode + (coreIcon2 != null ? coreIcon2.d.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreButtonModel(style=" + this.d + ", label=" + this.e + ", leadingIcon=" + this.f + ", trailingIcon=" + this.g + ", action=" + this.h + ", enabled=" + this.i + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d.name());
        dest.writeString(this.e);
        IconAsset.CoreIcon coreIcon = this.f;
        if (coreIcon == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            coreIcon.writeToParcel(dest, i);
        }
        IconAsset.CoreIcon coreIcon2 = this.g;
        if (coreIcon2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            coreIcon2.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.h, i);
        dest.writeInt(this.i ? 1 : 0);
    }
}
