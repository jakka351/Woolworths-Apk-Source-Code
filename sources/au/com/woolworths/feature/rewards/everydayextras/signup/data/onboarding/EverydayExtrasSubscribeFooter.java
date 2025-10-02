package au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/onboarding/EverydayExtrasSubscribeFooter;", "Landroid/os/Parcelable;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EverydayExtrasSubscribeFooter implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EverydayExtrasSubscribeFooter> CREATOR = new Creator();
    public final String d;
    public final List e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EverydayExtrasSubscribeFooter> {
        @Override // android.os.Parcelable.Creator
        public final EverydayExtrasSubscribeFooter createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = a.a(EverydayExtrasSubscribeFooter.class, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new EverydayExtrasSubscribeFooter(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final EverydayExtrasSubscribeFooter[] newArray(int i) {
            return new EverydayExtrasSubscribeFooter[i];
        }
    }

    public EverydayExtrasSubscribeFooter(String str, List list) {
        this.d = str;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EverydayExtrasSubscribeFooter)) {
            return false;
        }
        EverydayExtrasSubscribeFooter everydayExtrasSubscribeFooter = (EverydayExtrasSubscribeFooter) obj;
        return Intrinsics.c(this.d, everydayExtrasSubscribeFooter.d) && Intrinsics.c(this.e, everydayExtrasSubscribeFooter.e);
    }

    public final int hashCode() {
        String str = this.d;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.e;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return a.i("EverydayExtrasSubscribeFooter(id=", this.d, ", items=", ")", this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        List list = this.e;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), i);
        }
    }
}
