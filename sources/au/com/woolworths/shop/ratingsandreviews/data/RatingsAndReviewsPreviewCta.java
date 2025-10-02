package au.com.woolworths.shop.ratingsandreviews.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratingsandreviews/data/RatingsAndReviewsPreviewCta;", "Lau/com/woolworths/shop/ratingsandreviews/data/RatingsAndReviewsPreviewSections;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RatingsAndReviewsPreviewCta implements RatingsAndReviewsPreviewSections {

    @NotNull
    public static final Parcelable.Creator<RatingsAndReviewsPreviewCta> CREATOR = new Creator();
    public final LinkButton d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RatingsAndReviewsPreviewCta> {
        @Override // android.os.Parcelable.Creator
        public final RatingsAndReviewsPreviewCta createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new RatingsAndReviewsPreviewCta(LinkButton.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final RatingsAndReviewsPreviewCta[] newArray(int i) {
            return new RatingsAndReviewsPreviewCta[i];
        }
    }

    public RatingsAndReviewsPreviewCta(LinkButton button) {
        Intrinsics.h(button, "button");
        this.d = button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RatingsAndReviewsPreviewCta) && Intrinsics.c(this.d, ((RatingsAndReviewsPreviewCta) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "RatingsAndReviewsPreviewCta(button=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        this.d.writeToParcel(dest, i);
    }
}
