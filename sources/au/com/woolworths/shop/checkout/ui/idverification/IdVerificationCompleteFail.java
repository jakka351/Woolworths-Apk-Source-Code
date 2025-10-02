package au.com.woolworths.shop.checkout.ui.idverification;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.checkout.domain.model.idverification.IdVerificationBottomSheet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationCompleteFail;", "Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationCompleteResponse;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class IdVerificationCompleteFail extends IdVerificationCompleteResponse {

    @NotNull
    public static final Parcelable.Creator<IdVerificationCompleteFail> CREATOR = new Creator();
    public final IdVerificationBottomSheet d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IdVerificationCompleteFail> {
        @Override // android.os.Parcelable.Creator
        public final IdVerificationCompleteFail createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new IdVerificationCompleteFail(IdVerificationBottomSheet.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final IdVerificationCompleteFail[] newArray(int i) {
            return new IdVerificationCompleteFail[i];
        }
    }

    public IdVerificationCompleteFail(IdVerificationBottomSheet bottomSheet) {
        Intrinsics.h(bottomSheet, "bottomSheet");
        this.d = bottomSheet;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IdVerificationCompleteFail) && Intrinsics.c(this.d, ((IdVerificationCompleteFail) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "IdVerificationCompleteFail(bottomSheet=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        this.d.writeToParcel(dest, i);
    }
}
