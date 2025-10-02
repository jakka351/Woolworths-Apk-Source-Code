package au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.AlertDialogAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/onboarding/EverydayExtraSubscribeAlertDialog;", "Landroid/os/Parcelable;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/onboarding/EverydayExtraSignupSubscribeData;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EverydayExtraSubscribeAlertDialog extends EverydayExtraSignupSubscribeData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EverydayExtraSubscribeAlertDialog> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final ContentCta f;
    public final ContentCta g;
    public final AlertDialogAnalytics h;
    public final Boolean i;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EverydayExtraSubscribeAlertDialog> {
        @Override // android.os.Parcelable.Creator
        public final EverydayExtraSubscribeAlertDialog createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            ContentCta contentCta = (ContentCta) parcel.readParcelable(EverydayExtraSubscribeAlertDialog.class.getClassLoader());
            ContentCta contentCta2 = (ContentCta) parcel.readParcelable(EverydayExtraSubscribeAlertDialog.class.getClassLoader());
            Boolean boolValueOf = null;
            AlertDialogAnalytics alertDialogAnalyticsCreateFromParcel = parcel.readInt() == 0 ? null : AlertDialogAnalytics.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new EverydayExtraSubscribeAlertDialog(string, string2, contentCta, contentCta2, alertDialogAnalyticsCreateFromParcel, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final EverydayExtraSubscribeAlertDialog[] newArray(int i) {
            return new EverydayExtraSubscribeAlertDialog[i];
        }
    }

    public EverydayExtraSubscribeAlertDialog(String title, String message, ContentCta primaryCta, ContentCta contentCta, AlertDialogAnalytics alertDialogAnalytics, Boolean bool) {
        Intrinsics.h(title, "title");
        Intrinsics.h(message, "message");
        Intrinsics.h(primaryCta, "primaryCta");
        this.d = title;
        this.e = message;
        this.f = primaryCta;
        this.g = contentCta;
        this.h = alertDialogAnalytics;
        this.i = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EverydayExtraSubscribeAlertDialog)) {
            return false;
        }
        EverydayExtraSubscribeAlertDialog everydayExtraSubscribeAlertDialog = (EverydayExtraSubscribeAlertDialog) obj;
        return Intrinsics.c(this.d, everydayExtraSubscribeAlertDialog.d) && Intrinsics.c(this.e, everydayExtraSubscribeAlertDialog.e) && Intrinsics.c(this.f, everydayExtraSubscribeAlertDialog.f) && Intrinsics.c(this.g, everydayExtraSubscribeAlertDialog.g) && Intrinsics.c(this.h, everydayExtraSubscribeAlertDialog.h) && Intrinsics.c(this.i, everydayExtraSubscribeAlertDialog.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + b.c(this.d.hashCode() * 31, 31, this.e)) * 31;
        ContentCta contentCta = this.g;
        int iHashCode2 = (iHashCode + (contentCta == null ? 0 : contentCta.hashCode())) * 31;
        AlertDialogAnalytics alertDialogAnalytics = this.h;
        int iHashCode3 = (iHashCode2 + (alertDialogAnalytics == null ? 0 : alertDialogAnalytics.hashCode())) * 31;
        Boolean bool = this.i;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("EverydayExtraSubscribeAlertDialog(title=", this.d, ", message=", this.e, ", primaryCta=");
        sbV.append(this.f);
        sbV.append(", secondaryCta=");
        sbV.append(this.g);
        sbV.append(", analytics=");
        sbV.append(this.h);
        sbV.append(", resetPaymentForm=");
        sbV.append(this.i);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeParcelable(this.f, i);
        dest.writeParcelable(this.g, i);
        AlertDialogAnalytics alertDialogAnalytics = this.h;
        if (alertDialogAnalytics == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            alertDialogAnalytics.writeToParcel(dest, i);
        }
        Boolean bool = this.i;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }
}
