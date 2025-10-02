package au.com.woolworths.feature.rewards.everydayextras.signup.data.landing;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.TermsAndConditionsInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtrasTermsAndConditions;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/shared/TermsAndConditionsInterface;", "Landroid/os/Parcelable;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EverydayExtrasTermsAndConditions implements TermsAndConditionsInterface, Parcelable {

    @NotNull
    public static final Parcelable.Creator<EverydayExtrasTermsAndConditions> CREATOR = new Creator();
    public final String d;
    public final String e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EverydayExtrasTermsAndConditions> {
        @Override // android.os.Parcelable.Creator
        public final EverydayExtrasTermsAndConditions createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new EverydayExtrasTermsAndConditions(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EverydayExtrasTermsAndConditions[] newArray(int i) {
            return new EverydayExtrasTermsAndConditions[i];
        }
    }

    public EverydayExtrasTermsAndConditions(String title, String termsAndConditions) {
        Intrinsics.h(title, "title");
        Intrinsics.h(termsAndConditions, "termsAndConditions");
        this.d = title;
        this.e = termsAndConditions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EverydayExtrasTermsAndConditions)) {
            return false;
        }
        EverydayExtrasTermsAndConditions everydayExtrasTermsAndConditions = (EverydayExtrasTermsAndConditions) obj;
        return Intrinsics.c(this.d, everydayExtrasTermsAndConditions.d) && Intrinsics.c(this.e, everydayExtrasTermsAndConditions.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return a.j("EverydayExtrasTermsAndConditions(title=", this.d, ", termsAndConditions=", this.e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
