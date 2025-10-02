package au.com.woolworths.shop.ratingsandreviews.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratingsandreviews/data/RatingsOverview;", "Lau/com/woolworths/shop/ratingsandreviews/data/RatingsDistributionSection;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RatingsOverview implements RatingsDistributionSection {

    @NotNull
    public static final Parcelable.Creator<RatingsOverview> CREATOR = new Creator();
    public final double d;
    public final double e;
    public final CtaText f;
    public final int g;
    public final String h;
    public final Cta i;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RatingsOverview> {
        @Override // android.os.Parcelable.Creator
        public final RatingsOverview createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new RatingsOverview(parcel.readDouble(), parcel.readDouble(), CtaText.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Cta.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final RatingsOverview[] newArray(int i) {
            return new RatingsOverview[i];
        }
    }

    public RatingsOverview(double d, double d2, CtaText ratingText, int i, String totalReviewsText, Cta cta) {
        Intrinsics.h(ratingText, "ratingText");
        Intrinsics.h(totalReviewsText, "totalReviewsText");
        this.d = d;
        this.e = d2;
        this.f = ratingText;
        this.g = i;
        this.h = totalReviewsText;
        this.i = cta;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingsOverview)) {
            return false;
        }
        RatingsOverview ratingsOverview = (RatingsOverview) obj;
        return Double.compare(this.d, ratingsOverview.d) == 0 && Double.compare(this.e, ratingsOverview.e) == 0 && Intrinsics.c(this.f, ratingsOverview.f) && this.g == ratingsOverview.g && Intrinsics.c(this.h, ratingsOverview.h) && Intrinsics.c(this.i, ratingsOverview.i);
    }

    public final int hashCode() {
        int iC = b.c(b.a(this.g, (this.f.hashCode() + a.a(this.e, Double.hashCode(this.d) * 31, 31)) * 31, 31), 31, this.h);
        Cta cta = this.i;
        return iC + (cta == null ? 0 : cta.hashCode());
    }

    public final String toString() {
        StringBuilder sbN = androidx.constraintlayout.core.state.a.n(this.d, "RatingsOverview(averageRating=", ", displayRatings=");
        sbN.append(this.e);
        sbN.append(", ratingText=");
        sbN.append(this.f);
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.t(this.g, ", maximumRating=", ", totalReviewsText=", this.h, sbN);
        sbN.append(", cta=");
        sbN.append(this.i);
        sbN.append(")");
        return sbN.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeDouble(this.d);
        dest.writeDouble(this.e);
        this.f.writeToParcel(dest, i);
        dest.writeInt(this.g);
        dest.writeString(this.h);
        Cta cta = this.i;
        if (cta == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cta.writeToParcel(dest, i);
        }
    }
}
