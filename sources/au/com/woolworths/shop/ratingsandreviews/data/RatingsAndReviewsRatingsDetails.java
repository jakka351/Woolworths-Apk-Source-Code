package au.com.woolworths.shop.ratingsandreviews.data;

import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.android.onesite.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratingsandreviews/data/RatingsAndReviewsRatingsDetails;", "Lau/com/woolworths/shop/ratingsandreviews/data/RatingsAndReviewsPreviewSections;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RatingsAndReviewsRatingsDetails implements RatingsAndReviewsPreviewSections {

    @NotNull
    public static final Parcelable.Creator<RatingsAndReviewsRatingsDetails> CREATOR = new Creator();
    public final List d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RatingsAndReviewsRatingsDetails> {
        @Override // android.os.Parcelable.Creator
        public final RatingsAndReviewsRatingsDetails createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = a.a(RatingsAndReviewsRatingsDetails.class, parcel, arrayList, iA, 1);
            }
            return new RatingsAndReviewsRatingsDetails(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final RatingsAndReviewsRatingsDetails[] newArray(int i) {
            return new RatingsAndReviewsRatingsDetails[i];
        }
    }

    public RatingsAndReviewsRatingsDetails(List list) {
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RatingsAndReviewsRatingsDetails) && Intrinsics.c(this.d, ((RatingsAndReviewsRatingsDetails) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return a.l("RatingsAndReviewsRatingsDetails(sections=", ")", this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        Iterator itU = a.u(this.d, dest);
        while (itU.hasNext()) {
            dest.writeParcelable((Parcelable) itU.next(), i);
        }
    }
}
