package au.com.woolworths.foundation.rewards.offers.model;

import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.android.onesite.data.ContentCta;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsCta;", "Landroid/os/Parcelable;", "Lau/com/woolworths/android/onesite/data/ContentCta;", "cta", "", "displayStatus", "<init>", "(Lau/com/woolworths/android/onesite/data/ContentCta;Ljava/lang/String;)V", "Lau/com/woolworths/android/onesite/data/ContentCta;", "a", "()Lau/com/woolworths/android/onesite/data/ContentCta;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OfferDetailsCta implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OfferDetailsCta> CREATOR = new Creator();

    @SerializedName("cta")
    @NotNull
    private final ContentCta cta;

    @SerializedName("displayStatus")
    @Nullable
    private final String displayStatus;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OfferDetailsCta> {
        @Override // android.os.Parcelable.Creator
        public final OfferDetailsCta createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new OfferDetailsCta((ContentCta) parcel.readParcelable(OfferDetailsCta.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OfferDetailsCta[] newArray(int i) {
            return new OfferDetailsCta[i];
        }
    }

    public OfferDetailsCta(@NotNull ContentCta cta, @Nullable String str) {
        Intrinsics.h(cta, "cta");
        this.cta = cta;
        this.displayStatus = str;
    }

    /* renamed from: a, reason: from getter */
    public final ContentCta getCta() {
        return this.cta;
    }

    /* renamed from: b, reason: from getter */
    public final String getDisplayStatus() {
        return this.displayStatus;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferDetailsCta)) {
            return false;
        }
        OfferDetailsCta offerDetailsCta = (OfferDetailsCta) obj;
        return Intrinsics.c(this.cta, offerDetailsCta.cta) && Intrinsics.c(this.displayStatus, offerDetailsCta.displayStatus);
    }

    public final int hashCode() {
        int iHashCode = this.cta.hashCode() * 31;
        String str = this.displayStatus;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "OfferDetailsCta(cta=" + this.cta + ", displayStatus=" + this.displayStatus + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeParcelable(this.cta, i);
        dest.writeString(this.displayStatus);
    }
}
