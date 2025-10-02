package au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/onboarding/EverydayExtrasOnBoarding;", "Landroid/os/Parcelable;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/onboarding/EverydayExtraSignupSubscribeData;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EverydayExtrasOnBoarding extends EverydayExtraSignupSubscribeData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EverydayExtrasOnBoarding> CREATOR = new Creator();
    public final EverydayExtrasSubscribeContent d;
    public final EverydayExtrasSubscribeFooter e;
    public final Boolean f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EverydayExtrasOnBoarding> {
        @Override // android.os.Parcelable.Creator
        public final EverydayExtrasOnBoarding createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            Boolean boolValueOf = null;
            EverydayExtrasSubscribeContent everydayExtrasSubscribeContentCreateFromParcel = parcel.readInt() == 0 ? null : EverydayExtrasSubscribeContent.CREATOR.createFromParcel(parcel);
            EverydayExtrasSubscribeFooter everydayExtrasSubscribeFooterCreateFromParcel = parcel.readInt() == 0 ? null : EverydayExtrasSubscribeFooter.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new EverydayExtrasOnBoarding(everydayExtrasSubscribeContentCreateFromParcel, everydayExtrasSubscribeFooterCreateFromParcel, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final EverydayExtrasOnBoarding[] newArray(int i) {
            return new EverydayExtrasOnBoarding[i];
        }
    }

    public EverydayExtrasOnBoarding(EverydayExtrasSubscribeContent everydayExtrasSubscribeContent, EverydayExtrasSubscribeFooter everydayExtrasSubscribeFooter, Boolean bool) {
        this.d = everydayExtrasSubscribeContent;
        this.e = everydayExtrasSubscribeFooter;
        this.f = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EverydayExtrasOnBoarding)) {
            return false;
        }
        EverydayExtrasOnBoarding everydayExtrasOnBoarding = (EverydayExtrasOnBoarding) obj;
        return Intrinsics.c(this.d, everydayExtrasOnBoarding.d) && Intrinsics.c(this.e, everydayExtrasOnBoarding.e) && Intrinsics.c(this.f, everydayExtrasOnBoarding.f);
    }

    public final int hashCode() {
        EverydayExtrasSubscribeContent everydayExtrasSubscribeContent = this.d;
        int iHashCode = (everydayExtrasSubscribeContent == null ? 0 : everydayExtrasSubscribeContent.hashCode()) * 31;
        EverydayExtrasSubscribeFooter everydayExtrasSubscribeFooter = this.e;
        int iHashCode2 = (iHashCode + (everydayExtrasSubscribeFooter == null ? 0 : everydayExtrasSubscribeFooter.hashCode())) * 31;
        Boolean bool = this.f;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EverydayExtrasOnBoarding(content=");
        sb.append(this.d);
        sb.append(", footer=");
        sb.append(this.e);
        sb.append(", showConfetti=");
        return a.o(sb, this.f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        EverydayExtrasSubscribeContent everydayExtrasSubscribeContent = this.d;
        if (everydayExtrasSubscribeContent == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            everydayExtrasSubscribeContent.writeToParcel(dest, i);
        }
        EverydayExtrasSubscribeFooter everydayExtrasSubscribeFooter = this.e;
        if (everydayExtrasSubscribeFooter == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            everydayExtrasSubscribeFooter.writeToParcel(dest, i);
        }
        Boolean bool = this.f;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }
}
