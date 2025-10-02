package au.com.woolworths.checkbox;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/checkbox/IndeterminateCheckboxSavedState;", "Landroid/os/Parcelable;", "indeterminate-checkbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class IndeterminateCheckboxSavedState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IndeterminateCheckboxSavedState> CREATOR = new Creator();
    public final Parcelable d;
    public final ToggleableState e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IndeterminateCheckboxSavedState> {
        @Override // android.os.Parcelable.Creator
        public final IndeterminateCheckboxSavedState createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new IndeterminateCheckboxSavedState(parcel.readParcelable(IndeterminateCheckboxSavedState.class.getClassLoader()), ToggleableState.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final IndeterminateCheckboxSavedState[] newArray(int i) {
            return new IndeterminateCheckboxSavedState[i];
        }
    }

    public IndeterminateCheckboxSavedState(Parcelable parcelable, ToggleableState state) {
        Intrinsics.h(state, "state");
        this.d = parcelable;
        this.e = state;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndeterminateCheckboxSavedState)) {
            return false;
        }
        IndeterminateCheckboxSavedState indeterminateCheckboxSavedState = (IndeterminateCheckboxSavedState) obj;
        return Intrinsics.c(this.d, indeterminateCheckboxSavedState.d) && this.e == indeterminateCheckboxSavedState.e;
    }

    public final int hashCode() {
        Parcelable parcelable = this.d;
        return this.e.hashCode() + ((parcelable == null ? 0 : parcelable.hashCode()) * 31);
    }

    public final String toString() {
        return "IndeterminateCheckboxSavedState(superState=" + this.d + ", state=" + this.e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e.name());
    }
}
