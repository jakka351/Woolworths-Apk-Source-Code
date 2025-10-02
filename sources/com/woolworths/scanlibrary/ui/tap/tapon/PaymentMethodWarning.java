package com.woolworths.scanlibrary.ui.tap.tapon;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/tap/tapon/PaymentMethodWarning;", "Landroid/os/Parcelable;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PaymentMethodWarning implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PaymentMethodWarning> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentMethodWarning> {
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodWarning createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new PaymentMethodWarning(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentMethodWarning[] newArray(int i) {
            return new PaymentMethodWarning[i];
        }
    }

    public PaymentMethodWarning(String title, String body, String positiveActionLabel, String negativeActionLabel) {
        Intrinsics.h(title, "title");
        Intrinsics.h(body, "body");
        Intrinsics.h(positiveActionLabel, "positiveActionLabel");
        Intrinsics.h(negativeActionLabel, "negativeActionLabel");
        this.d = title;
        this.e = body;
        this.f = positiveActionLabel;
        this.g = negativeActionLabel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodWarning)) {
            return false;
        }
        PaymentMethodWarning paymentMethodWarning = (PaymentMethodWarning) obj;
        return Intrinsics.c(this.d, paymentMethodWarning.d) && Intrinsics.c(this.e, paymentMethodWarning.e) && Intrinsics.c(this.f, paymentMethodWarning.f) && Intrinsics.c(this.g, paymentMethodWarning.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(this.d.hashCode() * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        return androidx.constraintlayout.core.state.a.l(YU.a.v("PaymentMethodWarning(title=", this.d, ", body=", this.e, ", positiveActionLabel="), this.f, ", negativeActionLabel=", this.g, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.g);
    }
}
